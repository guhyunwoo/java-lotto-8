package lotto.controller;

import lotto.domain.Lottos;
import lotto.domain.NumberOfTicketsExtractor;
import lotto.view.OutputView;

public class LottoController {
    public void run() {
        int purchaseAmount = InputHandler.handleLottoPurchaseAmountInput();
        int numberOfTickets = NumberOfTicketsExtractor.extract(purchaseAmount);
        OutputView.showNumberOfTicketsResponse(numberOfTickets);
        Lottos lottos = Lottos.issue(numberOfTickets);
        OutputView.showLottosResponse(lottos);
    }
}
