/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiltlist;

/**
 *
 * @author f.pierre
 */
public class SubTask extends Task{
  ///////////////////////////ATTRIBUTES//////////////////////////////////////
    private static int id=0;
  private Note[] note = new Note[1];
  ///////////////////////////Constructor//////////////////////////////////////
  public SubTask(String details){
    itemID=id;id++;
    task = details;
  }
  ///////////////////////////Methods//////////////////////////////////////
  public void addNote(Note details) {
      if(note[0] == null){
      note[0]=details;}
      
  }
  public String getNote() {
      if(note[0] == null){return "";}
      return note[0].toString();
  }
  public Note getNotes() {
      return note[0];
  }
 public static int getSubTaskID(){
      return id;
  }
  public static void setSubTaskID(int i){
      id=i;
  }
//  
//  public String toString(){
//  return itemID+","+task+","+(?:);
//  }
}