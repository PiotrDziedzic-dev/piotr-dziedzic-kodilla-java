package com.kodilla.testing.library;

import java.util.Objects;

public class Book {
    String title;
    String author;
    int PublicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        PublicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return PublicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        PublicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return PublicationYear == book.PublicationYear &&
                title.equals(book.title) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, PublicationYear);
    }
}
