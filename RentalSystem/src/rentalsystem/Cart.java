/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rentalsystem;

import java.util.LinkedList;

/**
 *
 * @author seemab
 */
public class Cart {
    private LinkedList<RentalItem> items = new LinkedList<RentalItem>();
    
    public Cart(RentalItem item) {
        items.add(item);
    }
    
    public Cart() {} 
    
    public void add(RentalItem item) {
        items.add(item);
    }
    
    public String getItemDetails() {
        String ret = "";
        for(int i=0; i < items.size(); i++) {
                 ret += items.get(i).toString() + "\n";
        }
        return ret;
    }
    
    public double getAmountDue() { 
        double amtDue = 0;
        for(int i=0; i < items.size(); i++) {
                amtDue += items.get(i).getRentalRate();
        }
        return amtDue;
    }


    
}
