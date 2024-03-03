package org.lld.decorator;

import org.lld.BasePizza;
import org.lld.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {

    private final BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+5;
    }
}
