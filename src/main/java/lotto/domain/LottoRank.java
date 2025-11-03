package lotto.domain;

public enum LottoRank {
    FIRST(6, 2_000_000_000),
    SECOND(6, 30_000_000),
    THIRD(5, 1_500_000),
    FOURTH(4, 50_000),
    FIFTH(3, 5_000),
    MISS(0, 0);

    private final int matchCount;
    private final int reward;

    LottoRank(int matchCount, int reward) {
        this.matchCount = matchCount;
        this.reward = reward;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public int getReward() {
        return reward;
    }

    public static LottoRank valueOf(int matchCount, boolean isContainsBonusNumber) {
        if (matchCount == 6 && isContainsBonusNumber) return SECOND;
        if (matchCount == 6) return FIRST;
        if (matchCount == 5) return THIRD;
        if (matchCount == 4) return FOURTH;
        if (matchCount == 3) return FIFTH;
        return MISS;
    }
}
