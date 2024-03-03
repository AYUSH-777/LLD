package org.example;

public class OuterClass {
    private int nonStaticVar = 10;
    private static int staticVar = 20;

    public class InnerClass{
        int localVariable = 30;

        public void print()
        {
            System.out.println(nonStaticVar+staticVar+localVariable);
        }
    }
}
