package apache_POI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DataProviderExcel {
    static WebDriver driver;

    public static void main(String[] args) throws Exception {


        System.out.println("********************************************");
        runSelenium();

    }
    public static String getCellData(int RowNum, int ColNum) throws Exception{

        try{

            Cell cell = getSheetInit().getRow(RowNum).getCell(ColNum);

            String CellData = cell.getStringCellValue();

            return CellData;

        }catch (Exception e){

            return"";


        }

    }
    public static void runSelenium() throws Exception {

        for (int i = 1; i <= getSheetInit().getLastRowNum(); i++) {
            String sUserName = getCellData(i, 1);
            System.out.println(sUserName);

            String sPassword = getCellData(i, 2);

            System.out.println(sPassword);

            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.get("https://secure2.homedepot.com/account/view/logon/redirect/%252Faccount%252Fview%252Fprofile");
            driver.findElement(By.xpath("//*[@id=\"signinEmail\"]")).sendKeys(sUserName + "@gmail.com");
            driver.findElement(By.id("password")).sendKeys(sPassword);
            driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();


            driver.quit();
        }
    }


    public static Sheet getSheetInit() throws IOException {
        File f=new File("/Users/ritakk/Desktop/Presentation.xlsx");
        FileInputStream fi=new FileInputStream(f);

        Workbook workbook= WorkbookFactory.create(fi);
        Sheet sheet0=workbook.getSheetAt(0);
        return sheet0;

    }


}
