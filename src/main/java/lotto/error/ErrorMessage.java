package lotto.error;

public enum ErrorMessage {
    INVALID_INPUT("잘못된 입력 형식입니다."),
    LOTTO_PRICE_IS_NOT_DIVISIBLE("입력하신 로또 구입 금액이 1,000원으로 나누어 떨어지지 않습니다."),
    LOTTO_PRICE_IS_LESS_THAN_ZERO("0원 이하로는 입력하실 수 없습니다."),
    INVALID_LOTTO_NUMBER("로또 번호는 1부터 45 사이의 숫자여야 합니다."),
    BONUS_LOTTO_NUMBER("보너스 번호는 1부터 45 사이의 숫자여야 합니다."),
    LOTTO_NUMBER_IS_EQUALS_TO_BONUS_NUMBER("보너스 번호는 로또 번호와 중복될 수 없습니다."),
    ;

    ErrorMessage(String content) {
        this.content = "[ERROR] " + content;
    }

    public final String content;
}
