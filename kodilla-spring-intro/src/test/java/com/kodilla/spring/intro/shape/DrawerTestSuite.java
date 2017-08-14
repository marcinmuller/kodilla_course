package com.kodilla.spring.intro.shape;

import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {
    @Test
    public void testDoDrawingWithCircle() {
        //Given
        //When
        Drawer drawer = new Drawer(new Circle());
        String result=drawer.doDrawing();
        //Then
        Assert.assertEquals("This is a circle", result);
        //do nothing
    }
    @Test
    public void testDoDrawingWithTriangle() {
        //Given
        //When
        Drawer drawer = new Drawer(new Triangle());
        String result=drawer.doDrawing();
        //Then
        Assert.assertEquals("This is a triangle", result);
        //do nothing
    }
}