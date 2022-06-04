package Tests;

import Pages.FooterInfoPage;
import Pages.HomePage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FooterInfoTest extends BaseTest {
    FooterInfoPage footerInfoPage;

    @BeforeMethod
    public void localSetUp() {
        footerInfoPage = new FooterInfoPage(getDriver());
    }
    @DataProvider(name = "FooterInfo")
    public Object[] testData() {
        Object[] data = new Object[7];
        data[0] = "Specials";
        data[1] = "New products";
        data[2] = "Best sellers";
        data[3] = "Our store";
        data[4] = "Contact us";
        data[5] = "Terms and conditions of use";
        data[6] = "About us";

        return data;
    }

    @Test(testName = "Footer Info List varification", dataProvider = "FooterInfo")
    public void test01(String footer) {
        Assert.assertTrue(footerInfoPage.footerInfoList.contains(footer));
    }

    @Test(testName = "Sitemap varification")
    public void test02() {

        Assert.assertTrue(footerInfoPage.siteMap.getText().contains("Sitemap"));
    }

 }

