package com.kodilla.testing.shape;

/**
 * Created by Marcin Muller on 15.07.17.
 */
public class Triangle implements Shape {
    private double a,h;
    public Triangle(double a, double h){
        this.a=a;
        this.h=h;
    }
    public String getShapeName(){
        return "triangle";
    }
    public double getField(){
        return 0.5*a*h;
    }
}