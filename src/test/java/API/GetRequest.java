package API;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetRequest {
    public void createGetRequest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Send GET request and validate response
        given()
                .when()
                .get("/posts/1")
                .then()
                .statusCode(200) // Verify status code is 200
                .body("id", equalTo(1)) // Check if 'id' is 1
                .body("title", notNullValue()) // Ensure 'title' exists
                .body("body", notNullValue()); // Ensure 'body' exists
    }
}
