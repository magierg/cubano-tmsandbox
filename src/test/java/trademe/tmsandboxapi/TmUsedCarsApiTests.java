package trademe.tmsandboxapi;

import java.io.IOException;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.concordion.cubano.driver.http.JsonReader;
import org.concordion.cubano.tmsandbox.driver.api.TMSandBoxRestApi;
import org.concordion.cubano.tmsandbox.framework.CubanoTemplateFixture;

public class TmUsedCarsApiTests extends CubanoTemplateFixture {

    public boolean isCountGreaterThenZero() throws IOException {
        return new TMSandBoxRestApi()
                .getTmSandboxUrlResponse("https://api.tmsandbox.co.nz/v1/Search/Motors/Used.json").jsonPath("TotalCount").getAsInt() > 0;
    }

    public boolean doesGivenMakeExistInTheResponse(String makeName) throws IOException {
        return checkIfMakeExists(new TMSandBoxRestApi()
                .getTmSandboxUrlResponse("https://api.tmsandbox.co.nz/v1/Categories/UsedCars.json"), makeName);
    }

    public boolean areGivenAttributesAvailableInTheResponse(String details) throws IOException {
        String[] attributes = details.replaceAll("\\s", "").split(",");
        JsonArray cars = new TMSandBoxRestApi()
                .getTmSandboxUrlResponse("https://api.tmsandbox.co.nz/v1/Search/Motors/Used.json").jsonPath("List").getAsJsonArray();
        JsonObject firstCarObj = (JsonObject) cars.get(0);
        for (String s : attributes) {
            if (firstCarObj.get(s).toString().isEmpty()) {
                return false;
            }
            ;
        }
        return true;
    }

    private Boolean checkIfMakeExists(JsonReader json, String makeName) {
        JsonArray makes = json.jsonPath("Subcategories").getAsJsonArray();
        for (JsonElement make : makes) {
            String s = make.getAsJsonObject().get("Name").toString();
            if (make.getAsJsonObject().get("Name").toString().equals("\"" + makeName + "\"")) {
                return true;
            }
        }
        return false;
    }
}
