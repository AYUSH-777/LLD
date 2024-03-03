package org.example;

public class BalanceState implements ATMState{

    public BalanceState(){

    }

    @Override
    public void withdrawal(ATM atm,int withdrawalAmt) {
        System.out.println("Withdrawal not possible bcos currently ATM is in Balance State");
    }

    @Override
    public void deposit(ATM atm,int depositAmt) {
        System.out.println("Deposit not possible bcos currently ATM is in Balance State");
    }

    @Override
    public void balance(ATM atm) {
       System.out.println("Current Balance : "+atm.getBalance());
       atm.setAtmState(new IdleSate());
       System.out.println("Currently ATM is in Idle State");
    }

    @Override
    public void insertCard(ATM atm) {
        System.out.println("Inserting Card is not possible bcos currently ATM is in Balance State");
    }
}
