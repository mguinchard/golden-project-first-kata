package fr.papiguinguin.goldenmasterkata1.controller;

import fr.papiguinguin.goldenmasterkata1.service.CalculatorService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@Validated
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public float divideNumberPositive(@NotNull Float number, @NotNull Float divisor) {
        return calculatorService.divideNumberPositive(number, divisor);
    }

}
