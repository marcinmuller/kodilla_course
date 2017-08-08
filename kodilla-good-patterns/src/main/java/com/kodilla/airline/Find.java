package com.kodilla.airline;

/**
 * Created by Marcin Muller on 08.08.17.
 */
public class Find {
    public static void main(String[] args){
        Processor processor=new Processor();
        processor.findFrom("gdańsk");
        processor.findTo("wrocław");
        processor.findVia("poznań","gdańsk");
    }
}
