package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.util.ArrayList;

import static java.lang.Math.PI;

/**
 * Created by Marcin Muller on 16.07.17.
 */
public class ShapeCollectorTestSuite {

    @Rule
    public /*final*/ SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void tastCaseShowing() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(1));
        shapeCollector.addFigure(new Square(1));
        shapeCollector.addFigure(new Triangle(1, 2));
        shapeCollector.addFigure(new Triangle(1, 1));
        //When
        shapeCollector.showFigures();
        //Then
        Assert.assertTrue(systemOutRule.getLog().contains("circle " + PI + "\nsquare 1.0\ntriangle 1.0\ntriangle 0.5"));
    }

    @Test
    public void testCaseAdding() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(1);
        //When
        shapeCollector.addFigure(square);
        ArrayList<Shape> list = shapeCollector.getList();
        //Then
        Assert.assertTrue(list.contains(square));
    }
    @Test
    public void testCaseRemoving() {
        //Given
        ShapeCollector shapeCollector=new ShapeCollector();
        Square square=new Square(1);
        shapeCollector.addFigure(square);
        //When
        shapeCollector.removeFigure(square);
        ArrayList<Shape> list=shapeCollector.getList();
        //Then
        Assert.assertFalse(list.contains(square));
    }
    @Test
    public void testCaseGetting() {
        //Given
        ShapeCollector shapeCollector=new ShapeCollector();
        Square square=new Square(1);
        //When
        shapeCollector.addFigure(square);
        Shape figure=shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(figure,square);
    }

}