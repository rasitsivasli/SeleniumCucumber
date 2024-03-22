package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class Homework {
    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String pageUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(pageUrl));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int time) throws InterruptedException {
        Thread.sleep(time* 1000L);
    }

    @And("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String search) {
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains(search));

    }
}
