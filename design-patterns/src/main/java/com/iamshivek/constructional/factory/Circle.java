package com.iamshivek.constructional.factory;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateCircumference() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
