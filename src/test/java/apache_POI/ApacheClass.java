package apache_POI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ExcelDataTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ApacheClass {

    WebDriver driver;
    ExcelDataTest excelDataTest;

    @BeforeTest
    public void setupDriver() {
        excelDataTest = new ExcelDataTest();
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void seleniumTest() {
        driver = new ChromeDriver();
        String sUsername = excelDataTest.getStringData(3, 0);
        double sPassword = excelDataTest.getDoubleData(3, 1);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://secure2.homedepot.com/account/view/logon/redirect/%252Faccount%252Fview%252Fprofile");
        driver.findElement(By.xpath("//*[@id=\"signinEmail\"]")).sendKeys(sUsername + "@gmail.com");
        driver.findElement(By.id("password")).sendKeys(Double.toString(sPassword));
        driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
        driver.quit();
    }
}


