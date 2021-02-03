/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner; 

public class Exam_2 {



    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    SimpleExam fin = new SimpleExam();
    
    System.out.println("Input PV: ");
    double pres = input.nextDouble();
    fin.setPV(pres);
    
    
    System.out.println("Input interest: ");
    double interest = input.nextDouble();
    fin.setI(interest);
    
    
    System.out.println("Input number of periods: ");
    double periods = input.nextDouble();
    fin.setN(periods);
    
    
    System.out.println("Future value is: " + fin.getFV(pres, interest, periods));
    
    System.out.println("Input FVA Ordinary: ");
    
    double newfvaDue = fvaDue(input.nextDouble());
    
    System.out.println("The new FVA Due is: " + newfvaDue);
    
        
        
        
        
    }
    
      
    public double setInt(double newIntr){
        double interest = 1;
        return newIntr = interest;
    }
    
    
    public static double fvaDue(double fvaOrd){
        return fvaOrd *(1 + .12);
        
        }
    
    
    
    
    
}
