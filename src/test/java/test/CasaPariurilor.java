package test;

import helperMethods.CasaMethods;
import helperMethods.Menu;
import helperMethods.MenuHome;
import org.testng.annotations.Test;
import pages.GamesPage;
import pages.HomePage;
import share.SharedData;

import java.awt.*;

public class CasaPariurilor extends SharedData {

    @Test
    public void testMethod() throws InterruptedException {
        HomePage homePage = new HomePage(getWebDriver());
        MenuHome menuHome = new MenuHome();
        Menu menu = new Menu();
        homePage.navigateToSportGroup();
        menuHome.menuHome();
        menu.menuSub1Cases();

    }
}

