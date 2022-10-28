package fr.papiguinguin.goldenmasterkata1.controller;

import fr.papiguinguin.goldenmasterkata1.service.CalculatorService;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@Validated
public class MyController {

    private final CalculatorService calculatorService;

    public MyController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public float divideNumberPositive(@NotNull Float number, @NotNull Float divisor) {
        return calculatorService.divideNumberPositive(number, divisor);
    }

}
