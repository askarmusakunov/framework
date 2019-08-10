package stepDefs;

import apiBeans.PositiveGoRestResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import javaExamples.GoRestBody;
import utils.Config;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class CreateUserSteps {

    private RequestSpecification requestSpecification;
    private Response response;
    private ObjectMapper mapper = new ObjectMapper();

    @Given("the following headers are set")
    public void the_following_headers_are_set(List<Map<String, String>> headersList) {

        requestSpecification =
                given()
                        .accept(ContentType.valueOf(headersList.get(0).get("accept")))
                        .contentType(ContentType.valueOf(headersList.get(0).get("contentType")));

    }

    @Given("the following user info is set in body")
    public void the_following_user_info_is_set_in_body(List<Map<String, String>> headersList) {
        GoRestBody user = new GoRestBody();
        user.setFirst_name(headersList.get(0).get("first_name"));
        user.setLast_name(headersList.get(0).get("last_name"));
        Random random = new Random();
        user.setEmail(headersList.get(0).get("email")+random.nextInt());
        user.setGender(headersList.get(0).get("gender"));
        user.setStatus(headersList.get(0).get("status"));

        requestSpecification.body(user);
    }

    @When("the post request is sent to create the user")
    public void the_post_request_is_sent_to_create_the_user() {

        response = requestSpecification
                .when()
                .post(Config.getProperty("userURL"));

        System.out.println(response.asString());

    }

    @Then("the following should be the response")
    public void the_following_is_the_response(List<Map<String, String>> headersList) throws IOException {
        PositiveGoRestResponse goRestResponse = mapper.readValue(response.asString(), PositiveGoRestResponse.class);

        // assertEquals("Ids do not match", Integer.parseInt(headersList.get(0).get("id")), goRestResponse.getResult().getId());
        assertEquals("first names do not match", headersList.get(0).get("first_name"), goRestResponse.getResult().getFirst_name());
    }

    @Then("^the response status should be \"([^\"]*)\"$")
    public void theResponseStatusIs(int arg0) {
        assertEquals("The status code mismatch", arg0, response.statusCode());
    }
}
