package rest_client;


import config.Configuration;
import config.TestConfig;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.apache.hc.core5.net.URIBuilder;

import java.net.URISyntaxException;

import static io.restassured.RestAssured.given;
import static io.restassured.config.LogConfig.logConfig;
import static io.restassured.filter.log.LogDetail.ALL;

public class RestClient {
    private static final Configuration config = TestConfig.getConfiguration();
    private static RequestSpecification creditRequestSpecification;

    public static RequestSpecification getCreditRequestSpecification() {
        if (creditRequestSpecification == null) {
            try {
                creditRequestSpecification = new RequestSpecBuilder()
                        .setConfig(RestAssured.config()
                                .logConfig(logConfig().enablePrettyPrinting(true)
                                        .enableLoggingOfRequestAndResponseIfValidationFails(ALL)))
                        .setBaseUri(new URIBuilder()
                                .setScheme(config.urlScheme())
                                .setHost(config.host())
                                .setPort(config.port())
                                .setPath(config.resourceUri())
                                .build())
                        .build();
            } catch (URISyntaxException uriSyntaxException) {
                throw new RuntimeException(uriSyntaxException);
            }
        }
        return creditRequestSpecification;
    }


}
