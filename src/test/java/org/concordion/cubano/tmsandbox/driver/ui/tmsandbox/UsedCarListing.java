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
