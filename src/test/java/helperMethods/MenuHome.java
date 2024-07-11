package helperMethods;

import pages.HomePage;

import static share.SharedData.getWebDriver;

public class MenuHome {
    HomePage homePage = new HomePage(getWebDriver());
    public void menuHome () throws InterruptedException {
        System.out.println("Salut!");
        Thread.sleep(1000);
        System.out.println("Vreau sa te ajut sa pui un bilet la Casa Pariurilor.");
        Thread.sleep(1000);
        System.out.println("Tu trebuie sa alegi doar grupa, gradul de risc si suma pe care doresti sa o pariezi, iar de restul ma ocup eu.");
        Thread.sleep(1000);
        System.out.println();

    }

    public void menuSub1 () throws InterruptedException {
        System.out.println();
        System.out.println(ANSI_GREEN_BACKGROUND+"|---------------------------OPTIUNI DISPONIBILE----------------------------|"+ANSI_RESET);
        System.out.println("1. Afiseaza grupele de jocuri dispozibile.");
        System.out.println("2. Pariaza.");
        System.out.println("3. Inchide programul.");
        System.out.println(ANSI_GREEN_BACKGROUND+"|--------------------------------------------------------------------------|"+ANSI_RESET);
        Thread.sleep(500);
        System.out.print("Te rog sa alegi o optiune: ");
        System.out.println();
    }

    public void menuSub2 () throws InterruptedException {
        System.out.println();
        System.out.println(ANSI_GREEN_BACKGROUND+"|---------------------------OPTIUNI DISPONIBILE----------------------------|"+ANSI_RESET);
        System.out.println("1. Reafiseaza grupele de jocuri dispozibile.");
        System.out.println("2. Pune un bilet.");
        System.out.println("3. Meniul anterior.");
        System.out.println("4. Inchide programul.");
        System.out.println(ANSI_GREEN_BACKGROUND+"|--------------------------------------------------------------------------|"+ANSI_RESET);
        Thread.sleep(500);
        System.out.print("Te rog sa alegi o optiune: ");
        System.out.println();
    }

    public void menuSub3 () throws InterruptedException {
        System.out.println();
        System.out.println(ANSI_GREEN_BACKGROUND+"|------------ALEGE GRUPA DIN CARE DORESTI SA ITI FAC SELECTIA--------------|"+ANSI_RESET);
        System.out.println("1. " + homePage.gamesGroups().get(0));
        System.out.println("2. " + homePage.gamesGroups().get(1));
        System.out.println("3. " + homePage.gamesGroups().get(2));
        System.out.println("4. " + homePage.gamesGroups().get(3));
        System.out.println("5. " + homePage.gamesGroups().get(4));
        System.out.println("6. Meniul anterior.");
        System.out.println("7. Inchide programul.");
        System.out.println(ANSI_GREEN_BACKGROUND+"|--------------------------------------------------------------------------|"+ANSI_RESET);
        Thread.sleep(500);
        System.out.print("Te rog sa alegi o optiune: ");
        System.out.println();
    }

    public void menuSub4 () throws InterruptedException {
        System.out.println();
        System.out.println(ANSI_GREEN_BACKGROUND+"|---------------------------ALEGE GRADUL DE RISC---------------------------|"+ANSI_RESET);
        System.out.println("1. Mic.");
        System.out.println("2. Mediu.");
        System.out.println("3. Mare.");
        System.out.println("4. Meniul anterior.");
        System.out.println("5. Inchide programul.");
        System.out.println(ANSI_GREEN_BACKGROUND+"|--------------------------------------------------------------------------|"+ANSI_RESET);
        Thread.sleep(500);
        System.out.print("Te rog sa alegi o optiune: ");
        System.out.println();
    }

    public void menuSub5 () throws InterruptedException {
        System.out.println();
        System.out.println(ANSI_GREEN_BACKGROUND+"|---------------------------OPTIUNI DISPONIBILE----------------------------|"+ANSI_RESET);
        System.out.println("1. Previzualizare bilet.");
        System.out.println("2. Meniul anterior.");
        System.out.println("3. Inchide programul.");
        System.out.println(ANSI_GREEN_BACKGROUND+"|--------------------------------------------------------------------------|"+ANSI_RESET);
        Thread.sleep(500);
        System.out.print("Te rog sa alegi o optiune: ");
        System.out.println();
    }

    public void menuSub6 () throws InterruptedException {
        System.out.println();
        System.out.println(ANSI_GREEN_BACKGROUND+"|---------------------------OPTIUNI DISPONIBILE----------------------------|"+ANSI_RESET);
        System.out.println("1. Meniul anterior.");
        System.out.println("2. Inchide programul.");
        System.out.println(ANSI_GREEN_BACKGROUND+"|--------------------------------------------------------------------------|"+ANSI_RESET);
        Thread.sleep(500);
        System.out.print("Te rog sa alegi o optiune: ");
        System.out.println();
    }
    public void menuSub7 () throws InterruptedException {
        System.out.println();
        System.out.println(ANSI_GREEN_BACKGROUND+"|---------------------------OPTIUNI DISPONIBILE----------------------------|"+ANSI_RESET);
        System.out.println("1. Verificare cote raportat la gradul de risc ales.");
        System.out.println("2. Meniul anterior.");
        System.out.println("3. Inchide programul.");
        System.out.println(ANSI_GREEN_BACKGROUND+"|--------------------------------------------------------------------------|"+ANSI_RESET);
        Thread.sleep(500);
        System.out.print("Te rog sa alegi o optiune: ");
        System.out.println();
    }

    public void menuSub8 () throws InterruptedException {
        System.out.println();
        System.out.println(ANSI_GREEN_BACKGROUND+"|---------------------------OPTIUNI DISPONIBILE----------------------------|"+ANSI_RESET);
        System.out.println("1. Salveaza biletul.");
        System.out.println("2. Meniul anterior.");
        System.out.println("3. Inchide programul.");
        System.out.println(ANSI_GREEN_BACKGROUND+"|--------------------------------------------------------------------------|"+ANSI_RESET);
        Thread.sleep(500);
        System.out.print("Te rog sa alegi o optiune: ");
        System.out.println();
    }

    public void menuSub9 () throws InterruptedException {
        System.out.println();
        System.out.println(ANSI_GREEN_BACKGROUND+"|-----------------INTRODU SUMA PE CARE DORESTI SA O PARIEZI----------------|"+ANSI_RESET);
        System.out.println();
        System.out.println();
        System.out.println(ANSI_GREEN_BACKGROUND+"|--------------------------------------------------------------------------|"+ANSI_RESET);
        Thread.sleep(500);
        System.out.print("Suma: ");
        System.out.println();
    }


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";

}
