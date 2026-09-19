package org.java;



public final class Library {

    //Todo: Domänmodell: minst en record och minst en vanlig klass med privata fält, konstruktor och
    //get/set-metoder (inkapsling).


    //Todo:  Book (record) — en oföränderlig värdetyp med t.ex. isbn, titel och författare. Motivera i READM
    // varför en record passar här.

/*
            public static Book[] createBooks() {
                return new Book[] {
                        new Book.(1, "Sagan om ringen", "J.R.R. Tolkien", 1954, "Fantasy", "Svenska", 576, "9789113015117"),
                        new Book.Book(2, "1984", "George Orwell", 1949, "Dystopi", "Svenska", 328, "9780141036144"),
                        new Book.Book(3, "Stolthet och fördom", "Jane Austen", 1813, "Klassiker", "Svenska", 432, "9780141439518"),
                        new Book.Book(4, "Män som hatar kvinnor", "Stieg Larsson", 2005, "Kriminalroman", "Svenska", 544, "9789113014080"),
                        new Book.Book(5, "Pippi Långstrump", "Astrid Lindgren", 1945, "Barnbok", "Svenska" , 144, "9789129657707"),

        };
    }

 */
    public record Book(String title, String author, int year){}


    private Book[] books = new Book[2];
    private int numberOfBooks = 0;

    public void addBook(Book book){
        if (numberOfBooks == books.length){
            Book[] newBooks = new Book[books.length * 2];

            for (int i = 0; i < books.length ; i++) {
                newBooks[i] = books[i];
            }
            books = newBooks;
        }
        books [numberOfBooks] = book;
        numberOfBooks ++;
    }
    public void printBooks(){
        for (int i = 0; i < numberOfBooks ; i++) {
            IO.println(books[i]);
        }
    }



}


