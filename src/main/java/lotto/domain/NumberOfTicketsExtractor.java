package lotto.domain;

import lotto.error.ErrorMessage;

public class NumberOfTicketsExtractor {
    private static final int TICKET_UNIT_PRICE = 1000;

    public static int extract(int price) {
        ensurePrice(price);
        return price / TICKET_UNIT_PRICE;
    }

    private static void ensurePrice(int price) {
        ensurePriceIsDivisible(price);
        ensurePriceIsBiggerThanZero(price);
    }

    private static void ensurePriceIsDivisible(int price) {
        if(price % TICKET_UNIT_PRICE != 0) {
            throw new IllegalArgumentException(ErrorMessage.LOTTO_PRICE_IS_NOT_DIVISIBLE.content);
        }
    }

    private static void ensurePriceIsBiggerThanZero(int price) {
        if(price < 0) {
            throw new IllegalArgumentException(ErrorMessage.LOTTO_PRICE_IS_LESS_THAN_ZERO.content);
        }
    }
}
