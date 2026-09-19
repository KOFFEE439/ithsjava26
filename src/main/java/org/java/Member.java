package org.java;

public class Member {

    private int id;
    private String name;
    private boolean canBorrowBooks;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        this.canBorrowBooks = true;
    }

    //----------------- get set
    // getter för id, get return
    public int getId (){
        return id;
    }
    //setter för id, void int
    public void setId(int id){
        this.id = id;
    }

    // getter för namn
    public String getName() {
        return name;
    }
    // setter för namn, void (string)
    public void setName(String name){
        this.name = name;
    }
    //testar med boolean borrowbooks
    public boolean isCanBorrowBooks(){
        return canBorrowBooks;
    }
    public void setCanBorrowBooks(boolean canBorrowBooks){
        this.canBorrowBooks = canBorrowBooks;
    }
}


