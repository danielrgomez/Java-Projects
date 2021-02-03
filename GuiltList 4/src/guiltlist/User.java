/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiltlist;

import java.io.Serializable;
import java.util.LinkedList;
//import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author danielgomez
 */
public class User implements Serializable{
    ///////////////////////////ATTRIBUTES//////////////////////////////////////
    private String name;
    private String email;
    private String password;
    /*
    **stores list of Items related
    **and shared with User
    */
    private LinkedList<Items> items = new LinkedList<Items>();
    /*
    **stores list of Friends
    */
    private LinkedList<User> friends = new LinkedList<User>();
    /*
    **stores list of shared Items
    */
    private LinkedList<Items> sharedItems = new LinkedList<Items>();

    ///////////////////////////Constructor//////////////////////////////////////
    public User(String name,String email,String password){
      this.name = name;
      this.email = email;
      this.password = password;
    }

    //public USER(){}
    ///////////////////////////Methods//////////////////////////////////////
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public LinkedList<Items> getItems() { return items; }
    public Items returnItems(int i) { 
        for( int z=0;z<items.size();z++){
            if(i == items.get(z).getId()){ 
                return items.get(z);
            }
        }
        return null;
     }
    public LinkedList<User> getFriends() { return friends; }
    public LinkedList<Items> getSharedItem() { return sharedItems; }
    public String toString() { 
        return name + "," + email +"," 
                + (items!=null?",Has Started something ":"You so Lazy")
                + (friends!=null?",You have frinds":"You so Lonely")
                + (sharedItems!=null?",No shared ":"Shared"); 
    }

    public void addToItemList(Items item) {
        items.add(item);
    }
    public void addSharedItem(Items item) {
        sharedItems.add(item);
    }
    public void addFriend(User user) {
      friends.add(user);
    }
    public void setItems(LinkedList<Items> i){
    items = i;
    }
    // public User searchFriends() {
    //     for(int i=0; i < friends.size(); i++) {
    //         if(email.equals(users.get(i).getEmail())) return users.get(i);
    //     }
    //     return null;
    // }

    
}
