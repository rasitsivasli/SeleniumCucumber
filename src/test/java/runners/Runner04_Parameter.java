package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@amazonSearch",
        dryRun = false
)
public class Runner04_Parameter extends AbstractTestNGCucumberTests {

}
