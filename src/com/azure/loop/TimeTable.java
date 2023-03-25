package com.azure.loop;

public class TimeTable {
    public static void timetable(int number){
        System.out.println("Timetable of " +" "+ number);
        System.out.println("================");
        for(int a = 1; a<= 10; a++){
            int b = number * a;
            System.out.println(number + "*" + a + "=" + b);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        timetable(10);
        timetable(15);
        timetable(20);
        timetable(25);
        timetable(30);
        timetable(50);
    }
}
