/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiltlist;

import static guiltlist.Items.nextId;
import java.util.Date;

/**
 *
 * @author f.pierre
 */
public class Project extends Complex {
  ///////////////////////////ATTRIBUTES//////////////////////////////////////
  //private LinkedList<List> lists = new LinkedList<List>();
  ///////////////////////////Constructor//////////////////////////////////////
  public Project(String title, Date reminderDate, Date reminderTime){
        
        this.title = title; 
        this.reminderDate = reminderDate; 
        this.reminderTime = reminderTime;
        itemId = nextId; nextId++;
                        
      }    
  }
  
