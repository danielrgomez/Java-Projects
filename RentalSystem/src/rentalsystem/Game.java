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
public class Game extends RentalItem {
    
    public String platform;
    
    public Game(String title, String producer, String platform, int year, int duration, double rate, double lateFees) {
        super(title, producer, year, duration, rate, lateFees);
        this.platform = platform;
   }
    public Game() {}
    
    @Override
    public String toString() {
        return super.toString() + "," + platform;
    } 

}

