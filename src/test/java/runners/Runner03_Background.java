package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",// buraya feature file in CONTENT ROOT u yazilir
        glue = "stepdefinitions",// buraya STEPDEFINITION package' inin SOURCE ROOT' u yazilir
        tags = "@background",
        dryRun = false
)
public class Runner03_Background extends AbstractTestNGCucumberTests {

}
