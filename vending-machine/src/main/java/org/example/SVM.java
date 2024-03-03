package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SVM {
    public static void main(String[] args) {
        Random random = new Random();
        VendingMachine vendingMachine = new VendingMachine(new NoCoinInsertedState());
        Product p1 = new Product(String.valueOf(random.nextInt(100)),10,1, "Lays");
        Product p2 = new Product(String.valueOf(random.nextInt(100)),30,0,"Cadboury Chocolate");
        vendingMachine.addProduct(p1);
        vendingMachine.addProduct(p2);

        List<Coin> coinList = new ArrayList<>();
        coinList.add(new Coin(5));
        coinList.add(new Coin(5));
        vendingMachine.insertingCoin(coinList);
        vendingMachine.dispensing(p1.getProductId());
//        vendingMachine.dispensing(p2.getProductId());
    }
}