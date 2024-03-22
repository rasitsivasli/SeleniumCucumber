package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinitions","hooks"},
        tags = "@hooks",
        dryRun = false
)
public class Runner07_HooksFailed extends AbstractTestNGCucumberTests {

}
