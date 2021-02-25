package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.libraryA.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

        //Given
        Set<Book> setOfBooks = new HashSet<>();
        setOfBooks.add(new Book("Adam Mickiewicz","Pan Tadeusz",1834,"AM/PT/1"));
        setOfBooks.add(new Book("Bolesław Prus","Lalka",1890,"BP/LK/1"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(setOfBooks);

        //Then
        System.out.println(median);
        Assertions.assertEquals(median,1862);
    }
}
