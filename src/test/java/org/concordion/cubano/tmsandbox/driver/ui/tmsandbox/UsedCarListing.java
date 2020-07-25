package org.concordion.cubano.tmsandbox.driver.ui.tmsandbox;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

public class UsedCarListing extends HtmlElement {
    @FindBy(className = "motors-attribute-label")
    List<WebElement> motorAttributesLabel;

    @FindBy(className = "motors-attribute-value")
    List<WebElement> motorAttributesValue;
}


//public class UsedCarListing extends PageObject<UsedCarListing> {
//    public UsedCarListing(BrowserBasedTest test) {
//        super(test);
//    }
//
//    WebElement title;
//
//    @FindBy(className = "motors-attribute-label")
//    List<WebElement> motorAttributesLabel;
//
//    @FindBy(className = "motors-attribute-value")
//    List<WebElement> motorAttributesValue;
//
//    @Override
//    public ExpectedCondition<?> pageIsLoaded(Object... params) {
//        return ExpectedConditions.visibilityOf(title);
//    }
//
//    public static UsedCarListing open(BrowserBasedTest test) {
//        test.getBrowser().getDriver().navigate().to(AppConfig.getInstance().getSearchUrl());
//
//        return new UsedCarListing(test);
//    }
//
//    public Boolean allMotorAttributeshaveValue(){
//        for (WebElement attributeValue: motorAttributesValue) {
//            if (attributeValue.getText().isEmpty()){
//                return false;
//            }
//        }
//        return true;
//    }
//
//}
