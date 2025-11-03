package lotto.util.converter;

import lotto.error.ErrorMessage;

public class StringToIntegerConverter {
    public static Integer convert(String source) {
        try {
            return Integer.parseInt(source);
        } catch (Exception e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.content);
        }
    }
}
