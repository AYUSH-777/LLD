package org.example;

public class UPI implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Amount : "+amount+" paid via UPI.");
    }
}
