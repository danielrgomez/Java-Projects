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

public class Addition_Problem {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int number1 = (int) (Math.random() * 10);
    int number2 = (int) (Math.random() * 10);
    int answer = number1 + number2;
        
    System.out.println("What is: " + number1 + " + " + number2 + "?");
    
    int guess = input.nextInt();
    
    
    while (guess != number1 + number2){
    System.out.print("Your answer is incorrect! Try again: " + number1 + " + " + number2 + "? ");
    
    guess = input.nextInt();
    }
    
    System.out.print("Your answer is Correct!!" + "\nYour answer is: " + guess);
    
    }
    
}
