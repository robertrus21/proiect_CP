package helperMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

import static helperMethods.MenuHome.*;

public class CasaMethods extends BasePage {

    public CasaMethods(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//div[contains(@class, 'events-table-box')]/table[contains(@class, 'table events-table')]/tbody/tr/td[1]//div[contains(@class, 'event-name')]//span[contains(@class, 'market-name')]")
    private List<WebElement> gameName;
    @FindBy(xpath = "//div[contains(@class, 'events-table-box')]/table[contains(@class, 'table events-table')]/tbody/tr/td[2]//a[contains(@disabled, 'false')]")
    private List<WebElement> gameFirstNumber;
    @FindBy(xpath = "//div[contains(@class, 'events-table-box')]/table[contains(@class, 'table events-table')]/tbody/tr/td[3]//a[contains(@disabled, 'false')]")
    private List<WebElement> gameSecondNumber;
    @FindBy(xpath = "//div[contains(@class, 'events-table-box')]/table[contains(@class, 'table events-table')]/tbody/tr/td[4]//a[contains(@disabled, 'false')]")
    private List<WebElement> gameThirdNumber;

    public List<String> gamesNamesList() {
        List<String> gamesNamesList = new ArrayList<>();
        int size = Math.min(gameName.size(), 10);
        for (int i = 0; i < size; i++) {
            gamesNamesList.add(gameName.get(i).getText());
        }
        return gamesNamesList;
    }

    public List<String> gamesFirstNumberList() {
        List<String> gamesFirstNumberList = new ArrayList<>();
        int size = Math.min(gameFirstNumber.size(), 10);
        for (int i = 0; i < size; i++) {
            gamesFirstNumberList.add(gameFirstNumber.get(i).getText());
        }
        return gamesFirstNumberList;
    }

    public List<String> gamesSecondNumberList() {
        List<String> gamesSecondNumberList = new ArrayList<>();
        int size = Math.min(gameSecondNumber.size(), 10);
        for (int i = 0; i < size; i++) {
            gamesSecondNumberList.add(gameSecondNumber.get(i).getText());
        }
        return gamesSecondNumberList;
    }

    public List<String> gamesThirdNumberList() {
        List<String> gamesThirdNumberList = new ArrayList<>();
        int size = Math.min(gameThirdNumber.size(), 10);
        for (int i = 0; i < size; i++) {
            gamesThirdNumberList.add(gameThirdNumber.get(i).getText());
        }
        return gamesThirdNumberList;
    }

    public Map<String, List<String>> gamesFullLine() {
        List<String> gamesNameList = gamesNamesList();
        List<String> gamesFirstNumberList = gamesFirstNumberList();
        List<String> gamesSecondNumberList = gamesSecondNumberList();
        List<String> gamesThirdNumberList = gamesThirdNumberList();
        Map<String, List<String>> gamesFullLine = new HashMap<>();
        int sizeN = Math.min(gamesNameList.size(), 10);
        int sizeF = Math.min(gamesFirstNumberList.size(), 10);
        int sizeS = Math.min(gamesSecondNumberList.size(), 10);
        int sizeT = Math.min(gamesThirdNumberList.size(), 10);

        for (int i = 0; i < sizeN; i++) {
            List<String> coteMeci = new ArrayList<>();
            if (i < sizeF) {
                coteMeci.add(gamesFirstNumberList.get(i));
            }
            if (i < sizeS) {
                coteMeci.add(gamesSecondNumberList.get(i));
            }
            if (i < sizeT) {
                coteMeci.add(gamesThirdNumberList.get(i));
            }
            gamesFullLine.put(gamesNameList.get(i), coteMeci);
        }
        return gamesFullLine;
    }

    public Map<String, Double> getValidNumberMap(int input) {
        Map<String, List<String>> gamesFullLine = gamesFullLine();
        Map<String, Double> validNumberMap = new HashMap<>();
        switch (input) {
            case 1:
                return getStringDoubleMap(gamesFullLine, 1, 2, validNumberMap);
            case 2:
                return getStringDoubleMap(gamesFullLine, 2, 4, validNumberMap);
            case 3:
                return getStringDoubleMap(gamesFullLine, 4, Integer.MAX_VALUE, validNumberMap);
            default:
                return validNumberMap;
        }
    }

    private Map<String, Double> getStringDoubleMap(Map<String, List<String>> gamesFullLine, int x, int x1, Map<String, Double> validNumberMap) {
        int size = gamesFullLine.size();
        if (size > 10){
            size = 10;
        }
        for (int i = 0; i < size; i++) {
            String gameName = gamesNamesList().get(i);
            List<String> cote = gamesFullLine.get(gameName);
            cote.stream()
                    .map(Double::valueOf)
                    .filter(cota -> cota >= x && cota <= x1)
                    .min(Comparator.comparing(cota -> cota)).ifPresent(min -> validNumberMap.put(gameName, min));
        }
        return validNumberMap;
    }

    public void printValidationResult(Map<String, Double> validNumberMap, int x, int x1, int riskValue) {
        for (String gameName : validNumberMap.keySet()) {
            Double validNumber = validNumberMap.get(gameName);
            if (validNumber >= x && validNumber <= x1) {
                System.out.println();
                System.out.println("Cota " + ANSI_GREEN_BACKGROUND +validNumber + ANSI_RESET + " se incadreaza in gradul de risc " + riskValue);
            } else {
                System.out.println();
                System.out.println("Cota " + ANSI_RED_BACKGROUND +validNumber + ANSI_RESET + " nu se incadreaza in gradul de risc " + riskValue);
            }
        }
    }

    public void printFile(String gameLine) throws IOException {
        Path fileName = Path.of("src/main/resources/Bilete.txt");
        String nextLine = System.lineSeparator() + gameLine;
        Files.write(fileName,  nextLine.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);

    }
}
