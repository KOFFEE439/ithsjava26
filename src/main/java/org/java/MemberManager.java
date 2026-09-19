package org.java;

public class MemberManager {

    private Member[] members;
    private int numberOfMembers;


    //--------------------konstruktor för antal medlemmar och ökning för array
    public MemberManager(int capacity){
        members = new Member[capacity];
        numberOfMembers = 0;
    }

    //---------------registrera en medlem
    public void registerMember(Member member){
        if (numberOfMembers == members.length) {
            increaseArraySize();
        }
        members[numberOfMembers] = member;
        numberOfMembers++;
    }

    //------------------öka array för members
    private void increaseArraySize(){
        Member[] newMembers = new Member[members.length * 2];

        for (int i = 0; i < members.length ; i++) {
            newMembers [i] = members[i];
        }
        members = newMembers;
    }
//--------------- get number members
    public Member getMember(int i) {
        if (i < 0 || i >= numberOfMembers) {
            return null;
        }
        return members[i];
    }
        public int getNumberOfMembers(){
        return numberOfMembers;
        }




    //---------- skriv ut members--------test
    public void printMembers() {
        for (int i = 0; i < numberOfMembers; i++) {
            Member member = members[i];

            System.out.println("ID: " + member.getId());
            System.out.println("Namn: " + member.getName());



            System.out.println();
        }
    }
}



