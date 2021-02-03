/**
 *
 * @author danielgomez
 */
import java.util.Scanner;

public class A1_Question1 {

/* This program request the user to input a number between 0 to 1000. 
It then adds all the place values within this number. */
    
    public static void main(String[] args) {
    
    // This creates the new scanner object    
    Scanner input = new Scanner(System.in);
    
    // This requests the user to input any number between 0 to 1000
    System.out.println("Enter any number between 0 to 1000: ");
    int number = input.nextInt();
    
    //Here the sum of the place values is calculated
    int firstplace = number % 10; // Stores the rem. which is the 1st place val
    number /= 10;   //Divides number by 10 & removes the first place value
    int secondplace = number % 10; //Stores the rem. which is the 2nd place val
    number /= 10;   //Divides number by 10 & removes the second place value
    int thirdplace = number % 10; // Stores the rem. which is the 3rd place val
    number /= 10;   // Divides number by 10 & removes the third place val
    int total = firstplace + secondplace +thirdplace; //Adds all pl. values
    
    //And then finally the total gives the additon of all the pl. values
    System.out.print("Adding the place values of the number equals: " + total);
       
    }
    
}
