package org.java;

public class MemberManager {

    private Member[] members;
    private int numberOfMembers;



    public MemberManager(int capacity){
        members = new Member[capacity];
        numberOfMembers = 0;
    }


    public void registerMember(Member member){
        if (numberOfMembers == members.length) {
            increaseArraySize();
        }
        members[numberOfMembers] = member;
        numberOfMembers++;
    }


    private void increaseArraySize(){
        Member[] newMembers = new Member[members.length * 2];

        for (int i = 0; i < members.length ; i++) {
            newMembers [i] = members[i];
        }
        members = newMembers;
    }

    public Member getMember(int i) {
        if (i < 0 || i >= numberOfMembers) {
            return null;
        }
        return members[i];
    }
        public int getNumberOfMembers(){
        return numberOfMembers;
        }



        public String getMemberNameById(int memberId) {
        for (int i = 0; i < numberOfMembers; i++) {
            if (members[i].getId() == memberId) {
                return members[i].getName();
            }
        }

        return "Okänd medlem";
    }

    public boolean memberExists(int memberId) {
        for (int i = 0; i < numberOfMembers; i++) {
            if (members[i].getId() == memberId) {
                return true;
            }
        }

        return false;
    }
}





