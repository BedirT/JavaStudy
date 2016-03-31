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
public class Fibonacci {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int steps = scan.nextInt();
        int num1 = 1,num2 = 1, temp;
        System.out.print(num1 + "  ");
        for(int i=0; i<steps ; i++){
            System.out.print(num1 + "  ");
            temp = num1;
            num1 += num2;
            num2 = temp;
        }
        
    }
    
}
