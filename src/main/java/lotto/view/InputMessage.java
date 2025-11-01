package lotto.view;

public enum InputMessage {
    PURCHASE_AMOUNT("구입금액을 입력해 주세요."),
    ;

    public final String content;

    InputMessage(String content) {
        this.content = content;
    }
}
