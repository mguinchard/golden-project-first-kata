package fr.papiguinguin.goldenmasterkata1.service;

import fr.papiguinguin.goldenmasterkata1.domain.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public float divideNumberPositive(float nbr, float divisor) {
        Calculator calculator = Calculator.builder().build();
        return calculator.divideNumberPositive(nbr, divisor);
    }

}
