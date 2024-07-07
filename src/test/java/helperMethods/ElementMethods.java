package helperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.xml.crypto.Data;
import java.time.Duration;
import java.util.Scanner;

public class ElementMethods {
    private WebDriver webDriver;

    public ElementMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public void scrollElementByPyxel(Integer x, Integer y) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(" + x + "," + y + ")", "");
    }

    public void waitVisibleElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(WebElement element) {
        waitVisibleElement(element);
        element.click();
    }

    public void validateElementTest(WebElement element, String expected) {
        waitVisibleElement(element);
        String actual = element.getText();
        Assert.assertEquals(actual, expected);
    }

    public void printElementText(WebElement element) {
        waitVisibleElement(element);
        System.out.println(element.getText());
    }

    public void fillElement(WebElement element, String value) {
        waitVisibleElement(element);
        element.sendKeys(value);
    }

    public void refillElement(WebElement element, String value) {
        waitVisibleElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void selectTextElement(WebElement element, String value) {
        waitVisibleElement(element);
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void selectValueElement(WebElement element, String value) {
        waitVisibleElement(element);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void fillPressElement(WebElement element, String value, Keys key) {
        waitVisibleElement(element);
        element.sendKeys(Keys.ENTER);
    }

    public void fillPress(WebElement element, String value) {
        waitVisibleElement(element);
        element.click();
        element.sendKeys(value);
        element.sendKeys(Keys.ENTER);
    }
    public void fillState(WebElement element, WebElement element2, String value) {
        waitVisibleElement(element);
        element.click();
        waitVisibleElement(element2);
        element2.sendKeys(value);
        element2.sendKeys(Keys.ENTER);
    }

}
