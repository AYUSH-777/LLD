package org.example;

public class DepositState implements ATMState{

    public DepositState(){

    }

    @Override
    public void withdrawal(ATM atm,int withdrawalAmt) {
        System.out.println("Withdrawal not possible bcos currently ATM is in Deposit State");
    }

    @Override
    public void deposit(ATM atm,int depositAmt) {
        int totalDepositAmt = atm.getBalance()+depositAmt;
        atm.setBalance(totalDepositAmt);
        System.out.println("totalDepositAmt : "+atm.getBalance());
        atm.setAtmState(new IdleSate());
        System.out.println("Currently ATM is in Idle State");
    }

    @Override
    public void balance(ATM atm) {
        System.out.println("Balance not possible bcos currently ATM is in Deposit State");
    }

    @Override
    public void insertCard(ATM atm) {
        System.out.println("Inserting Card is not possible bcos currently ATM is in Deposit State");
    }
}
