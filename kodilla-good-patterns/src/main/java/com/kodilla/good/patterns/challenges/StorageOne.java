package com.kodilla.good.patterns.challenges;

import java.util.Random;

/**
 * Created by Marcin Muller on 07.08.17.
 */
public class StorageOne implements Storage {
    private int number;
    public StorageOne() {
        number=3;
    }

    public boolean checkAvailability(String name){
//        Random r=new Random();
//        return r.nextBoolean();
        System.out.println("ssssssssss"+number);
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
