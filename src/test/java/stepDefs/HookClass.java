package stepDefs;

import cucumber.api.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.DriverUtil;

public class HookClass {
    @After
    public void after(Scenario currentScenario){
        if(currentScenario.isFailed()&& DriverUtil.getMyCurrentDriver() !=null){
            TakesScreenshot screenshotTaker= (TakesScreenshot) DriverUtil.getMyCurrentDriver();
            byte[] screenshot= screenshotTaker.getScreenshotAs(OutputType.BYTES);
            currentScenario.embed(screenshot, "image/png");
        }
    }
}
