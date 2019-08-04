package apache_POI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataProvider1 {
    private static WebDriver driver;

    @Test

    @Parameters({ "sUsername", "sPassword" })

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
