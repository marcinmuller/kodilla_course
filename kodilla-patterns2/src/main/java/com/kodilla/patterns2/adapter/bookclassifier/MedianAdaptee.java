package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Statistics;

import java.util.Map;

/**
 * Created by Marcin Muller on 30.10.17.
 */
public class MedianAdaptee implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books){
        return 0;
    }
    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books){
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
