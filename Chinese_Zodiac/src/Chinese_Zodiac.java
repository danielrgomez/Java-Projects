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

public class Chinese_Zodiac {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("What year were you born? ");
    
    int year = input.nextInt();
    
    switch (year % 12){
        case 0 : System.out.println("Your Chinese Zodiac is a Monkey"); break;
        case 1 : System.out.println("Your Chinese Zodiac is a Rooster"); break;
        case 2 : System.out.println("Your Chinese Zodiac is a Dog"); break;
        case 3 : System.out.println("Your Chinese Zodiac is a Pig"); break;
        case 4 : System.out.println("Your Chinese Zodiac is a Rat"); break;
        case 5 : System.out.println("Your Chinese Zodiac is a OX"); break;
        case 6 : System.out.println("Your Chinese Zodiac is a Tiger"); break;
        case 7 : System.out.println("Your Chinese Zodiac is a Rabbit"); break;
        case 8 : System.out.println("Your Chinese Zodiac is a Dragon"); break;        
        case 9 : System.out.println("Your Chinese Zodiac is a Snake"); break;
        case 10 : System.out.println("Your Chinese Zodiac is a Horse"); break;
        case 11 : System.out.println("Your Chinese Zodiac is a Sheep"); break;
        
    }
            
        
        
    }
    
}
