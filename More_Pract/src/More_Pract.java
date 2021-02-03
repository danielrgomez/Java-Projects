/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielgomez
 */
import java.util.Scanner;

public class More_Pract {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Choose any number between 0 and 1000: ");
        
    int number = input.nextInt();
    
    
    if (number < 0){
        System.out.printf("The input: %d is incorrect! "
                + "\nIt must be above 0!!!",number);
    }
    
    else if(number > 1000){
        System.out.printf("The input: %d is incorrect"
                + "\nIt must be below 1000!!!",number);
    }
    
    else if (number >= 100){
        String s = Integer.toString(number);
    
    
        String one = s.substring(0,1);
        String two = s.substring(1,2);
        String three= s.substring(2,3);
    
    
        System.out.println("Each one of the place values for your number -> " + 
        number + " are: \n" + one + ", " + two + ", " + three );
    
        int firstPv = Integer.parseInt(one);
        int secondPv = Integer.parseInt(two);
        int thirdPv = Integer.parseInt(three);
    
        System.out.println("The sum of all the place values of your number " + 
        number + " results in: " + (firstPv + secondPv + thirdPv));
    }        
    
    else if(number <= 99){
        String s = Integer.toString(number);
        
        String one = s.substring(0,1);
        String two = s.substring(1,2);
        
        System.out.println("Each one of the place values for your number -> " + 
        number + " are: \n" + one + ", " + two);
        
        int firstPv = Integer.parseInt(one);
        int secondPv = Integer.parseInt(two);
        
        System.out.println("The sum of all the place values of your number " + 
        number + " results in: " + (firstPv + secondPv));
        
    }

    else{
        System.out.print("Invalid Number!");
    }
    
    }
    
}
