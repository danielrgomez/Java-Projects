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

public class Lottery_Problem {

    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);    
    
    int lottery = (int) (Math.random() * 100);
   
    
    System.out.println("Choose a number between  1 to 100, and you may win"
    + " the lottery" + "\nYour number is: ");
    
    int number = input.nextInt();
    int onesnum = number % 10;
    int twosnum = number / 10; 
    int onelott = lottery % 10;
    int twolott = lottery / 10;
    
    
    if(number == lottery){
        System.out.println("Congratulations the number you chose: " + number +
        " matches exactly with the lottery of: " + lottery + ".\nYou just won"
        + " 10,000 dollars!!!");
    }
    
    else if(onesnum==twolott && twosnum == onelott){
        System.out.println("Second prize!! This is for 3000 dollars!"
        + " The lottery was for: " + lottery + ", and your number was: " + number);
          
    }    
        
    else if (onesnum == onelott || onesnum == twolott || twosnum == twolott || twosnum == twolott){
        System.out.println("Third prize of 1000 dollars!!!" +
        "The lottery was: " + lottery + " and your number was: " + number);    
    }
    
    else{
        System.out.println("Sorry... you did not win anything. The Lottery was: " + lottery +
        ", and your number was: " + number);
    }
    
    }
    
}
