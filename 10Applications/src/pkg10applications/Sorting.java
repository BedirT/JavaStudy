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
public class Sorting {

    public static void main(String[] args) {
        //Write program to sort an integer array without using API methods?
        //(I used bubble sorting)
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int arr[] = new int[num];
        int i , j;
        for(i = 0 ; i < num ; i++){
            
            arr[i] = scan.nextInt();
            
        }
        
        for(i = 0; i < num ; i++){
            for(j = i+1 ; j < num ; j++){
                if(arr[i]<arr[j]){
                    arr[i] = arr[i]+arr[j];
                    arr[j] = arr[i]-arr[j];
                    arr[i] = arr[i]-arr[j];
                }
            }
        }
        
        for(i = 0; i < num ; i++){
            System.out.println(arr[i]);
        }
        
        
    }
    
}
