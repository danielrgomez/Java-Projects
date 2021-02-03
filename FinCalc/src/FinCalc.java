/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner; 

public class FinCalc {

    public static void main(String[] args) {
    
            
    Scanner input = new Scanner(System.in);
    
    SimpleFinance cash_1 = new SimpleFinance();
    
    System.out.println("First we will find out the present value. \n"
            + "What is your Future Value: ");
    double fValue = input.nextDouble(); 
    cash_1.setFV(fValue);
    
    System.out.println("What is the interest: ");
    double interest = input.nextDouble();
    cash_1.setI(interest);
    
    System.out.println("What is the number of periods? ");
    double periodsN = input.nextDouble();
    cash_1.setN(periodsN);
    
    System.out.println("That means that the present value is: " + 
            cash_1.presValue(fValue, interest, periodsN));
        
    System.out.println("Now we will find out the future value. \n");
    
    System.out.println("What is your Present Value? ");
    double pValue = input.nextDouble();
    cash_1.setpresVal(pValue);
    
    System.out.println("What is your interest? ");
    double i = input.nextDouble();
    cash_1.setI(i);
    
    System.out.println("What is the number of periods? ");
    double n = input.nextDouble();
    cash_1.setN(n);
    
    System.out.println("That means that your Future Value is: " 
            + cash_1.futValue(pValue, i, n));
        
        
    }
    
}
