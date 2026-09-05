package org.example;

import static java.lang.IO.println;

public class Logic {
    static void main () {
        boolean a = true;
        boolean b = true;
        int value = -1;
        IO.println("koool");

        if (value > 10 || value > 10)
        IO.println( "sant");
        else IO.println("falskt");

        if (a && b) {
           IO.println("sant");
System.out.println("sant");
        }
        else
            IO.println("Falskt");

        //  man kan skapa metoder i java på 2 sätt, endera skapa en klass eller skapa ett objekt
        // static då finns allt från början
if (greaterThanZero(value) || lessThanTen(value))
    IO.println("santyt");

    }
    static boolean lessThanTen(int v) {
        return v < 10;

    }
public static boolean greaterThanZero(int v) {
        if (v > 0)
            return true;
        return false;
}
// något av dessa saker kallas för pass by value
    // vill man skicka information till metoden kallas det parametrar,
    //package private är default värde och inte public, trodde min app sa något annat? hmm



}
