package org.example;

public class BankTransfer implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Amount : "+amount+" paid via Bank Transfer.");
    }
}
