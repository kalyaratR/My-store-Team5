package Tests;

import Pages.AccountSectionPage;
import Pages.HomePage;
import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.SeleniumUtils;

public class AccountSectionTest extends BaseTest {
    HomePage homePage;

    AccountSectionPage accountSectionPage;

    @BeforeMethod
    public void localSetUp() {

        accountSectionPage = new AccountSectionPage(getDriver());

    }

    @DataProvider(name = "userInfo")
    public Object[] testData() {
        Object[] data = new Object[4];
        data[0] = "My orders";
        data[1] = "My credit slips";
        data[2] = "My addresses";
        data[3] = "My personal info";


        return data;
    }

    @Test(testName = "AccountSectionInfo", dataProvider = "userInfo")
    public void test01(String myOrders, String myCreditSlips, String myAddresses, String myPersonalInfo) {

            getDriver().findElement(By.xpath("userInfo")).click();
            String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
            Assert.assertEquals(actualTitle, testData());
        }

}


