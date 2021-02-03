/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiltlist;

// import java.time.LocalDate;
// import java.time.LocalTime;
import java.util.Date;


/**
 *
 * @author danielgomez
 */
public class List extends Complex {
      
       public List(String title){
        this.title = title; 
       itemId += nextId; nextId++;
                        
      }
      public List(String title, Date reminderDate){
        
        this.title = title; 
        this.reminderDate = reminderDate; 
        itemId = nextId; nextId++;
                        
      } 
      
       public List(String title, Date reminderDate, Date reminderTime){
        
        this.title = title; 
        this.reminderDate = reminderDate; 
        this.reminderTime = reminderTime;
        itemId = nextId; nextId++;
                        
      }    
    //public List() {}
    
    @Override
    public String toString(){
        String n = new String("L,");
        return n.concat(super.toString());
    }
    
}
