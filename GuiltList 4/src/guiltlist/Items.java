package guiltlist;

//import static guiltlist.GuiltList.addToItemList;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.sql.Time;
import java.util.*;
//import java.time.LocalDate;
//import java.time.LocalTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielgomez
 */
public abstract class Items implements Serializable {

//    static void setReminder(String reminderDate) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    protected static int nextId = 1;
    protected int itemId;
    protected String title;
    protected boolean sharing = false;
    protected Date reminderDate;
    protected Date reminderTime; 
    protected boolean pin = false;
    
    
    
    
    //this get method is to get the linkedlist items onto the jlist within the main page
   
    
    public static int getNextId() {return nextId;}
    public static void setNextId(int i) { nextId=i;}
    public String getTitle() { return title; }
    public boolean getSharing() { return sharing; }
    public Date getReminderDate() { return reminderDate; }
    public Date getReminderTime() { return reminderTime; }
    public boolean getPin(){return pin; }
    public int getId() { return itemId; }
    //public void String setTitle(String e){ title=e;}
    public void setTitle(String newTitle){ title = newTitle; }

     
      
//    public Items(String title, Date reminderDate, Date reminderTime){
//        this.itemId = itemId; 
//        this.title = title; 
//        this.reminderDate = reminderDate; 
//        this.reminderTime = reminderTime;
//        itemId = nextId; nextId++;
//    }
//    
//    
//    public Items() { itemId = nextId; nextId++;}
    
    
    
    
    
     public String toString() { 
        return itemId + "," + title + (sharing?",Shared ":",Not Shared"); 
    }

    
     protected static void main(Items i){
         PrintWriter output1 = null ;
     try {	
	output1 = new PrintWriter("itemID.txt"); 
	// creates a file if it does not exist; 
	//discards the current content if the file exists

	output1.print(i.getId()+1);
	output1.flush();	
     }
     catch(IOException ioe) {
               System.out.println(ioe.toString());
     }
    finally {    if (output1 != null)      output1.close();     }}
     
}


