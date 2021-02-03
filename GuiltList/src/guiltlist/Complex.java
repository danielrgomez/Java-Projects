/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiltlist;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

/**
 *
 * @author danielgomez
 */
public abstract class Complex extends Items {
    
    
public Complex(String title, LocalDate reminderDate, LocalTime reminderTime, boolean timeOfDay){
         super(title,reminderDate,reminderTime, timeOfDay);
                         
}
    


//----- Tasks Info --- //


    

//private static LinkedList<Task> tasks = new LinkedList<Task>();


//public void addTask(String details){
//    
//    tasks.add(new Task(details));
//}
    
}
