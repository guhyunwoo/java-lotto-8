package lotto.controller;

import lotto.util.converter.StringToIntegerConverter;
import lotto.util.converter.CSVToIntegerListConverter;
import lotto.view.InputMessage;
import lotto.view.InputView;

import java.util.List;

public class InputHandler {
    public static Integer handleLottoPurchaseAmountInput() {
        String input = InputView.read(InputMessage.PURCHASE_AMOUNT);
        return StringToIntegerConverter.convert(input);
    }

    public static List<Integer> handleWinningNumbersInput() {
        String input = InputView.read(InputMessage.WINNING_NUMBERS);
        return CSVToIntegerListConverter.convert(input);
    }

    public static int handleBonusNumberInput() {
        String input = InputView.read(InputMessage.BONUS_NUMBER);
        return StringToIntegerConverter.convert(input);
    }
}
