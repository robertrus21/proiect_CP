package helperMethods;

import java.util.List;

public class CalculationMethods {

    public double riskStage(List<Double> validNumbers, int amount) {
        double number = 0.0;
        for (Double i : validNumbers) {
            number = number + i;
        }
        number = number * amount;
        return number;
    }

}
