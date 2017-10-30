package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

import java.util.Map;

/**
 * Created by Marcin Muller on 30.10.17.
 */
public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature, Book> books);
    int medianPublicationYear(Map<BookSignature, Book> books);
}
