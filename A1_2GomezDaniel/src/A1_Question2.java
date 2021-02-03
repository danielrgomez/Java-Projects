
/**
 *
 * @author danielgomez
 */

/* This program requests the user to input two coordinate points. It then finds
the distance between both points. 
*/
import java.util.Scanner;

public class A1_Question2 {
    
    public static void main(String[] args) {
        // This creates the Scanner Input.
        Scanner input = new Scanner(System.in);
        
        //User must now enter the first coordinate point
        System.out.println("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        //User must now enter the second coordinate point
        System.out.println("Now, Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        //Here the program computes the distance between both points
        double diffxy = Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2);
        double distance = Math.pow(diffxy,.50);
        
        //Finally, the program gives the result of the distance between points.
        System.out.print("The distance between the two points is: " + distance);
        
    } 
}
