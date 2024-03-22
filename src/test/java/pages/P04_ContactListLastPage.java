package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P04_ContactListLastPage {
    public P04_ContactListLastPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastname;

    @FindBy(id = "submit")
    public WebElement submit;

    @FindBy(xpath = "(//td)[2]")
    public WebElement verify;


}

