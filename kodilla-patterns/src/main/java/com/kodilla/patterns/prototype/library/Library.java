package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype{
    final String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary=(Library)super.clone();
        clonedLibrary.books=new HashSet<>();
        for(Book b: books){
            clonedLibrary.books.add(b);
        }
        return clonedLibrary;
    }
}