/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intclass;

import java.util.Scanner;
import java.lang.Integer;
/**
 *
 * @author BedirTapkan
 */
public class IntClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter the number");
        
        Scanner scan = new Scanner(System.in);
        int theNum = scan.nextInt();
        
        System.out.println("The binary = " + Integer.toBinaryString(theNum));
        System.out.println("The Octal = " + Integer.toOctalString(theNum));
        System.out.println("The Hexadecimal = " + Integer.toHexString(theNum));
        
        
        System.out.println("The biggest integer in Java = " +Integer.MAX_VALUE); 
        System.out.println("The smallest integer in Java = " 
                +Integer.MIN_VALUE);
        
        String num1 = scan.next();
        String num2 = scan.next();
        System.out.println("The sum of these numbers is = " 
                +(Integer.valueOf(num1)+Integer.valueOf(num2)));
        
    }
    
}
