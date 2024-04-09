package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", //konsol ciktilarinin daha okunakli olmasi icin plugin
                "html:target/reports/html_reports/cucumber.html", //html formatinda rapor almak icin kullanilan plugin
                "json:target/reports/json-reports/cucumber1.json", //json formatinda rapor almak icin kullanilan plugin
                "junit:target/reports/xml-reports/cucumber1.xml",  //xml formatinda rapor almak icin kullanilan plugin
                "rerun:target/reports/failed-reports/failed1.txt", //failed testler için kullanilan plugin
        },
        monochrome = true,//konsolda gereksiz yazi ve yorumlari siler
        features = "src/test/resources/features",
        glue = {"stepdefinitions","hooks"},
        tags = "@parallel",
        dryRun = false
)
public class Runner10_ParallelTestRunner extends AbstractTestNGCucumberTests {

}
