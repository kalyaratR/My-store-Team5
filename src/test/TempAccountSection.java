import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TempAccountSection {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

    @Test()
    public void testMyaccount() {
        driver.findElement(By.xpath("//a[@title='My orders']")).click();

        driver.findElement(By.xpath("//a[@title='My credit slips']")).click();

        driver.findElement(By.xpath("//a[@title='My addresses']")).click();

        driver.findElement(By.xpath("//a[@title='Manage my personal information']")).click();

    }
}
////       @Test()
// //       public void testMyaccount() {
//            driver.get("http://automationpractice.com/index.php");
//           Assert.assertTrue(driver.findElement(By.xpath("//section[@class='footer-block col-xs-12 col-sm-4']")).isEnabled());
//        }
//
//       @DataProvider(name = "buttonNames")
//        public Object[] testData() {
//            Object[] data = {"My order", "My credit slips", "My addresses", "My personal info"};
//            return data;
//
//        }
//    }
//
