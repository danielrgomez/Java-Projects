/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiltlist;

import java.util.LinkedList;

/**
 *
 * @author danielgomez
 */
public class Task {
    
    private int taskId;
    private boolean check;
    private String content;
    private String subContent;
    
    
    private static int nextTaskId = 1000;

private static LinkedList<Task> tasks = new LinkedList<Task>();



public Task(boolean check, String content, String subContent){
    this.check = check; this.content = content; this.subContent = subContent;
    taskId = nextTaskId; nextTaskId++;
}

public static void addTaskTo(boolean check, String content, String subContent){
        Task t = new Task(check, content, subContent);
        addTask(t);
        
    }

public static void addTask(Task t) {
        tasks.add(t);
    }
    

        
public Task() { taskId = nextTaskId; nextTaskId++;}
}
