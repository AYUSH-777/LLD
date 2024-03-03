package org.example;

public class OuterClass {
    public static int staticVar = 10;
    public int nonStaticVar = 20;
    static class StaticNestedClass{
        public void print()
        {
            System.out.println(staticVar);
        }
    }
}
