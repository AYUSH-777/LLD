package org.example;

public class NumericExpression implements Expression{

    private int value;

    public NumericExpression(int value)
    {
        this.value = value;
    }
    @Override
    public int evaluate() {
        return value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
