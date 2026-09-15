package org.example;

public class bokMeInput {
    static void main() {
        books book = new books(IO.readln("title "), IO.readln("författare"), Integer.parseInt(IO.readln("utgivningsår")));

    IO.println(book.title + book.year + book.writer);

    IO.println(book);



    }

    public record books(String title, String writer, int year){}

    static String bookdescription(books book){
        return "title " + book.title +  ":" + "författare " + book.writer + ":" + "utgivningsår " + book.year;
    }
}
