package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryA.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryA.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryB.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryB.Book> mapOfBooks = new HashMap<>();
        List<Book> listOfBooks = new ArrayList<>(bookSet);
        for (int n = 0; n < listOfBooks.size(); n++) {
            mapOfBooks.put(new BookSignature(listOfBooks.get(n).getSignature()),
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryB.Book(listOfBooks.get(n).getAuthor()
                            ,listOfBooks.get(n).getTitle(),listOfBooks.get(n).getPublicationYear()));
        }
        return averagePublicationYear(mapOfBooks);
    }

}
