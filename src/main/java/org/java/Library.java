package org.java;


public final class Library {

    public record Book(int id, String title, String author, int year) {
    }

    private int[] borrowedByMemberId = new int[2];

    private Book[] books = new Book[2];
    private int numberOfBooks = 0;

    private boolean[] borrowed = new boolean[2];

    public void addBook(Book book) {
        if (numberOfBooks == books.length) {
            increaseArraySize();

        }

        borrowedByMemberId[numberOfBooks] = 0;
        books[numberOfBooks] = book;
        borrowed[numberOfBooks] = false;
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
        Book[] newBooks = new Book[books.length * 2];
        boolean[] newBorrowed = new boolean[borrowed.length * 2];

        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
            newBorrowed[i] = borrowed[i];
        }
        books = newBooks;
        borrowed = newBorrowed;
    }


    public void printBooks() {
        for (int i = 0; i < numberOfBooks; i++) {
            Book book = books[i];

            String status;

            if (borrowed[i]) {
                status = "Utlånad";
            } else {
                status = "Tillgänglig";
            }


            IO.println("ID: " + book.id() + ", Title: " + book.title() + ", Författare: " + book.author() + ", År: " + book.year() + ", Status: "+ status);

        }
    }

    public void searchBook(String searchText) {
        boolean found = false;
        String search = searchText.toLowerCase();

        for (int i = 0; i < numberOfBooks; i++) {
            Book book = books[i];

            if (book.title().toLowerCase().contains(search) || book.author().toLowerCase().contains(search)) {

                IO.println("ID: " + book.id + ", title: " + book.title + " , författare: " + book.author + ", År: " + book.year);
                found = true;
            }
        }
        if (!found) {
            IO.println("ingen bok hittades. ");
        }


    }

    public void printNumberOfBooks() {
        if (numberOfBooks == 0) {
            IO.println(" Det går inte att låna några böcker ");

        }
        for (int i = 0; i < numberOfBooks; i++) {
            Book book = books[i];
            IO.println("ID: " + book.id() + ", Title: " + book.title() + ", Författare: " + book.author() + "År: " + book.year());


            if (borrowedByMemberId[i] == 0) {
                IO.println("Status: Är tillgänglig ");
            } else {
                IO.println("Status: Är inte tillgänglig, utlånad till " + borrowedByMemberId[i]);
            }
            IO.println();
        }



    }
    public boolean borrowBook(int bookId) {
        for (int i = 0; i < numberOfBooks; i++) {

            if (books[i].id() == bookId) {

                if (borrowed[i]) {
                    return false;
                }

                borrowed[i] = true;
                return true;
            }
        }

        return false;
    }

    public boolean returnBook(int bookId) {
        for (int i = 0; i < numberOfBooks; i++) {

            if (books[i].id() == bookId) {

                if (!borrowed[i]) {
                    return false;
                }

                borrowed[i] = false;
                return true;
            }
        }

        return false;
    }

}


