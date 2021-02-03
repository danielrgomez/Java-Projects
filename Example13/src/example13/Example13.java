/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example13;

/**
 *
 * @author danielgomez
 */
public class Example13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int num = 13;
      System.out.println((num% 2 ==0) ? (num + " is even") : (num +" is odd"));
      System.out.println(4 + 20 / (3 - 1) * 2);
      
      double x = 5.5;

      int y = (int)x;

      System.out.println("x is " + x + " and y is " + y);
      System.out.println((int)(76.0252175 * 100) / 100);
      
      int n = 10000 * 10000 * 10000;

      System.out.println("n is " + n);
      
       
    }
    
}
