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

public class Java_Practice1 {


    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter any integer: ");
    
    int number = input.nextInt();
    
    if (number % 2 == 0){
        System.out.print("Hi Even");
    }
    if (number % 5 == 0){
        System.out.print("Hi Five");
    }
    
    }
    
}