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
public class Factorial {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = 1;
        for(int i = 1; i <= num ; i++){
            result *= i;
        }
        System.out.println(result);
    }
}
