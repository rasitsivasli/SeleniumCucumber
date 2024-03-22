package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.P01_ContactLoginPage;

public class Mentor3 {
    P01_ContactLoginPage loginPage = new P01_ContactLoginPage();

    @When("enter valid username {string}")
    public void enterValidUsername(String username) {
        loginPage.email.sendKeys(username);
    }

    @And("enter valid password {string}")
    public void enterValidPassword(String password) {
        loginPage.password.sendKeys(password);
    }
}
