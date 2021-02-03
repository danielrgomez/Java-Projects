package guiltlist;

//import static guiltlist.GuiltList.addToItemList;
import java.sql.Time;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielgomez
 */
public class Items {

//    static void setReminder(String reminderDate) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    protected int itemId;
    protected  String title;
    protected  boolean sharing = false;
    protected  LocalDate reminderDate;
    protected  LocalTime reminderTime; 
    protected boolean timeOfDay;
    protected  boolean pin = false;
     
    
    private static int nextId = 1;
    
    
    
    
    //this get method is to get the linkedlist items onto the jlist within the main page
   
    
    
    public  String getTitle() { return title; }
    public  boolean getSharing() { return sharing; }
    public LocalDate getReminderDate() { return reminderDate; }
    public  LocalTime getReminderTime() { return reminderTime; }
    
    public static String setTimeOfDay(boolean time) { 
        if(time == true){
            return "AM";
        } else {
            return "PM";
        }
    }
        
    public boolean getTimeOfDay(){return timeOfDay;}
    public boolean getPin(){return pin; }
    public void setTitle(String newTitle){ title = newTitle; }

     
      
    public Items(String title, LocalDate reminderDate, LocalTime reminderTime, boolean timeOfDay){
        this.itemId = itemId; this.title = title; this.reminderDate = reminderDate; this.reminderTime = reminderTime; this.timeOfDay = timeOfDay;
        itemId = nextId; nextId++;
        
    }
       
    public Items() { itemId = nextId; nextId++;}
       
    
     public String toString() {
        return itemId + title + "         " + reminderDate + "           " + reminderTime + setTimeOfDay(timeOfDay); 
        
    }

    
     
     
}


