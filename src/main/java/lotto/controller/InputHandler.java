package lotto.controller;

import lotto.util.converter.StringToIntegerConverter;
import lotto.view.InputView;

public class InputHandler {
    public static Integer handleLottoPurchaseAmountInput() {
        String input = InputView.readLottoPurchaseAmount();
        return StringToIntegerConverter.convert(input);
    }
}
