package com.kodilla.good.patterns.challenges;

import java.util.Random;

/**
 * Created by Marcin Muller on 07.08.17.
 */
public class StorageOne implements Storage {
    private static int number=3;

    public int getNumber() {
        return number;
    }

    public boolean checkAvailability(String name){
        if(number>0) {
            return true;
        }else {
            return false;
        }
    }

    public void inventoryBalanceRefreshment(){
        if(number>0){
            number--;
        }
    }

}
