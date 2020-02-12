package BasePackage;

import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;

    @BeforeTest
    public void Setup() {
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            //driver.manage().deleteAllCookies();
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(50, TimeUnit.SECONDS);
        }
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
