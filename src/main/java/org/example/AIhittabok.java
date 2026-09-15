package org.example;

public class AIhittabok {
    static void main() {
        Bok[] böcker = {
                new Bok("Dune", "Frank Herbert", 1965),
                new Bok("Harry Potter", "J.K. Rowling", 1997),
                new Bok("Sagan om ringen", "J.R.R. Tolkien", 1954)
        };

        String sökning = IO.readln("Sök efter titel eller författare: ");

        books(böcker, sökning);
    }
    public record Bok(String titel, String författare, int år) {
    }
    public static void books(Bok[] böcker, String sökning) {
        boolean hittad = false;

        for (Bok bok : böcker) {
            if (bok.titel().equalsIgnoreCase(sökning)
                    || bok.författare().equalsIgnoreCase(sökning)) {

                System.out.println("Boken hittades:");
                System.out.println("Titel: " + bok.titel());
                System.out.println("Författare: " + bok.författare());
                System.out.println("Utgiven: " + bok.år());

                hittad = true;
            }
        }

        if (!hittad) {
            System.out.println("Ingen bok hittades.");

        }
    }}