package org.concordion.cubano.tmsandbox.driver.api;

import java.io.IOException;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.concordion.cubano.driver.http.HttpEasy;
import org.concordion.cubano.driver.http.JsonReader;

public class TMSandBoxRestApi extends ServiceBase {
    private static final String OAUTH_CONSUMER_KEY= "0B59A1614EC8D895B83014DA5A79FB47";
    private static final String OAUTH_SIGNATURE="984BE7D1E5C04A6C77D9418E3E2009DC%26";
    private static final String OAUTH_SIGNATURE_METHOD="PLAINTEXT";
    private static final String AUTH_HEADER = String.format("OAuth oauth_consumer_key=\"%1$s\",oauth_signature_method=\"%2$s\",oauth_version=\"1.0\",oauth_signature=\"%3$s\"", OAUTH_CONSUMER_KEY, OAUTH_SIGNATURE_METHOD, OAUTH_SIGNATURE);

    public JsonReader getTmSandboxUrlResponse(String Url) throws IOException {
        // NOTE: HttpEasy config has already been set in ConcordionDomainBase using baseUrl from config.properties file

        JsonReader response = HttpEasy.request()
                .baseUrl(Url)
                .header("Authorization",AUTH_HEADER)
                .get()
                .getJsonReader();

        // Log response details in both log file and storyboard
        captureAction(Action.JSON_RESPONSE, "Response", "", response.asPrettyString());

        return response;
    }
}
