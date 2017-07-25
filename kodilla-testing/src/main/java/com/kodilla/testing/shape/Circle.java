package com.kodilla.testing.shape;

/**
 * Created by Marcin Muller on 15.07.17.
 */
public class Circle implements Shape {
    private double r;
    public Circle(double r){
        this.r=r;
    }
    public String getShapeName() {
        return "circle";
    }
    public double getField(){
        return Math.PI*r;
    }
}