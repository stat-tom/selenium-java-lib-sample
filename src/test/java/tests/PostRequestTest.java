package tests;

import API.PostRequest;
import org.testng.annotations.Test;

public class PostRequestTest {
    PostRequest postRequest = new PostRequest();

    @Test
    public void postRequest_shouldReturnValidResponse() {
        postRequest.createPostRequest();
    }

}
