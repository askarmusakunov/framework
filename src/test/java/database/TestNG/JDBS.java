package database.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigDataProvider;
import utils.DataBaseJDBC;
import utils.Driver;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBS {
    DataBaseJDBC dataBaseJDBC;
    WebDriver driver;
    ConfigDataProvider configDataProvider;

    @Before
    public void setupDriver() throws SQLException {
        WebDriverManager.chromedriver().setup();

        configDataProvider = new ConfigDataProvider();
        dataBaseJDBC = new DataBaseJDBC(configDataProvider.getDatabaseURL(),
                configDataProvider.getDatabaseUsername(), configDataProvider.getDatabasePassword());
    }

    @Test
    public void seleniumWork() {

        try {
            driver = new ChromeDriver();
            ResultSet rs = dataBaseJDBC.getResultSet("Select * from test.customer");
            System.out.println(" No:  username  " + "password");
            while (rs.next()) {
                driver.get("https://secure2.homedepot.com/account/view/logon");
                driver.findElement(By.id("signinEmail")).sendKeys(rs.getString(2) + "@gmail.com");
                driver.findElement(By.id("password")).sendKeys(rs.getString(3));
                driver.findElement(By.xpath("/html/body/div[2]/myaccount-app/div/div/account-logon/div/div[1]/form/div/div[2]/div[2]/button/span")).click();
                System.out.println("No: " + rs.getString("id") + "    " + rs.getString("username") + "  " + rs.getString("password"));

                Thread.sleep(2000);
            }
            System.out.println("Successfully logged in");

        } catch (Exception e) {

        }
    }

}
