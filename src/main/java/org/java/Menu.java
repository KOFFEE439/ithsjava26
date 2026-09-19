package org.java;

public class Menu {

//Todo Meny & interaktivitet: en robust meny (Scanner) som hanterar felaktig inmatning (t.ex.
//bokstäver där siffror förväntas) utan att programmet kraschar.


    //Todo: Funktionalitet:
    //◦ Lägga till en ny bok.
    //◦ Registrera en ny medlem.
    //◦ Låna en bok — kontrollera att boken finns och inte redan är utlånad.
    //◦ Lämna tillbaka en bok.
    //◦ Söka bok på (del av) titel eller författare, skiftlägesokänsligt, via egen sökloop (linjär
    //sökning).
    //◦ Visa samtliga böcker med status (utlånad/tillgänglig och till vem).

    //Todo: Felhantering: tydliga meddelanden vid t.ex. bok/medlem som inte hittas, bok som redan är
    //utlånad, eller ogiltiga menyval — programmet ska aldrig krascha på grund av felaktig inmatning.
    //Versionshantering: projektet sätts upp i en IDE, byggs med Maven och lämnas in som länk till ett
    //Git-repository med flera meningsfulla commits (inte en enda stor commit).
    //Källkritik & reflektion: skriv i projektets README.md en kort beskrivning av lösningen samt en
    //reflektion kring dina designval (t.ex. record kontra klass).

    public void showMenu() {
        boolean menu = true;
        while (menu) {
            IO.println("Bibliotekshanteraren ");
            IO.println("==================== ");
            IO.println("1. Lägg till en bok ");  //set book
            IO.println("2. Registrera medlem  "); //set member
            IO.println("3. Låna bok ");             //boolean borrowBook specific book set
            IO.println("4. Lämna tillbaka bok ");   //boolean returnBook
            IO.println("5. Sök bok "); //array search writer or title
            IO.println("6. Visa alla böcker och status "); //array allBooks
            IO.println("7. Avsluta ");

            String choice = IO.readln("Välj ett alternativ " + "\n" );

            switch (choice) {
                case "1":
                    // läggtillbok();
                    break;
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                    menu = false;
                    IO.println("\n" + "VÄLKOMMEN TILLBAKA! ");
                    break;
                default:
                    IO.println("\n" +"Ogiltigt val, vänligen välj en siffra mellan 1 och 7." + "\n" );
                    break;



            }

        }

    }
}
