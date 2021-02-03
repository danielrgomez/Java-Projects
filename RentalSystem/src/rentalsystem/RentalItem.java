/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rentalsystem; 

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author seemab
 */
public class RentalItem implements Serializable {
    
    private int itemId;
    private String title;
    private String producer;
    private int year;
    private int rentalDuration;
    private double rentalRate;
    private double lateFeesPerDay;
    private LocalDate dueDate; 
    
    private Customer customer;
    
    private static int nextId = 1000;
    
    public static int getNextId() { return nextId; }
    public static void setNextId(int i) { nextId = i; }
    
    public int getId() { return itemId; }
    public String getTitle() { return title; }
    public String getProducer() { return producer; }
    public double getRentalRate() { return rentalRate; }
    public void setRentalDuration(int duration) { if(duration > 0) rentalDuration = duration; }
    
    public RentalItem(String title, String producer, int year, int duration, double rate, double lateFees) {
        this.title = title; this.producer = producer;
        this.year = year;  this.rentalDuration = duration;
        this.rentalRate = rate;  this.lateFeesPerDay = lateFees;
        itemId = nextId; nextId++;
    }
    
    public RentalItem() { itemId = nextId; nextId++; }
    
    public String toString() { 
        return itemId + "," + title +"," + producer + ","
                + year + "," + rentalDuration + "," 
                + rentalRate + "," + lateFeesPerDay 
                + (customer!=null?", Checked out to Cust Id: "+customer.getId() + " Due On:" + dueDate:", Checked-In"); 
    }
    
    public boolean checkOut(Customer c) {
        if(customer != null) return false;
        
        customer = c;
        LocalDate date = LocalDate.now();
        dueDate = date.plusDays(rentalDuration);
        return true;
    }
    

}
