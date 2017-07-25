package com.kodilla.testing.shape;

/**
 * Created by Marcin Muller on 15.07.17.
 */
public class Square implements Shape {
    private double a;
    public Square(double a){
        this.a=a;
    }
    public String getShapeName(){
        return "square";
    }
    public double getField(){
        return a*a;
    }
}