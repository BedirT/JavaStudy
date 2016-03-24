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
public class Prime {

    public static void main(String[] args) {

        //Write a program in Java to find out if a number is prime in Java? 
        //(input 7: output true , input 9 : output false)

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean a = false;
        System.out.println(n);
        for(int i = 2 ; i < n ; i++){
            if(n%i==0){
                a = true;
            }
        }
        if(a){System.out.println("True");}
        else{System.out.println("False");}
    }
}
