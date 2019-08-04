package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private static WebDriver driver;

    private Driver() {

    }

    public static WebDriver getDriver(String browserType) {
        System.setProperty("webdriver.chrome.driver", "/Users/ritakk/Documents/WorkSpace/chromedriver");
        System.setProperty("webdriver.firefox.driver", "/Users/ritakk/Documents/WorkSpace/gecko");

        if (browserType.equalsIgnoreCase("chrome")) {
            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox") || browserType.equalsIgnoreCase("ff")) {
            return new FirefoxDriver();
        } else {
            System.out.println("User input for browser type is invalid: (" + browserType + ")");


            return null;

        }
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}
