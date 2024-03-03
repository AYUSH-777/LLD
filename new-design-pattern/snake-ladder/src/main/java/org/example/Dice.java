package org.example;

import java.util.Random;

public class Dice {
    private int size;

    private Random random;

    public Dice(int size)
    {
        this.size = size;
        random = new Random();
    }

    public int getMoveVal()
    {
        return (random.nextInt()%size)+1;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
