package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@dortIslem",
        dryRun = false
)
public class Runner06_DortIslem extends AbstractTestNGCucumberTests {

}
