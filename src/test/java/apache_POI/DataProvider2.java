package apache_POI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataProvider2 {
    private static WebDriver driver;

    @DataProvider(name = "Authentication")

    public static Object[][] credentials() {

        return new Object[][] { { "adam", "Test@123" }, { "smith", "Test@123" },{"barbolbaike@gmail.com","Bishkek312"}};

    }

    // Here we are calling the Data Provider object with its Name

    @Test(dataProvider = "Authentication")

    public void test(String sUsername, String sPassword) {

        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://secure2.homedepot.com/account/view/logon/redirect/%252Faccount%252Fview%252Fprofile");
        driver.findElement(By.xpath("//*[@id=\"signinEmail\"]")).sendKeys(sUsername+"@gmail.com");
        driver.findElement(By.id("password")).sendKeys(sPassword);
        driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();


        driver.quit();

    }

}

