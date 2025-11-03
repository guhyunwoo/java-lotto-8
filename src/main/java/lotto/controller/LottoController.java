package lotto.controller;

import lotto.domain.Lottos;
import lotto.domain.NumberOfTicketsExtractor;
import lotto.domain.WinningNumbers;
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
    }
}
