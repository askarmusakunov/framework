package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverUtil;

public class IDSWeb1 {

    WebDriver driver;

    {
        driver = DriverUtil.getMyDriver("chrome");

    }
    @Given("User login in to the website")
    public void user_login_in_to_the_website() {

    }

    @When("user clicks visit site icon")
    public void user_clicks_visit_site_icon() {

    }

    @Then("homepage should appear")
    public void homepage_should_appear() {

    }
}
