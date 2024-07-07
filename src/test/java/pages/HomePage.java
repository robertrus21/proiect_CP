package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.collections.CollectionUtils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(className = "f-icon-l")
    private WebElement ticketPopup;

    @FindBy(id = "cookie-consent-button-accept")
    private WebElement acceptCookies;

//    @FindBy(className = "brand-logo homepage-link")
//    private WebElement home;

    public void navigateToSportGroup() {
        elementMethods.clickElement(ticketPopup);
        elementMethods.clickElement(acceptCookies);
    }

//    public void navigateHome() {
//        elementMethods.clickElement(home);
//    }

    public List<String> gamesGroups() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        List<String> gamesGroup = new ArrayList<>();
        try {
            List<WebElement> groups =
                    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.xpath("//*[contains(@class, 'toggler-content opened toggler-content-visible')]//strong")));
            for (int i = 0; i < 5; i++) {
                gamesGroup.add(groups.get(i).getText());
            }
            return gamesGroup;
        } catch (Exception e) {
            System.out.println("plm");
            return new ArrayList<>();
        }

    }
}

