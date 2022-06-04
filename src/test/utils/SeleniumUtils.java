package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SeleniumUtils {
    public static String switchToWindowAndVerifyTitle(WebDriver driver) {
        String currentWindowID = driver.getWindowHandle();
        String title = "";

        Set<String> allWindowIDs = driver.getWindowHandles();
        for (String each : allWindowIDs) {
            if (!each.equals(currentWindowID)) {
                driver.switchTo().window(each);
                title = driver.getTitle();
                //new ExtentManager().logScreenshot();
                driver.close();
            }
        }
        driver.switchTo().window(currentWindowID);
        return title;
    }
    public static void switchWindow(WebDriver driver){
        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for(String each: allWindows){
            if (!each.equals(mainWindow))
                driver.switchTo().window(each);
        }
    }
}
