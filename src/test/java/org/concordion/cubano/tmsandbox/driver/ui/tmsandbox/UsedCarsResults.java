package org.concordion.cubano.tmsandbox.driver.ui.tmsandbox;

import java.util.List;

import org.concordion.cubano.driver.BrowserBasedTest;
import org.concordion.cubano.tmsandbox.AppConfig;
import org.concordion.cubano.tmsandbox.driver.ui.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UsedCarsResults extends PageObject<UsedCarsResults> {
    public UsedCarsResults(BrowserBasedTest test) {
        super(test);
    }

    @FindBy(className = "motors-heading-used-cars")
    WebElement motorHeading;

    @FindBy(className = "tmm-search-card-list-view")
    List<WebElement> cards;

    @FindBy(className = "tmm-search-card-list-view")
    List<WebElement> listings;

    @FindBy(id = "AttributesDisplay_attributesSection")
    List<UsedCarListing> attributes;

    @FindAll
            ({
                    @FindBy(xpath = "//td[@class='make_item_col0']//a"),
                    @FindBy(xpath = "//td[@class='make_item_col1']//a"),
                    @FindBy(xpath = "//td[@class='make_item_col2']//a")
            })
    private List<WebElement> MultipleInputElements;

    @Override
    public ExpectedCondition<?> pageIsLoaded(Object... params) {
        return ExpectedConditions.visibilityOf(motorHeading);
    }

    public static UsedCarsResults open(BrowserBasedTest test) {
        test.getBrowser().getDriver().navigate().to(AppConfig.getInstance().getSearchUrl());

        return new UsedCarsResults(test);
    }

    public Boolean isAtLeastOneCarDisplayed() {
        return cards.size() > 0;
    }

    public Boolean hasGivenMake(String make) {
        for (WebElement element : MultipleInputElements) {
            if (element.getText().equals(make)) {
                return true;
            }
        }
        return false;
    }

    public UsedCarsResults selectCar(Integer index) {
        listings.get(index).click();
        return this;
    }

    public Boolean doAllMotorAttributesHaveValue() {
        for (WebElement attributeValue : attributes) {
            if (attributeValue.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
