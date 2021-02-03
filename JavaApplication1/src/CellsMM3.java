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
public class CellsMM3 {

public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    final double DILUTION = 20;
    final double AREA = 4;
    final double DEPTH = .1;
    
   double wbc = input.nextDouble();
   double cellsMM3 = wbc * DILUTION / (AREA * DEPTH);
   
   System.out.println("Input the number of White Blood Cells: " + wbc + ".");
   System.out.print("Due to this we can " + "determine that the Cells/MM3 is equal to: " + cellsMM3);
    
}
    }
