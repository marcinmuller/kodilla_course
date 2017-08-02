package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReader;


/**
 * Created by Marcin Muller on 02.08.17.
 */
public class ExceptionModuleRunner {
    public static void main(String args[]){
        FileReader fileReader=new FileReader();
        try {
            fileReader.readFile();
        }catch (FileReaderException e){
            System.out.println("problem ");
        }
    }
}
