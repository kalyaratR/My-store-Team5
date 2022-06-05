package Pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSectionPage extends BasePage {
    protected WebDriver driver;

    public AccountSectionPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
     @FindBy(xpath = "//div[@class='block_content toggle-footer']")
     public List<WebElement> userInfo;

    @FindBy(xpath = "//a[@title='My orders']")

    public WebElement myOrder;

    @FindBy(xpath ="//a[@title='My credit slips']")
    public WebElement myCredit;

    @FindBy(xpath ="//a[@title='My addresses']")
    public WebElement myAddresses;

    @FindBy(xpath = "//a[@title='Manage my personal information']")
    public WebElement myPersonalInfo;

}
