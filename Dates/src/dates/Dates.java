/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dates;

/**
 *
 * @author BedirTapkan
 */
// ************************************************************
// Dates.java
//
// Determine whether a 2nd-millenium date entered by the user
// is valid
// ************************************************************
import java.util.Scanner;

public class Dates {

    public static void main(String[] args) {
        int month, day, year;   //date read in from user
        int daysInMonth = 0;        //number of days in month read in
        boolean monthValid=true, yearValid=true, dayValid=false;  
        boolean leapYear = false;      //true if user's year is a leap year
        Scanner scan = new Scanner(System.in);
//Get integer month, day, and year from user
        System.out.println("Enter Month/Day/Year");
        month = scan.nextInt();
        day = scan.nextInt();
        year = scan.nextInt();
//Check to see if month is valid
        if (month < 1 || month > 12) {
            monthValid = false;
        }
//Check to see if year is valid
        if (1000 > year || year > 1999) {
            yearValid = false;
        }
//Determine whether it's a leap year
        if (year % 400 == 0) {
            leapYear = true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            leapYear = true;
        }
//Determine number of days in month
        if(month == 2)
            daysInMonth = leapYear ? 29 : 28;
        else if(month == 1 || month == 3 || month == 5 || month == 7 || 
                month == 8 || month == 10 || month == 12)
            daysInMonth = 31;
        else
            daysInMonth = 30;
                        
        
//User number of days in month to check to see if day is valid
        if (day <= daysInMonth && day > 0 )
            dayValid = true;
        
        if (dayValid && yearValid==true && monthValid==true)
            System.out.println("Valid Date");
        else
            System.out.println("Invalid Date");
        
        System.out.println(dayValid + " " + yearValid + " " + monthValid);
//Determine whether date is valid and print appropriate message
}
}

