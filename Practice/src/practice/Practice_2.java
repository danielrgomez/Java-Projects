
package practice;

import java.util.Scanner;

public class Practice_2 {
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
