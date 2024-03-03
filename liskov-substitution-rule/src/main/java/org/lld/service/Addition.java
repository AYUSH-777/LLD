package org.lld.service;

import org.lld.Calculator;

public class Addition extends Calculator {

    public Addition(int leftNum,int rightNum)
    {
        super(leftNum,rightNum);
    }

    @Override
    public void calculate(int leftNum, int rightNum)
    {
        System.out.println("Addition Result :"+(leftNum+rightNum));
    }
}
