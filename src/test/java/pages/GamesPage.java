package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import share.SharedData;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static share.SharedData.getWebDriver;

public class GamesPage extends BasePage {

    public GamesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void gameCategory (String category){
        webDriver.findElement(By.xpath("//strong[contains(text(),'"+category+"')]")).click();
    }

}
