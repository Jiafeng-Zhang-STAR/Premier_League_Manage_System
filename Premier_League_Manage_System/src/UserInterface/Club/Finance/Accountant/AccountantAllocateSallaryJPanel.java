/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Club.Finance.Accountant;

import TheClub.Finance.Accountant.Accountant;
import UserInterface.League.Match.Manager.*;
import UserInterface.Club.Health.Doctor.*;
import TheClub.Health.Doctor.Doctor;
import TheLeague.Match.Manager.Manager;
import TheSystem.Common.Person.Person;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//import java.awt.Image;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*; 
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.util.Random;
//import javax.swing.ButtonModel;
//import javax.swing.JButton;

/**
 *
 * @author Jiafeng
 */
public class AccountantAllocateSallaryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorHistoryJPanel
     */
    Accountant accountant;
    ArrayList<Match> MatchCataFirstHalf;
    ArrayList<Match> MatchCataSecondHalf;
//    int appointmentHistoryID;
//    String appointmentHistoryPlayerUserName;
//    String appointmentHistoryPlayerName;
    
    
    public static final String Referee1 = "James";
    public static final String Referee2 = "Robert";
    public static final String Referee3 = "John";
    public static final String Referee4 = "Michael";
    public static final String Referee5 = "David";
    public static final String Referee6 = "William";
    public static final String Referee7 = "Richard";
    public static final String Referee8 = "Joseph";
    public static final String Referee9 = "Thomas";
    public static final String Referee10 = "Charles";
    
   
    public AccountantAllocateSallaryJPanel(Accountant accountantTemp) {
        initComponents();
        this.accountant = accountantTemp;
        
//        fillingAppointmentHistoryTable();
        
        Enumeration<AbstractButton> button;
        AbstractButton buttonChoose; //buttonChoose = jButton1 is true
        
        button=justSetColor.getElements();
        for(int i=0;i<justSetColor.getButtonCount();i++)
        {
              buttonChoose=button.nextElement();
              buttonChoose.setBackground(new java.awt.Color(255, 255, 255));
              buttonChoose.setForeground(Color.black);
            
        }
        
        
        selectOnePeopleButton.setEnabled(true);
        
        
        saveMatchButton.setEnabled(false);
        editSelectedMatchButton.setEnabled(false);
        freshMatchButton.setEnabled(false);
        submitMatchButton.setEnabled(false);
        
        
        memberjTextField.setEnabled(false);
        enterjTextFieldSalary.setEnabled(false);
        
        salaryTable.setEnabled(true);
        
        fillingAppointmentHistoryTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        justSetColor = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        salaryTable = new javax.swing.JTable();
        freshMatchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        saveMatchButton = new javax.swing.JButton();
        submitMatchButton = new javax.swing.JButton();
        selectOnePeopleButton = new javax.swing.JButton();
        editSelectedMatchButton = new javax.swing.JButton();
        memberjTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        enterjTextFieldSalary = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 139, 69));
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));

        salaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Role", "Club", "Salary"
            }
        ));
        salaryTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(salaryTable);

        freshMatchButton.setText("<html>Fresh<br/>Table</html>");
        freshMatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freshMatchButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Member name:");

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Allocate Salary");

        saveMatchButton.setText("Save");
        saveMatchButton.setMaximumSize(new java.awt.Dimension(80, 28));
        saveMatchButton.setMinimumSize(new java.awt.Dimension(80, 28));
        saveMatchButton.setPreferredSize(new java.awt.Dimension(80, 28));
        saveMatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMatchButtonActionPerformed(evt);
            }
        });

        submitMatchButton.setText("Submit");
        submitMatchButton.setMaximumSize(new java.awt.Dimension(80, 28));
        submitMatchButton.setMinimumSize(new java.awt.Dimension(80, 28));
        submitMatchButton.setPreferredSize(new java.awt.Dimension(80, 28));
        submitMatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitMatchButtonActionPerformed(evt);
            }
        });

        selectOnePeopleButton.setText("<html>Select One<br/>&nbsp Member</html>");
        selectOnePeopleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectOnePeopleButtonActionPerformed(evt);
            }
        });

        editSelectedMatchButton.setText("<html>Edit Selected<br/>&nbsp&nbsp&nbsp Member</html>");
        editSelectedMatchButton.setActionCommand("<html>Edit Selected<br/>Match</html>");
        editSelectedMatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSelectedMatchButtonActionPerformed(evt);
            }
        });

        memberjTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        memberjTextField.setMinimumSize(new java.awt.Dimension(64, 25));
        memberjTextField.setPreferredSize(new java.awt.Dimension(64, 25));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salary Table:");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Salary:");

        enterjTextFieldSalary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enterjTextFieldSalary.setMinimumSize(new java.awt.Dimension(64, 25));
        enterjTextFieldSalary.setPreferredSize(new java.awt.Dimension(64, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(freshMatchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectOnePeopleButton)
                            .addComponent(editSelectedMatchButton)
                            .addComponent(saveMatchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(submitMatchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(memberjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(enterjTextFieldSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel2))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel7)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(memberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterjTextFieldSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(selectOnePeopleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveMatchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editSelectedMatchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submitMatchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(freshMatchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void freshMatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freshMatchButtonActionPerformed
        
        fillingAppointmentHistoryTable();
    }//GEN-LAST:event_freshMatchButtonActionPerformed

    private void saveMatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMatchButtonActionPerformed
        // TODO add your handling code here:
        

        selectOnePeopleButton.setEnabled(false);
        
        
        saveMatchButton.setEnabled(false);
        editSelectedMatchButton.setEnabled(true);
        freshMatchButton.setEnabled(true);
        submitMatchButton.setEnabled(true);
        
        
        memberjTextField.setEnabled(false);
        
        enterjTextFieldSalary.setEnabled(false);
        
        salaryTable.setEnabled(false);
         
    }//GEN-LAST:event_saveMatchButtonActionPerformed

    private void submitMatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitMatchButtonActionPerformed
        // TODO add your handling code here:
        String TempSalary=enterjTextFieldSalary.getText();
           if((!"".equals(TempSalary))&& (TempSalary!=null)&&(!" ".equals(TempSalary))){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/premierleague";
                String username = "root";
                String password = "abcd1234!";
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();
                
                
                
                String sql= "UPDATE system_user_info SET "
                            + "salary= \'"
                            + Integer.valueOf(enterjTextFieldSalary.getText())
                            + "\' WHERE name = \'"
                            + memberjTextField.getText()
                            + "\' AND club = \'"
                            + accountant.getClub()
                            + "\'";
                statement.executeUpdate(sql);
                statement.close();
                connection.close();
            }
            catch(ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
           }
           else{
           JOptionPane.showMessageDialog(submitMatchButton, "Please enter the salary first!");
           }
        selectOnePeopleButton.setEnabled(true);
        
        
        
        
        saveMatchButton.setEnabled(false);
        editSelectedMatchButton.setEnabled(false);
        freshMatchButton.setEnabled(true);
        submitMatchButton.setEnabled(false);
        
        
        memberjTextField.setEnabled(false);
        enterjTextFieldSalary.setEnabled(false);
        
        salaryTable.setEnabled(true);
        

    }//GEN-LAST:event_submitMatchButtonActionPerformed

    private void selectOnePeopleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectOnePeopleButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndexFirstTable = this.salaryTable.getSelectedRow();
        
        if((selectedRowIndexFirstTable<0) ){
            JOptionPane.showMessageDialog(selectOnePeopleButton, "Please select a match first!");
            return;
        }
        DefaultTableModel model1 = (DefaultTableModel) this.salaryTable.getModel();
        if(selectedRowIndexFirstTable>=0){
            memberjTextField.setText(String.valueOf(model1.getValueAt(selectedRowIndexFirstTable, 0)));
        }
        
        selectOnePeopleButton.setEnabled(false);
        
        
        
        saveMatchButton.setEnabled(true);
        editSelectedMatchButton.setEnabled(true);
        freshMatchButton.setEnabled(false);
        submitMatchButton.setEnabled(false);
        
        
        memberjTextField.setEnabled(false);
        enterjTextFieldSalary.setEnabled(true);

        
        salaryTable.setEnabled(false);
        
        
    }//GEN-LAST:event_selectOnePeopleButtonActionPerformed

    private void editSelectedMatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSelectedMatchButtonActionPerformed
        // TODO add your handling code here:
       
        
        selectOnePeopleButton.setEnabled(true);
        
        
        
        
        saveMatchButton.setEnabled(false);
        editSelectedMatchButton.setEnabled(false);
        freshMatchButton.setEnabled(true);
        submitMatchButton.setEnabled(false);
        
        
        memberjTextField.setEnabled(true);
        enterjTextFieldSalary.setEnabled(true);
        
        salaryTable.setEnabled(true);

    }//GEN-LAST:event_editSelectedMatchButtonActionPerformed

    public class Match{
        String match_home;
        String match_away;
        String date;
        String referee;

        public Match(String match_home, String match_away) {
            this.match_home = match_home;
            this.match_away = match_away;
        }

        public String getMatch_home() {
            return match_home;
        }

        public void setMatch_home(String match_home) {
            this.match_home = match_home;
        }

        public String getMatch_away() {
            return match_away;
        }

        public void setMatch_away(String match_away) {
            this.match_away = match_away;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getReferee() {
            return referee;
        }

        public void setReferee(String referee) {
            this.referee = referee;
        }
        
    }
    
    private void fillingAppointmentHistoryTable() {
        DefaultTableModel model = (DefaultTableModel) salaryTable.getModel();
        model.setRowCount(0);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/premierleague";
            String username = "root";
            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            String sql = "SELECT * FROM system_user_info WHERE "+
                         "club=\'"+this.accountant.getClub()+"\'";
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
                String playerUsernameTemp;
                String playerNameTemp = null;
                
                Object[] row = new Object[4];
                
                row[0] = resultSet.getObject("name");
                
                switch(resultSet.getInt("role_type")) {
                    case 1:
                      row[1]="Accountant";
                      break;
                    case 2:
                      row[1]="Doctor";
                      break;
                    case 4:
                      row[1]="Player";
                      break;
                    case 5:
                      row[1]="Coach";
                      break;
                    default:
                      row[1]="Other Role";
                      // code block
                  }
                row[2] = resultSet.getObject("club");
                row[3] = resultSet.getObject("salary");
                model.addRow(row);
          }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        } 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editSelectedMatchButton;
    private javax.swing.JTextField enterjTextFieldSalary;
    private javax.swing.JButton freshMatchButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup justSetColor;
    private javax.swing.JTextField memberjTextField;
    private javax.swing.JTable salaryTable;
    private javax.swing.JButton saveMatchButton;
    private javax.swing.JButton selectOnePeopleButton;
    private javax.swing.JButton submitMatchButton;
    // End of variables declaration//GEN-END:variables
}