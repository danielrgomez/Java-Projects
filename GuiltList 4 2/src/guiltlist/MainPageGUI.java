package guiltlist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielgomez 
 */
public class MainPageGUI extends javax.swing.JFrame {
private static User user;
    /**
     * Creates new form MainPage
     */
    public MainPageGUI(User u) {
        user = u;
        initComponents();
        jLabel4.setText(user.getName());
//        Scanner    s1 = null;
//        Scanner    s2 = null;
//        try {
//            File f1 = new File("lists.txt");
//            s1 = new Scanner(f1);
//            
//            while(s1.hasNextLine()) {
//                String line = s1.nextLine();
//                String[] cInfo = line.split(",");
//                user.addToItemList(new List(cInfo[2]));         
//            }
//         }
//        catch (IOException ioe) {     
//		System.out.println(ioe.toString());       
//         } 
//        try {
//            File f2 = new File("notes.txt");
//            s2 = new Scanner(f2);
//            
//            while(s2.hasNextLine()) {
//                String line = s2.nextLine();
//                String[] cInfo = line.split(",");
//                user.addToItemList(new Note(cInfo[2]));         
//            }
//         } 
//        catch (IOException ioe) {     
//		System.out.println(ioe.toString());       
//         }  finally  {    
//            if (s1 != null)  s1.close();
//            if (s2 != null)  s1.close(); 
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNoteButton2 = new javax.swing.JButton();
        jListButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jExitButton1 = new javax.swing.JButton();
        jViewButton = new javax.swing.JButton();
        jViewButton2 = new javax.swing.JButton();
        jViewButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Welcome to your Guilt List ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        jLabel4.setText("Albert Gator");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Create a new item by selecting one of the options:");

        jNoteButton2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jNoteButton2.setText("Note");
        jNoteButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNoteButton2ActionPerformed(evt);
            }
        });

        jListButton3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jListButton3.setText("List");
        jListButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("To View or Modify your Items Choose one of the Options:");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 54)); // NOI18N
        jLabel1.setText("Guilt List");

        jExitButton1.setText("X");
        jExitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButton1ActionPerformed(evt);
            }
        });

        jViewButton.setBackground(new java.awt.Color(204, 204, 204));
        jViewButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jViewButton.setText("Items");
        jViewButton.setFocusable(false);
        jViewButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jViewButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewButtonActionPerformed(evt);
            }
        });

        jViewButton2.setBackground(new java.awt.Color(204, 204, 204));
        jViewButton2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jViewButton2.setText("Write to Obj");
        jViewButton2.setFocusable(false);
        jViewButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jViewButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jViewButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewButton2ActionPerformed(evt);
            }
        });

        jViewButton3.setBackground(new java.awt.Color(204, 204, 204));
        jViewButton3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jViewButton3.setText("Write to Text");
        jViewButton3.setFocusable(false);
        jViewButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jViewButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jViewButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(jLabel1)))
                        .addGap(0, 155, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jExitButton1)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(122, 122, 122))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jNoteButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(jListButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jViewButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jViewButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jExitButton1)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNoteButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jListButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jLabel5)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jViewButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jViewButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewButtonActionPerformed
        // TODO add your handling code here:
        new ItemsReportGUI(user).setVisible(true);
    }//GEN-LAST:event_jViewButtonActionPerformed

    private void jExitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jExitButton1ActionPerformed

    private void jListButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListButton3ActionPerformed
        // TODO add your handling code here:
       // System.out.print(user);
        CreateListGUI g = new CreateListGUI(user);
        g.setVisible(true);
    }//GEN-LAST:event_jListButton3ActionPerformed

    private void jNoteButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNoteButton2ActionPerformed
        // TODO add your handling code here:
        new CreateNoteMainGUI(user).setVisible(true);
    }//GEN-LAST:event_jNoteButton2ActionPerformed

    private void jViewButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewButton2ActionPerformed
        // TODO add your handling code here:
        try {
            FileOutputStream fos = new FileOutputStream("gl.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            
            oos.writeObject(GuiltList.getUserList());
            oos.writeObject(Items.getNextId());
            oos.writeObject(Task.getTaskID());
            oos.writeObject(SubTask.getSubTaskID());
            
            oos.close();
        } catch(IOException ioe) {
            System.out.println(ioe.toString());
        }
    }//GEN-LAST:event_jViewButton2ActionPerformed

    private void jViewButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewButton3ActionPerformed
        // TODO add your handling code here:
         PrintWriter output = null ;
    try {	
	output = new PrintWriter("items.txt"); 
	// creates a file if it does not exist; 
	//discards the current content if the file exists

	for (int i=0; i<user.getItems().size(); i++){
            output.print(user.getItems().get(i)+ "\n");
                    }
	output.flush();	
     }
     catch(IOException ioe) {
               System.out.println(ioe.toString());
      }
    finally {    if (output != null)      output.close();     }
    }//GEN-LAST:event_jViewButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPageGUI(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jExitButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jListButton3;
    private javax.swing.JButton jNoteButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jViewButton;
    private javax.swing.JButton jViewButton2;
    private javax.swing.JButton jViewButton3;
    // End of variables declaration//GEN-END:variables
}
