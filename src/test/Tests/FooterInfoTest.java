package Tests;

import Pages.FooterInfoPage;
import base.BaseTest;
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
        Object[] data = new Object[8];
        data[0] = "Specials";
        data[1] = "New products";
        data[2] = "Best sellers";
        data[3] = "Our store";
        data[4] = "Contact us";
        data[5] = "Terms and conditions of use";
        data[6] = "About us";
        data[7] = "Sitemap";

        return data;
    }

    @Test(testName = "Footer Info List varification", dataProvider = "FooterInfo")
    public void test01(String data) {

        boolean specials = footerInfoPage.specials.isDisplayed();
        boolean newProduct = footerInfoPage.newProduct.isDisplayed();
        boolean bestSellers = footerInfoPage.bestSellers.isDisplayed();
        boolean ourStores = footerInfoPage.ourStores.isDisplayed();
        boolean contactUs = footerInfoPage.contactUs.isDisplayed();
        boolean termsConditions = footerInfoPage.termsConditions.isDisplayed();
        boolean aboutUs = footerInfoPage.aboutUs.isDisplayed();
        boolean siteMap = footerInfoPage.siteMap.isDisplayed();

    }

 }

