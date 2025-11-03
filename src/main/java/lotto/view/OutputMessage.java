package lotto.view;

public enum OutputMessage {
    NUMBER_OF_TICKETS("%d개를 구매했습니다."),
    ;

    public final String content;

    OutputMessage(String content) {
        this.content = content;
    }
}
