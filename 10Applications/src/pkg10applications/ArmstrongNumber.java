/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10applications;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author BedirTapkan
 */
public class ArmstrongNumber {
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] digits = new int[3];
        int sum = 0;
        // it is 3 digits - it is a constant
        
        for(int i = 0 ; i < 3 ; i++){
            
            digits[i] = (int)(num/pow(10,2-i));
            digits[i] %= 10;
            sum += (int)pow(digits[i],3);
            System.out.println(sum);
        }
        String result = sum==num? "true" : "false";
        System.out.println(result);
    }
    
}
