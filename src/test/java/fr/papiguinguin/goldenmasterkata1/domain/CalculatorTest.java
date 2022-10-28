package fr.papiguinguin.goldenmasterkata1.domain;

import org.assertj.core.internal.bytebuddy.implementation.bind.annotation.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;


class CalculatorTest {

    Calculator calculator = Calculator.builder().build();

    @Test
    void divideNumberPositive_nbr_and_divisor_less_than_0_should_return_minus_1 () {
        assertThat(calculator.divideNumberPositive(-10, -120)).isEqualTo(-1);
    }

    @Test
    void divideNumberPositive_nbr_greater_0_and_divisor_equals_0_should_return_0() {
        assertThat(calculator.divideNumberPositive(10, 0)).isEqualTo(0);
    }

    static Stream<Arguments> divideNumberPositive_nbr_greaterOrEquals_0_and_divisor_greater_0_should_return_real_divide_data() {
        return Stream.of(
                Arguments.of(10,10),
                Arguments.of(0,1)
        );
    }

    @ParameterizedTest
    @MethodSource("divideNumberPositive_nbr_greaterOrEquals_0_and_divisor_greater_0_should_return_real_divide_data")
    void divideNumberPositive_nbr_greaterOrEquals_0_and_divisor_greater_0_should_return_real_divide(float nbr, float divisor) {
        assertThat(calculator.divideNumberPositive(nbr, divisor)).isEqualTo(nbr/divisor);
    }
}
