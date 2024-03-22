package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@sOutline",
        dryRun = false
)
public class Runner05_ScenarioOutline extends AbstractTestNGCucumberTests {

}
