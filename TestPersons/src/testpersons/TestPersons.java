/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpersons;
/**
 * Title : PERSON - HW 3
 * 
 * Description : In this project we will experience how to create a new class
 * all by ourselves and how to use it in our main class. 
 * 
 * @author BedirTapkan
 */
public class TestPersons {

    public static void main(String[] args) {
        
        Person person1 = new Person("Mustafa","Bedir","Tapkan",19);
        Person person2 = new Person("Omer","Faruk","Yolal",19);
        
        System.out.println(person1.firstMiddleLast());
        System.out.println(person1.lastFirstMiddle());
        System.out.println(person1.initials());
        System.out.println(person1.length());
        System.out.println(person1.agee);
        System.out.println("");
        System.out.println(person2.firstMiddleLast());
        System.out.println(person2.lastFirstMiddle());
        System.out.println(person2.initials());
        System.out.println(person2.length());
        System.out.println(person2.agee);
        System.out.println("");
        if(person1.equals(person2) && person1.agee == person2.agee){
            System.out.println("The names and ages are equal");
        }else
            System.out.println("The names and ages are not equal (At least one"
                    + " of them is different.)");
        System.out.println("");
    }
    
}
