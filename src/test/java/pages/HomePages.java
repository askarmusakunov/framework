package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class HomePages {
    public HomePages(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@class='form-input__field rp__email-input ng-untouched ng-pristine ng-invalid']")
    public WebElement Userid;

    @FindBy (id =" password")
    public WebElement PassWordID;

    @FindBy(id = "signinEmail")
    public WebElement SingInButton;
}
