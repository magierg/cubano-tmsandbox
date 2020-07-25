package trademe.tmsandboxui;

import org.concordion.cubano.tmsandbox.driver.ui.tmsandbox.UsedCarsResults;
import org.concordion.cubano.tmsandbox.framework.CubanoTemplateFixture;

public class UsedCarTests extends CubanoTemplateFixture {

    public Boolean atLeastOneListingExists() {
        return UsedCarsResults.open(this)
                .atLeastOneCar();
    }

    public Boolean makeExists() {
        return UsedCarsResults.open(this)
                .hasKiaMake();
    }

    public Boolean allAttributesHaveValue() {
         return UsedCarsResults.open(this).selectCar().allMotorAttributeshaveValue();
    }
}
