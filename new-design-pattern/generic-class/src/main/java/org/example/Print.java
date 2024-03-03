package org.example;

public class Print<T> {
    private T value;

    public Print(T value)
    {
        this.value = value;
    }

    public void print()
    {
        System.out.println(value);
    }

    public T getValue()
    {
        return value;
    }
}
