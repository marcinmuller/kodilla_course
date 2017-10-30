package com.kodilla.patterns2.adapter.company.oldhrsystem;

/**
 * Created by Marcin Muller on 30.10.17.
 */
public class Workers {
    private String [][] workers = {
        {"111111111111","11","111"},
        {"222222222222","22","222"},
        {"333333333333","33","333"}
    };
    private double[] salaries={
            1000.0,
            2000.0,
            3000.0
    };
    public String getWorker(int n){
        if(n>salaries.length){
            return "";
        }
        return workers[n][0]+" "+workers[n][1]+" "+workers[n][2]+" "+salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
