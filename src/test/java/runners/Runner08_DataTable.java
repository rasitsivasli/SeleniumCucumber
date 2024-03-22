package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinitions","hooks"},
        tags = "@invalidCredentials",
        dryRun = false
)
public class Runner08_DataTable extends AbstractTestNGCucumberTests {

}
