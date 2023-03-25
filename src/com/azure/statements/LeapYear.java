package com.azure.statements;

public class LeapYear {
    public static void findLeapYear (int year){
        if (year % 400== 0){
            System.out.println(year+" "+" is leap year");
        }else if (year % 100 ==0){
            System.out.println(year+" "+" is not a leap year");
        }else if (year % 4 == 0){
            System.out.println(year+" "+" is leap year");
        }else{
            System.out.println(year+" "+" is not a leap year");
        }
    }
    public static void main(String[] args) {
        findLeapYear(1999);
        findLeapYear(2001);
        findLeapYear(2020);
        findLeapYear(2008);
    }
}
// if year divided by 4 (its a year)and no remendus left  than its a leap year
// if year divided by 4oo ( if 'year' its  centuary year)and no remendus left than its a  leap year.
// if year divided by 100  and no than not leap year//
// exap 1900 year its a centuary year so needs to divided by  4 and 400.1900 not divided by 400 so its not a leap year//
//exap 2012 is a year and it will divided by 4 and no remendus left so its a leap year//
             // logic for leapyear count//
//Leap Year contains 366 days, which comes once every four years. Every leap year corresponds to these facts :
//
//A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
//A leap year (except a century year) can be identified if it is exactly divisible by 4.
//A century year should be divisible by 4 and 100 both.
//A non-century year should be divisible only by 4.//

