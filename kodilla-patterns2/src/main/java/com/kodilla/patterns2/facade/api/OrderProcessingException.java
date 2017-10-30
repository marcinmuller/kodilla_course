package com.kodilla.patterns2.facade.api;

/**
 * Created by Marcin Muller on 19.10.17.
 */
public class OrderProcessingException extends Exception{
    public static String ERR_NOT_AUTHORISED = "USER IS NOT AUTHORISED";
    public static String ERR_PAYMENT_REJECTED= "PEYMENT WAS REJECTED";
    public static String ERR_VERIFICATION_ERROR = "VERIFICATION ERROR";
    public static String ERR_SUBMITTING_ERROR = " CANNOT SUBMIT ORDER";

    public OrderProcessingException(String message){
        super(message);
    }

}
