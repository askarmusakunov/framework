package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class CreateUserSteps {


    @Given("the following headers are set")
    public void the_following_headers_are_set(List<Map<String, String>> headersList) {
       System.out.println(headersList.get(0).get("contentType"));
        System.out.println(headersList.get(0).get("accept"));
        System.out.println(headersList.get(1).get("contentType"));

    }

    @Given("the following user info is set in body")
    public void the_following_user_info_is_set_in_body(List<Map<String, String>> headersList) {
        System.out.println(headersList.get(0).get("email"));
    }

    @When("the post request is sent to create the user")
    public void the_post_request_is_sent_to_create_the_user() {

    }

    @Then("the following is the response")
    public void the_following_is_the_response(List<Map<String, String>> headersList) {
        System.out.println(headersList.get(0).get("last_name"));
    }

    @Then("^the response status is \"([^\"]*)\"$")
    public void theResponseStatusIs(String arg0) throws Throwable {
        System.out.println(arg0);
    }
}
