/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rock;

// ************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//
// ************************************************************
import java.util.Scanner;
import java.util.Random;

public class Rock {

    public static void main(String[] args) {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = "";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
//computer's play
        System.out.println("Enter your play: R, P, or S");
        Scanner scan = new Scanner(System.in);
//Get player's play -- note that this is stored as a string
        personPlay = scan.next();
//Make player's play uppercase for ease of comparison
        personPlay = personPlay.toUpperCase();
//Generate computer's play (0,1,2)
        Random gen = new Random();
//Translate computer's randomly generated play to string
        computerInt = gen.nextInt(3);
        switch (computerInt) {
            case 0:
                computerPlay = "R";
            case 1:
                computerPlay = "P";
            case 2:
                computerPlay = "S";
        }

        System.out.println("Computer's play is " + computerPlay);
//See who won.  Use nested ifs instead of &&.
        if (personPlay.equals(computerPlay)) {
            System.out.println("It's a tie!");
        } else if (personPlay.equals("R")) {
            if (computerPlay.equals("S")) {
                System.out.println("Rock crushes scissors.  You win!!");
            } else {
                System.out.println("Paper covers rock.  You lose!!");
            }
        } else if (personPlay.equals("S")) {
            if (computerPlay.equals("R")) {
                System.out.println("Rock crushes scissors.  You lose!!");
            } else {
                System.out.println("Scissors cut papers.  You win!!");
            }
        } else {
            if (computerPlay.equals("S")) {
                System.out.println("Scissors cut papers.  You lose!!");
            } else {
                System.out.println("Paper covers rock.  You win!!");
            }
        }
    }
}
