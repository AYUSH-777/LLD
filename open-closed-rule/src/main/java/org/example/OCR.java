package org.example;

import org.example.service.Addition;
import org.example.service.Subtraction;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class OCR {
    public static void main(String[] args) {
        CalculatorOperator calculatorOperator = new CalculatorOperator();
        Calculator additionOpn = new Addition(10,20);
        calculatorOperator.performCalculation(additionOpn);
        Calculator subtractionOpn = new Subtraction(20,10);
        calculatorOperator.performCalculation(subtractionOpn);
    }
}