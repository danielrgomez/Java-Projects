

/**
 *
 * @author danielgomez
 */

import java.util.Scanner;

public class Financial_Calculator {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("            Welcome to the Financial Calculator! \n");
    System.out.print("___________________________________________________"
            + "____________");
    
    
    System.out.print("\n\nDo you wish to Proceed?\n(Yes or No): ");
    String cont = input.next();
    
//try a do loop instead. Check out chapter five in order to see!!    
while ("Yes".equals(cont)||"yes".equals(cont)||
        "Y".equals(cont)||"y".equals(cont)){

    System.out.print("\nThis calculator solves for simple Time Value of"
            + " Money problems. \nWhat are you trying to find out? "
            + "\nInput one of the numbers for your calculation: " + 
            "\n1. Future Value"+ "\n2. Present Value" + "\n3. FV of an Annuity"+
            "\n4. FV of Annuity Due \n5. PV of an Ordinary Annuity \n6. PV of an Annuity"
            + " Due" + "\n7. PV of a Perpetuity \n8. Present Value of CFs" + 
            "\n9. Periodic Rate \n10. Number of Periods" + 
            "\n11. Effective Annual Rate" + "\n" + "\nType in a number: ");
    
    int answer = input.nextInt();
    System.out.print("\n------------------------------------------------"
                + "----------------");
    
    //Setting the new object to reference. Called fin1
    SimpleFin fin1 = new SimpleFin();
    
    // The first if statement calculates the Future Value 
    if (answer == 1){
        System.out.print("\n\t\t1. Future Value Was Chosen \n\tThat means we will calculate Future Value"
                + "\n\nInput Present Value:");
        double pv = input.nextDouble();
        fin1.setPres(pv);
        
        System.out.print("Input Interest (Must be as a Decimal): ");
        double i = input.nextDouble();
        fin1.setInt(i);
       
        System.out.print("Input Periods: ");
        double n = input.nextDouble();
        fin1.setN(n);
             
        System.out.print("\nYour Future Value is: $" + fin1.getFut(pv, i, n));
        
        System.out.print("\n\n------------------------------------------------"
                + "----------------");
        System.out.print("\nDo you want to try another Time Value Of Money Question?"
            + " (Yes or No) ");
    cont = input.next();
        }

    
    
    // The second conditional statement calculates the Present Value
    else if(answer == 2){
        
        System.out.print("\n\t\t2. Present Value Was Chosen \n\tThat means we will calculate Present Value"
        + "\n\nInput Future Value:");
        double fv = input.nextDouble();
        fin1.setFut(fv);
        
        System.out.print("Input Interest (Must be as a Decimal): ");
        double i = input.nextDouble();
        fin1.setInt(i);
        
        System.out.print("Input Periods: ");
        double n = input.nextDouble();
        fin1.setN(n);
        
        System.out.print("\nYour Present Value is: $" + fin1.getPres(fv,i,n));
    
        System.out.print("\n\n------------------------------------------------"
                + "----------------");    
        System.out.print("\nDo you want to try another Time Value Of Money Question?"
            + " (Yes or No) ");
        cont = input.next();    
    }    
    
    // The third conditional statement calculates the FV of an Annuity Due
    else if( answer == 3){
    //check number three bc it doesnt make sense
       System.out.print("\n\t\t3. FV of an Ordinary Annuity Was Chosen "
               + "\nThat means we will calculate the Future Value "
               + "an Ordinary Annuity \n\nInput Payment: "); 
       
       double pmt = input.nextDouble();
       fin1.setPMT(pmt);
       
       System.out.print("Input Interest (Must be as a Decimal):");
       double i = input.nextDouble();
       fin1.setInt(i);
       
       System.out.print("Input Periods: ");
       double n = input.nextDouble();
       fin1.setN(n);
       
       System.out.print("\nThe Future Value of the Ordinary Annuity is: $" + 
               fin1.getFVOrd(pmt, i, n));
    
        System.out.print("\n\n------------------------------------------------"
                + "----------------");
        System.out.print("\nDo you want to try another Time Value Of Money Question?"
            + " (Yes or No) ");
        cont = input.next();
    
    }
    
    
    // The fourth conditional statement calculates the FV of an Annuity Due
    else if( answer == 4){
    //check number 4 bc it doesnt make sense    
        System.out.print("\n\t\t4. FV of Annuity Due Was Chosen \nThat means we will "
                + "calculate FV of an Annuity Due" + "\n\nDo you know the FV "
                + "of the Ordinary Annuity? \nChoose Yes or No: ");    
        
        String ans = input.next();
        
        // There are two cases if FV of and Ord Annuity is known or not
        if ("yes".equals(ans) || "Yes".equals(ans) ||
                "y".equals(ans) || "Y".equals(ans)) {
            
            System.out.print("\n------------------------------------------------"
                + "----------------");
            
            System.out.print("\n\t\tYou chose Yes"
                + "\nInput Future Value of Ordinary Annuity: ");
            double fvo = input.nextDouble();
            fin1.setFVOrd(fvo);
            
            System.out.print("Interest: ");
            double i = input.nextDouble();
            fin1.setInt(i);
            
            System.out.print("\nThe Future Value of an Annuity Due is: " + 
            fin1.getFVADue(fvo, i));
        
            System.out.print("\n\n------------------------------------------------"
                + "----------------");    
            System.out.print("\nDo you want to try another Time Value Of Money Question?"
                + " (Yes or No) ");
            cont = input.next();
        }
        //This is the conditional case that the user does not know the FV of Ord Ann.
        else if ("no".equals(ans) || "No".equals(ans) || 
                    "n".equals(ans) || "N".equals(ans)){

            System.out.print("\n------------------------------------------------"
                + "----------------");
            System.out.print("\n\t\tYou chose No. \nThat means we will first calculate "
                   + "FV of an Ordinary Annuity.\n"
                    + "\nInput Payment:"); 
            double pmt = input.nextDouble();
            fin1.setPMT(pmt);
            
            System.out.print("Input Interest (Must be as a Decimal): ");
            double i = input.nextDouble();
            fin1.setInt(i);
        
            System.out.print("Input Periods: ");
            double n = input.nextDouble();
            fin1.setN(n);
            
            double newFVOrd = fin1.getFVOrd(pmt,i,n);
            
            System.out.println("\nThe Ordinary Future Value of this Annuity is: $" + 
                    newFVOrd); 
       
            System.out.print("\nAnd, the Future Value of this Annuity "
                    + "Due is: $" + fin1.getFVADue(newFVOrd, i));
        
            System.out.print("\n\n------------------------------------------------"
                + "----------------");
            System.out.print("\nDo you want to try another Time Value Of Money Question?"
                + " (Yes or No) ");
            cont = input.next();
        }   
    }
    
// This is the fifth condition it calculates the PV of an Annuity
    else if(answer == 5){
        
        System.out.println("\n\t\t5. PV of an Ordinary Annuity Was Chosen \n\nThat means we will "
                + "calculate PV of an Ordinary Annuity");    

        System.out.print("Input payment: ");
        double pmt = input.nextDouble();
        fin1.setPMT(pmt);
       
        System.out.print("Input interest: ");
        double i = input.nextDouble();
        fin1.setInt(i);
        
        System.out.print("Input the number of periods: ");
        double n = input.nextDouble();
        fin1.setN(n);
        
        System.out.print("The Present Value of the Ordinary Annuity is: " + 
                fin1.getPVAOrd(pmt, i, n));
        
        System.out.print("\n\n------------------------------------------------"
                + "----------------");
        System.out.print("\nDo you want to try another Time Value Of Money Question?"
                + " (Yes or No) ");
            cont = input.next();
        
    }

    else if (answer == 6){
        System.out.print("\n\t\t6. PV of an Annuity Due Was Chosen \n\nThat means we will calculate"
                + " the Present Value of an Annuity due. \nDo you know "
                + "the Present Value of the Ordinary Annuity (yes/no)? ");
        
        String ans = input.next();
        
        // There are two cases if FV of and Ord Annuity is known or not
        if ("yes".equals(ans) || "Yes".equals(ans) ||
                "y".equals(ans) || "Y".equals(ans)) {
        
        System.out.print("\n\n------------------------------------------------"
                + "----------------");
                
        System.out.print("\n\t\tYou Chose Yes\n");
        
        System.out.print("\nInput the Present Value of the Ordinary Annuity: ");
        double PVOrd = input.nextDouble();
        fin1.setPVOrd(PVOrd);
        
        System.out.print("Input the interest (must be a decimal): ");
        double i = input.nextDouble();
        fin1.setInt(i);
        
        System.out.print("\nThe Present Value of the Ordinary Annuity is: " + 
                fin1.getPVADue(PVOrd,i));
        
        System.out.print("\n\n------------------------------------------------"
                + "----------------");
        System.out.print("\nDo you want to try another Time Value Of Money Question?"
                + " (Yes or No) ");
            cont = input.next();
        
        
        }
        
        else if("no".equals(ans) || "No".equals(ans) ||
                "n".equals(ans) || "N".equals(ans)){
        
        System.out.print("\n\n------------------------------------------------"
                + "----------------");
        
        System.out.print("\n\t\t\tYou chose No. \n\nThat means we will first have to calculate"
                + " the Present Value of the Ordinary Annuity");
        
        System.out.print("\n\nInput payment: ");
        double pmt = input.nextDouble();
        fin1.setPMT(pmt);
       
        System.out.print("Input interest: ");
        double i = input.nextDouble();
        fin1.setInt(i);
        
        System.out.print("Input the number of periods: ");
        double n = input.nextDouble();
        fin1.setN(n);
        
        double pvo = fin1.getPVAOrd(pmt,i ,n);
        
        System.out.print("\nThe Present Value of the Ordinary Annuity is: " + 
                pvo);
        
        System.out.print("\nAnd, The Present Value of the "
                + "Annuity Due is: " + fin1.getPVADue(pvo, i));
        
        System.out.print("\n\n------------------------------------------------"
                + "----------------");
        System.out.print("\nDo you want to try another Time Value Of Money Question?"
                + " (Yes or No) ");
            cont = input.next();
        } 
            
            }
        
        
    else if (answer == 7){
        System.out.print("\n\t\t7. PV of a Perpetuity Was Chosen \n\nThat means we will calculate"
                + " The Present Value of a Perpetuity.");
        
        System.out.print("\n\nInput Payment: ");
        double pmt = input.nextDouble();
        fin1.setPMT(pmt);
        
        System.out.print("Input Interest (Must be as a decimal): ");
        double i = input.nextDouble();
        fin1.setInt(i);
        
        System.out.print("The Present Value of the Perpetuity is: " +
                fin1.getPVP(pmt, i));
        
        System.out.print("\n\n------------------------------------------------"
                + "----------------");
        System.out.print("\nDo you want to try another Time Value Of Money Question?"
                + " (Yes or No) ");
            cont = input.next();
        
        }
      
        else if (answer == 8){
        System.out.print("\n\t\t8. Present Value of CFs Was Chosen \n\nThat means we will calculate "
                + "The Present Value of Cash Flows");
        System.out.print("\nInput the number of Cash Flows to calculate: ");
        int cfsNum = input.nextInt();
        
        
        
        double [] cfs = new double[cfsNum];
        System.out.print("\nInput each one of the cash flows \n"
                + "(use spaces to differentiate each cash flow): ");
        
        
        for(int i = 0; i < cfs.length; i++){
            cfs[i] = input.nextDouble();
            if(i == 0){
                System.out.print("\nThese are the Cash Flows: \n");
            }
            System.out.print("CF: " + (i +1) + "   " + cfs[i] + "\n" );
            
        }
        
        System.out.print("\nWhat is the interest (must be as a decimal): ");
        double i = input.nextDouble();
        
        
        System.out.print("\nThe Present Value of the Cash Flows is: $" + 
        fin1.PresCF(cfs, i));
        
        System.out.print("\n\n------------------------------------------------"
                + "----------------");
            
        System.out.print("\n\nDo you want to try another Time Value Of Money Question?"
                + " (Yes or No) ");
            cont = input.next();
        
            
            
        }
    
    else if (answer == 9){
        System.out.print("\n\t\t9. Periodic Rate Was Chosen \n\n\tThat means we will calculate "
                + "The Periodic Rate");
        System.out.print("\n\nInput the Stated Annual Rate: ");
        double sar = input.nextDouble();
        
        
        System.out.print("Input the Number of Payments per Year: ");
        double numPMTYear = input.nextDouble();
        
        System.out.print("The Periodic Rate is: " + fin1.getIPer(sar,numPMTYear));
    
    
    }
    
    else if (answer == 10){
        System.out.print("\n\t\t10. Number of Periods Was Chosen \n\n\tThat means we will calculate "
                + "The Number of Periods");
        
        System.out.print("\n\nInput the Number of Years: ");
        double numYears = input.nextDouble();
                
        System.out.print("Input the Periods Per Year: ");
        double pdsYear = input.nextDouble();
        
        System.out.print("\nThe Number of Periods is: " + 
                fin1.getNumPer(numYears,pdsYear));
    }
    
    else if (answer == 11){
        System.out.print("\n\t\t11. Effective Annual Rate Was Chosen \n\n\tThat means we will calculate "
                + "The Effective Annual Rate");
        
        System.out.print("\n\nInput the Inom: ");
        double inom = input.nextDouble();
        
        System.out.print("Input M: ");
        double m = input.nextDouble();
        
        System.out.print("The Effective Annual Rate is: " + 
                fin1.getEFF(inom,m));
        
        
    }    
        
System.out.print("\n___________________________________________________"
            + "____________");
System.out.print("\nFinancial Calculator has Closed.");
    





}
    }
        }
        
  
     

