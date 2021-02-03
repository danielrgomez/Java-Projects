/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalsystem;

/**
 *
 * @author seemab
 */
public class Video extends RentalItem {
    
    private String director; 
    
    public Video(String title, String producer, String director, int year, int duration, double rate, double lateFees) {
        super(title, producer, year, duration, rate, lateFees);
        this.director = director;
   }
    
   public Video() {}
   
   public String toString() {
       return super.toString() + "," + director;
   }

}

