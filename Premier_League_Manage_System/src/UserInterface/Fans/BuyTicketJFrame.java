/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface.Fans;

import Test.Feng.TestMainJFrame;
import TheSystem.Common.Person.Person;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*获取当前时间*/
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author yidia
 */
public class BuyTicketJFrame extends javax.swing.JFrame {
    
    String fromDate;
    String toDate;
    String balance;
    /*Lu email在登录后打开这个界面时传入，*/
    String email = "yidianhaoranlv07@outlook.com"; 
    Person person;
    
    /**
     * Creates new form BuyTicket
     */
    public BuyTicketJFrame() {
        initComponents();
        lb_Account.setText(email);
        //更改Balace label
        getBalance();
        lb_Balance.setText(balance);
    }
    
     public BuyTicketJFrame(String email) {
         this.email= email;
        initComponents();
        lb_Account.setText(email);
        //更改Balace label
        getBalance();
        lb_Balance.setText(balance);
    }
     
     public BuyTicketJFrame(Person person_Pass) {
        this.person = person_Pass;
        this.email = this.person.getUsername();
        initComponents();
        lb_Account.setText(email);
        //更改Balace label
        getBalance();
        lb_Balance.setText(balance);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        ControlPanel = new javax.swing.JPanel();
        btnBookTicket = new javax.swing.JButton();
        btnCheckTicket = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_Account = new javax.swing.JLabel();
        lb_Balance = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        BookTicketJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFromDate = new javax.swing.JTextField();
        txtToDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSessionSearch = new javax.swing.JTable();
        btnBook = new javax.swing.JButton();
        btnWait = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setResizable(false);

        SplitPane.setDividerLocation(100);

        ControlPanel.setBackground(new java.awt.Color(61, 174, 72));

        btnBookTicket.setText("BookTicket");
        btnBookTicket.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnBookTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookTicketActionPerformed(evt);
            }
        });

        btnCheckTicket.setText("CheckTicket");
        btnCheckTicket.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnCheckTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckTicketActionPerformed(evt);
            }
        });

        jLabel4.setText("Account");

        jLabel5.setText("Balance");

        lb_Account.setText(" ");

        lb_Balance.setText(" ");

        logoutButton.setText("Log out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBookTicket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCheckTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_Account, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Account)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Balance)
                .addGap(28, 28, 28)
                .addComponent(btnBookTicket)
                .addGap(18, 18, 18)
                .addComponent(btnCheckTicket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 371, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
        );

        SplitPane.setLeftComponent(ControlPanel);

        BookTicketJPanel.setBackground(new java.awt.Color(0, 139, 69));
        BookTicketJPanel.setPreferredSize(new java.awt.Dimension(423, 600));

        jLabel1.setText("Session Select");

        jLabel2.setText("FromDate");

        txtFromDate.setText("YYYY-MM-DD");
        txtFromDate.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtFromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromDateActionPerformed(evt);
            }
        });

        txtToDate.setText("YYYY-MM-DD");
        txtToDate.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtToDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToDateActionPerformed(evt);
            }
        });

        jLabel3.setText("ToDate");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tbSessionSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "HomeTeam", "AwayTeam", "Price", "LeftAmount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbSessionSearch);

        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        btnWait.setText("Join waitlist");
        btnWait.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnWait.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWaitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BookTicketJPanelLayout = new javax.swing.GroupLayout(BookTicketJPanel);
        BookTicketJPanel.setLayout(BookTicketJPanelLayout);
        BookTicketJPanelLayout.setHorizontalGroup(
            BookTicketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookTicketJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(BookTicketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(BookTicketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BookTicketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnWait, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BookTicketJPanelLayout.setVerticalGroup(
            BookTicketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookTicketJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BookTicketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BookTicketJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnBook)
                        .addGap(18, 18, 18)
                        .addComponent(btnWait))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(309, Short.MAX_VALUE))
        );

        SplitPane.setRightComponent(BookTicketJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFromDateActionPerformed

    private void txtToDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToDateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
                                                  
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbSessionSearch.getModel();//生成table
        model.setRowCount(0);
        fromDate = txtFromDate.getText();
        toDate = txtToDate.getText();
        
        if(fromDate =="YYYY-MM-DD"){
            JOptionPane.showMessageDialog(this, "Please fill the fromDate");
            return;
        }
        if(toDate =="YYYY-MM-DD"){
            JOptionPane.showMessageDialog(this, "Please fill the fromDate");
            return;
        }
        /* verify the date format and time */
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);
            format.parse(fromDate);
        } catch (ParseException e) {
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            JOptionPane.showMessageDialog(this, "Please fill the fromDate like YYYY-MM-DD");
            return;
        }
        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);
            format.parse(toDate);
        } catch (ParseException e) {
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            JOptionPane.showMessageDialog(this, "Please fill the toDate like YYYY-MM-DD");
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
                
                /* get matchliset in these dates */
                String sqlMatList = "SELECT * FROM match_info WHERE date >= \'"+ fromDate +"\' and date <= \'"+ toDate+"\'"; 
                
                ResultSet resultSet = statement.executeQuery(sqlMatList);   //搭配select使用，其他update什么的都不用
                
                while(resultSet.next()){
                Object[] row = new Object[5];
                row[0] = String.valueOf(resultSet.getObject("date"));//添加内容
                row[1] = String.valueOf(resultSet.getObject("home"));
                row[2] = String.valueOf(resultSet.getObject("away"));
                row[3] = String.valueOf(resultSet.getObject("price"));
                row[4] = String.valueOf(resultSet.getObject("left_amount"));


                model.addRow(row);///添加的命令
                }
                
                resultSet.close();//close  搭配select使用，其他update什么的都不用
                statement.close();
                connection.close();
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, "You need to check before search");
                return;
            }
    
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tbSessionSearch.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tbSessionSearch.getModel();
        
        String date = model.getValueAt(selectedRowIndex , 0).toString();//获得选中的行的第2列的内容
        String homeTeam = model.getValueAt(selectedRowIndex , 1).toString();//获得选中的行的第2列的内容
        String awayTeam = model.getValueAt(selectedRowIndex , 2).toString();//获得选中的行的第2列的内容
        String price = model.getValueAt(selectedRowIndex , 3).toString();//获得选中的行的第2列的内容
        int leftAmount = Integer.parseInt(model.getValueAt(selectedRowIndex , 4).toString());//获得选中的行的第2列的内容
        if(leftAmount==0){
            JOptionPane.showMessageDialog(this, "There is no ticket, you can choose to join the waitlist.");
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
                SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间 
                sdf.applyPattern("yyyy-MM-dd HH:mm:ss");// 
                Date currentDate = new Date();// 获取当前时间 
                String cuDate = sdf.format(currentDate);
            
                 /* 在fan_match中增加book记录 */
                String sql = "INSERT INTO fan_match (email, hometeam, awayteam, date, price,status, order_time) VALUES (\'" + email +"\',\'" + homeTeam +"\',\'" +awayTeam+"\',\'"+ date +"\',\'"+ price +"\','Ordered',\'"+cuDate+"\')"; 
                
                int isBooked = statement.executeUpdate(sql);//executeQuery(sql)是查询  executeUpdate是删改
               
                
                /*4.`match_info`中left_amount会-1 */
                /*4.1 找出之前剩余票数 */
                String sqlLeftAmount = "SELECT left_amount FROM match_info WHERE date = \'"+ date +"\' and home =\'"+homeTeam +"\'and away =\'"+awayTeam +"\'"; 

                ResultSet resultSet = statement.executeQuery(sqlLeftAmount);   //搭配select使用，其他update什么的都不用


                /*4.2 left_amount会-1 再插进去*/
                String sqlInsertLeftAmount = "UPDATE match_info SET left_amount = "+ (leftAmount-1) +" WHERE home =\'"+homeTeam +"\'and away =\'"+awayTeam +"\'and date =\'"+date +"\'and price ="+price;

                int isInsertLeftAmount = statement.executeUpdate(sqlInsertLeftAmount);//executeQuery(sql)是查询  executeUpdate是删改
                if (isBooked ==1&&isInsertLeftAmount==1){
                    //populateTable(); //Refresh table
                    JOptionPane.showMessageDialog(this, "Book successfully.");
                }

                resultSet.close();//close  搭配select使用，其他update什么的都不用
                statement.close();
                connection.close();
                CheckTicketJPanel checkticketjpanel = new CheckTicketJPanel(email,balance,lb_Balance,SplitPane);///跳转页面
                SplitPane.setRightComponent(checkticketjpanel);
                } catch (ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(this, "You need to check before book.");
                    return;
            }
            
    }//GEN-LAST:event_btnBookActionPerformed

    private void btnBookTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookTicketActionPerformed
        // TODO add your handling code here:
        SplitPane.setRightComponent(BookTicketJPanel);
    }//GEN-LAST:event_btnBookTicketActionPerformed

    private void btnCheckTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckTicketActionPerformed
        // TODO add your handling code here:
        CheckTicketJPanel checkticketjpanel = new CheckTicketJPanel(email,balance,lb_Balance,SplitPane);///跳转页面
        SplitPane.setRightComponent(checkticketjpanel);
    }//GEN-LAST:event_btnCheckTicketActionPerformed

    private void btnWaitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWaitActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        int selectedRowIndex = tbSessionSearch.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tbSessionSearch.getModel();
        
        String date = model.getValueAt(selectedRowIndex , 0).toString();//获得选中的行的第2列的内容
        String homeTeam = model.getValueAt(selectedRowIndex , 1).toString();//获得选中的行的第2列的内容
        String awayTeam = model.getValueAt(selectedRowIndex , 2).toString();//获得选中的行的第2列的内容
        String price = model.getValueAt(selectedRowIndex , 3).toString();//获得选中的行的第2列的内容
        int leftAmount = Integer.parseInt(model.getValueAt(selectedRowIndex , 4).toString());//获得选中的行的第2列的内容
        if(leftAmount>0){
            JOptionPane.showMessageDialog(this, "There are available tickets, you can choose to book.");
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
                
                /*获取当前时间*/
                SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间 
                sdf.applyPattern("yyyy-MM-dd HH:mm:ss");// 
                Date currentDate = new Date();// 获取当前时间 
                String cuDate = sdf.format(currentDate);
            
                /* Insert */
                String sql = "INSERT INTO fan_match (email, hometeam, awayteam, date, price,status, order_time) VALUES (\'" + email +"\',\'" + homeTeam +"\',\'" +awayTeam+"\',\'"+ date +"\',\'"+ price +"\','Waiting',\'"+cuDate+"\')"; 
                int isBooked = statement.executeUpdate(sql);//executeQuery(sql)是查询  executeUpdate是删改
               
                if (isBooked ==1){
                    //populateTable(); //Refresh table
                    JOptionPane.showMessageDialog(this, "Joined into waitlist successfully.");
                }
                
                statement.close();
                connection.close();
                CheckTicketJPanel checkticketjpanel = new CheckTicketJPanel(email,balance,lb_Balance,SplitPane);///跳转页面
                SplitPane.setRightComponent(checkticketjpanel);
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, "You need to check before book.");
                return;
            }
            
    }//GEN-LAST:event_btnWaitActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        int value = JOptionPane.showConfirmDialog(rootPane, "Are you want to log out?");
        if (value == JOptionPane.YES_OPTION) {
            dispose();
            new TestMainJFrame().setVisible(true);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(BuyTicketJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(BuyTicketJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(BuyTicketJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(BuyTicketJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new BuyTicketJFrame().setVisible(true);
//            }
//        });
//    }
    private void getBalance() {
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
                String sqlMatList = "SELECT balance FROM fan_balance WHERE email = \'"+email+"\'"; 
                
                ResultSet resultSet = statement.executeQuery(sqlMatList);   //搭配select使用，其他update什么的都不用
                
                while(resultSet.next()){
                balance = String.valueOf(resultSet.getObject("balance"));
                
                }
                
                resultSet.close();//close  搭配select使用，其他update什么的都不用
                statement.close();
                connection.close();
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, "No doctor available");
                return;
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BookTicketJPanel;
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnBookTicket;
    private javax.swing.JButton btnCheckTicket;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnWait;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_Account;
    private javax.swing.JLabel lb_Balance;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTable tbSessionSearch;
    private javax.swing.JTextField txtFromDate;
    private javax.swing.JTextField txtToDate;
    // End of variables declaration//GEN-END:variables
}
