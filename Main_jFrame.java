import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


        
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P0068839
 */
public class Main_jFrame extends javax.swing.JFrame {
    
    // ATTRIBUTES
    public MyHashTable theHT;
    
    
    // CONSTRUCTORS
    /**
     * Creates new form MainJFrame
     */
    public Main_jFrame() {
        initComponents();
        
        theHT = new MyHashTable(10);
        System.out.println("HERE HERE");
        
    }
    
    
    // METHODS   
    
    public MyHashTable getTheHT() {
        return theHT;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        SaveAllEmployee = new javax.swing.JButton();
        LoadAllEmployee = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Create three employees, add to hash table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Display all employees");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add new employee");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressed_jButton3(evt);
            }
        });

        jButton4.setText("WEATHER FOR A CITY");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clicked_jButton4(evt);
            }
        });

        SaveAllEmployee.setText("Save all employees to file");
        SaveAllEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveAllEmployeeMouseClicked(evt);
            }
        });
        SaveAllEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAllEmployeeActionPerformed(evt);
            }
        });

        LoadAllEmployee.setText("Load all employees from file");
        LoadAllEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadAllEmployeeActionPerformed(evt);
            }
        });

        jButton7.setText("Show Monday_jFrame");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Remove employee");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(LoadAllEmployee))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveAllEmployee))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addComponent(jButton4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoadAllEmployee)
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addGap(29, 29, 29)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveAllEmployee)
                    .addComponent(jButton8))
                .addGap(22, 22, 22)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
       
        FTE theFTE;
        PTE thePTE;
        
        theFTE = new FTE(111111, "Elmer", "Fudd", 3,  0.2, 80000.00);
        theHT.addEmployee(theFTE);
        System.out.println("Added the FTE to the hash table!");
                
        thePTE = new PTE(222222, "Daffy", "Duck", 2, 0.22, 10.0, 20.0, 30.0);
        theHT.addEmployee(thePTE);
        System.out.println("Added the PTE to the hash table!");
                
        theFTE = new FTE(333333, "Lola", "Bunny", 5, 0.17, 90000.00);
        theHT.addEmployee(theFTE);
        System.out.println("Added the FTE to the hash table!");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        DisplayAllEmps_jFrame theNumItems_jFrame = new DisplayAllEmps_jFrame();
        theNumItems_jFrame.setVisible(true);
        theNumItems_jFrame.setMainHT(theHT);  // Have theSeparateJFrame mainHT point to the real HT.
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pressed_jButton3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pressed_jButton3
        // TODO add your handling code here:
        AddNewEmployee_jFrame theANEJFrame = new AddNewEmployee_jFrame();
        theANEJFrame.setVisible(true);
        theANEJFrame.setMainHT(theHT);
    }//GEN-LAST:event_pressed_jButton3

    private void clicked_jButton4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clicked_jButton4
        // TODO add your handling code here:
        Weather_jFrame theAnotherSeparateJFrame = new Weather_jFrame();
        theAnotherSeparateJFrame.setVisible(true);
        //System.out.println(theAnotherSeparateJFrame);
    }//GEN-LAST:event_clicked_jButton4

    private void SaveAllEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAllEmployeeActionPerformed
        // TODO add your handling code here:
        
        // Here, I need code that walks through the entire hash table
        // and writes the attribute values for each employee to a
        // text file (by using say buffered writer).
        
        System.out.println("Save to file");
        try {
            File f = new File("ArchivedFile.txt");
            if (f.createNewFile()){
                System.out.println("File created: " +f.getName());
            }
            else{
                System.out.println("File already exists.");
            }
            
            FileWriter writer;
            writer = new FileWriter("ArchiveFile.txt");
            for(int i = 0; i < theHT.buckets.length; i++){
                for(int j = 0; j < theHT.buckets[i].size(); j++){  
                EmployeeInfo e = theHT.buckets [i].get(j);
                
                    System.out.println(e);
                    
                    if(e instanceof PTE){
                      String out = "PTE;";
                       out += ","+e.getEmpNum();
                       out += ","+e.getFirstName();
                       out += ","+e.getLastName();
                       out += ","+e.getWorkLocation();
                       out += ","+e.getDeductionRate();
                       out += ","+((PTE)e).getHourlyWage();
                       out += ","+((PTE)e).getHoursPerWeek();
                       out += ","+((PTE)e).getWeeksPerYear();
                       writer.write(out + "\n");
                    }
                    if ( e instanceof FTE){                     
                      String out = "FTE";
                      out += ","+e.getEmpNum();
                      out += ","+e.getFirstName();
                      out += ","+e.getLastName();
                      out += ","+e.getWorkLocation();
                      out += ","+e.getDeductionRate();
                      out += ","+((FTE) e).getYearlySalary();
                       writer.write(out + "\n");
                               
                    }
                }
            }
            writer.close();
        } catch (IOException e) {
            Logger.getLogger(Main_jFrame.class.getName()).log(Level.SEVERE, null, e);
            System.out.println ("There is an Error");
        }
        
    }//GEN-LAST:event_SaveAllEmployeeActionPerformed

    private void LoadAllEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadAllEmployeeActionPerformed
        // TODO add your handling code here:
        // Here, I need code that reads the attribute values for the employee
        // data stored in a text file (by say using buffered reader) and adding
        // each of those employees to the hash table.
        for (ArrayList<EmployeeInfo> bucket : theHT.buckets) {
            bucket.clear();
        }
            theHT.numInHashTable = 0;
            
            try {
                 File f = new File("ArchiveFile.txt");
            try (Scanner myReader = new Scanner(f)) {
                while(myReader.hasNextLine()){
                    String data = myReader.nextLine();
                    String[] arr = data.split(",");
                    if ("PTE".equals(arr[0])){
                        
                        PTE emp;
                        emp = new PTE(Integer.parseInt(arr [1]), arr[2], arr[3], Integer.parseInt(arr[4]), Double.parseDouble(arr[5]), Double.parseDouble(arr[6]), Double.parseDouble(arr[7]), Double.parseDouble(arr[8]));
                        theHT.addEmployee(emp);
                    }
                    
                    else {
                        
                        FTE emp;
                        emp = new FTE (Integer.parseInt(arr[1]), arr[2], arr[3], Integer.parseInt(arr[4]), Double.parseDouble(arr[5]),
                                Double.parseDouble(arr[6]));
                        theHT.addEmployee(emp);
                    }
                }
            }  
            } 
            catch (FileNotFoundException e) {
                Logger.getLogger(Main_jFrame.class.getName()).log(Level.SEVERE, null, e);
                System.out.println("There is an Error.");
            }
               
            
       
    }//GEN-LAST:event_LoadAllEmployeeActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        System.out.println("Set up theMonday_jFrame");
        Monday_jFrame theMonday_jFrame = new Monday_jFrame();
        theMonday_jFrame.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void SaveAllEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveAllEmployeeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveAllEmployeeMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        RemoveEmployee_JFrame theREJFrame = new RemoveEmployee_JFrame();
        theREJFrame.setVisible(true);
        theREJFrame.setMainHT(theHT);
    }//GEN-LAST:event_jButton8MouseClicked

    
    
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
            java.util.logging.Logger.getLogger(Main_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_jFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoadAllEmployee;
    private javax.swing.JButton SaveAllEmployee;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    // End of variables declaration//GEN-END:variables
}