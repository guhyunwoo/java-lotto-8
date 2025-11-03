package lotto.domain;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
        if (numbers.size() != numbers.stream().distinct().count()) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 중복될 수 없습니다.");
        }
    }

    public Lotto sort() {
        List<Integer> sorted = numbers.stream()
                .sorted()
                .toList();
        return new Lotto(sorted);
    }

    public LottoRank match(WinningNumbers winningNumbers) {
        int matchCount = 0;
        boolean isContainsBonusNumber = false;
        for (int number : numbers) {
            if (winningNumbers.isWinningNumbersContainsNumber(number)) {
                matchCount++;
            } else if (winningNumbers.isBonusNumberEquals(number)) {
                isContainsBonusNumber = true;
            }
        }
        return LottoRank.valueOf(matchCount, isContainsBonusNumber);
    }

    @Override
    public String toString() {
        return numbers.toString();
    }
}
