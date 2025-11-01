package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String readLottoPurchaseAmount() {
        System.out.println(InputMessage.PURCHASE_AMOUNT.content);
        return Console.readLine();
    }
}
