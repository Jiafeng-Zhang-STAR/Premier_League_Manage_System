/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Club.Team.Player;

import TheSystem.Common.Person.Person;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrew Chou
 */
public class PlayerMedicalJPanel extends javax.swing.JPanel {
    Person person;
    /**
     * Creates new form PlayerMedicalJPanel
     */
    public PlayerMedicalJPanel() {
        initComponents();
    }

    public PlayerMedicalJPanel(Person person_Pass) {
        initComponents();
        this.person = person_Pass;
        populateMedicalTable();
        this.editComboBox.setEnabled(false);
        this.deleteButton.setEnabled(false);
        this.editDoneButton.setEnabled(false);
        this.confirmEditButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        PlayerMedicalTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        appointComboBox = new javax.swing.JComboBox<>();
        confirmButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editComboBox = new javax.swing.JComboBox<>();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        IDLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        editDoneButton = new javax.swing.JButton();
        confirmEditButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 139, 69));

        PlayerMedicalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Doctor", "Date", "State", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PlayerMedicalTable);

        jLabel1.setText("Doctor");

        appointComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        confirmButton.setFont(new java.awt.Font("Consolas", 2, 12)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("----------------------------Make Appointment-----------------------------");

        jLabel3.setText("----------------------------Edit Appointment-----------------------------");

        jLabel4.setText("Doctor");

        editComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        editComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editComboBoxActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Consolas", 2, 12)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        IDLabel.setText("-------------");

        jLabel5.setText("Appoint ID");

        editDoneButton.setText("Edit Done");
        editDoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDoneButtonActionPerformed(evt);
            }
        });

        confirmEditButton.setFont(new java.awt.Font("Consolas", 2, 12)); // NOI18N
        confirmEditButton.setText("Confirm Edit");
        confirmEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEditButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(appointComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confirmButton))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editDoneButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmEditButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(appointComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(editComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDLabel)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(deleteButton)
                    .addComponent(editDoneButton)
                    .addComponent(confirmEditButton))
                .addGap(0, 320, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int ID = Integer.parseInt(this.IDLabel.getText());
        int n = JOptionPane.showConfirmDialog(appointComboBox, "Are you sure want to cancel this appointment?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/premierleague?zeroDateTimeBehavior=CONVERT_TO_NULL";
                String username = "root";
                String password = "abcd1234!";
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();

                String delete_sql = "DELETE FROM club_diagnose_appointment WHERE id=\'" + ID + "\'";
                int resultSet = statement.executeUpdate(delete_sql);
                if (resultSet == 1) {
                    JOptionPane.showConfirmDialog(appointComboBox, "Delete Successful!", "Congratulations!", JOptionPane.DEFAULT_OPTION);
                }
                statement.close();
                connection.close();
            } catch (ClassNotFoundException | SQLException e) {
            }
            populateMedicalTable();
            this.editComboBox.setEnabled(false);
            this.deleteButton.setEnabled(false);
            this.editDoneButton.setEnabled(false);
            this.confirmEditButton.setEnabled(false);
            this.editButton.setEnabled(true);
            this.IDLabel.setText("-------------");
        } else {
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editComboBoxActionPerformed
        // TODO add your handling code here:  
    }//GEN-LAST:event_editComboBoxActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        String doc_Name = String.valueOf(this.appointComboBox.getSelectedItem());
        String player_Name = this.person.getUsername();
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String appoint_Date = ft.format(date);
        int appoint_ID;
        try {
            String max_ID = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/premierleague?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";
            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String getID_sql = "SELECT MAX(id) as max_id FROM club_diagnose_appointment";

            ResultSet getID_resultSet = statement.executeQuery(getID_sql);
            while (getID_resultSet.next()) {
                max_ID = String.valueOf(getID_resultSet.getObject("max_id"));
            }
            
            if (max_ID.equals("null")) {
                appoint_ID = 1;
                
            } else {
                appoint_ID = Integer.parseInt(max_ID) + 1;
            }
            String appoint_sql = "INSERT INTO club_diagnose_appointment (id,player_id,doctor_id,date,status,result) VALUES(\'" + appoint_ID + "\',\'" + player_Name + "\',\'" + doc_Name + "\',\'" + appoint_Date + "\',\'undiagnosed\',\'undiagnosed\')";
            System.out.println(appoint_sql);
            int appoint_result = statement.executeUpdate(appoint_sql);
            if (appoint_result == 1) {
                JOptionPane.showConfirmDialog(appointComboBox, "Appoint Successful!", "Appoint Successful!", JOptionPane.DEFAULT_OPTION);
            }
            getID_resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        populateMedicalTable();
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = this.PlayerMedicalTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showConfirmDialog(appointComboBox, "Please select a row please", "Warning", JOptionPane.DEFAULT_OPTION);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) this.PlayerMedicalTable.getModel();
        String state = String.valueOf(model.getValueAt(selectedRowIndex, 3));
        if (!state.equals("undiagnosed")) {
            JOptionPane.showConfirmDialog(appointComboBox, "This appointment can't be changed!", "Warning", JOptionPane.DEFAULT_OPTION);
            return;
        }
        this.IDLabel.setText(String.valueOf(model.getValueAt(selectedRowIndex, 0)));
        for (int i = 0; i < this.editComboBox.getItemCount(); i++) {
            if (this.editComboBox.getItemAt(i).equals(String.valueOf(model.getValueAt(selectedRowIndex, 1)))) {
                this.editComboBox.setSelectedIndex(i);
            }
        }
        this.editComboBox.setEnabled(true);
        this.editDoneButton.setEnabled(true);
        this.confirmEditButton.setEnabled(true);
        this.deleteButton.setEnabled(true);
        this.editButton.setEnabled(false);
    }//GEN-LAST:event_editButtonActionPerformed

    private void editDoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDoneButtonActionPerformed
        // TODO add your handling code here:
        int ID = Integer.parseInt(this.IDLabel.getText());
        String old_Doctor = "";
        DefaultTableModel model = (DefaultTableModel) this.PlayerMedicalTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            if (Integer.parseInt(String.valueOf(model.getValueAt(i, 0))) == ID) {
                old_Doctor = String.valueOf(model.getValueAt(i, 1));
                break;
            }
        }
        String new_Doctor = String.valueOf(this.editComboBox.getSelectedItem());
        if (!(old_Doctor.equals(new_Doctor))) {
            int n = JOptionPane.showConfirmDialog(appointComboBox, "There's still change not be saved!", "Are you sure want to quit edit?", JOptionPane.YES_NO_OPTION);
            if (n == 0) {
                this.editComboBox.setEnabled(false);
                this.deleteButton.setEnabled(false);
                this.editDoneButton.setEnabled(false);
                this.confirmEditButton.setEnabled(false);
                this.editButton.setEnabled(true);
                this.IDLabel.setText("-------------");
            } else {

            }
        } else {
            this.editComboBox.setEnabled(false);
            this.deleteButton.setEnabled(false);
            this.editDoneButton.setEnabled(false);
            this.confirmEditButton.setEnabled(false);
            this.editButton.setEnabled(true);
            this.IDLabel.setText("-------------");
        }
    }//GEN-LAST:event_editDoneButtonActionPerformed

    private void confirmEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEditButtonActionPerformed
        // TODO add your handling code here:
        int ID = Integer.parseInt(this.IDLabel.getText());
        String old_Doctor = "";
        DefaultTableModel model = (DefaultTableModel) this.PlayerMedicalTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            if (Integer.parseInt(String.valueOf(model.getValueAt(i, 0))) == ID) {
                old_Doctor = String.valueOf(model.getValueAt(i, 1));
                break;
            }
        }
        String new_Doctor = String.valueOf(this.editComboBox.getSelectedItem());
        if (old_Doctor.equals(new_Doctor)) {
            JOptionPane.showConfirmDialog(appointComboBox, "Nothing changed!", "Warning", JOptionPane.DEFAULT_OPTION);
            return;
        }
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String update_Date = ft.format(date);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/premierleague?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";
            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String update_sql = "UPDATE club_diagnose_appointment SET doctor_id=\'" + new_Doctor + "\', date=\'" + update_Date + "\' WHERE id=\'" + ID + "\'";
            int resultSet = statement.executeUpdate(update_sql);
            if (resultSet == 1) {
                JOptionPane.showConfirmDialog(appointComboBox, "Edit Successful!", "Congratulations!", JOptionPane.DEFAULT_OPTION);
            }
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        populateMedicalTable();
    }//GEN-LAST:event_confirmEditButtonActionPerformed
    
    public final void populateMedicalTable() {
        this.appointComboBox.removeAllItems();
        this.editComboBox.removeAllItems();
        DefaultTableModel model = (DefaultTableModel) PlayerMedicalTable.getModel();
        model.setRowCount(0);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/premierleague?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";
            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String doc_sql = "SELECT * FROM system_user_info WHERE role_type='2' AND club=\'" + this.person.getClub() + "\'";
            
            String appoint_sql = "SELECT * FROM club_diagnose_appointment WHERE player_id=\'" + this.person.getUsername() + "\'";
            System.out.println(appoint_sql);
            ResultSet docComboBox_resultSet = statement.executeQuery(doc_sql);
            while (docComboBox_resultSet.next()) {
                this.appointComboBox.addItem(String.valueOf(docComboBox_resultSet.getObject("username")));
                this.editComboBox.addItem(String.valueOf(docComboBox_resultSet.getObject("username")));
            }
            ResultSet appointTable_resultSet = statement.executeQuery(appoint_sql);
            while (appointTable_resultSet.next()) {
                Object[] row = new Object[5];
                row[0] = appointTable_resultSet.getObject("id");
                row[1] = appointTable_resultSet.getObject("doctor_id");
                row[2] = appointTable_resultSet.getObject("date");
                
                row[3] = String.valueOf(appointTable_resultSet.getObject("status"));
                
                row[4] = appointTable_resultSet.getObject("result");
                model.addRow(row);
            }
            appointTable_resultSet.close();
            docComboBox_resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTable PlayerMedicalTable;
    private javax.swing.JComboBox<String> appointComboBox;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton confirmEditButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JComboBox<String> editComboBox;
    private javax.swing.JButton editDoneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
