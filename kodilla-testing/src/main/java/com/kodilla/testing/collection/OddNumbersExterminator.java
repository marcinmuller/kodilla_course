package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin Muller on 13.07.17.
 */
public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> even=new ArrayList<Integer>();

        for(Integer n: numbers){
            if(n%2==0) even.add(n);
        }
        return even;
    }
}