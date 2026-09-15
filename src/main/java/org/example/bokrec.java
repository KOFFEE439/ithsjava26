package org.example;

public class bokrec {
    static void main() {
        bok bok = new bok("kalle och hägern", "bosse på posten", 2013);
        IO.println(bokBeskrivning(bok));
// kallar beskrivningen i metoden, till det nya objektet


    }
    public record bok(String title, String writer, int year) {}

    static String bokBeskrivning(bok boki){

        return "title " + boki.title + "\n" + "författare " + boki.writer + "\n" + "utgivningsår " + boki.year;
    }

}
