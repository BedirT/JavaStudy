/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

/**
 *
 * @author BedirTapkan
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NewClass die1 = new NewClass();
        NewClass die2 = new NewClass();
        
        die1.setValue(5);
        die2.setValue(5);
        
        boolean b = die1==die2;
        System.out.println(b);
        die1.equals(die2);
        
    }
    
}
