package lotto.domain;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LottoRankResult {
    private final List<LottoRank> lottoRanks;

    public LottoRankResult(List<LottoRank> lottoRanks) {
        this.lottoRanks = lottoRanks;
    }

    public int getLottoRanksCount(LottoRank lottoRank) {
        AtomicInteger count = new AtomicInteger(0);
        lottoRanks.forEach(eachLottoRank -> {
            if(eachLottoRank.name().equals(lottoRank.name())) {
                count.getAndIncrement();
            }
        });
        return count.get();
    }
}
