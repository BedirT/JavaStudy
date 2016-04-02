/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomwalks;

/**
 *
 * @author BedirTapkan
 */
import java.util.Scanner;

public class TestWalk {

    public static void main(String[] args) {

        int maxSteps; // maximum number of steps in a walk 
        int maxCoord; // the maximum x and y coordinate 
        int x, y; // starting x and y coordinates for a walk
        int counter = 0;

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("\nRandom Walk Test Program");
//        System.out.println();
//
//        System.out.print("Enter the boundary for the square: ");
//        maxCoord = scan.nextInt();
//        System.out.print("Enter the maximum number of steps: ");
//        maxSteps = scan.nextInt();
//
//        System.out.print("Enter the starting x and y coordinates with " + "a space between: ");
//
//        x = scan.nextInt();
//        y = scan.nextInt();
//
//        RandomWalk obj1 = new RandomWalk(10, 5);
//        RandomWalk obj2 = new RandomWalk(maxSteps, maxCoord, x, y);

        //Declare and instantiate two RandomWalk objects --one with boundary 5, 
        //maximum steps 10, and centered at the origin (use the two parameter
        //constructor) and the other with the values entered by the user.
        
////        RandomWalk obj3 = new RandomWalk(10, 200);
        
//        for(int i = 0 ; i < 5 ; i++){
//            obj1.takeStep();
//            obj2.takeStep();
//            System.out.println(obj1.toString());
//            System.out.println(obj2.toString());
//        }
        
        Collisions object = new Collisions(2000000, 100000);
        System.out.println(object.hits());
        
        RandomWalk p1 = new RandomWalk(2000000, 100000, -3, 0);
        RandomWalk p2 = new RandomWalk(2000000, 100000, 0, -3);
        
        for(int i = 0 ; i < 10000 ; i++){
            
            p1.takeStep();p2.takeStep();
            if(Collisions.samePosition(p1, p2)){
                counter++;
            }
            
        }
        
        System.out.println(counter);
        
////        obj3.walk();
////        System.out.println(obj3.toString());
        
        //Print out each object. Note that you won’t get any information about the 
        //boundary or maximum number of steps (think about what your toString 
        //method does), but that’s ok.
    }
}
