package helperMethods;

import pages.GamesPage;
import pages.HomePage;
import share.SharedData;

import java.util.*;

import static helperMethods.MenuHome.*;
import static share.SharedData.getWebDriver;

public class Menu {
    HomePage homePage = new HomePage(getWebDriver());
    MenuHome menuHome = new MenuHome();
    GamesPage gamesPage = new GamesPage(getWebDriver());
    Scanner sc = new Scanner(System.in);
    SharedData sharedData = new SharedData();
    int input;
    String gameGroup;

    int money;


    public void menuSub1Cases() throws InterruptedException {

        while (true) {
            menuHome.menuSub1();
            try {
                input = sc.nextInt();
                if (input >= 1 && input <= 5) {
                    switch (input) {
                        case 1:
                            System.out.println("1. " + homePage.gamesGroups().get(0));
                            System.out.println("2. " + homePage.gamesGroups().get(1));
                            System.out.println("3. " + homePage.gamesGroups().get(2));
                            System.out.println("4. " + homePage.gamesGroups().get(3));
                            System.out.println("5. " + homePage.gamesGroups().get(4));
                            break;
                        case 2:
                            menuSub2Cases();
                        case 3:
                            sc.close();
                            sharedData.afterDriver();
                            break;
                    }
                } else {
                    System.out.println(ANSI_RED_BACKGROUND + "Optiunea nu exista!" + ANSI_RESET);
                    System.out.println("|--------------------------------------------------------------------------|");
                    System.out.println("Te rog sa alegi o optiune: ");
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED_BACKGROUND
                        + "Valoarea introdusa trebuie sa fie numarul din dreptul optiunii din meniu!" + ANSI_RESET);
                System.out.println("|--------------------------------------------------------------------------|");
                System.out.println("Te rog sa alegi o optiune: ");
                sc.nextLine();
            }

        }
    }

    public void menuSub2Cases() throws InterruptedException {

        while (true) {
            menuHome.menuSub2();
            try {
                input = sc.nextInt();
                if (input >= 1 && input <= 4) {
                    switch (input) {
                        case 1:
                            System.out.println("1. " + homePage.gamesGroups().get(0));
                            System.out.println("2. " + homePage.gamesGroups().get(1));
                            System.out.println("3. " + homePage.gamesGroups().get(2));
                            System.out.println("4. " + homePage.gamesGroups().get(3));
                            System.out.println("5. " + homePage.gamesGroups().get(4));
                            break;
                        case 2:
                            menuSub3Cases();
                        case 3:
                            menuSub1Cases();
                        case 4:
                            sc.close();
                            sharedData.afterDriver();
                            break;

                    }
                } else {
                    System.out.println(ANSI_RED_BACKGROUND + "Optiunea nu exista!" + ANSI_RESET);
                    System.out.println("|--------------------------------------------------------------------------|");
                    System.out.println("Te rog sa alegi o optiune: ");
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED_BACKGROUND
                        + "Valoarea introdusa trebuie sa fie numarul din dreptul optiunii din meniu!" + ANSI_RESET);
                System.out.println("|--------------------------------------------------------------------------|");
                System.out.println("Te rog sa alegi o optiune: ");
                sc.nextLine();
            }
        }
    }

    public void menuSub3Cases() throws InterruptedException {

        while (true) {
            menuHome.menuSub3();
            try {
                input = sc.nextInt();
                if (input >= 1 && input <= 7) {
                    switch (input) {
                        case 1:
                            System.out.println("Ai ales 1. " + homePage.gamesGroups().get(0));
                            gameGroup = homePage.gamesGroups().get(0);
                            gamesPage.gameCategory(gameGroup);
                            menuSub4Cases(0);
                        case 2:
                            System.out.println("Ai ales 2. " + homePage.gamesGroups().get(1));
                            gameGroup = homePage.gamesGroups().get(1);
                            gamesPage.gameCategory(gameGroup);
                            menuSub4Cases(1);
                        case 3:
                            System.out.println("Ai ales 3. " + homePage.gamesGroups().get(2));
                            gameGroup = homePage.gamesGroups().get(2);
                            gamesPage.gameCategory(gameGroup);
                            menuSub4Cases(2);
                        case 4:
                            System.out.println("Ai ales 4. " + homePage.gamesGroups().get(3));
                            gameGroup = homePage.gamesGroups().get(3);
                            gamesPage.gameCategory(gameGroup);
                            menuSub4Cases(3);
                        case 5:
                            System.out.println("Ai ales 5. " + homePage.gamesGroups().get(4));
                            gameGroup = homePage.gamesGroups().get(4);
                            gamesPage.gameCategory(gameGroup);
                            menuSub4Cases(4);
                        case 6:
                            menuSub1Cases();
                        case 7:
                            sc.close();
                            sharedData.afterDriver();
                            break;

                    }
                } else {
                    System.out.println(ANSI_RED_BACKGROUND + "Optiunea nu exista!" + ANSI_RESET);
                    System.out.println("|--------------------------------------------------------------------------|");
                    System.out.println("Te rog sa alegi o optiune: ");
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED_BACKGROUND
                        + "Valoarea introdusa trebuie sa fie numarul din dreptul optiunii din meniu!" + ANSI_RESET);
                System.out.println("|--------------------------------------------------------------------------|");
                System.out.println("Te rog sa alegi o optiune: ");
                sc.nextLine();
            }


        }

    }

    public void menuSub4Cases(int groupSelected) throws InterruptedException {

        while (true) {
            menuHome.menuSub4();
            gameGroup = homePage.gamesGroups().get(groupSelected);
            gamesPage.gameCategory(gameGroup);
            try {
                input = sc.nextInt();
                if (input >= 1 && input <= 5) {
                    switch (input) {
                        case 1:
                            System.out.println(ANSI_YELLOW_BACKGROUND + "Ai ales 1 - Grad mic de risc" + ANSI_RESET);
                            System.out.println();
                            menuSub9Cases(input);
                        case 2:
                            System.out.println(ANSI_YELLOW_BACKGROUND + "Ai ales 2 - Grad mediu de risc" + ANSI_RESET);
                            System.out.println();
                            menuSub9Cases(input);
                        case 3:
                            System.out.println(ANSI_YELLOW_BACKGROUND + "Ai ales 3 - Grad mare de risc" + ANSI_RESET);
                            System.out.println();
                            menuSub9Cases(input);
                        case 4:
                            //homePage.navigateHome();
                            menuSub1Cases();
                        case 5:
                            sc.close();
                            sharedData.afterDriver();
                            break;

                    }
                } else {
                    System.out.println(ANSI_RED_BACKGROUND + "Optiunea nu exista!" + ANSI_RESET);
                    System.out.println("|--------------------------------------------------------------------------|");
                    System.out.println("Te rog sa alegi o optiune: ");
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED_BACKGROUND
                        + "Valoarea introdusa trebuie sa fie numarul din dreptul optiunii din meniu!" + ANSI_RESET);
                System.out.println("|--------------------------------------------------------------------------|");
                System.out.println("Te rog sa alegi o optiune: ");
                sc.nextLine();
            }


        }
    }

    public void menuSub5Cases(int riskValue, int amount) throws InterruptedException {

        while (true) {
            menuHome.menuSub5();
            try {
                input = sc.nextInt();
                if (input >= 1 && input <= 4) {
                    switch (input) {
                        case 1:
                            System.out.println("1. Previzualizare bilet.");
                            //catre functie
                            menuSub6Cases(riskValue, amount);
                        case 2:
                            System.out.println("3. Verifica cotele.");
                            //catre functie
                            menuSub8Cases(riskValue);
                        case 3:
                            menuSub1Cases();
                        case 4:
                            sc.close();
                            sharedData.afterDriver();
                            break;

                    }
                } else {
                    System.out.println(ANSI_RED_BACKGROUND + "Optiunea nu exista!" + ANSI_RESET);
                    System.out.println("|--------------------------------------------------------------------------|");
                    System.out.println("Te rog sa alegi o optiune: ");
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED_BACKGROUND
                        + "Valoarea introdusa trebuie sa fie numarul din dreptul optiunii din meniu!" + ANSI_RESET);
                System.out.println("|--------------------------------------------------------------------------|");
                System.out.println("Te rog sa alegi o optiune: ");
                sc.nextLine();
            }
        }
    }

    public void menuSub6Cases(int riskValue, int amount) throws InterruptedException {

        while (true) {
            System.out.println();
            System.out.println("PREVIZUALIZARE BILET");
            System.out.println();
            CalculationMethods calculationMethods = new CalculationMethods();
            CasaMethods casaMethods = new CasaMethods(getWebDriver());
            Map<String, Double> validNumberMap = casaMethods.getValidNumberMap(riskValue);
            Map<String, List<String>> gamesList = casaMethods.gamesFullLine();
            List<Double> allValidNumbers = new ArrayList<>();
            for (String gameName : validNumberMap.keySet()) {
                Double validNumber = validNumberMap.get(gameName);
                List<String> allNumbers = gamesList.get(gameName);
                List<String> allNumbersFormatted = new ArrayList<>();
                allValidNumbers.add(validNumber);
                for (String number : allNumbers) {
                    Double numberDouble = Double.parseDouble(number);
                    if (numberDouble.equals(validNumber)) {
                        allNumbersFormatted.add(ANSI_GREEN_BACKGROUND + number + ANSI_RESET);
                    } else {
                        allNumbersFormatted.add(number);
                    }
                }
                System.out.println(gameName + " || " + String.join(" - ", allNumbersFormatted));
            }

            if (allValidNumbers.equals(0)){
                System.out.println("mata");
            }

            double possibleWin = calculationMethods.riskStage(allValidNumbers, amount);
            System.out.println();
            System.out.println(ANSI_GREEN_BACKGROUND + "Posibil castig - calcul standard: " + possibleWin + " RON" + ANSI_RESET);
            System.out.println();

            menuHome.menuSub6();
            try {
                input = sc.nextInt();
                if (input >= 1 && input <= 2) {
                    switch (input) {
                        case 1:
                            menuSub2Cases();
                        case 2:
                            menuSub2Cases();
                        case 3:
                            menuSub2Cases();
                        case 4:
                            sc.close();
                            sharedData.afterDriver();
                            break;
                    }
                } else {
                    System.out.println(ANSI_RED_BACKGROUND + "Optiunea nu exista!" + ANSI_RESET);
                    System.out.println("|--------------------------------------------------------------------------|");
                    System.out.println("Te rog sa alegi o optiune: ");
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED_BACKGROUND
                        + "Valoarea introdusa trebuie sa fie numarul din dreptul optiunii din meniu!" + ANSI_RESET);
                System.out.println("|--------------------------------------------------------------------------|");
                System.out.println("Te rog sa alegi o optiune: ");
                sc.nextLine();
            }


        }
    }

    public void menuSub7Cases() throws InterruptedException {

        while (true) {
            System.out.println("SALVARE BILET");
            menuHome.menuSub7();
            try {
                input = sc.nextInt();
                if (input >= 1 && input <= 2) {
                    switch (input) {
                        case 1:
                            menuSub2Cases();
                        case 2:
                            sc.close();
                            sharedData.afterDriver();
                            break;

                    }
                } else {
                    System.out.println(ANSI_RED_BACKGROUND + "Optiunea nu exista!" + ANSI_RESET);
                    System.out.println("|--------------------------------------------------------------------------|");
                    System.out.println("Te rog sa alegi o optiune: ");
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED_BACKGROUND
                        + "Valoarea introdusa trebuie sa fie numarul din dreptul optiunii din meniu!" + ANSI_RESET);
                System.out.println("|--------------------------------------------------------------------------|");
                System.out.println("Te rog sa alegi o optiune: ");
                sc.nextLine();
            }
        }
    }

    public void menuSub8Cases(int riskValue) throws InterruptedException {

        while (true) {
            System.out.println("VERIFICA COTELE/GRADUL DE RISC");
            menuHome.menuSub8();
            try {
                input = sc.nextInt();
                if (input >= 1 && input <= 2) {
                    switch (input) {
                        case 1:
                            menuSub2Cases();
                        case 2:
                            sc.close();
                            sharedData.afterDriver();
                            break;
                    }
                } else {
                    System.out.println(ANSI_RED_BACKGROUND + "Optiunea nu exista!" + ANSI_RESET);
                    System.out.println("|--------------------------------------------------------------------------|");
                    System.out.println("Te rog sa alegi o optiune: ");
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED_BACKGROUND
                        + "Valoarea introdusa trebuie sa fie numarul din dreptul optiunii din meniu!" + ANSI_RESET);
                System.out.println("|--------------------------------------------------------------------------|");
                System.out.println("Te rog sa alegi o optiune: ");
                sc.nextLine();
            }
        }
    }

    public int menuSub9Cases(int riskValue) throws InterruptedException {

        while (true) {
            System.out.println("INTRODU SUMA");
            menuHome.menuSub9();
            try {
                input = sc.nextInt();
                if (input >= 1 && input <= 999999) {
                    money = input;
                    menuSub5Cases(riskValue, input);
                } else {
                    System.out.println(ANSI_RED_BACKGROUND + "INCORECT - Suma introdusa trebuie sa fie in intervalul 1 - 999999 RON!" + ANSI_RESET);
                    System.out.println("|--------------------------------------------------------------------------|");
                    System.out.println("Te rog sa reintroduci suma: ");
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED_BACKGROUND
                        + "INCORECT - Suma introdusa trebuie sa fie numar intreg!" + ANSI_RESET);
                System.out.println("|--------------------------------------------------------------------------|");
                System.out.println("Te rog sa reintroduci suma: ");
                sc.nextLine();
            }
        }
    }

}

