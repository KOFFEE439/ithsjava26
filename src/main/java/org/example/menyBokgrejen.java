package org.example;

public class menyBokgrejen {
    static void main() {
        boolean menu = true;

        while (menu) {
            IO.println("Bibliotekshanteraren ");
            IO.println("==================== ");
            IO.println("1. Lägg till en bok ");
            IO.println("2. Registrera medlem  ");
            IO.println("3. Låna bok ");
            IO.println("4. Lämna tillbaka bok ");
            IO.println("5. Sök bok ");
            IO.println("6. Visa alla böcker och status ");
            IO.println("7. Avsluta ");

            String choice = IO.readln("Välj ett alternativ");

            switch (choice) {
                case "1":
                   // läggtillbok();
                    break;
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7": menu = false;
                IO.println("\n" + "VÄLKOMMEN TILLBAKA! ");
                break;



            }

        }
    }
}
