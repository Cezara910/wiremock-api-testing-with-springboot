package tests;

import io.restassured.http.ContentType;
import io.restassured.http.Method;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static rest_client.RestClient.getCreditRequestSpecification;

public class CreditRequestTests {
    @Test
    public void creditRequestForSufficientCreditScore_ShouldBeApproved() {
        Map<String, Object> map = new HashMap<>();
        map.put("customerId", "1234");
        map.put("loanAmount", "100");

            given()
                .spec(getCreditRequestSpecification())
                .body(map)
                .contentType("application/json")
                .when()
                .request(Method.POST)
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("status", Matchers.equalTo("Approved"));
    }

    @Test
    public void creditRequestForInsufficientCreditScore_ShouldBeRejected() {
        Map<String, Object> map = new HashMap<>();
        map.put("customerId", "5678");
        map.put("loanAmount", "200");

            given()
                .spec(getCreditRequestSpecification())
                .body(map)
                .contentType("application/json")
                .when()
                .request(Method.POST)
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("status", Matchers.equalTo("Rejected"));
    }
}
