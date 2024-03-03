package org.lld.service;

import org.lld.Calculator;

public class Subtraction extends Calculator {
    public Subtraction(int leftNum,int rightNum)
    {
        super(leftNum,rightNum);
    }
    @Override
    public void calculate(int leftNum,int rightNum)
    {
        System.out.println("Subtraction Result : "+(leftNum-rightNum));
    }
}
