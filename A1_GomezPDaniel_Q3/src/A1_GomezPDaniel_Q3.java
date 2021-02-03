/* This program calculates the quadratic formula, and gives three diferent
results, these are dependent on the answer for the discriminant.*/
/**
 *
 * @author danielgomez
 */

import java.util.Scanner;

public class A1_GomezPDaniel_Q3 {

    public static void main(String[] args) {
    
    // Here we create the scanner
    Scanner input = new Scanner(System.in);

    //The program requests the user to input three numbers for a,b and c
    System.out.print("Enter a number for a, b and c: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double discriminant = Math.pow(b, 2.0) - (4*a*c);
    
    //If the discriminant is greater than 0 it will produce two roots
    if (discriminant > 0){
        double firstRoot = ((-b) + Math.pow(discriminant,0.5))/(2 * a);
        double secRoot = ((-b) - Math.pow(discriminant,0.5))/(2 * a);    
    
    //Displays the two roots
    System.out.print("The discriminant is (+) so, the equation has two roots " +
    firstRoot + " and R2: " + secRoot);
        
    }
    
    //However, if the discriminant is equal to 0 then just one root will result
    else if(discriminant == 0){
        double oneRoot = ((-b) + Math.pow(discriminant,0.5))/(2 * a);
    
    //A single root is produced
    System.out.print("Discriminant is 0 so, the equation has one root: " +
    oneRoot);
        
    }
    
    //And if there is anything else that is neither greater than or equal to 0
    else{
    
    //Then the program display that there are no real roots. 
    System.out.print("The equation has no real roots");
        
        
    }
    
        
    }
    
}
