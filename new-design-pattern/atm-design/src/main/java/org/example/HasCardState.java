package org.example;

public class HasCardState implements ATMState{

    public HasCardState(){

    }

    @Override
    public void withdrawal(ATM atm,int withdrawalAmt) {
        atm.setAtmState(new WithdrawalState());
        atm.withdrawTheAmount(withdrawalAmt);
        System.out.println("Currently ATM is in Withdrawal State");
    }

    @Override
    public void deposit(ATM atm,int depositAmt) {
        atm.setAtmState(new DepositState());
        atm.depositTheAmount(depositAmt);
        System.out.println("Currently ATM is in Deposit State");
    }

    @Override
    public void balance(ATM atm) {
        atm.setAtmState(new BalanceState());
        atm.checkBalance();
        System.out.println("Currently ATM is in Idle State");
    }

    @Override
    public void insertCard(ATM atm) {
        System.out.println("Inserting Card not possible bcos currently ATM is in HasCard State");
    }
}
