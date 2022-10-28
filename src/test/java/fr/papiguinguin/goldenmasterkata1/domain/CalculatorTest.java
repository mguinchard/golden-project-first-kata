package fr.papiguinguin.goldenmasterkata1.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class CalculatorTest {
    
    Calculator calculator = Calculator.builder().build();
    
    static Stream<Arguments> divideNumberPositive_data() {
        return Stream.of(
            Arguments.of(10, 10, 1),
            Arguments.of(0, 1, 0),
            Arguments.of(-10, -120, -1),
            Arguments.of(10, 0, 0)
        );
    }
    
    @ParameterizedTest
    @MethodSource("divideNumberPositive_data")
    void divideNumberPositive(
        float nbr,
        float divisor,
        float expected
    ) {
        assertThat(calculator.divideNumberPositive(nbr, divisor)).isEqualTo(expected);
    }
    
    
    static Stream<Arguments> divideNumberPositive_data_etape3() {
        return Stream.of(
            Arguments.of(10, 10, 1),
            Arguments.of(0, 1, 0),
            Arguments.of(-10, -120, -1),
            Arguments.of(10, 0, 0)
        );
    }
    
    
    @ParameterizedTest
    @MethodSource("divideNumberPositive_data_etape3")
    void divideNumberPositive_etape3(
        float nbr,
        float divisor,
        float expected
    ) {
        assertThat(calculator.divideNumberPositive(nbr, divisor)).isEqualTo(expected);
    }
    
}
