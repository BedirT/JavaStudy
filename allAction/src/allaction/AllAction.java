/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allaction;

import java.util.Scanner;

/**
 *
 * @author BedirTapkan
 */
public class AllAction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        BandBooster thing1 = new BandBooster("Joe");
        BandBooster thing2 = new BandBooster("Jack");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of boxes sold by "+ thing1.getName() +" this week: ");
        thing1.updateSales(scan.nextInt());
        
        System.out.print("Enter the number of boxes sold by "+ thing2.getName() +" this week: ");
        thing2.updateSales(scan.nextInt());
        
        System.out.print("Enter the number of boxes sold by "+ thing1.getName() +" this week: ");
        thing1.updateSales(scan.nextInt());
        
        System.out.print(thing1.toString());
        System.out.print(thing2.toString());
    }
    
}
