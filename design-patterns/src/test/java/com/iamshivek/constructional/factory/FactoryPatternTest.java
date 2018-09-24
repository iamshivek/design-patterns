package com.iamshivek.constructional.factory;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class FactoryPatternTest {


    @Test
    public void shapeCreationTest(){
        Shape shape = ShapeFactory.getShape(ShapeFactory.ShapeType.CIRCLE,10);
        shape.calculate();
        Assert.assertEquals(shape.calculateArea(),314.1592653589793);
        Assert.assertEquals(shape.calculateCircumference(),62.83185307179586);

        shape  = ShapeFactory.getShape(ShapeFactory.ShapeType.SQUARE,10);
        shape.calculate();
        Assert.assertEquals(shape.calculateArea(),100.0);
        Assert.assertEquals(shape.calculateCircumference(),40.0);


        shape = ShapeFactory.getShape(ShapeFactory.ShapeType.RECTANGLE,10,20);
        shape.calculate();
        Assert.assertEquals(shape.calculateArea(),200.0);
        Assert.assertEquals(shape.calculateCircumference(),60.0);

        shape = ShapeFactory.getShape(ShapeFactory.ShapeType.RECTANGLE,10);
        shape.calculate();
        Assert.assertEquals(shape.calculateArea(),0.0);
        Assert.assertEquals(shape.calculateCircumference(),0.0);
        
    }












}
