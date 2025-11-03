package lotto.controller;

import lotto.domain.*;
import lotto.view.OutputView;

import java.util.List;

public class LottoController {
    public void run() {
        try {
            int purchaseAmount = getPurchaseAmount();
            Lottos lottos = issueLottos(purchaseAmount);
            WinningNumbers winningNumbers = getWinningNumbers();
            LottoRankResult result = matchLottos(lottos, winningNumbers);
            double profitRate = calculateProfitRate(purchaseAmount, result.getProfit());

            showResults(result, profitRate);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private int getPurchaseAmount() {
        return InputHandler.handleLottoPurchaseAmountInput();
    }

    private Lottos issueLottos(int purchaseAmount) {
        int numberOfTickets = NumberOfTicketsExtractor.extract(purchaseAmount);
        OutputView.showNumberOfTicketsResponse(numberOfTickets);
        Lottos lottos = Lottos.issue(numberOfTickets);
        OutputView.showLottosResponse(lottos);
        return lottos;
    }

    private WinningNumbers getWinningNumbers() {
        List<Integer> numbers = InputHandler.handleWinningNumbersInput();
        int bonus = InputHandler.handleBonusNumberInput();
        return new WinningNumbers(numbers, bonus);
    }

    private LottoRankResult matchLottos(Lottos lottos, WinningNumbers winningNumbers) {
        return lottos.match(winningNumbers);
    }

    private double calculateProfitRate(int purchaseAmount, int totalProfit) {
        return ProfitRateCalculator.calculate(purchaseAmount, totalProfit);
    }

    private void showResults(LottoRankResult result, double profitRate) {
        OutputView.showResultResponse(result);
        OutputView.showProfitRateResponse(profitRate);
    }
}
