package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {
    /**
     * This method poll every 20 millis for 2 mins to make element is visible
     * @param driver
     * @param element
     * @return
     */
    public static WebElement waitUntilVisible(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 3);

        WebElement webElement = wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
