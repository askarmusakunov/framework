package javaExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CrossbrowserScripts {
    WebDriver driver;

    /**
     * This function will execute before each Test tag in testng.xml
     * @param browser
     * @throws Exception
     */
    @Parameters("browser")
    @BeforeTest

    public void setup(String browser) throws Exception{
        //Check if parameter passed from TestNG is 'firefox'
        if(browser.equalsIgnoreCase("Firefox")){
            //create firefox instance
            System.setProperty("webdriver.firefox.driver","/Users/ritakk/Documents/WorkSpace/gecko");
            driver = new FirefoxDriver();
            driver.get("https://www.firefox.com");

        }
        //Check if parameter passed as 'chrome'
        else if(browser.equalsIgnoreCase("Chrome")){
            //set path to chromedriver.exe
            System.setProperty("webdriver.chrome.driver","/Users/ritakk/Documents/WorkSpace/chromedriver");
            //create chrome instance
            driver = new ChromeDriver();
            driver.get("https://www.yahoo.com");

        }
        //Check if parameter passed as 'Edge'
        else if(browser.equalsIgnoreCase("Edge")){
            //set path to Edge.exe
            System.setProperty("webdriver.edge.driver","c:\\setup\\MicrosoftWebDriver.exe");
            //create Edge instance
            driver = new EdgeDriver();
            driver.get("https://www.microsoft.com");
        }
        else{
            //If no browser passed throw exception
            throw new Exception("Browser is not correct");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testParameterWithXML() throws InterruptedException{
        driver.get("http://demo.guru99.com/V4/");
        //Find user name
        WebElement userName = driver.findElement(By.name("uid"));
        //Fill user name
        userName.sendKeys("guru99");
        //Find password
        WebElement password = driver.findElement(By.name("password"));
        //Fill password
        password.sendKeys("guru99");
    }
    @Test
    public void outputPrint() {
        System.out.println("Just checking how it works");
    }
    @Test
    public void Comp() {

        //create chrome instance
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
    }
}
