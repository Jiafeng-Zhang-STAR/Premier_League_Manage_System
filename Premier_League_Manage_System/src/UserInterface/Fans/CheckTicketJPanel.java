/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Fans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author yidia
 */
public class CheckTicketJPanel extends javax.swing.JPanel {
    
    String email;
    String balance;
    int balanceInt;
    javax.swing.JLabel lb_Balance;
    JSplitPane SplitPane;
    String date = "";
    String homeTeam = "";
    String awayTeam = "";
    /**
     * 发邮件所需变量
     */
   
    /**
     * Creates new form CheckTicketJPanel
     */
    public CheckTicketJPanel() {
        initComponents();
    }
    public CheckTicketJPanel(String email,String balance,javax.swing.JLabel lb_Balance, JSplitPane SplitPane) {
        this.email = email;
        this.balance = balance;
        
        this.lb_Balance =lb_Balance;
        this.SplitPane = SplitPane;
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
        tbMySession = new javax.swing.JTable();
        btnPay = new javax.swing.JButton();
        btnRefund = new javax.swing.JButton();
        btnCancelBook = new javax.swing.JButton();
        btnRatePlayer = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(500, 600));
        setMinimumSize(new java.awt.Dimension(500, 600));

        tbMySession.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "HomeTeam", "AwayTeam", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbMySession);
        if (tbMySession.getColumnModel().getColumnCount() > 0) {
            tbMySession.getColumnModel().getColumn(4).setResizable(false);
        }

        btnPay.setText("Pay");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        btnRefund.setText("Refund");
        btnRefund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefundActionPerformed(evt);
            }
        });

        btnCancelBook.setText("CancelBook");
        btnCancelBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelBookActionPerformed(evt);
            }
        });

        btnRatePlayer.setText("RatePlayer");
        btnRatePlayer.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnRatePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRatePlayerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnRefund, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnCancelBook)
                        .addGap(38, 38, 38)
                        .addComponent(btnRatePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPay)
                    .addComponent(btnRefund)
                    .addComponent(btnCancelBook)
                    .addComponent(btnRatePlayer))
                .addContainerGap(406, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tbMySession.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tbMySession.getModel();

        date = model.getValueAt(selectedRowIndex , 0).toString();//获得选中的行的第2列的内容
        homeTeam = model.getValueAt(selectedRowIndex , 1).toString();//获得选中的行的第2列的内容
        awayTeam = model.getValueAt(selectedRowIndex , 2).toString();//获得选中的行的第2列的内容
        int price = Integer.parseInt(model.getValueAt(selectedRowIndex , 3).toString());//获得选中的行的第2列的内容
        String status = model.getValueAt(selectedRowIndex , 4).toString();//获得选中的行的第2列的内容
        if(!"Ordered".equals(status)){
            JOptionPane.showMessageDialog(this, "You can't pay when the status is not Ordered.");
            return;
        }   
        
        balanceInt =Integer.parseInt(balance);
        if(balanceInt-price<0){
            JOptionPane.showMessageDialog(this, "Balance is not enough.");
            return;
        }
   
        /*1.数据库改balance，涉及充值先不做*/
        boolean paySuccess = updateBalance(price);
        if(paySuccess == false){
            return;
            }   
        /*2.页面改balance*/
        lb_Balance.setText(String.valueOf(balanceInt-price));
        balanceInt = balanceInt -price;
        balance = String.valueOf(balanceInt);
        try {
            /* create jdbc connection */
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/premierleague?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";

            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            /*3.扣款成功后改状态到complete */
            String sql = "UPDATE fan_match SET status = \'Complete\' WHERE status = \'Ordered\' and email =\'"+email +"\'and hometeam =\'"+homeTeam +"\'and awayteam =\'"+awayTeam +"\'and date =\'"+date +"\'and price ="+price;
            
            int isBooked = statement.executeUpdate(sql);//executeQuery(sql)是查询  executeUpdate是删改
            if (isBooked ==1){
                populateTable(); //Refresh table
                JOptionPane.showMessageDialog(this, "Paid successfully.");
            }
            
//            /*4.`match_info`中left_amount会-1 */
//            /*4.1 找出之前剩余票数 */
//            String sqlLeftAmount = "SELECT left_amount FROM match_info WHERE date = \'"+ date +"\' and home =\'"+homeTeam +"\'and away =\'"+awayTeam +"\'"; 
//                
//            ResultSet resultSet = statement.executeQuery(sqlLeftAmount);   //搭配select使用，其他update什么的都不用
//            int leftAmount = 0;
//            while(resultSet.next()){
//            leftAmount = Integer.parseInt(String.valueOf(resultSet.getObject("left_amount")));
//            }
//            /*4.2 left_amount会-1 再插进去*/
//            String sqlInsertLeftAmount = "UPDATE match_info SET left_amount = "+ (leftAmount-1) +" WHERE home =\'"+homeTeam +"\'and away =\'"+awayTeam +"\'and date =\'"+date +"\'and price ="+price;
//            
//            int isInsertLeftAmount = statement.executeUpdate(sqlInsertLeftAmount);//executeQuery(sql)是查询  executeUpdate是删改
//            if (isBooked ==1&&isInsertLeftAmount==1){
//                //populateTable(); //Refresh table
//                JOptionPane.showMessageDialog(this, "Paid successfully.");
//            }
//            
//            resultSet.close();//close  搭配select使用，其他update什么的都不用
            statement.close();
            connection.close();
            
        
        } catch (ClassNotFoundException | SQLException e) {
        }
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnRefundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefundActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tbMySession.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tbMySession.getModel();

        date = model.getValueAt(selectedRowIndex , 0).toString();//获得选中的行的第2列的内容
        homeTeam = model.getValueAt(selectedRowIndex , 1).toString();//获得选中的行的第2列的内容
        awayTeam = model.getValueAt(selectedRowIndex , 2).toString();//获得选中的行的第2列的内容
        int price = Integer.parseInt(model.getValueAt(selectedRowIndex , 3).toString());//获得选中的行的第2列的内容
        String status = model.getValueAt(selectedRowIndex , 4).toString();//获得选中的行的第2列的内容
        if(!"Complete".equals(status)){
            JOptionPane.showMessageDialog(this, "You can't refund when the status is not Complete.");
            return;
        }   
        
        
        
        //balanceInt =Integer.parseInt(balance);
        
        balanceInt =Integer.valueOf(balance);
        
        /*1.数据库返回balance*/
        try {
                /* create jdbc connection */
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                String url = "jdbc:mysql://localhost:3306/premierleague?zeroDateTimeBehavior=CONVERT_TO_NULL";
                String username = "root";

                String password = "abcd1234!";
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();
                
                /* get matchliset in these dates */
                String sql = "UPDATE fan_balance SET balance ="+ (balanceInt+price)+" WHERE email =\'"+email+"\'";  
                
                int isBooked = statement.executeUpdate(sql);//executeQuery(sql)是查询  executeUpdate是删改


                statement.close();
                connection.close();
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, "Fail to refund(update the balance in database_");
                return;
            }
        
        /*2.页面返回balance*/
        lb_Balance.setText(String.valueOf(balanceInt+price));
        balanceInt = balanceInt + price;
        balance = String.valueOf(balanceInt);
        /*3.退款成功后改状态到cancel */
        try {
            /* create jdbc connection */
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/premierleague?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";

            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String sql = "UPDATE fan_match SET status = \'Refund\' WHERE status = \'Complete\' and email =\'"+email +"\'and hometeam =\'"+homeTeam +"\'and awayteam =\'"+awayTeam +"\'and date =\'"+date +"\'and price ="+price;
            
            int isBooked = statement.executeUpdate(sql);//executeQuery(sql)是查询  executeUpdate是删改

            /*4.`match_info`中left_amount会+1 */
            /*4.1 找出之前剩余票数 */
            String sqlLeftAmount = "SELECT left_amount FROM match_info WHERE date = \'"+ date +"\' and home =\'"+homeTeam +"\'and away =\'"+awayTeam +"\'"; 
                
            ResultSet resultSet = statement.executeQuery(sqlLeftAmount);   //搭配select使用，其他update什么的都不用
            int leftAmount = 0;
            while(resultSet.next()){
            leftAmount = Integer.parseInt(String.valueOf(resultSet.getObject("left_amount")));
            }
            /*4.2 left_amount会+1 再插进去*/
            String sqlInsertLeftAmount = "UPDATE match_info SET left_amount = "+ (leftAmount+1) +" WHERE home =\'"+homeTeam +"\'and away =\'"+awayTeam +"\'and date =\'"+date +"\'and price ="+price;
            
            int isInsertLeftAmount = statement.executeUpdate(sqlInsertLeftAmount);//executeQuery(sql)是查询  executeUpdate是删改
            if (isBooked ==1&&isInsertLeftAmount==1){
                //populateTable(); //Refresh table
                JOptionPane.showMessageDialog(this, "Refund successfully.");
            }
            
            resultSet.close();//close  搭配select使用，其他update什么的都不用
           
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        
        /*4.刷新表格 */
        populateTable();
    }//GEN-LAST:event_btnRefundActionPerformed

    private void btnCancelBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelBookActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tbMySession.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tbMySession.getModel();

        date = model.getValueAt(selectedRowIndex , 0).toString();//获得选中的行的第2列的内容
        homeTeam = model.getValueAt(selectedRowIndex , 1).toString();//获得选中的行的第2列的内容
        awayTeam = model.getValueAt(selectedRowIndex , 2).toString();//获得选中的行的第2列的内容
        int price = Integer.parseInt(model.getValueAt(selectedRowIndex , 3).toString());//获得选中的行的第2列的内容
        String status = model.getValueAt(selectedRowIndex , 4).toString();//获得选中的行的第2列的内容
        if(!"Ordered".equals(status)){
            JOptionPane.showMessageDialog(this, "You can't cancel when the status is not Ordered.");
            return;
        }   
        
        
        /*改状态到cancel */
        try {
            /* create jdbc connection */
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/premierleague?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";

            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String sql = "DELETE from fan_match WHERE status = \'Ordered\' and email =\'"+email +"\'and hometeam =\'"+homeTeam +"\'and awayteam =\'"+awayTeam +"\'and date =\'"+date +"\'and price ="+price;
            
            int isBooked = statement.executeUpdate(sql);//executeQuery(sql)是查询  executeUpdate是删改

            /*4.`match_info`中left_amount会+1 */
            /*4.1 找出之前剩余票数 */
            String sqlLeftAmount = "SELECT left_amount FROM match_info WHERE date = \'"+ date +"\' and home =\'"+homeTeam +"\'and away =\'"+awayTeam +"\'"; 
                
            ResultSet resultSet = statement.executeQuery(sqlLeftAmount);   //搭配select使用，其他update什么的都不用
            int leftAmount = 0;
            while(resultSet.next()){
            leftAmount = Integer.parseInt(String.valueOf(resultSet.getObject("left_amount")));
            }
            /*4.2 left_amount会+1 再插进去*/
            String sqlInsertLeftAmount = "UPDATE match_info SET left_amount = "+ (leftAmount+1) +" WHERE home =\'"+homeTeam +"\'and away =\'"+awayTeam +"\'and date =\'"+date +"\'and price ="+price;
            
            int isInsertLeftAmount = statement.executeUpdate(sqlInsertLeftAmount);//executeQuery(sql)是查询  executeUpdate是删改
            if (isBooked ==1&&isInsertLeftAmount==1){
                //populateTable(); //Refresh table
                JOptionPane.showMessageDialog(this, "Cancel successfully.");
            }
            
            resultSet.close();//close  搭配select使用，其他update什么的都不用
           
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        
        /*4.刷新表格 */
        populateTable();
    }//GEN-LAST:event_btnCancelBookActionPerformed

    private void btnRatePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRatePlayerActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tbMySession.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a match.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tbMySession.getModel();

        date = model.getValueAt(selectedRowIndex , 0).toString();//获得选中的行的第2列的内容
        homeTeam = model.getValueAt(selectedRowIndex , 1).toString();//获得选中的行的第2列的内容
        awayTeam = model.getValueAt(selectedRowIndex , 2).toString();//获得选中的行的第2列的内容
        String status = model.getValueAt(selectedRowIndex , 4).toString();//获得选中的行的第2列的内容
        if(!"Complete".equals(status)){
            JOptionPane.showMessageDialog(this, "You can't rate when the status is not Complete.");
            return;
        }   
        
        
        RatePlayerJPanel rateplayerjpanel = new RatePlayerJPanel(email,SplitPane,date,homeTeam,awayTeam);///跳转页面
        SplitPane.setRightComponent(rateplayerjpanel);
    }//GEN-LAST:event_btnRatePlayerActionPerformed

    private void populateTable() {
               // TODO add your handling code here:
                                                  
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbMySession.getModel();//生成table
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
                String sqlMatList = "SELECT * FROM fan_match WHERE email = \'"+email+"\'"; 
                
                ResultSet resultSet = statement.executeQuery(sqlMatList);   //搭配select使用，其他update什么的都不用
                
                while(resultSet.next()){
                Object[] row = new Object[5];
                row[0] = String.valueOf(resultSet.getObject("date"));//添加内容
                row[1] = String.valueOf(resultSet.getObject("hometeam"));
                row[2] = String.valueOf(resultSet.getObject("awayteam"));
                row[3] = String.valueOf(resultSet.getObject("price"));
                row[4] = String.valueOf(resultSet.getObject("status"));


                model.addRow(row);///添加的命令
                }
                
                resultSet.close();//close  搭配select使用，其他update什么的都不用
                statement.close();
                connection.close();
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, "There is no ticket");
                return;
            }
    }

    private boolean updateBalance(int price) {
               // TODO add your handling code here:
    
        try {
                /* create jdbc connection */
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                String url = "jdbc:mysql://localhost:3306/premierleague?zeroDateTimeBehavior=CONVERT_TO_NULL";
                String username = "root";
                
                String password = "abcd1234!";
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();
                
                /* get matchliset in these dates */
                String sql = "UPDATE fan_balance SET balance ="+ (Integer.parseInt(balance)-price)+" WHERE email =\'"+email+"\'";  
                
                int isBooked = statement.executeUpdate(sql);//executeQuery(sql)是查询  executeUpdate是删改

                if (isBooked ==1){
                    //populateTable(); //Refresh table
                    //JOptionPane.showMessageDialog(this, "Update Balance in database successfully.");
                   
                }
                statement.close();
                connection.close();
                return true;
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, "Fail to pay（update the balance in database）");
                return false;
            }
    }
    
    private void refundToDatabaseBalance(int price) {
               // TODO add your handling code here:
    
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelBook;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnRatePlayer;
    private javax.swing.JButton btnRefund;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMySession;
    // End of variables declaration//GEN-END:variables

    
    
}
