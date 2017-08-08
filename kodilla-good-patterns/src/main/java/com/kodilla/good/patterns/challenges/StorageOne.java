package com.kodilla.good.patterns.challenges;

import java.util.Random;

/**
 * Created by Marcin Muller on 07.08.17.
 */
public class StorageOne implements Storage {
    public boolean checkAvailability(String name){
        Random r=new Random();
        return r.nextBoolean();
    }
}
