package lotto.domain;

import lotto.error.ErrorMessage;

import java.util.List;

public class WinningNumbers {
    private final List<Integer> winningNumbers;
    private final int bonusNumber;

    public WinningNumbers(List<Integer> winningNumbers, int bonusNumber) {
        validate(winningNumbers, bonusNumber);
        this.winningNumbers = winningNumbers;
        this.bonusNumber = bonusNumber;
    }

    private void validate(List<Integer> winningNumbers, int bonusNumber) {
        validateBonusNumber(bonusNumber);
        for (Integer winningNumber : winningNumbers) {
            validateNumber(winningNumber);
        }
        validateBonusNumberNotInWinningNumbers(winningNumbers, bonusNumber);
    }

    private void validateNumber(int number) {
        if (number < 1 || number > 45) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_LOTTO_NUMBER.content);
        }
    }

    private void validateBonusNumber(int bonusNumber) {
        if (bonusNumber < 1 || bonusNumber > 45) {
            throw new IllegalArgumentException(ErrorMessage.BONUS_LOTTO_NUMBER.content);
        }
    }

    private void validateBonusNumberNotInWinningNumbers(List<Integer> winningNumbers, int bonusNumber) {
        if (winningNumbers.contains(bonusNumber)) {
            throw new IllegalArgumentException(ErrorMessage.LOTTO_NUMBER_IS_EQUALS_TO_BONUS_NUMBER.content);
        }
    }

    public boolean isWinningNumbersContainsNumber(int number) {
        return winningNumbers.contains(number);
    }

    public boolean isBonusNumberEquals(int number) {
        return bonusNumber == number;
    }
}
