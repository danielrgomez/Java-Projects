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



public class Users {
    
    private String name;
    private String email;
    private String password;
    
    
    
    private static LinkedList<Items> item = new LinkedList<Items>();
    public static LinkedList<Items> getItems() { return item; }
    
    
    
    public Users(String user,String email,String password){
      this.name = name;
      this.email = email;
      this.password = password;
    }
    
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    
       // -----Shaded out for now -------
//    public LinkedList<User> getFriends() { return friends; }
//    public LinkedList<String> getSharedItem() { return sharedItems; }
    //public LinkedList<Customer> getCustomers() { return customers; }
    
    public static void addList(String title, LocalDate reminderDate, LocalTime reminderTime, boolean timeOfDay){
        List l = new List(title, reminderDate, reminderTime, timeOfDay);
        addToItemList(l);
    }
    
    
    // -----Shaded out for now -------
//    public static void addProject(String title, int reminderDate, int reminderTime){
//        Project p = new Project(title, reminderDate, reminderTime);
//        addToItemList(p);
//        
//    }
//    
//    public static voic addNote(String title, int reminderDate, int reminderTime){
//        Note n = new Note(title, reminderDate, reminderTime);
//        addToItemList(n);
//    }
    
    
    public static void addToItemList(Items items) {
        item.add(items);
    }
 
    
   // -----Shaded out for now -------
//    public void addSharedItem(Items item) {
//        sharedItems.add(item);
//    }
//    public void addFriend(Users user) {
//      friends.add(user);
//    }

    

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       
        
        MainPageGUI g = new MainPageGUI();
        g.setVisible(true);
       // TODO code application logic here
   }
            
}
