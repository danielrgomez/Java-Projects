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

public class TryCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
                double firstfv = 0;
                double secfv = 0;
                double i1 = Math.random();
                double i2 = Math.random();
                            
                
                
                System.out.println("What is your N? PMT? FV?");
                Double n = input.nextDouble();
                Double pmt = input.nextDouble();
                Double fv = input.nextDouble();
               
                //The indicator is just fv/pmt. Refer to the FV annuity formula
                double indicator = fv / pmt;
                
                //If indicator is equal to 0 then it will give a zero interest rate
                if((fv / pmt) == n){
                    System.out.print("Interest is 0.00");
                }
                
                //These are all the exceptions
                else if(fv < pmt || fv < 1 || pmt < 1 || n < 1 || fv == pmt){
                    System.out.print("Make sure you input the correct numbers");
                }
                
                //If indicator is less than periods. It will produce a negative interest rate:
                else if((fv / pmt) < n){
                    
                    /*The first while statement tries to guess an interest rate that when inputted into :
                    (Math.pow((1 + i1),n) - 1) / i1; gives an indicator that is below .005 from the actual
                    indicator (fv/pmt) */ 
                    while(true){
                        i1 = Math.random() * -1;
                        firstfv = ( Math.pow((1 + i1),n) - 1) / i1;
                    
                        if(firstfv < indicator && firstfv > indicator - .005){
                            System.out.println(firstfv);
                            break;
                        }
                    }    
                    
                    /*The second while statement tries to guess an interest rate that when inputted into: 
                    ( Math.pow((1 + i1),n) - 1) / i1; gives an indicator that is above .005 from the acutal
                    indicator (fv/pmt) */
                    while(true){
                        i2 = Math.random() * -1;
                        secfv = (Math.pow((1 + i2),n) - 1) / i2;
                    
                        if(secfv > indicator && secfv < indicator + .005){
                             System.out.println(secfv);
                            break;
                        }                    
                    }
                    
                    double interest = i1 + ((( indicator - firstfv) / (secfv - firstfv)) * (i2 - i1));
                    System.out.println("This is your interest: " + interest);
                }
                    
                //If the indicator is greater than periods then it will give us a positive interest rate.
                else if(fv / pmt > n){
                    
                    /*The first while statement tries to guess an interest rate that when inputted into :
                    (Math.pow((1 + i1),n) - 1) / i1; gives an indicator that is below .005 from the actual
                    indicator (fv/pmt) */                     
                    while(true){
                        i1 = Math.random();
                        firstfv = ( Math.pow((1 + i1),n) - 1) / i1;
                    
                        if(firstfv < indicator && firstfv > indicator - .005){
                            System.out.println(firstfv);
                            break;
                        }
                    }    
                    
                    /*The second while statement tries to guess an interest rate that when inputted into: 
                    ( Math.pow((1 + i1),n) - 1) / i1; gives an indicator that is above .005 from the acutal
                    indicator (fv/pmt) */
                    while(true){
                        i2 = Math.random();
                        secfv = (Math.pow((1 + i2),n) - 1) / i2;
                    
                        if(secfv > indicator && secfv < indicator + .005){
                            System.out.println(secfv);
                            break;
                        }    
                    }
            
                double interest = i1 + ((( indicator - firstfv) / (secfv - firstfv)) * (i2 - i1));
                System.out.println("This is your interest: " + interest);
                }
                
                                                             
                else{
                    System.out.print("Make sure you input the correct numbers");
                }
    
}
}
