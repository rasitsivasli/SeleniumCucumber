package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",// buraya feature file in CONTENT ROOT u yazilir
        //Gherkin dilinde yazilmis senaryolar buradan alinir.
        glue = "stepdefinitions",// buraya STEPDEFINITION package' inin SOURCE ROOT' u yazilir
        //java kodlari olarak impelement ettigimiz Package
        dryRun = false
        // Tamamlanmamis step definition var mi onlari gösteriri.
)

public class Runner01_FirstFeature extends AbstractTestNGCucumberTests {

}
