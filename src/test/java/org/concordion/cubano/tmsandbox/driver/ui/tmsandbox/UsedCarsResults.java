package org.concordion.cubano.tmsandbox.driver.ui.tmsandbox;

import java.util.List;

import org.concordion.cubano.driver.BrowserBasedTest;
import org.concordion.cubano.tmsandbox.AppConfig;
import org.concordion.cubano.tmsandbox.driver.ui.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UsedCarsResults extends PageObject<UsedCarsResults> {
    public UsedCarsResults(BrowserBasedTest test) {
        super(test);
    }

    @FindBy(xpath = "//h1[@class='landing-header motors-heading-used-cars']")
    WebElement ele2;

    @FindBy(xpath = "//li[@class='tmm-search-card-list-view']")
    List<WebElement> element3;

    @FindBy(xpath = "//a[contains(text(),'Kia')]")
    WebElement kia;

    @FindBy(className = "tmm-search-card-list-view")
    List<WebElement> listings;

    @FindBy(id = "AttributesDisplay_attributesSection")
    List<UsedCarListing> attributes;

    @Override
    public ExpectedCondition<?> pageIsLoaded(Object... params) {
        return ExpectedConditions.visibilityOf(ele2);
    }

    public static UsedCarsResults open(BrowserBasedTest test) {
        test.getBrowser().getDriver().navigate().to(AppConfig.getInstance().getSearchUrl());

        return new UsedCarsResults(test);
    }


    public Boolean atLeastOneCar(){
        return element3.size() != 0;
    }

    public Boolean hasKiaMake (){
        return kia.isDisplayed();
    }

    public UsedCarsResults selectCar(){
        listings.get(0).click();
        return this;
    }

        public Boolean allMotorAttributeshaveValue(){
        for (WebElement attributeValue: attributes) {
            if (attributeValue.getText().isEmpty()){
                return false;
            }
        }
        return true;
    }
}
