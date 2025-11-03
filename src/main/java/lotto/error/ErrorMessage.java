package lotto.error;

public enum ErrorMessage {
    INVALID_INPUT("잘못된 입력 형식입니다."),
    LOTTO_PRICE_IS_NOT_DIVISIBLE("입력하신 로또 구입 금액이 1,000원으로 나누어 떨어지지 않습니다."),
    ;

    ErrorMessage(String content) {
        this.content = "[ERROR] " + content;
    }

    public final String content;
}
