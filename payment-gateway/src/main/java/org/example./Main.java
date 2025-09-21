package org.example;

public class Main {
    public static void main(String[] args) {
        Payment payment1 = new Payment(new BankTransfer());
        payment1.pay(50);

        Payment payment2 = new Payment(new UPI());
        payment2.pay(100);
    }
}