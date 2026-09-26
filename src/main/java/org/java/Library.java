package org.java;


import java.util.Locale;

public final class Library {

    public record Book(int id, String title, String author, int year) {
    }


    private Book[] books = new Book[2];
    private int numberOfBooks = 0;

    public void addBook(Book book) {
        if (numberOfBooks == books.length) {
            increaseArraySize();

        }
        books[numberOfBooks] = book;
        numberOfBooks++;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public Book getBook(int index) {
        if (index < 0 || index >= numberOfBooks) {
            return null;
        }
        return books[index];
    }

    private void increaseArraySize() {
        Book[] newbooks = new Book[books.length * 2];

        for (int i = 0; i < books.length; i++) {
            newbooks[i] = books[i];
        }
        books = newbooks;
    }


    public void printBooks() {
        for (int i = 0; i < numberOfBooks; i++) {
            IO.println(books[i]);
        }
    }
    public void searchBook(String searchText) {
        boolean found = false;
        String search = searchText.toLowerCase();

        for (int i = 0; i < numberOfBooks; i++) {
            Book book = books[i];

            if (book.title().toLowerCase().contains(search) || book.author().toLowerCase().contains(search)) {

                IO.println( "ID: " + book.id + ", title: " + book.title + " , författare: " + book.author + ", År: " + book.year);
                found = true;
            }
        }
        if (!found) {
            IO.println("ingen bok hittades. ");
        }
    }



}


