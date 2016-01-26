package idealweight;

//@author BedirTapkan

import java.util.Scanner;

public class IdealWeight {

    public static void main(String[] args) {
        
        int ideal = 0 , height, gender =0, idealRanged, idealRangeu ;
        
        Scanner input = new Scanner(System.in);
        
        do{
            
            System.out.println("What is your gender ?");
            System.out.println("(1 for male / 2 for female)");
            gender = input.nextInt();
        
            if (gender != 1 && gender != 2)
                System.out.println("Please choose a valid number: 1 or 2");
            
        }while(gender != 1 && gender != 2);
        
        System.out.println("What is your height?");
        System.out.print("Foots: ");
        int heightf = input.nextInt();
        System.out.print("Inches: ");
        int heights = input.nextInt();
        
        //Program with if-else statements
        
        if (gender == 1){
            height=heights+(heightf-5)*12;
            ideal =106+(height*6); 
            
        }
        else if (gender == 2){
            height=heights+(heightf-5)*12;
            ideal =100+(height*5);
        }
        
        // Same program with switch statement
        
//        switch (gender) {
//            case 1:
//                height=heights+(heightf-5)*12; 
//                ideal =106+(height*6);
//                break;
//            case 2:
//                height=heights+(heightf-5)*12;
//                ideal =100+(height*5);
//                break;
//            default:
//                System.out.println("Please enter a valid character.");
//                break;
//        }
        
        idealRanged = ideal-(ideal*15/100) ;
        idealRangeu = ideal+(ideal*15/100) ;

        System.out.println("Your exact ideal weight is " + ideal + " pounds" );
        System.out.println("But the range of good weight for you is " + idealRanged + " pounds to "
        + idealRangeu );
        
    }
    
}
