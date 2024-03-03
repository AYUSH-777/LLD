package org.example.service;

import org.example.Calculator;

public class Subtraction implements Calculator {
    private int firstNum;
    private int secNum;

    public Subtraction(int firstNum, int secNum) {
        this.firstNum = firstNum;
        this.secNum = secNum;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecNum() {
        return secNum;
    }

    public void setSecNum(int secNum) {
        this.secNum = secNum;
    }

    @Override
    public void calculate()
    {
        int result = firstNum - secNum;
        System.out.println("Subtraction Result : "+result);
    }
}
