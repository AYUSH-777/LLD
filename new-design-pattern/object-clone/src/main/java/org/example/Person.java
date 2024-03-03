package org.example;

import java.lang.ref.PhantomReference;

public class Person implements Cloneable{
    private String name;
    private int age;

    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
