package org.java;

public class Member {

    private int id;
    private String name;
    private int borrowedBooks;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = 0;
    }

    //----------------- get set
    // getter för id, get return
    public int getId() {
        return id;
    }


    // getter för namn
    public String getName() {
        return name;
    }

    // setter för namn, void (string)
    public void setName(String name) {
        this.name = name;
    }
}


