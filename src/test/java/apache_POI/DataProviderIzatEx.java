package apache_POI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataProviderIzatEx {
    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeClass
    public static void beforeClass() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,5);
        driver.get("https://secure2.homedepot.com/account/view/logon/redirect/%252Faccount%252Fview%252Fprofile");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }
    @DataProvider()
    public Iterator<Object[]> getDatafromProvider() throws IOException {
        List<Object[]> myData = new ArrayList<Object[]>();
        FileInputStream fis = new FileInputStream("src/test/POI.xlsx");
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheetAt(0);
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            String name = sheet.getRow(i).getCell(0).toString();
            String password = sheet.getRow(i).getCell(1).toString();
            Object[] obj = {name, password};
            myData.add(obj);
        }
        return myData.iterator();
    }

    @Test(dataProvider ="getDatafromProvider",priority = 1)
    public void homeDepotLogIn(String string, String string1) throws InterruptedException {
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.id("signinEmail"));
        email.clear();
        email.sendKeys(string+"@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.clear();
        password.sendKeys(string1);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Sign In')]"))).click();
    }
    @AfterClass
    public static void closeChrome(){
        driver.quit();
    }
}
