/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiltlist;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author f.pierre
 */
public class Task implements Serializable {
  ///////////////////////////ATTRIBUTES//////////////////////////////////////
  private static int taskId=0;
  protected int itemID;
  protected String task;
  protected boolean checked = false;
  private LinkedList<SubTask> subTasks = new LinkedList<SubTask>();
  ///////////////////////////Constructor//////////////////////////////////////
  
  public Task(String t){
    task = t;
    itemID= taskId; taskId++;
  }
  public Task(){}
  ///////////////////////////Methods//////////////////////////////////////
  public void addSubTask(SubTask details) {
      subTasks.add(details);
  }
  public LinkedList<SubTask> getSubList(){
  return subTasks;
  }
  public SubTask getSub(int id){
      for(int i=0; i<subTasks.size();i++){
        if(id== subTasks.get(i).getID()){
            return subTasks.get(i);
            }
        }
       return null;
  }
  public int getID(){
      return itemID;
  }
  public static int getTaskID(){
      return taskId;
  }
  public static void setTaskID(int i){
      taskId=i;
  }
  public void checkTask(){
      if(checked){checked=false;}
      else{
      checked=true;}
  }
  public String getTitle(){
      return task;
  }
  public void setTitle(String e){
       task=e;
  }
  @Override
  public String toString(){
  return itemID+","+task+","+(checked==false?"Not Checked":"Checked");
  }
}

