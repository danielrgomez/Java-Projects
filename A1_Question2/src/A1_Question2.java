
/**
 *
 * @author danielgomez
 */

/* This program requests the user to input two coordinate points. It then
finds the distance betweeen these points.
*/
import java.util.Scanner;

public class A1_Question2 {

    public static void main(String[] args) {
    
    //Here we create the scanner 
    Scanner input = new Scanner(System.in);
    
    // We request that the user the first coordinate point
    System.out.println("Enter x1 and y1: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    
    //We then request the user to input the second coordinate point
    System.out.println("Enter x2 and y2: ");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    
    //The program computes the distance between the two points
    double diffxy = Math.pow((x1 - x2),2) + Math.pow((x2 - y2),2);
    double distance = Math.sqrt(diffxy);
    
    //Finally, it displays the distance between the two points
    System.out.print("The distance between the two points is: " + distance);
    
    }
    
}
