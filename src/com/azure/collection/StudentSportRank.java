package com.azure.collection;

import java.util.HashSet;

public class StudentSportRank {
    int id ;
    String studentName;
    String sportName;
    int rank;
    public StudentSportRank(int id,String studentName,String sportName,int rank){
        this.id = id;
        this.studentName = studentName;
        this.sportName = sportName;
        this.rank = rank;
    }

    public static void main(String[] args) {
        HashSet<StudentSportRank> set = new HashSet<>();
        StudentSportRank s1 = new StudentSportRank(21,"Raghav","Football",4);
        StudentSportRank s2 = new StudentSportRank(25,"Rashmi","Badminton",2);
        StudentSportRank s3 = new StudentSportRank(45,"Vishal","Cricket",1);
        StudentSportRank s4 = new StudentSportRank(50,"Radha","Swimming",3);
        // add student sport rank into set
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        for (StudentSportRank s:set) {
            System.out.println("Student id :"+" "+s.id+" "+ s.studentName+" "+"good in"+" "+ s.sportName+" "+"and rank is"+" "+ s.rank);
        }
    }
}
