package Tests;

import Pages.HomePage;
import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class AccountSectionTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
    }

    @DataProvider(name = "LinksTestData")
    public Object[][] testData1() {
        Object[][] data = new Object[7][2];
        data[0][0] = "php-travels";
        data[0][1] = "Demo Script Test drive - PHPTRAVELS";

        data[1][0] = "mercury-tours";
        data[1][1] = "Demoaut.com";

        data[2][0] = "internet";
        data[2][1] = "The Internet";

        data[3][0] = "e-commerce";
        data[3][1] = "My Store";

        data[4][0] = "passion-tea-company";
        data[4][1] = "";

        data[5][0] = "sauce-demo";
        data[5][1] = "Swag Labs";

        data[6][0] = "shopping-cart";
        data[6][1] = "Typescript React Shopping cart";

        return data;
    }

}
