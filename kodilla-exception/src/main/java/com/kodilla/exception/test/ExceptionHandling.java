package com.kodilla.exception.test;

/**
 * Created by Marcin Muller on 02.08.17.
 */
public class ExceptionHandling {
    public static void main(String args[]){
        SecondChallenge secondChallenge=new SecondChallenge();
        try{
            System.out.println(secondChallenge.probablyIWillThrowException(5,11.0));
        }catch (Exception e){
            System.out.println("error occurred ");
        }finally {
            System.out.println("tada!");
        }
    }
}
