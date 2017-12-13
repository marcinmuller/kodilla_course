package com.kodilla.stream.array;

import java.util.stream.IntStream;

/**
 * Created by Marcin Muller on 31.07.17.
 */
public class ArrayOperations {
    public static double getAverage(final int[] numbers){
        IntStream.range(0,numbers.length)
                .map(n->numbers[n])
                .forEach(System.out::println);
        double average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();
        System.out.println(average);
        return average;
    }
}
