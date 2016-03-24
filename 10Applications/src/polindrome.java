
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BedirTapkan
 */
public class polindrome {

    public static void main(String[] args) {
        //Write Java program to check if a number is palindrome in Java? ( 121 is palindrome, 321 is not)
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        boolean a = true;
//        String reverse = new StringBuilder(n).reverse().toString();
        
        for(int i = 0 ; i < n.length() ; i++){
            if(n.charAt(i)!=n.charAt(n.length()-i-1)){
               a = false;
            }
        }
        
        if(a){System.out.println("Polindrome");}
        else{System.out.println("Not Polindrome");}
        
//        if(reverse.equals(n)){System.out.println("Polindrome");}
//        else{System.out.println("Not Polindrome");}
 
    }
}
