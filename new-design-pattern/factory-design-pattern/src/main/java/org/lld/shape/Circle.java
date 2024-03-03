package org.lld.shape;

import org.lld.Shape;

public class Circle implements Shape {

    public Circle(){

    }
    @Override
    public void draw() {
        System.out.println("Circle is drawn");
    }
}
