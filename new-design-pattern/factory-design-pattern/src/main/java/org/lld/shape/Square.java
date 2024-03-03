package org.lld.shape;

import org.lld.Shape;

public class Square implements Shape {

    public Square(){

    }
    @Override
    public void draw() {
        System.out.println("Square is drawn");
    }
}
