package org.example;

public class Payment {
    PaymentStrategy paymentStrategy;

    public Payment(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount)
    {
        paymentStrategy.pay(amount);
    }
}
