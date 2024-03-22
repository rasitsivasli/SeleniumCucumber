package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucunber.class)  Eger JUnit kullansaydik bu anat. kullaniliyor
@CucumberOptions(
        features = "src/test/resources/features",// buraya feature file in CONTENT ROOT u yazilir
        glue = "stepdefinitions",// buraya STEPDEFINITION package' inin SOURCE ROOT' u yazilir
        tags = "@firstFeature and not @java"
        // Run etmek istedigimiz tagin adi
        //dryRun = true
)
public class Runner02_Tags extends AbstractTestNGCucumberTests {

}
