package lotto.view;

import lotto.domain.Lotto;
import lotto.domain.LottoRank;
import lotto.domain.LottoRankResult;
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
        System.out.println();
    }

    private static void showOneLottoResponse(Lotto lotto) {
        System.out.println(lotto);
    }

    public static void showResultResponse(LottoRankResult lottoRankResult) {
        System.out.println();
        System.out.printf(
                OutputMessage.RANK_RESULT.content,
                lottoRankResult.getLottoRanksCount(LottoRank.FIFTH),
                lottoRankResult.getLottoRanksCount(LottoRank.FOURTH),
                lottoRankResult.getLottoRanksCount(LottoRank.THIRD),
                lottoRankResult.getLottoRanksCount(LottoRank.SECOND),
                lottoRankResult.getLottoRanksCount(LottoRank.FIRST)
        );
    }
}
