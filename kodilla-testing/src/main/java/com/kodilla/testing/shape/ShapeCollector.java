package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Marcin Muller on 16.07.17.
 */
public class ShapeCollector
{
    protected ArrayList<Shape> figures=new ArrayList<Shape>();
    public void addFigure(Shape shape){
        figures.add(shape);
    }
    public void removeFigure(Shape shape){
        figures.remove(shape);
    }
    public void showFigures(){
        for(Shape f: figures){
            System.out.println(f.getShapeName()+" "+f.getField());
        }
    }
    public Shape getFigure(int n){
        return figures.get(n);
    }
    public ArrayList<Shape> getList(){
        return figures;
    }

}