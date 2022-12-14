/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface.SponsorCompany.Management.Manager;

import Test.Feng.TestMainJFrame;
import TheSystem.Common.Person.Person;
import UserInterface.Fans.CheckTicketJPanel;
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
 * @author yidia
 */
public class SponsorJFrame extends javax.swing.JFrame {
    
    /*Lu email在登录后打开这个界面时传入，*/
    Person person;
    String email; 
    int quoteAmount;
    /**
     * Creates new form SponsorJFrame
     */
    public SponsorJFrame() {
        initComponents();
        lb_Account.setText(email);
        populateTable();
    }
    public SponsorJFrame(String email) {
        this.email = email;
        initComponents();
        lb_Account.setText(email);
        populateTable();
    }
    public SponsorJFrame(Person person_Pass) {
        this.person = person_Pass;
        this.email = person.getUsername();
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

        SponsorSplitPaneSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lb_Account = new javax.swing.JLabel();
        bntTeamkist = new javax.swing.JButton();
        btnMyquote = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        GivequoteJPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTBSponsoredTeam = new javax.swing.JTable();
        btnGiveQuote = new javax.swing.JButton();
        txtQuoteAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SponsorSplitPaneSplitPane.setDividerLocation(100);

        jPanel1.setBackground(new java.awt.Color(61, 174, 72));

        jLabel4.setText("Account");

        lb_Account.setText(" ");

        bntTeamkist.setText("TeamList");
        bntTeamkist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntTeamkistActionPerformed(evt);
            }
        });

        btnMyquote.setText("Myquote");
        btnMyquote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyquoteActionPerformed(evt);
            }
        });

        logoutButton.setText("Log out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Account, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntTeamkist)
                    .addComponent(btnMyquote)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Account)
                .addGap(18, 18, 18)
                .addComponent(bntTeamkist)
                .addGap(26, 26, 26)
                .addComponent(btnMyquote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 423, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
        );

        SponsorSplitPaneSplitPane.setLeftComponent(jPanel1);

        tbTBSponsoredTeam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Team"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbTBSponsoredTeam);

        btnGiveQuote.setText("GiveQuote");
        btnGiveQuote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveQuoteActionPerformed(evt);
            }
        });

        txtQuoteAmount.setText("Please input your quote acount");
        txtQuoteAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuoteAmountActionPerformed(evt);
            }
        });

        jLabel1.setText("QuoteAmount");

        javax.swing.GroupLayout GivequoteJPanelLayout = new javax.swing.GroupLayout(GivequoteJPanel);
        GivequoteJPanel.setLayout(GivequoteJPanelLayout);
        GivequoteJPanelLayout.setHorizontalGroup(
            GivequoteJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GivequoteJPanelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(GivequoteJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQuoteAmount, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGiveQuote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GivequoteJPanelLayout.setVerticalGroup(
            GivequoteJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GivequoteJPanelLayout.createSequentialGroup()
                .addGroup(GivequoteJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GivequoteJPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GivequoteJPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuoteAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnGiveQuote)))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        SponsorSplitPaneSplitPane.setRightComponent(GivequoteJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SponsorSplitPaneSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SponsorSplitPaneSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGiveQuoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveQuoteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tbTBSponsoredTeam.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }
        if("Please input your quote acount".equals(txtQuoteAmount.getText())){
            JOptionPane.showMessageDialog(this, "Please input your quote acount");
            return;
        }
        try {
            quoteAmount = Integer.parseInt(txtQuoteAmount.getText());
        }catch(NumberFormatException t){
            JOptionPane.showMessageDialog(this,"Please input an Integer");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tbTBSponsoredTeam.getModel();
        String toBeSponseredTeam = model.getValueAt(selectedRowIndex , 0).toString();//获得选中的行的第2列的内容
        
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
                String sql = "INSERT INTO sponsorompany_sponsor_info (time, username, team, quote_price, status) VALUES (\'" + cuDate +"\',\'" + email +"\',\'" +toBeSponseredTeam+"\',\'"+ quoteAmount +"\',\'Ordered\')"; 
                int isBooked = statement.executeUpdate(sql);//executeQuery(sql)是查询  executeUpdate是删改
               
                if (isBooked ==1){
                    //populateTable(); //Refresh table
                    JOptionPane.showMessageDialog(this, "Ordered successfully.");
                }
                
                statement.close();
                connection.close();
                CheckSponsorJPanel checksponsorjpanel = new CheckSponsorJPanel(email);///跳转页面
                SponsorSplitPaneSplitPane.setRightComponent(checksponsorjpanel);
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, "You need to check before book.");
                return;
            }
    }//GEN-LAST:event_btnGiveQuoteActionPerformed

    private void txtQuoteAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuoteAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuoteAmountActionPerformed

    private void btnMyquoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyquoteActionPerformed
        // TODO add your handling code here:
        CheckSponsorJPanel checksponsorjpanel = new CheckSponsorJPanel(email);///跳转页面
        SponsorSplitPaneSplitPane.setRightComponent(checksponsorjpanel);
    }//GEN-LAST:event_btnMyquoteActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        int value = JOptionPane.showConfirmDialog(rootPane, "Are you want to log out?");
        if (value == JOptionPane.YES_OPTION) {
            dispose();
            new TestMainJFrame().setVisible(true);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void bntTeamkistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntTeamkistActionPerformed
        // TODO add your handling code here:
         SponsorSplitPaneSplitPane.setRightComponent(GivequoteJPanel);
    }//GEN-LAST:event_bntTeamkistActionPerformed

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
//            java.util.logging.Logger.getLogger(SponsorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SponsorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SponsorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SponsorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SponsorJFrame().setVisible(true);
//            }
//        });
//    }
    private void populateTable() {
               // TODO add your handling code here:
                                                  
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbTBSponsoredTeam.getModel();//生成table
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
                String sqlMatList = "SELECT distinct club as club_list FROM system_user_info"; 
                
                ResultSet resultSet = statement.executeQuery(sqlMatList);   //搭配select使用，其他update什么的都不用
                
                while(resultSet.next()){
                Object[] row = new Object[1];
                row[0] = String.valueOf(resultSet.getObject("club_list"));//添加内容

                model.addRow(row);///添加的命令
                }
                
                resultSet.close();//close  搭配select使用，其他update什么的都不用
                statement.close();
                connection.close();
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, "There is no match");
                return;
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GivequoteJPanel;
    private javax.swing.JSplitPane SponsorSplitPaneSplitPane;
    private javax.swing.JButton bntTeamkist;
    private javax.swing.JButton btnGiveQuote;
    private javax.swing.JButton btnMyquote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_Account;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTable tbTBSponsoredTeam;
    private javax.swing.JTextField txtQuoteAmount;
    // End of variables declaration//GEN-END:variables
}
