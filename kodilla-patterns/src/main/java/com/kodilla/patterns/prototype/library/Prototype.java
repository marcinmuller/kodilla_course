package com.kodilla.patterns.prototype.library;

/**
 * Created by Marcin Muller on 17.08.17.
 */
public class Prototype<B> implements Cloneable {
    @Override
    public B clone() throws CloneNotSupportedException{
        return (B)super.clone();
    }
}
