package com.kodilla.exception.io;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by Marcin Muller on 02.08.17.
 */
public class FileReader {
    public void readFile() throws FileReaderException{
        ClassLoader classLoader=getClass().getClassLoader();
        File file= new File(classLoader.getResource("file/names.txt").getFile());

        try (Stream<String> filelines = Files.lines(Paths.get(file.getPath()))){
            filelines.forEach(System.out::println);
        }catch (IOException e){
            throw new FileReaderException();
        } finally {
            System.out.println("I'm gonna be here");
        }

    }
}