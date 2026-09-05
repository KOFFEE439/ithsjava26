package org.example;

public class Methods {
    // mestadels handlar allt om att kedja metoder, man sitter inte mycket med operatorer men man sitter mycket med färdiga metoder
    static void main () {
        printGreeting();

        int a = readIntegerFromKeyboard();
        int b = readIntegerFromKeyboard();

        IO.println("du skrev" + a);
        IO.println("du skrev" + b);


        printShutDownMessage();

    }

    static void printGreeting(){
        IO.println("Statring app");
        IO.println("Welkomen to methods 1.9");
        IO.println("--------------");

    }
    static void printShutDownMessage() {
        IO.println("Shutting Down");
        IO.println("thaanks");
    }
    static int readIntegerFromKeyboard() {
        int value = Integer.parseInt(IO.readln("enter an integer"));
        return value;
//viktigt med return value, annrs var den inte glad :S
        // IO.readln är en sknner metod? :ö



    }
}

