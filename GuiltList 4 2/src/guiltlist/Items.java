package guiltlist;

//import static guiltlist.GuiltList.addToItemList;
import java.io.Serializable;
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
public class Items implements Serializable{

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
    public void updateSharing(){sharing = true;}
    public boolean getPin(){return pin; }
    public int getId() { return itemId; }
    //public void String setTitle(String e){ title=e;}
    public void setTitle(String newTitle){ title = newTitle; }   
    public String toString() { 
        return itemId + "," + title + (sharing?",Shared ":",Not Shared"); 
    }
    
    class ItemComparatorByTitle implements Comparator<Items> {
    public int compare(Items c1, Items c2) {
        return (c1.getTitle().compareTo(c2.getTitle()));
        }
    }
    
//     protected static void main(Items i){
//         PrintWriter output1 = null ;
//     try {	
//	output1 = new PrintWriter("itemID.txt"); 
//	// creates a file if it does not exist; 
//	//discards the current content if the file exists
//
//	output1.print(i.getId()+1);
//	output1.flush();	
//     }
//     catch(IOException ioe) {
//               System.out.println(ioe.toString());
//     }
//    finally {    if (output1 != null)      output1.close();     }}
     


}
