package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(xpath = "(//div[@class='QS5gu sy4vM'])[2]")
    WebElement cookies;

    public void amazonSearchFor(String keyword) {
        searchBox.sendKeys(keyword, Keys.ENTER);
    }

}
