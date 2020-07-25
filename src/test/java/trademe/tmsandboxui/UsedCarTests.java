package trademe.tmsandboxui;

import org.concordion.cubano.tmsandbox.driver.ui.tmsandbox.UsedCarsResults;
import org.concordion.cubano.tmsandbox.framework.CubanoTemplateFixture;

public class UsedCarTests extends CubanoTemplateFixture {

    public Boolean isAtLeastOneListingDisplayed() {
        return UsedCarsResults.open(this)
                .atLeastOneCar();
    }

    public Boolean isMakeDisplayed(String make) {
        return UsedCarsResults.open(this)
                .hasGivenMake(make);
    }

    public Boolean doAllAttributesHaveValue() {
        return UsedCarsResults
                .open(this).selectCar()
                .doAllMotorAttributesHaveValue();
    }
}
