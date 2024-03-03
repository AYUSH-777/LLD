package org.example;

public class ArithmeticExpression implements Expression{

    private NumericExpression lftExpression;
    private NumericExpression rhtExpression;

    public ArithmeticExpression(NumericExpression l,NumericExpression r)
    {
        this.lftExpression = l;
        this.rhtExpression = r;
    }
    @Override
    public int evaluate() {
        return lftExpression.evaluate() + rhtExpression.evaluate();
    }

    public NumericExpression getLftExpression() {
        return lftExpression;
    }

    public void setLftExpression(NumericExpression lftExpression) {
        this.lftExpression = lftExpression;
    }

    public NumericExpression getRhtExpression() {
        return rhtExpression;
    }

    public void setRhtExpression(NumericExpression rhtExpression) {
        this.rhtExpression = rhtExpression;
    }
}
