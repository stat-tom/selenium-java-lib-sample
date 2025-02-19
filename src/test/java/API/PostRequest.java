package API;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PostRequest {
    public void createPostRequest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("title", "Brand New Sample Post");
        requestBody.put("body", "This is a sample body.");
        requestBody.put("userId", 1);

        // Send POST request and validate response
        given()
                .contentType(ContentType.JSON) // Set content type to JSON
                .body(requestBody) // Attach request body
                .when()
                .post("/posts")
                .then()
                .statusCode(201) // Verify status code (201 Created)
                .body("title", equalTo("Brand New Sample Post")) // Validate response fields
                .body("body", equalTo("This is a sample body."))
                .body("userId", equalTo(1))
                .body("id", notNullValue()); // ID should be present
    }
}
