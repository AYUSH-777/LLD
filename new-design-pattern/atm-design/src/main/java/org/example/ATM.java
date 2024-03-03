package org.example;

public class ATM {
    private int balance;
    private ATMState atmState;

    public ATM(int balance,ATMState atmState)
    {
        this.balance = balance;
        this.atmState = atmState;
    }

    public void insertTheCard()
    {
        atmState.insertCard(this);
    }

    public void checkBalance()
    {
        atmState.balance(this);
    }

    public void depositTheAmount(int depositAmt)
    {
        atmState.deposit(this,depositAmt);
    }

    public void withdrawTheAmount(int withdrawAmt)
    {
        atmState.withdrawal(this,withdrawAmt);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }
}
