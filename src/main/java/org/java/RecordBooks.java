package org.java;

public class RecordBooks {

    book book = new book ("kollo", "baire", 1922);

    IO.println(bookDescription(book));





    public record book(String title, String writer, int year) { }


    static String bookDescription (book book) {
    return "titel "+ book.title+  + "författare " + book.writer + "utgivningsår " + book.year;
}
}
