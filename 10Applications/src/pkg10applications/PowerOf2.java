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
public class PowerOf2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //How to find if a number is power of 2 in Java? (1,2, 4 power of 2, 3 is not)
        while(n>2){
            n = n/2;
        }
        if(n==2){System.out.println("True");}
        else{System.out.println("False");}
    }
}