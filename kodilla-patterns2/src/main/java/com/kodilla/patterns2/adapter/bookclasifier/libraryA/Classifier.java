package com.kodilla.patterns2.adapter.bookclasifier.libraryA;

import java.util.Set;

public interface Classifier {

    int publicationYearMedian(Set<Book> bookSet);

}