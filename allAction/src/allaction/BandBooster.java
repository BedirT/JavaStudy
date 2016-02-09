/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allaction;

/**
 *
 * @author BedirTapkan
 */
public class BandBooster {
   
    String StudentName;
    int boxesSold = 0;
    
    public BandBooster (String name) {
        StudentName = name;
    }
    
    public String getName () {
        return StudentName;
    }

    public int updateSales (int number){
        boxesSold+=number;
        return boxesSold;
    }
    public String toString (){
        String end = (StudentName+": "+boxesSold+" boxes");
        return end; 
    }

    
}
