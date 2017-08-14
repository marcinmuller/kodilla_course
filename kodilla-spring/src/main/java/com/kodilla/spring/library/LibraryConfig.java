package com.kodilla.spring.library;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfigA {
    @Bean
    public Library library() {
        return new Library(libraryDBController());
    }

    @Bean
    public LibraryDBController libraryDBController() {
        return new LibraryDBController();
    }
}