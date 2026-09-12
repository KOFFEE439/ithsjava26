package org.example;

import java.util.Scanner;

public class Grundlaggande {
    static void main() {

       /*
        int a = 3;
        int b = 6;

        int c = a;



        a =b;
        b = c;



        IO.println("b är "+ b);
        IO.println("a är" + a);


        IO.println(sum(9, 5));



    }

     static int sum (int a, int b) {
        IO.println(a-b);
        return a + b;
// kul grej. kan bara snurra med en massa grejer.





        }


    static double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;



        IO.println("hej");
        double farenheit =  Double.parseDouble(IO.readln("skriv in vad du vill se i C från F "));
farenheit = FtoC(farenheit);
        IO.println(farenheit);
    }
 static        double FtoC (double farenheit) {
            return (farenheit - 32) * 5 /9;




    IO.println(lika(2,4));
    }
    //12
    public static boolean lika (int a ,int b) {


        return a == b;

/*
        static boolean ärLika(String text1, String text2) {
            return text1.equals(text2);
  för text strängar




IO.println(equalsOrDivide5(25));

    }
    static boolean equalsOrDivide5 (int a) {

        return a % 5== 0;





        fizzBuzz(3);
        fizzBuzz(5);
        fizzBuzz(7);
        fizzBuzz(15);


    }
static void fizzBuzz (int a ) {

        if (a % 5 ==0 && a % 3==0){
        IO.println("Fizz Buzz");
        }
        else if (a % 5==0) {
            IO.println("Buzz");
        }
        else if (a % 3==0) {
            IO.println("Fizz");
        }
       else {IO.println("inte delbart med 3 eller 5");}



    IO.println(makesTen(8,9));
    }
        static boolean makesTen(int a, int b){

        return a+b==10;


        IO.println(right24(98,2));

    }
        static int right24 (int one, int two) {
        int sum;
        if (one + two == 24)
        {
            sum = one + two ;
            return sum;}
        else if (one - two == 24)
        {
            sum = one - two ;
            return sum;}
        else if (one * two == 24)
        { sum = one * two ;
            return sum;}
        else if (one / two == 24)
        { sum = one / two ;
            IO.println("divided");
            return sum ;}

        else
            IO.println("none");
        return 99;
        }





    }
        static void winnerGame(int play, int play2){
        play = IO.readln("spela")(int) (Math.random() * 6) + 1));
        play2= (int) (Math.random() * 6) + 1;
        if (play >play2)
        {
            IO.readln("player1 winnns");
        }
        else if (play<play2){IO.readln("player2 winnns");}
        else IO.println("oavgjort");


    }


        */

      winnerGame();
    }

    static void winnerGame() {
        IO.println("Player 1: press Enter to roll");
        IO.readln();

        int play = (int) (Math.random() * 6) + 1;
        IO.println("Player 1 rolled: " + play);

        IO.println("Player 2: press Enter to roll");
        IO.readln();

        int play2 = (int) (Math.random() * 6) + 1;
        IO.println("Player 2 rolled: " + play2);

        if (play > play2) {
            IO.println("Player 1 wins");
        } else if (play < play2) {
            IO.println("Player 2 wins");
        } else {
            IO.println("Oavgjort");
        }


    }
}














