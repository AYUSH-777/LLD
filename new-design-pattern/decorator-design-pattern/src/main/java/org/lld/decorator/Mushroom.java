package org.lld.decorator;

import org.lld.BasePizza;
import org.lld.ToppingDecorator;

public class Mushroom extends ToppingDecorator {

    private final BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+15;
    }
}
