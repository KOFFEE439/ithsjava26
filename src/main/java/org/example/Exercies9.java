package org.example;

import java.util.Locale;

public class Exercies9 {
    static void main() {
        /*    9. Skriv ett program som frågar användaren efter en mening och sedan:
    • Skriver ut antalet tecken.
    • Skriver ut meningen i versaler.
    • Skriver ut meningen baklänges.
    • Kontrollerar om meningen innehåller ordet "Java"
    
         */
        String mening = IO.readln("skriv en mening: ");
        IO.println(mening.length());
        IO.println(mening.toUpperCase());
        IO.println(mening);
        String reverse = "";


        for (int i = mening.length() - 1; i >= 0; i--) {
            reverse += mening.charAt(i);

        }
        if (mening.toLowerCase().contains("java")) {
            IO.println("din mening innehåller java");
        } else IO.println("din mening innehåller inte java");

        IO.println(reverse);

    }
}
