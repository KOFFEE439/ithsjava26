package org.example;

public class CtoF {
static void main () {

    double celsius = Double.parseDouble(IO.readln("Skriv temperaturen i Celsius: "));

    double fahrenheit = celsiusToFahrenheit(celsius);

    System.out.println(celsius + " °C är " + fahrenheit + " °F");
}

    static double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
    }



