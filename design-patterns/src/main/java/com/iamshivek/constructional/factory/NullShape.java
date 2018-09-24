package com.iamshivek.constructional.factory;

public class NullShape implements Shape {

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculateCircumference() {
        return 0;
    }

    @Override
    public String getName() {
        return "Null Shape";
    }
}
