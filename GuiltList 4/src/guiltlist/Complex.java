/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiltlist;


//import java.util.Date;
//import java.util.Time;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author danielgomez
 */
public abstract class Complex extends Items {

protected LinkedList<Task> tasks = new LinkedList<Task>();


public void addTask(Task task){
    
    tasks.add(task);
}
public LinkedList<Task> getTaskList(){
return tasks;
        }
public Task getTask(int z){
    for(int i=0; i < tasks.size(); i++) {
        if(z==tasks.get(i).getID()) return tasks.get(i);
    }
    return null;
}
    
}
