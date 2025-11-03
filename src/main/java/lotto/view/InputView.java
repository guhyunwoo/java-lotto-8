package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String read(InputMessage inputMessage) {
        System.out.println(inputMessage.content);
        return Console.readLine();
    }
}
