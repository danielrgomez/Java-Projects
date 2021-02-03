/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiltlist;

import java.time.LocalDate;
import java.time.LocalTime;


/**
 *
 * @author danielgomez
 */
public class List extends Complex {
    
    private static int nextListId = 100;
    
    public static int getListId() { return nextListId; }
    
   
      public List(String title, LocalDate reminderDate, LocalTime reminderTime, boolean timeOfDay){
         super(title,reminderDate,reminderTime, timeOfDay);
                        
      }
          
    //public List() {}
    
    @Override
    public String toString(){
        return super.toString() + " Type of Item: List";
    }
    
}
