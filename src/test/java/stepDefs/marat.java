package stepDefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.collections.Maps;
import pages.HomePages;
import utils.Driver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class marat {
    WebDriver driver=Driver.getDriver("Chrome");
    HomePages homePages = new HomePages(driver);

    @Given("user able to login in website")
    public void user_able_to_login_in_website() throws InterruptedException {
       // driver = Driver.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://secure2.homedepot.com/account/view/logon");
        Thread.sleep(6000);


    }

    @When("user passes Username and Password")
    public void user_passes_Username_and_Password(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> ListOfMap = dataTable.asMaps(String.class, String.class);

homePages.Userid.click();
            homePages.Userid.sendKeys(ListOfMap.get(0).get("username"));




    }

    @Then("user logins multiple time")
    public void user_logins_multiple_time() {


    }


}
