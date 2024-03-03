package org.lld;

import org.lld.shape.Circle;
import org.lld.shape.Square;

public class ShapeFactory {

    public ShapeFactory()
    {

    }
    Shape getShape(String shape)
    {
        switch (shape)
        {
            case "Circle":
                return new Circle();

            case "Square":
                return new Square();

            default:
                return null;
        }
    }
}
