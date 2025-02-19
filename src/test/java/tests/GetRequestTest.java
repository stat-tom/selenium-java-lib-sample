package tests;

import API.GetRequest;
import org.testng.annotations.Test;

public class GetRequestTest {
    GetRequest getRequest = new GetRequest();

    @Test
    public void getRequest_shouldReturnValidResponse() {
        getRequest.createGetRequest();
    }

}
