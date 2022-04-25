package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("author1", "title1", 1995, "001");
        Book book2 = new Book("author2", "title2", 1996, "002");
        Book book3 = new Book("author3", "title3", 1997, "003");
        Book book4 = new Book("author4", "title4", 1998, "004");
        Book book5 = new Book("author5", "title5", 1999, "005");

        Set<Book> booksSet = new HashSet<>();
        booksSet.add(book1);
        booksSet.add(book2);
        booksSet.add(book3);
        booksSet.add(book4);
        booksSet.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int thePublicationYearMedian = medianAdapter.publicationYearMedian(booksSet);

        //Then
        assertEquals(1997, thePublicationYearMedian);
    }
}