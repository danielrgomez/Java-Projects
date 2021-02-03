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

public class Math_Learning_Tool {

    public static void main(String[] args) {
    
        
        
    int num1 = (int) (Math.random() * 10);
    int num2 = (int) (Math.random() * 10);
   
    if(num1 < num2){
       int temp = num1;
       num1 = num2;
       num2 = temp;
           
    }
    
    System.out.println("When you subtract: " + num1 + " - " + num2 +
    "\nWhat is the answer?");
    
    
    
    Scanner input = new Scanner(System.in);
    
    int ans = input.nextInt();
    
    if (ans == (num1 - num2)){
        System.out.print("Your answer: " + ans + " Is correct!!");
        
    }
    else if (ans != num1 - num2){
        System.out.print("Your answer: " + ans + " Is Incorrect!!");
    }    
    
    }
    
}
    