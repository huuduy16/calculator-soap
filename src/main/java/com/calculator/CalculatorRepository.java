package com.calculator;

import com.calculator.client.gen.Expression;
import org.springframework.stereotype.Component;

@Component
public class CalculatorRepository {

    public String calculate(Expression expression) {
        Double a = expression.getNum0();
        Double b = expression.getNum1();
        String operation = expression.getOperation();
        switch (operation) {
            case "+": {
                return "" + a + " + " + b + " = " + (a + b);
            }
            case "-": {
                return "" + a + " - " + b + " = " + (a - b);
            }
            case "*": {
                return "" + a + " * " + b + " = " + (a * b);
            }
            case "/": {
                return "" + a + " / " + b + " = " + (a / b);
            }
            case "**": {
                return "" + a + " ** " + b + " = " + (Math.pow(a, b));
            }
        }
        return "not recognize input";
    }
}
