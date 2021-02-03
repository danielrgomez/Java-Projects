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

public class Lottery_Dos {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int winNo = (int)(Math.random()* 10);
        
        System.out.println("Make a 1st guess? ");
        int guess1 = input.nextInt();
        
        System.out.println("Make a 2nd guess? ");
        int guess2 = input.nextInt();
        
        if(guess1 == winNo && guess2 == winNo){
            System.out.println("Payout = $1000");
            
        }
        
        else if(guess1 == winNo ^ guess2 == winNo){
            System.out.println("Payout = $100. The lucky number is " + winNo);
        }
        
        else{
            System.out.println("You lost. The winning number was " + winNo);
        }
        
}
    }
    
    

