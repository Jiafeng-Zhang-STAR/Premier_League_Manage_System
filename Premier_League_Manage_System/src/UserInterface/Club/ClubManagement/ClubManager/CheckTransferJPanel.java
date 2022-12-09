/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Club.ClubManagement.ClubManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yidia
 */
public class CheckTransferJPanel extends javax.swing.JPanel {
    
    String email;
    JSplitPane SplitPane;
    String club;
    /**
     * Creates new form CheckTransferJPanel
     */
    public CheckTransferJPanel(String email,String club) {
        this.email = email;
        this.club = club;
        initComponents();
        populateTable();
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
        tbMyTransfer = new javax.swing.JTable();
        btnSign = new javax.swing.JButton();

        tbMyTransfer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Name", "Club", "TransferPrice", "Email", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbMyTransfer);

        btnSign.setText("Sign");
        btnSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(btnSign)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnSign)
                .addContainerGap(325, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
                // TODO add your handling code here:
        int selectedRowIndex = tbMyTransfer.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tbMyTransfer.getModel();

        email = model.getValueAt(selectedRowIndex , 4).toString();//获得选中的行的第2列的内容
        String date = model.getValueAt(selectedRowIndex , 0).toString();//获得选中的行的第2列的内容

        String status = model.getValueAt(selectedRowIndex , 3).toString();//获得选中的行的第2列的内容
        
        if("Complete".equals(status)){
            JOptionPane.showMessageDialog(this, "the person is not available.");
            return;
        }
        
        try {
            /* create jdbc connection */
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/premierleague?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";

            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            /*签约后改状态到complete */
            String sql = "UPDATE club_transfer_info SET status = \'Complete\' WHERE email =\'"+email+"\'";
            
            int isBooked = statement.executeUpdate(sql);//executeQuery(sql)是查询  executeUpdate是删改
            
            /*在user表中把球员俱乐部改了 */
            String sqlClub = "UPDATE system_user_info SET club = \'"+club+"\' WHERE username =\'"+email+"\'";
            
            int isBookedClub = statement.executeUpdate(sqlClub);//executeQuery(sql)是查询  executeUpdate是删改
            if (isBooked ==1&&isBookedClub ==1){
                populateTable(); //Refresh table
                JOptionPane.showMessageDialog(this, "Sign successfully.");
            }
            statement.close();
            connection.close();
            
        
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Please check before sign.");
        }
        
        
        
    }//GEN-LAST:event_btnSignActionPerformed
    private void populateTable() {
               // TODO add your handling code here:
                                                  
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbMyTransfer.getModel();//生成table
        model.setRowCount(0);
        
        
        try {
                /* create jdbc connection */
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                String url = "jdbc:mysql://localhost:3306/premierleague?zeroDateTimeBehavior=CONVERT_TO_NULL";
                String username = "root";
                
                String password = "abcd1234!";
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();
                
                /* get matchliset in these dates */
                String sqlMatList = "SELECT * FROM club_transfer_info"; 
                
                ResultSet resultSet = statement.executeQuery(sqlMatList);   //搭配select使用，其他update什么的都不用

                while(resultSet.next()){
                Object[] row = new Object[6];
                row[0] = String.valueOf(resultSet.getObject("time")).replace("T", " ");
                row[1] = String.valueOf(resultSet.getObject("name"));
                row[2] = String.valueOf(resultSet.getObject("club"));
                row[3] = String.valueOf(resultSet.getObject("transfer_price"));
                row[4] = String.valueOf(resultSet.getObject("email"));
                row[5] = String.valueOf(resultSet.getObject("status"));


                model.addRow(row);///添加的命令
                }
                
                resultSet.close();//close  搭配select使用，其他update什么的都不用
                statement.close();
                connection.close();
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, "There is no transfer available");
                return;
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSign;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMyTransfer;
    // End of variables declaration//GEN-END:variables
}