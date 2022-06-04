package Tests;

import Pages.FollowUsPage;
import Pages.HomePage;
import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SeleniumUtils;

public class FollowUsTest extends BaseTest {
    FollowUsPage followUsPage;

    @Test(testName = "AUT-5")
    public void test01(){
        //followUsPage.click(followUsPage.facebookBtn);
        getDriver().findElement(By.xpath("//*[@class='facebook']")).click();
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "Selenium Framework");
    }
    @Test(testName = "AUT-5")
    public void test02(){
        getDriver().findElement(By.xpath("//*[@class='twitter']")).click();
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "Selenium Framework");
    }

    @Test(testName = "AUT-5")
    public void test03(){
        getDriver().findElement(By.xpath("//*[@class='youtube']")).click();
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "Selenium Framework - YouTube");
    }

    @Test(testName = "AUT-5")
    public void test04(){
        getDriver().findElement(By.xpath("//*[@class='google-plus']")).click();
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "Sign in - Google Accounts");
    }



}
