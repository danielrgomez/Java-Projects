/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author danielgomez
 */

import java.util.Scanner;

public class Practice {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        double pound = input.nextDouble();
        double feet = input.nextDouble();
        
        double kg = pound * .453592;
        double m = feet * 3.28;
        
        double bmi = kg / Math.pow(m,2);
        
        System.out.println("If your weight is: " + kg + 
        " and your height is " + m + "\nThen your BMI is: " + 
        bmi);
        
        if (bmi > 30){
            System.out.print("This means that you are Obese");
        }
        else if (bmi <= 30){
            System.out.print("Then that means that you are Overwight");
        }
        else if (bmi <= 25){
            System.out.print("Then that means that you are Normal");
        }
        else if (bmi <= 18.5){
            System.out.print("Then that means that you are Underweight");
        }
    }
}
