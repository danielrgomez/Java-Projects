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
public class Note extends Items {
  ///////////////////////////ATTRIBUTES//////////////////////////////////////
      private String note;
  ///////////////////////////Constructor//////////////////////////////////////
      public Note(String note){
        title = note;
        itemId += nextId; nextId++;

  }

  public Note(){}
  ///////////////////////////Methods//////////////////////////////////////
   @Override
    public String toString(){
        String n = new String("N,");
        return n.concat(super.toString());
    } 
//public String getNote() { return note; }
    //public void setNote(String note) { this.note =note; }

}
