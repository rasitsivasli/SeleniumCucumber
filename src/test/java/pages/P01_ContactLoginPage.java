package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P01_ContactLoginPage {
    public P01_ContactLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(id = "error")
    public WebElement errorMessage;

    @FindBy(tagName = "h1")
    public WebElement contactList;

    @FindBy(id = "signup")
    public WebElement signUp;

    public void loginEmail() {
        email.sendKeys(Faker.instance().internet().emailAddress(), Keys.ENTER);
    }
}

