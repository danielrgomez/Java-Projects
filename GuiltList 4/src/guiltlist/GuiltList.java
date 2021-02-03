/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiltlist;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author danielgomez
 */



public class GuiltList implements Serializable{
    
   ///////////////////////////ATTRIBUTES//////////////////////////////////////
    private static LinkedList<User> users = new LinkedList<User>();
/*
**finding a User's ref
*/
public static User searchUsers(String email) {
    for(int i=0; i < users.size(); i++) {
        if(email.equals(users.get(i).getEmail())) return users.get(i);
    }
    return null;
}
/*
**adding a User's ref to GuiltListSys
*/
public static void addUsers(String name, String email, String password) {
                users.add(new User(name, email, password));
                writeFile();
    }
public static void writeFile(){
 PrintWriter output = null ;
    try {	
	output = new PrintWriter("users.txt"); 
	// creates a file if it does not exist; 
	//discards the current content if the file exists

	for(int i=0; i < users.size(); i++) {
        output.print(users.get(i).getName()+","+users.get(i).getPassword()+","+users.get(i).getEmail()+"\n");
    }
	output.flush();	
     }
     catch(IOException ioe) {
               System.out.println(ioe.toString());
      } 
      finally {    if (output != null)      output.close();     }
}
public static String print(){
   String p ="";
   for(int i=0; i<users.size(); i++){
    p += users.get(i).toString()+"\n";
    }
   return p;
}
public static boolean getUsers() {
                  if(users.size() !=0){return true;}
                else{return false;}
    }
public static void setUsers(LinkedList<User> u) {
                  users = u;
    }
public static LinkedList<User> getUserList() {
                  return users;
    }
public static void main(String[] args) {
            GuiltList gs = new GuiltList();
            Scanner    s1 = null;
        try {
            File f1 = new File("users.txt");
            s1 = new Scanner(f1);
            
            while(s1.hasNextLine()) {
                String line = s1.nextLine();
                String[] cInfo = line.split(",");
                gs.addUsers(cInfo[0], cInfo[1], cInfo[2]);         
            }
         } catch (IOException ioe) {     
		System.out.println(ioe.toString());       
         }  finally  {    
            if (s1 != null)  s1.close(); 
        }
            
            
            
            LoginGUI g = new LoginGUI();
            g.setVisible(true);
        }
            
}
