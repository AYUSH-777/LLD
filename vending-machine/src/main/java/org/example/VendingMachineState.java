package org.example;

import java.util.List;

public interface VendingMachineState {
    void insertCoin(VendingMachine vendingMachine,List<Coin> coinList);

    void dispense(VendingMachine vendingMachine,String productId);
}
