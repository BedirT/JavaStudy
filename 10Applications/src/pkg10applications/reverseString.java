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
    
    public static String reversed = "";
    
    public static void main(String[] args) {
        
       //Write a program in Java to check if a number is even or odd in Java?
       //(input 2 output true, input 3 : output false)
       Scanner scan = new Scanner(System.in);
       String text = scan.nextLine();
       int len = text.length();
//       int i;
//       int len = text.length();
//       for(i = 0 ; i < text.length() ; i++){
//           reversed = reversed.concat(String.valueOf(text.charAt(len-i-1)));
//       }
        
        System.out.println(recursive(text,len));
    }

    public static String recursive(String a, int len){
        
        len--;
        
        if(len >= 0){    
            reversed = reversed.concat(String.valueOf(a.charAt(len)));
            recursive(a,len);
        }
        return reversed;
    }

}