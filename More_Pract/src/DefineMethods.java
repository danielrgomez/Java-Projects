/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author danielgomez
 */
public class DefineMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your income? ");
        double income = input.nextDouble();
        
        System.out.print("So your income after taxes is: ");
        double answer = afterTax(income);
    }

    public static double afterTax(double income){
    
    double afterTax = income * .045;
    
    return afterTax;
    
    
    }
    
}

   
