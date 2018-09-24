package com.iamshivek.constructional.factory;

public class Rectangle implements Shape {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (length + width);
    }

    @Override
    public String getName() {
        if(length == width ) return "Square";
        return "Rectangle";
    }


}
