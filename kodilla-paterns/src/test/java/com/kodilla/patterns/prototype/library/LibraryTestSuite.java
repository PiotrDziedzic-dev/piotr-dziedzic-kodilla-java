package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    private Library library;

    @Test
    void testGetBooks() {
        //Given
        library = new Library("Krakow Library");
        LocalDate date1 = LocalDate.of(1999,1,1);
        LocalDate date2 = LocalDate.of(2000,2,3);
        LocalDate date3 = LocalDate.of(1820,3,3);
        Book book1 = new Book("Harry potter","J.K. Rowling",date1);
        Book book2 = new Book("Hobbit","J.R.R Tolkien",date2);
        Book book3 = new Book("Pan Tadeusz","Adam Mieckiewicz",date3);
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowCopiedLibrary = null;
        try {
            shallowCopiedLibrary = library.shallowCopy();
            shallowCopiedLibrary.setName("shallowCopiedLibrary");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCopiedLibrary = null;
        try {
            deepCopiedLibrary = library.deepCopy();
            deepCopiedLibrary.setName("deepCopiedLibrary");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        shallowCopiedLibrary.getBooks().remove(book3);

        //Then
        System.out.println(library);
        System.out.println(shallowCopiedLibrary);
        System.out.println(deepCopiedLibrary);
        Assertions.assertEquals(2,library.getBooks().size());
        Assertions.assertEquals(2,shallowCopiedLibrary.getBooks().size());
        Assertions.assertEquals(3,deepCopiedLibrary.getBooks().size());
        Assertions.assertEquals(library.getBooks(),shallowCopiedLibrary.getBooks());
        Assertions.assertNotEquals(library.getBooks(),deepCopiedLibrary.getBooks());

    }
}
