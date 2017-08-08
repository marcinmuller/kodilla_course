package com.kodilla.food;

/**
 * Created by Marcin Muller on 08.08.17.
 */
public class Quantity {
    private double number;
    private String unit;

    public Quantity(double number, String unit) {
        this.number = number;
        this.unit = unit;
    }

    public double getNumber() {
        return number;
    }

    public String getUnit() {
        return unit;
    }
}
