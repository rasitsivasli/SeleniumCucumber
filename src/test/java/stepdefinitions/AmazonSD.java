package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class AmazonSD {
    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //ReusableMethods.amazonCaptcha(Driver.getDriver());
    }

    @When("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String str) {
        amazonPage.amazonSearchFor(str);
    }

    @Then("kullanici title da {string} gormelidir")
    public void kullaniciTitleDaGormelidir(String str) throws InterruptedException {
        //Thread.sleep(2000);
        ReusableMethods.waitForPageToLoad(3);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
    }
}
