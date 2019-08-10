package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber", "rerun:target/rerun.txt"},
        features = "src/test/resources/featureFiles", //
        glue = "stepDefs", // connecting with StepDefs
        tags = "@smoke"
)

public class Runner {

}
