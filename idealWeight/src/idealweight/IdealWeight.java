package idealweight;

//@author BedirTapkan
/*
Desctiption : We will calculate a persons ideal weight by looking her/his height

ProgramName : idealWeight

*/


import java.util.Scanner;

public class IdealWeight {

    public static void main(String[] args) {
        
        int ideal = 0 , maleHeight, femaleHeight, maleIdeal, femaleIdeal  ;
        int idealRangedF, idealRangeuF, idealRangedM, idealRangeuM ;
        // int gender =0;
        Scanner input = new Scanner(System.in);
        
        
        // Uncomment if you want to ask gender to user.
//        do{
//            
//            System.out.println("What is your gender ?");
//            System.out.println("(1 for male / 2 for female)");
//            gender = input.nextInt();
//        
//            if (gender != 1 && gender != 2)
//                System.out.println("Please choose a valid number: 1 or 2");
//            
//        }while(gender != 1 && gender != 2);
        
        System.out.println("What is your height?");
        System.out.print("Foots: ");
        int heightf = input.nextInt();
        System.out.print("Inches: ");
        int heights = input.nextInt();
        
         // Uncomment if you want to ask gender to user.
//        if (gender == 1){
//            height=heights+(heightf-5)*12;
//            ideal =106+(height*6); 
//            
//        }
//        else if (gender == 2){
//            height=heights+(heightf-5)*12;
//            ideal =100+(height*5);
//        }
        
        
        maleHeight=heights+(heightf-5)*12;
        maleIdeal =106+(maleHeight*6);
        
        femaleHeight=heights+(heightf-5)*12;
        femaleIdeal =100+(femaleHeight*5);
        
        idealRangedM = maleIdeal-(maleIdeal*15/100) ;
        idealRangeuM = maleIdeal+(maleIdeal*15/100) ;
        idealRangedF = femaleIdeal-(femaleIdeal*15/100) ;
        idealRangeuF = femaleIdeal+(femaleIdeal*15/100) ;
        
        System.out.println("\nFor male in this height, the ideal weight is " + maleIdeal + " pounds" );
        System.out.println("For male in this height, the range of ideal weight is " + idealRangedM + " pounds to "
        + idealRangeuM );
        
        System.out.println("\nFor female in this height, the ideal weight is " + femaleIdeal + " pounds" );
        System.out.println("For female in this height, the range of ideal weight is " + idealRangedF + " pounds to "
        + idealRangeuF );
        System.out.println();
    }
    
}
