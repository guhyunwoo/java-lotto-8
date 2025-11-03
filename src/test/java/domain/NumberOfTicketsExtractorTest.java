package domain;

import lotto.domain.NumberOfTicketsExtractor;
import lotto.error.ErrorMessage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NumberOfTicketsExtractorTest {
    @Test
    void 금액이_0으로_나누어_떨어진다면_로또를_발행한다() {
        // given
        int fee = 1000;

        // when
        int numberOfTickets = NumberOfTicketsExtractor.extract(fee);

        // then
        assertThat(numberOfTickets).isEqualTo(1);
    }

    @Test
    void 금액이_0으로_나누어_떨어지지_않는다면_예외가_발생한다() {
        // given
        int fee = 1500;

        // when & then
        assertThatThrownBy(() -> NumberOfTicketsExtractor.extract(fee))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.LOTTO_PRICE_IS_NOT_DIVISIBLE.content);
    }
}
