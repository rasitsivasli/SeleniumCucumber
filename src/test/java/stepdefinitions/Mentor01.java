package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.P01_ContactLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Mentor01 {
    P01_ContactLoginPage clp = new P01_ContactLoginPage();

    @Given("go to the home page")
    public void goToTheHomePage() {
        Driver.getDriver().get(ConfigReader.getProperty("contactUrl"));

    }

    @When("enter invalid email")
    public void enterInvalidUsername() {
        clp.loginEmail();
    }

    @And("enter invalid password")
    public void enterInvalidPassword() {
        clp.password.sendKeys(Faker.instance().internet().password());
    }

    @And("click submit button")
    public void verifySubmitButton() throws InterruptedException {
        Thread.sleep(3000);
        clp.submitButton.click();
        Thread.sleep(3000);
    }

    @Then("verify incorrect message")
    public void verifyIncorrectMessage() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(clp.errorMessage.isDisplayed());
    }

    @And("close Browser")
    public void closeBrowser() {
        Driver.closeDriver();
    }


    @When("enter valid email")
    public void enterValidEmail() {
        clp.email.sendKeys(ConfigReader.getProperty("c_username"));

    }

    @And("enter valid password")
    public void enterValidPassword() {
        clp.password.sendKeys(ConfigReader.getProperty("c_password"));
    }

    @Then("verify correct contactList message")
    public void verifyCorrectContactListMessage() {
        ReusableMethods.waitForVisibility(clp.contactList,2);
        Assert.assertTrue(clp.contactList.getText().contains("Contact List"));
    }
}
