package org.lld;

public abstract class Calculator {
    private int leftNum;
    private int rightNum;

    public Calculator(int leftNum,int rightNum)
    {
        this.leftNum = leftNum;
        this.rightNum = rightNum;
    }

    public int getLeftNum() {
        return leftNum;
    }

    public void setLeftNum(int leftNum) {
        this.leftNum = leftNum;
    }

    public int getRightNum() {
        return rightNum;
    }

    public void setRightNum(int rightNum) {
        this.rightNum = rightNum;
    }

    public void display()
    {
        System.out.println("leftNum : "+leftNum+" rightNum : "+rightNum);
    }

    public abstract void calculate(int leftNum,int rightNum);
}
