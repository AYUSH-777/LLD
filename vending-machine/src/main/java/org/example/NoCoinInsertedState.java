package org.example;

import java.util.List;

public class NoCoinInsertedState implements VendingMachineState{

    @Override
    public void insertCoin(VendingMachine vendingMachine, List<Coin> coinList) {
        int totalValue = 0;
        for(Coin coin:coinList)
        {
            totalValue+=coin.getCoinVal();
        }
        vendingMachine.setAmount(totalValue);
        vendingMachine.setVendingMachineState(new CoinInsertedState());
        System.out.println("State of machine set to coin inserted state");
    }

    @Override
    public void dispense(VendingMachine vendingMachine, String productId) {
          System.out.println("Machine is in No coin inserted state");
    }
}
