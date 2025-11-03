package lotto.view;

public class OutputView {
    public static void showNumberOfTicketsResponse(int numberOfTickets) {
        System.out.println();
        System.out.printf(OutputMessage.NUMBER_OF_TICKETS.content, numberOfTickets);
    }
}
