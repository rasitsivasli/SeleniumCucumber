package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", // Cucumber senaryo dosyalarının konumunu belirtir
        plugin = {"pretty", // Konsol çıktılarını daha okunabilir hale getirmek için plugin
                "html:target/reports/html_reports/cucumber.html", // HTML formatında rapor almak için kullanılan plugin
                "json:target/reports/json-reports/cucumber1.json", // JSON formatında rapor almak için kullanılan plugin
                "junit:target/reports/xml-reports/cucumber1.xml"},  // XML formatında rapor almak için kullanılan plugin
        glue = {"stepdefinitions","hooks"}, // Step tanımları ve hookları içeren paketlerin yollarını belirtir
        tags = "@hooks", // Çalıştırılacak senaryoları belirlemek için kullanılan etiketler
        dryRun = false // Senaryoları gerçekten çalıştırmadan sadece senaryoların geçerliliğini kontrol etmek için kullanılır
)
public class Runner09_TestRunner extends AbstractTestNGCucumberTests {

}
