package share;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;

import java.time.Duration;

public class SharedData {

    private static WebDriver webDriver;

//    public SharedData() {
//        super();
//    }

    @BeforeMethod
    public void prepDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        webDriver = new ChromeDriver(options);
        webDriver.get("https://www.casapariurilor.ro/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void afterDriver() {

        webDriver.quit();
    }

    public static WebDriver getWebDriver() {

        return webDriver;
    }



}
