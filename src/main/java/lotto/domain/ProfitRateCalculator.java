package lotto.domain;

public class ProfitRateCalculator {
    public static double calculate(int purchaseAmount, int profit) {
        return (double) profit / purchaseAmount * 100;
    }
}
