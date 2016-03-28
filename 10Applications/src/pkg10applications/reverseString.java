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
public class reverseString {
    public static void main(String[] args) {
        
       //Write a program in Java to check if a number is even or odd in Java?
       //(input 2 output true, input 3 : output false)
       Scanner scan = new Scanner(System.in);
       String text = scan.nextLine();
       String reversed = "";
       int i;
       for(i = 0 ; i < text.length() ; i++){
           char c = text.charAt(text.length()-i-1);
           reversed.toCharArray();
       }
    }
}
