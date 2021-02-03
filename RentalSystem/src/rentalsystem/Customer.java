/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rentalsystem;  

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author seemab
 */
public class Customer implements Serializable, Comparable<Customer> {
    
    private int custId;
    private String name;
    private String address;
    private String phone;
    
    private static int nextId=1;
    
    public static int getNextId() { return nextId; }
    public static void setNextId(int i) { nextId = i; }

    
    public int getId() { return custId; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    
    public String toString() {
        return custId + "," + name + "," + address + "," + phone;
    }
    
    public Customer(String name, String phone, String address ) {
        this.name = name; this.phone = phone; this.address = address;
        custId = nextId; nextId++;
    }
    
    public Customer() {custId = nextId; nextId++;}

    public int compareTo(Customer c) {
        int ret =  (this.name.compareTo(c.name));
        if(ret != 0) {
            return ret;
        } else {
            ret = this.address.compareTo(c.address);
            return ret;
        }
        //return ret;
    }
    

}

class CustomerComparatorById implements Comparator<Customer> {
    public int compare(Customer c1, Customer c2) {
        return (c1.getId() - c2.getId());
    }
}
    
class CustomerComparatorByAddr implements Comparator<Customer> {
    public int compare(Customer c1, Customer c2) {
        return (c1.getAddress().compareTo(c2.getAddress()));
    }
}