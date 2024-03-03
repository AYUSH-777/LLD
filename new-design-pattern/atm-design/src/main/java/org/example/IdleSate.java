package org.example;

public class IdleSate implements ATMState{

    public IdleSate()
    {

    }

    @Override
    public void withdrawal(ATM atm,int withdrawalAmt) {
        System.out.println("Withdrawal not possible bcos currently ATM is in Idle State");
    }

    @Override
    public void deposit(ATM atm,int depositAmt) {
        System.out.println("Deposit not possible bcos currently ATM is in Idle State");
    }

    @Override
    public void balance(ATM atm) {
        System.out.println("Balance not possible bcos currently ATM is in Idle State");
    }

    @Override
    public void insertCard(ATM atm) {
        atm.setAtmState(new HasCardState());
        System.out.println("Card inserted successfully, currently ATM is in HasCard State");
    }
}
