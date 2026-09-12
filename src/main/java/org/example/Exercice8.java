package org.example;

public class Exercice8 {
    static void main() {
        var person=  new Person("jogn", 26, "Got");
        IO.println(person);
        var person2=  new Person("jn", 28, "Goyit");
        var person3= new Person("jn", 22, "Goatt");



    }
    record Person(String name, int age, String city ) {

    }
}
