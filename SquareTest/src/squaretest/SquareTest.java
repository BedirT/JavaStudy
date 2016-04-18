/*
SquareTest.java should contain a program that reads input for squares
from a file named magicData.txt and tells whether each is a magic square.
Main method should read the size of a square, then after constructing the
square of that size, it should call the readSquare method to read the square in.
 */
package squaretest;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author BedirTapkan
 */
public class SquareTest {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner scan = new Scanner(new File("/Users/BedirTapkan/Desktop/MagicData.txt"));
        
        int size = scan.nextInt();
        int count = 1;
        
        while(size>=0){
            
            Square obj1 = new Square(size);
            obj1.fillMatrix(scan);
            obj1.printSqr();
            System.out.println(obj1.isMagic());
            count++;
            size = scan.nextInt();
            
        }
        
        
//        Square obj1 = new Square(3);
//        
//        obj1.fillMatrix();
//        obj1.printSqr();
//        System.out.println(obj1.isMagic());
     
        
    }
    
}
