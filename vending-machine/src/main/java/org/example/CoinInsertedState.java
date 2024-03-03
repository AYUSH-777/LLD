package org.example;

import java.util.List;

public class CoinInsertedState implements VendingMachineState{

    @Override
    public void insertCoin(VendingMachine vendingMachine, List<Coin> coinList) {
        System.out.println("Machine is already in the Coin Inserted State");
    }

    @Override
    public void dispense(VendingMachine vendingMachine, String productId) {
          Product product = vendingMachine.getProductFromId(productId);
          if(product.getAvailableCount()<=0||vendingMachine.getAmount()<product.getPrice())
          {
              System.out.println("Product cannot be dispensed now. Try again later");
              return ;
          }
          int availableCnt = product.getAvailableCount();
          product.setAvailableCount(availableCnt-1);
          vendingMachine.setAmount(0);
          vendingMachine.setVendingMachineState(new NoCoinInsertedState());
          System.out.println("Requested Product Dispensed Successfully. State of machine set to no coin inserted state");
    }
}
