package test;

import helperMethods.CasaMethods;
import helperMethods.Menu;
import helperMethods.MenuHome;
import org.testng.annotations.Test;
import pages.GamesPage;
import pages.HomePage;
import share.SharedData;

public class CasaPariurilor extends SharedData {

    @Test
    public void testMethod() throws InterruptedException {
        HomePage homePage = new HomePage(getWebDriver());
        MenuHome menuHome = new MenuHome();
        Menu menu = new Menu();
        homePage.navigateToSportGroup();

//        gamesPage.gameCategory("ROMÂNIA LIGA 1");
//        List<String> test = casaMethods.gamesFullLine().get(casaMethods.gamesNamesList().get(0));
//        System.out.println(test.get(0));
//        System.out.println(casaMethods.gamesFullLine());
//        System.out.println(casaMethods.gamesFullLine().get(casaMethods.gamesNamesList().get(0)));

        menuHome.menuHome();
        menu.menuSub1Cases();

    }
}

