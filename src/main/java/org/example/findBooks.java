package org.example;

public class findBooks {
    static void main() {
    Book[] books = {
            new Book("harry", "skriver Potter ", 2000),
            new Book("tokig koll", "skriver Portrer", 2010),
            new Book( "koll", "bra ", 9012)
    }    ;
    String search = IO.readln("sök efter böcker");

    books(books, search);

    //nmellanslag i array stringsen gjorde att jag inte hittade något... men en del till kanske gjord.

    }
    public record Book(String title, String writer, int year) {}

    public static void books(Book[] books, String search){
        boolean found = false;

        for (Book book : books) {
            if (book.title().equalsIgnoreCase(search) || book.writer().equalsIgnoreCase(search)) {
                IO.println("boken hittades");
                IO.println("title" + book.title);
                IO.println("författare " + book.writer);
                IO.println("utgivningsår " + book.year);

                found = true;
            }
        }
            if (!found) {IO.println("boken hittades inte ");}
        }



            }


