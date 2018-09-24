package com.iamshivek.constructional.factory;

public interface Shape {

    double calculateArea();

    double calculateCircumference();

    String getName();

    default void calculate() {
        System.out.println(String.format("Areas of %s is : %s", getName(),calculateArea()));
        System.out.println(String.format("Circumference of %s is : %s", getName(),calculateCircumference()));
    }

}
