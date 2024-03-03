package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Operation addition = (a, b) -> a + b;
//        Operation subtraction = (a,b) -> a - b;
//        System.out.println("Addition: " + operate(10, 5, addition));
//        System.out.println("Addition: " + operate(10, 5, subtraction));
        Operation addition = (a,b) -> (a+b);
        Operation subtraction = (a,b) -> (a-b);

        System.out.println("Addition : "+operate(100,200,addition));
        System.out.println("Subtraction : "+operate(200,100,subtraction));

    }

    public static int operate(int a,int b,Operation operation)
    {
        return operation.operate(a,b);
    }
}