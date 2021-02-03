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
public class MonetaryUnits {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double amtMoney = input.nextDouble();
        
        int dollars = (int) amtMoney / 1;
        double quarters = amtMoney / .25;
        double dimes = amtMoney / .1;
        double nickels = amtMoney / .05;
        double pennies = amtMoney / .01;
        
        System.out.println("If we have: $" + amtMoney + " This will be a maximum total" +
        " number of: ");
        System.out.println((int) dollars + " : Dollars, ");
        System.out.println((int) quarters + " : Quarters, ");
        System.out.println((int) dimes + " :  Dimes, ");
        System.out.println((int) nickels + " : Nickels, and lastly,");
        System.out.print((int) pennies + " : Pennies");
   
    
    }
}
