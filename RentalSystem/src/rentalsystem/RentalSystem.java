/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rentalsystem; 

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author seemab
 */
public class RentalSystem implements Serializable {
    private static LinkedList<Customer> customers = new LinkedList<Customer>();
    private static LinkedList<RentalItem> items = new LinkedList<RentalItem>();
    
    public static LinkedList<RentalItem> getItems() { return items; }
    public static LinkedList<Customer> getCustomers() { return customers; }
    
    public static void setCustomers(LinkedList<Customer> custs) { customers = custs; }
    public static void setItems(LinkedList<RentalItem> items) { RentalSystem.items = items; }
    
    public static Customer searchCust(int custId) {
        for(int i=0; i < customers.size(); i++) {
                if(custId == customers.get(i).getId()) return customers.get(i);
        }
        return null; 
    }
    
    public static RentalItem searchItem(int itemId) {
        for(int i=0; i < items.size(); i++) {
            if(itemId == items.get(i).getId()) return items.get(i);
        }
        return null;
    }
    
    public static void addGame(String title, String producer, String platform, int year, int duration, double rate, double lateFees) {
        Game g = new Game(title, producer, platform, year, duration, rate, lateFees);
        addToItemList(g);
    }
    
    public static void addVideo(String title, String producer, String director, int year, int duration, double rate, double lateFees) {
        Video g = new Video(title, producer, director, year, duration, rate, lateFees);
        addToItemList(g);
    }
    
    public static void addToItemList(RentalItem item) {
        items.add(item);
    }
    
    public static void addCustomer(String name, String ph, String addr) {
                customers.add(new Customer(name, ph, addr));
    }


    public static void main(String[] args) {
        RentalSystem rs = new RentalSystem();
        MainGUI g = new MainGUI();
        g.setVisible(true);
    }

    
}
