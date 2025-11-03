package lotto.controller;

import lotto.domain.*;
import lotto.view.OutputView;

import java.util.List;

public class LottoController {
    public void run() {
        int purchaseAmount = InputHandler.handleLottoPurchaseAmountInput();
        int numberOfTickets = NumberOfTicketsExtractor.extract(purchaseAmount);
        OutputView.showNumberOfTicketsResponse(numberOfTickets);
        Lottos lottos = Lottos.issue(numberOfTickets);
        OutputView.showLottosResponse(lottos);

        List<Integer> winningNumbersInput = InputHandler.handleWinningNumbersInput();
        int bonusNumberInput = InputHandler.handleBonusNumberInput();
        WinningNumbers winningNumbers = new WinningNumbers(winningNumbersInput, bonusNumberInput);
        LottoRankResult result = lottos.match(winningNumbers);
        OutputView.showResultResponse(result);
        double profit = ProfitRateCalculator.calculate(purchaseAmount, result.getProfit());
    }
}
