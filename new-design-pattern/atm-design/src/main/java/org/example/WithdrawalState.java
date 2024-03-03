package org.example;

public class WithdrawalState implements ATMState{

    public WithdrawalState(){

    }

    @Override
    public void withdrawal(ATM atm,int withdrawalAmt) {
        int totalWithdrawalAmt = atm.getBalance() - withdrawalAmt;
        atm.setBalance(totalWithdrawalAmt);
        System.out.println("totalWithdrawalAmt : "+atm.getBalance());
        atm.setAtmState(new IdleSate());
        System.out.println("Current ATM is in Idle State");
    }

    @Override
    public void deposit(ATM atm,int depositAmt) {
        System.out.println("Deposit not possible bcos currently ATM is in WithdrawalState State");

    }

    @Override
    public void balance(ATM atm) {
        System.out.println("Balance not possible bcos currently ATM is in WithdrawalState State");

    }

    @Override
    public void insertCard(ATM atm) {
        System.out.println("Inserting not possible bcos currently ATM is in WithdrawalState State");
    }
}
