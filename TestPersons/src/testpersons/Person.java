/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpersons;

/**
 * NAME : Person Class
 * 
 * Description : This is a class for us to use in our TestPersons.java file.
 * We created this class for using all predefined functions inside of it.
 * 
 * @author BedirTapkan
 */
public class Person {

    String firstName;
    String middleName;
    String lastName;
    int agee;

    public Person(String first, String middle, String last, int age) {
    firstName = first;
    middleName = middle;
    lastName = last;
    agee = age;
    }

    public String getFirst() {
        return firstName;
    }
    public String getMiddle() {
        return middleName;
    }
    public String getLast() {
        return lastName;
    }
    public String firstMiddleLast() {
        return (firstName + " " + middleName + " " + lastName);
    }
    public String lastFirstMiddle() {
        return (lastName + ", " + firstName + " " + middleName);
    }
    public boolean equals(Person otherPerson) {
        return firstMiddleLast().equalsIgnoreCase(otherPerson.
                firstMiddleLast());
    }
    public String initials() {
        return firstName.substring(0,1)+middleName.substring(0,1)+
                lastName.substring(0,1);
    }    
    public int length() {
        return firstName.length() + middleName.length() + lastName.length();
    }   
    public void changeAge(int ageChange) {
        agee = ageChange;
    }    
    public int getAge() {
        return agee;
    }
}
