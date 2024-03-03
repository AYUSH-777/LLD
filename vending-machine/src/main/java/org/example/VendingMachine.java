package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachine {

    private VendingMachineState vendingMachineState;
    private int amount;
    private List<Product> productList;
    private Map<String,Product> map;

    public VendingMachine(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
        this.amount = 0;
        this.productList = new ArrayList<>();
        this.map = new HashMap<>();
    }

    public VendingMachineState getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product)
    {
        productList.add(product);
        map.put(product.getProductId(),product);
    }

    public Product getProductFromId(String productId)
    {
        return map.get(productId);
    }

    public void insertingCoin(List<Coin> coinList)
    {
        vendingMachineState.insertCoin(this,coinList);
    }

    public void dispensing(String productId)
    {
        vendingMachineState.dispense(this,productId);
    }

}
