/*
should contain a class that represents a square matrix. It should include
a constructor that gives the size of the square and methods to read values
into the square, print the square, find the sum of a given row, find the sum
of a given column, find the sum of the main (or other) diagonal, and determine
whether the square is magic.
 */
package squaretest;

import java.util.Scanner;

/**
 *
 * @author BedirTapkan
 */
public class Square {
    
    private int size;
    int array[][];
    int sum = 0;
    
    Square (int size) {
        
        this.size = size;
        array = new int[size][size];
        
    }
    
    public void fillMatrix(Scanner scan){
        
        for(int i = 0 ; i<size ; i++){
            for(int j = 0 ; j<size ; j++){
                array[i][j] = scan.nextInt();
            }
        }  
    }
    
    public void printSqr(){
        
        for(int i = 0 ; i<size ; i++){
            for(int j = 0 ; j<size ; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
          
    }
    
    private int sumOfRow(int a){
        
        sum = 0;
        for(int i = 0 ; i<size ; i++){
            sum += array[i][a];
        }
        return sum;
    
    }
    
    private int sumOfColumn(int a){
        
        sum = 0;
        for(int i = 0 ; i<size ; i++){
            sum += array[a][i];
        }
        return sum;
    
    }
    
    private int sumOfMainDiognal(){
        
        sum = 0;
        for(int i = 0 ; i<size ; i++){
            sum += array[i][i];
        }
        return sum;
    
    }
    
    private int sumOfOtherDiognal(){
        
        sum = 0;
        for(int i = 0 ; i<size ; i++){
            sum += array[i][size-i-1];
        }
        return sum;
    }
    
    public boolean isMagic(){
        
        boolean cond = false;
        int[] check = new int[2*size+3];
        for(int i = 0 ; i<size ; i++){
            check[i] = sumOfRow(i);
        }
        for(int i = size ; i<2*size ; i++){
            check[i] = sumOfColumn(i-size);
        }
        check[2*size] = sumOfMainDiognal();
        check[2*size+1] = sumOfOtherDiognal();
        
        for(int i = 0 ; i<2*size+2 ; i++){
            if(check[i]==check[0]){
                cond = true;
            }else{
                cond = false;
                break;
            }
        }
        
        return cond;
    }
    
}
