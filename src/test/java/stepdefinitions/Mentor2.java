package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.P01_ContactLoginPage;
import pages.P02_ContactAddPage;
import pages.P03_ContactListPage2;
import pages.P04_ContactListLastPage;

public class Mentor2 {
    P01_ContactLoginPage loginPage = new P01_ContactLoginPage();
    P02_ContactAddPage addPage = new P02_ContactAddPage();
    P03_ContactListPage2 addNewContactButton = new P03_ContactListPage2();
    P04_ContactListLastPage lastPage = new P04_ContactListLastPage();

    @When("click sign Up button")
    public void clickSignUpButton() {
        loginPage.signUp.click();
    }

    @And("enter first and last name and email and Password")
    public void enterFirstAndLastNameAndEmailAndPassword() {
        addPage.firstName.sendKeys(Faker.instance().name().firstName());
        addPage.lastname.sendKeys(Faker.instance().name().lastName());
        addPage.email.sendKeys(Faker.instance().internet().emailAddress());
        addPage.password.sendKeys(Faker.instance().internet().password());
        addPage.submit.click();
    }

    @When("click add a new Contact button")
    public void clickAddANewContactButton() {
        addNewContactButton.addContact.click();

    }

    @And("enter firstName and lastName")
    public void enterFirstNameAndLastName() {
        lastPage.firstName.sendKeys(Faker.instance().name().firstName());
        String firstName = lastPage.firstName.getText();
        System.out.println("firstName = " + firstName);
        lastPage.lastname.sendKeys(Faker.instance().name().lastName());
        lastPage.submit.click();
        Assert.assertTrue(lastPage.verify.getText().contains(firstName));

    }

    @And("verify user add table")
    public void verifyUserAddTable() {

    }
}
