package org.example;

public class GenericPair<K,V>{
    private K key;
    private V val;

    public GenericPair(K k,V v)
    {
        this.key = k;
        this.val = v;
    }

    public void print()
    {
        System.out.println("Key : "+key+" Value : "+val);
    }
}
