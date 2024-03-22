package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.OrangeHRMpage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.ObjectInputFilter;
import java.util.List;
import java.util.Map;

public class OrangeHRMSD {
    OrangeHRMpage orange = new OrangeHRMpage();

    @Given("kullanici anasayfaya gider")
    public void kullaniciAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("orangeUrl"));
    }

    @And("kullanici username {string} girer")
    public void kullaniciUsernameGirer(String arg0) {
        orange.userName.sendKeys(arg0);
    }

    @And("kullanici password {string} girer")
    public void kullaniciPasswordGirer(String arg0) {
        orange.password.sendKeys(arg0);
    }

    @And("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        orange.loginButton.click();
    }

    @And("scenario fail olur")
    public void scenarioFailOlur() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertFalse(orange.errorMessagge.isDisplayed());
        Driver.closeDriver();
    }

    @When("kullanici credentiallari girer")
    public void kullaniciCredentiallariGirer(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> adminCredentials = dataTable.asMaps();
        for (Map<String, String> each : adminCredentials) {
            orange.userName.sendKeys(each.get("username"));
            orange.password.sendKeys(each.get("password"));
            orange.loginButton.click();
            Thread.sleep(2000);
            System.out.println(each);

        }
    }

    @When("kullanici invalid credentiallari girer")
    public void kullaniciInvalidCredentiallariGirer(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> invalidCredentials = dataTable.asMaps();
        System.out.println("invalidCredentials = " + invalidCredentials);

        for (int i = 0; i < invalidCredentials.size(); i++) {
            orange.userName.sendKeys(invalidCredentials.get(i).get("username"));
            orange.password.sendKeys(invalidCredentials.get(i).get("password"));
            orange.loginButton.click();
            Assert.assertTrue(orange.errorMessagge.isDisplayed());
                Thread.sleep(2000);
        }


    }
}
