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

public class ArrayPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input number of items: ");
        int totItems = input.nextInt();
        double[] newArray = new double[totItems];
        double sum = 0;
        
        
        System.out.println("Input each one of the items. Up to: " + totItems +
                ". \nInput here: ");
        
        for(int items = 0; items < totItems; items++){
        newArray[items] = input.nextDouble();
        sum += newArray[items];
        }
        
        double average = sum / totItems;
        
        System.out.println("The average of the total items is: " + 
                average);
        
         
         
        
        
        
        
        
        
        
    }
    
}