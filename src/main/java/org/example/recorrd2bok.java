package org.example;

public class recorrd2bok {
    static void main() {

        booki book = new booki ("kollo", "baire", 1922);
IO.println(bookDescription(book));



    }
    public record booki(String title, String writer, int year) { }

    static String bookDescription (booki book) {
        return "titel "+ book.title+ "\n"  + "författare " + "\n" +book.writer + "utgivningsår "+ "\n" + book.year;
    }
}

/*
skapa en record, den ska vara public. den ska ha parametrarna
skapa en metod den ska ha ett eget namn och ha recorden som en parameter med ett nytt namn, här ska returnvärdet ligga med
recordens innehåll som strängar.
sen ska vi kalla objektet i main, där ska vi kalla recorden och inte metoden, hmm, hur hanterar metoden något?
sen printar vi ut metoden med en new object som kallas något. Wow vad det är snurrigt, måste nog göra denna några gånger.
 */