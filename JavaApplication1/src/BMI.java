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
public class BMI {


    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    double kg = input.nextDouble();
    double m = input.nextDouble();
    
    double bmi = kg/Math.pow(m,2);
    
    if(bmi >= 30){
        System.out.print("Your BMI is: "+ bmi + " and you are: Obese.");
    }
    else if (bmi >= 25){
        System.out.print("Your BMI is: "+ bmi + " and you are: Overweight.");
    } 
    else if (bmi >= 18.5){
        System.out.print("Your BMI is: "+ bmi + " and you are: Normal");
    } 
    else{
        System.out.print("Your BMI is: "+ bmi + " and you are: Underweight.");
    }
    
        
    }
}
