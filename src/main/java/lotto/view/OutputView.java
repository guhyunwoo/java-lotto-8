package lotto.view;

import lotto.domain.Lotto;
import lotto.domain.Lottos;

public class OutputView {
    public static void showNumberOfTicketsResponse(int numberOfTickets) {
        System.out.println();
        System.out.printf(OutputMessage.NUMBER_OF_TICKETS.content, numberOfTickets);
    }

    public static void showLottosResponse(Lottos lottos) {
        System.out.println();
        for (Lotto lotto: lottos) {
            showOneLottoResponse(lotto);
        }
    }

    private static void showOneLottoResponse(Lotto lotto) {
        System.out.println(lotto);
    }
}
