package org.example;

public interface ATMState {
    void withdrawal(ATM atm,int withdrawalAmt);
    void deposit(ATM atm,int depositAmt);
    void balance(ATM atm);
    void insertCard(ATM atm);
}
