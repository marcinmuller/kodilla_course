package com.kodilla.good.patterns.challenges;

/**
 * Created by Marcin Muller on 07.08.17.
 */
public interface Storage {
    public boolean checkAvailability(String name);
    public void inventoryBalanceRefreshment();
    public int getNumber();
}
