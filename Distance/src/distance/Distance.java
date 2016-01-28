package distance;
// ************************************************************
// Distance.java
//
// Computes the distance between two points
// ************************************************************
import java.lang.Math;
import java.util.Scanner;

public class Distance
{

    public static void main(String[] args) {
        double x1, y1, x2, y2; // coordinates of two points
        double distance; // distance between the points
        Scanner scan = new Scanner(System.in);
        // Read in the two points
        System.out.print("Enter the coordinates of the first point "
                + "(put a space between them): ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        System.out.print("Enter the coordinates of the second point: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        // Compute the distance
        distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("The distance is = " + distance);
        
        // Print out the answer
    }
}
