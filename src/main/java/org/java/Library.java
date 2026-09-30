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
        int[] newBorrowedByMemberId =
                new int[borrowedByMemberId.length * 2];

        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
            newBorrowed[i] = borrowed[i];
            newBorrowedByMemberId[i] = borrowedByMemberId[i];
        }

        books = newBooks;
        borrowed = newBorrowed;
        borrowedByMemberId = newBorrowedByMemberId;
    }


    public void printNumberOfBooks(MemberManager memberManager) {
        if (numberOfBooks == 0) {
            IO.println("Det finns inga böcker.");
            return;
        }

        for (int i = 0; i < numberOfBooks; i++) {
            Book book = books[i];

            IO.println(
                    "ID: " + book.id()
                            + ", Titel: " + book.title() + ", Författare: " + book.author() + ", År: " + book.year()
            );

            if (borrowedByMemberId[i] == 0) {
                IO.println("Status: Är tillgänglig");
            } else {
                String memberName =
                        memberManager.getMemberNameById(
                                borrowedByMemberId[i]
                        );

                IO.println(
                        "Status: Utlånad till " + memberName + " med medlems-ID " + borrowedByMemberId[i]
                );
            }

            IO.println();
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


    public boolean borrowBook(int bookId, int memberId) {
        for (int i = 0; i < numberOfBooks; i++) {

            if (books[i].id() == bookId) {

                if (borrowed[i]) {
                    return false;
                }

                borrowed[i] = true;
                borrowedByMemberId[i] = memberId;

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
                borrowedByMemberId[i] = 0;

                return true;
            }
        }

        return false;
    }

}


