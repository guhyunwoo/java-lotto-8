package lotto.error;

public enum ErrorMessage {
    INVALID_INPUT("잘못된 입력 형식입니다."),
    ;

    ErrorMessage(String content) {
        this.content = "[ERROR] " + content;
    }

    public final String content;
}
