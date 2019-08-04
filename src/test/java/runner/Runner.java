package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber", "rerun:target/rerun.txt"},
        features = "src/test/resource/featureFiles", //
        glue = "stepDefs",     // connecting with StepDefs
        tags = "@marat",    //
        dryRun = true
)

public class Runner {


}
