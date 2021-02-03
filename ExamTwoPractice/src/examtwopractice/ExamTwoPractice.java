/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examtwopractice;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



/**
 *
 * @author danielgomez
 */
public class ExamTwoPractice {

    /**
     * @param args the command line arguments
     */
    
    
        
       
		

   
        
        
    
    
    
    public static void main(String[] args) {
        
	
 PrintWriter output = null;
 
// try{
//     output = new PrintWriter("myFile.txt");
//     output.println("Hello Everyone!!! ABCDEFG");
//     output.println(234234234);
//     output.flush();
// }catch(IOException ioe){ ioe.toString();
//    }finally{if(output != null) output.close();}
//    
//    }
    
    
    
         Scanner input = null;
      try{
	File file = new   File("abc.txt"); 
	input = new Scanner(file); 
	while (input.hasNextLine()) { 
		String line = input.nextLine(); 
		System.out.println( line); 
	} 
         } catch (IOException ioe) {     
		System.out.println(ioe.toString());       
         }  finally  {if (input != null)  input.close();    }
}
}

        
        
        
    
    
        
    












//
//private String brand;
//        public int size;
//        public String location;
//        
//        ExamTwoPractice(String brand, int size, String location){
//            this.brand = brand; this.size = size; this.location = location;
//        }
//        
//        public String getBrand() { return brand; }
//        public int getSize() { return size; }
//        public String getLocation() { return location; }
//        
//        
//        public String toString(){
//            return brand + "," + size + "," + location;
//        }
//        
//        
//         try{
//        FileOutputStream fos = new FileOutputStream("b.dat");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(ExamTwoPractice.getBrand());
//        oos.close();   
//        }catch(IOException ioe){ ioe.toString(); } 
//        
//
//
//
//








    /////WRITE NEW FILE/////
//        PrintWriter output= null;
//        try{ 
//            output = new PrintWriter("myfile.txt");
//            
//        output.println("Hola como estas?");
//        output.println("muy bien y tu?");
//        output.println("todo super bien y tu que tal chinazo");
//        
//        output.flush();
//                     
//        }
//        catch(IOException ioe){
//            System.out.print(ioe.toString());
//        }
//        
//        finally{ if(output != null) output.close(); }

        ////READ NEW FILE///
//Scanner input = null;
//try{
//    File file = new File("myfile.txt");
//    input = new Scanner(file);
//    while (input.hasNextLine()) { 
//		String line = input.nextLine(); 
//		System.out.println( line); 
//	} 
//    } 
//
//catch (IOException ioe) {     
//		System.out.println(ioe.toString());       
//         }  
//
//
//finally  {if (input != null)  input.close();}
//
//    } 