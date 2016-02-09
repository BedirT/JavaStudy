
import trackinggrades.student;

// ************************************************************
// Grades.java //
// Use Student class to get test grades for two students
// and compute averages //
// ************************************************************
public class Grades {

    public static void main(String[] args) {
        student student1 = new student("Mary");
        student student2 = new student("Mike");
        student1.inputGrades();
        System.out.println("The average of " + student1.getName() + "'s score is " + student1.getAverage());
        
        System.out.println();
        
        student2.inputGrades();
        System.out.println("The average of " + student2.getName() + "'s score is " + student2.getAverage());
    }
}
