/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10applications;

import java.util.Scanner;

/**
 *
 * @author BedirTapkan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Write a program in Java to check if a number is even or odd in Java?
       //(input 2 output true, input 3 : output false)
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
       if(num%2==0)
           System.out.println("True");
       else
           System.out.println("False");
       
    }
    
}
