package org.lld;

import org.lld.service.Addition;
import org.lld.service.Subtraction;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class LSR {
    public static void main(String[] args) {
        CalculatorOperator calculatorOperator = new CalculatorOperator();
        Calculator additionOpn = new Addition(10,15);
        calculatorOperator.calculateOpn(additionOpn);
        Calculator subOpn = new Subtraction(20,25);
        calculatorOperator.calculateOpn(subOpn);
    }
}