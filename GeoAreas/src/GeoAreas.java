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
import java.util.Date;

public class GeoAreas {

    public static void main(String[] args) {
//here we find the areas of the geometric figures
    SimpleAreas area_1 = new SimpleAreas();
    
    System.out.println("What is the base of your square? ");
        
    Scanner input = new Scanner(System.in);
        double sqBase = input.nextDouble();
    
    System.out.println("What is the height of your square? ");
        double sqHeight = input.nextDouble();
    
    System.out.println("The Square's area is: " + area_1.getSquareArea(sqBase, sqHeight));

    
    System.out.println("\n\n             ");
    
    System.out.println("\n\nNow what is the base of your triangle? ");
    
        double tBase = input.nextDouble();
        area_1.setBase(tBase);
    
    
    System.out.println("What is the height of your triangle? ");
    
        double tHeight = input.nextDouble();
        area_1.setHeight(tHeight);
    
    
    System.out.println("The triangle's area is: " + area_1.getTriangleArea(tBase, tHeight));
    
    System.out.println("\n\n             ");
    
    System.out.println("\n\nFinally we want to know the area of the circle. "
            + "\nWhat is the radius: ");
    
    double radius_1 = input.nextDouble();
        area_1.setRadius(radius_1);
        
    System.out.println("The area of the circle is: " + area_1.getCircleArea(radius_1));
    
    
    
    /* Now we will do the perimeters of these 
    geometric figures using the SimplePerimeters class*/
    
    
    SimplePerimeters peri_1 = new SimplePerimeters();
    
    System.out.println("What is the side of your square? ");
    
    double side1 = input.nextDouble();
    peri_1.setNewSide(side1);
    
    System.out.println("The perimeter of your square is: " + peri_1.sqPerimeter());
    
    
    System.out.println("Now, the side1 of your triangle is: ");
    double tside1 = input.nextDouble();
    peri_1.setNewSide(tside1);
    
    System.out.println("Now, the side2 of your triangle is: ");
    double tside2 = input.nextDouble();
    peri_1.setSide_2(tside2);
    
    System.out.println("Now, the side3 of your triangle is: ");
    double tside3 = input.nextDouble();
    peri_1.setSide_3(tside3);
    
    System.out.println("The triangle's perimeter is: " + 
            peri_1.tPerimeter(tside1, tside2, tside3));
    
    
    System.out.println("Finally, we will print out the circle's circumference: ");
    System.out.println("What is the radius of the circle? ");
    double radius = input.nextDouble();
    peri_1.setRad_1(radius);
    
    System.out.println("The circumferece of the circle is: " + peri_1.cPerimeter());
    
    java.util.Date date = new java.util.Date();
    System.out.println(date.toString());
            
    
    }
    
}
