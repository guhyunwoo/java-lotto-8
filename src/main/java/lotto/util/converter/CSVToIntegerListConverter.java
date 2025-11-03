package lotto.util.converter;

import lotto.error.ErrorMessage;

import java.util.Arrays;
import java.util.List;

public class CSVToIntegerListConverter {
    private static final String DELIMITER = ",";

    public static List<Integer> convert(String input) {
        try {
            String[] inputs = input.split(DELIMITER);
            return Arrays.stream(inputs).map(StringToIntegerConverter::convert).toList();
        } catch (Exception e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.content);
        }
    }
}
