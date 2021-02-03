
/**
 *
 * @author danielgomez
 */

/* This program requests the user to input a number between 0 to 1000. It then
adds all the place values found within this number.
*/
import java.util.Scanner;

public class A1_Question1 {
    
    public static void main(String[] args) {
    
    // This creates a new scanner object    
    Scanner input = new Scanner(System.in);
    
    // This requests the user to input a number between 0 - 1000
    System.out.println("Enter any number between 0 to 1000: ");
    int number = input.nextInt();
    
    // Here the sum of the place values is calculated. 
    int firstplace = number % 10;   // Stores the rem. which is 1st place value
    number /= 10;     // Divides number by 10 & removes the first place value
    int secondplace = number % 10; //Stores the rem. which is the 2nd pl.value
    number /= 10;    // Divides number by 10 & removes the second place value
    int thirdplace = number % 10; //Stores the rem. which is the 3rd pl.value
    number /= 10;   // Divides number by 10 & removes the third place value
    int total = firstplace + secondplace + thirdplace; //Adds all pl. values
    
    //And finally the total gives the addition of the place values
    System.out.print("Adding the place values of the number equals: " + total);
        
    }
    
}
