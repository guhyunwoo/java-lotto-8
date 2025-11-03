package lotto.domain;

import lotto.error.ErrorMessage;

public class NumberOfTicketsExtractor {
    private static final int TICKET_UNIT_PRICE = 1000;

    public static int extract(int price) {
        if(price % TICKET_UNIT_PRICE != 0) {
            throw new IllegalArgumentException(ErrorMessage.LOTTO_PRICE_IS_NOT_DIVISIBLE.content);
        }
        return price / TICKET_UNIT_PRICE;
    }
}
