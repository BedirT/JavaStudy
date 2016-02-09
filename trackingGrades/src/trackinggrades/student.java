/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackinggrades;

import java.util.Scanner;

/**
 *
 * @author BedirTapkan
 */
public class student {
    
    String studentName;
    int exam1,exam2;
    public student(String name ) {
        studentName = name;
    }

    public String getName() {
        return studentName;
    }
    
    public void inputGrades() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter's " + studentName + "'s score for test1");
        exam1 = scan.nextInt();
        exam2 = scan.nextInt();
    }
    
    public double getAverage() {
        return ((double)exam1+(double)exam2)/2;
    }
    
    public String toString(){
        String aa = ("Name:"+ studentName+" Test1: "+exam1+" Test2: "+ exam2);
        return aa;
    }
}
