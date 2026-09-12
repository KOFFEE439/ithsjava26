package org.example;

public class recordd {
    static void main() {

        recordBook book = new recordBook("Dune", "Frank Herbert", 1965);
        System.out.println((book(book)));




    }



    record recordBook(String title, String writer, int year) {

    }
    public static String book (recordBook b) {
        return "title " + b.title() + " - författare " + b.writer + " + utgiven " + b.year;
}
}