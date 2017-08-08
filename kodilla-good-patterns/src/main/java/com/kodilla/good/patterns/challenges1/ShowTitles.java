package com.kodilla.good.patterns.challenges1;

import com.kodilla.good.patterns.challenges1.MovieStore;

import java.util.stream.Stream;

public class ShowTitles {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore
                .getMovies()
                .entrySet()
                .stream()
                .flatMap(s -> s.getValue().stream())
                .map(s->s+"!")
                .forEach(System.out::print);

    }
}
