/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BedirTapkan
 */
public class Lab10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        int x = 0;
//        while(x<100){
//            System.out.println("“I love computer science!!");
//            x++;
//        }
//        int sum = 0; //setup
//        String keepGoing = "y";
//        int nextVal,counter = 0;
          Scanner scan = new Scanner(System.in);
//        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
//            System.out.print("Enter the next integer: "); //do work
//            nextVal = scan.nextInt();
//            sum = sum + nextVal;
//            System.out.println("Type y or Y to keep going"); //update condition
//            keepGoing = scan.next();
//            counter++;
//        }
//        System.out.println("The sum of your integers is " + sum);
//        System.out.println("You entered " + counter + " integers");
//        int count = 10;
//        while (count >= 0) {
//            System.out.println(count);
//            count--;
//        }
//        //////////
//        int limit = scan.nextInt();
//        
//        int count = 1,sum = 0;
//        while (count <= limit) {
//            System.out.println(count +" I love Computer Science!!");
//            sum+=count;
//            count++;
//        }
//        System.out.println("Printed this message " + limit + " times.");
//        System.out.println("The sum of the numbers from " + 1 + " to " + 
//                limit + " is " + sum);
        

        int numToGuess; //Number the user tries to guess
        int guess, tooHigh=0, tooLow=0; //The user's guess
//        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        numToGuess = generator.nextInt(10);
        System.out.println("Guess the number: ");
        guess = scan.nextInt();
        while (guess != numToGuess) {
            if (guess > numToGuess) {
                tooHigh++;
                System.out.println("Try Again your guess is bigger than"
                        + " the number");
            } else if (guess < numToGuess) {
                tooLow++;
                System.out.println("Try Again your guess is smaller than"
                        + " the number");
            }
            guess = scan.nextInt();
        }
        System.out.println("That is Correct ! ");
        System.out.println("Too high tries = " + tooHigh);
        System.out.println("Too low tries = " + tooLow);
    }

}
