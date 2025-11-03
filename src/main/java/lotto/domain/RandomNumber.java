package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class RandomNumber {
    private static final int START_INCLUSIVE = 1;
    private static final int END_EXCLUSIVE = 45;
    private static final int LOTTO_NUMBERS_COUNT = 6;

    public static List<Integer> generateLottoNumbers() {
        return Randoms.pickUniqueNumbersInRange(START_INCLUSIVE, END_EXCLUSIVE, LOTTO_NUMBERS_COUNT);
    }
}
