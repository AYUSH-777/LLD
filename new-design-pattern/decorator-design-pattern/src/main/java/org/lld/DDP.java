package org.lld;

import org.lld.decorator.ExtraCheese;
import org.lld.pizza.Magherita;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DDP {
    public static void main(String[] args) {
      BasePizza magherita = new Magherita();
      BasePizza extraCheeseMagherita = new ExtraCheese(magherita);
       System.out.println(extraCheeseMagherita.cost());
    }
}