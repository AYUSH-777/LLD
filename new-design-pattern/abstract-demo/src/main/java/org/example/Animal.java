package org.example;

public abstract class Animal {

    public String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public abstract void speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
