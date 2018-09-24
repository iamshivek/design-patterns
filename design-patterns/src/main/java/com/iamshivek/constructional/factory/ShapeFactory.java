package com.iamshivek.constructional.factory;

public class ShapeFactory {


    public static Shape getShape(ShapeType type, double... property) {

        if (property.length == 1) {
            switch (type) {
                case CIRCLE: {
                    return new Circle(property[0]);
                }
                case SQUARE: {
                    return new Rectangle(property[0], property[0]);
                }
                default:
                    return new NullShape();
            }
        } else if (property.length == 2) {
            switch (type) {
                case RECTANGLE: {
                    return new Rectangle(property[0], property[1]);
                }
                case SQUARE: {
                    return new Rectangle(property[0], property[1]);
                }
                default:
                    return new NullShape();
            }
        } else return new NullShape();
    }


    public enum ShapeType {
        CIRCLE,
        SQUARE,
        RECTANGLE,
    }


}
