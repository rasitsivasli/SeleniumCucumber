package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",// buraya feature file in CONTENT ROOT u yazilir
        glue = "stepdefinitions",// buraya STEPDEFINITION package' inin SOURCE ROOT' u yazilir
        tags = "@ScenarioOutline",
        dryRun = false
)
public class RunnerMentor3 extends AbstractTestNGCucumberTests {

}
