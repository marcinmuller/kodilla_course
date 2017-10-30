package com.kodilla.patterns2.adapter.bookclassifier.librarya;

import java.util.Set;

/**
 * Created by Marcin Muller on 30.10.17.
 */
public interface Classifier {
    int publicationYearMedian(Set<Book> bookSet);
}
