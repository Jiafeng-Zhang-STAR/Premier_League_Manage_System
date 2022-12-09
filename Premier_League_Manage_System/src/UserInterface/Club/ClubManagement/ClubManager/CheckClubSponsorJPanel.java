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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yidia
 */
public class CheckClubSponsorJPanel extends javax.swing.JPanel {
    
    
    String email;
    JSplitPane SplitPane;
    String date = "";
    String team;
    String sponsorEmail;
    /**
     * Creates new form CheckSponsorJPanel
     */
    public CheckClubSponsorJPanel(String email,String team) {
        this.email = email;
        this.team = team;
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
        tbMySponser = new javax.swing.JTable();
        btnAcceptSponsor = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();

        tbMySponser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Sponsor", "QuotaAmount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbMySponser);

        btnAcceptSponsor.setText("Accept");
        btnAcceptSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptSponsorActionPerformed(evt);
            }
        });

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(btnAcceptSponsor)
                .addGap(153, 153, 153)
                .addComponent(btnReject)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceptSponsor)
                    .addComponent(btnReject))
                .addContainerGap(447, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptSponsorActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tbMySponser.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tbMySponser.getModel();
        date = model.getValueAt(selectedRowIndex , 0).toString();//获得选中的行的第2列的内容
        sponsorEmail = model.getValueAt(selectedRowIndex , 1).toString();//获得选中的行的第2列的内容
        try {
            /* create jdbc connection */
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/premierleague?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";

            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            String sql = "UPDATE sponsorompany_sponsor_info SET status = \'Accepted\' WHERE time =\'"+date +"\'";
            
            int isBooked = statement.executeUpdate(sql);//executeQuery(sql)是查询  executeUpdate是删改
            
            
            statement.close();
            connection.close();
            populateTable();
            sendEmail(sponsorEmail, true, team);
        
        } catch (ClassNotFoundException | SQLException e) {
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "You need to check before set 'Accepted'.");
                return;
        }
    }//GEN-LAST:event_btnAcceptSponsorActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tbMySponser.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tbMySponser.getModel();
        date = model.getValueAt(selectedRowIndex , 0).toString();//获得选中的行的第2列的内容
        sponsorEmail = model.getValueAt(selectedRowIndex , 1).toString();//获得选中的行的第2列的内容
        try {
            /* create jdbc connection */
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/premierleague?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";

            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            /*捐赠成功后改状态到complete */
            String sql = "UPDATE sponsorompany_sponsor_info SET status = \'Rejected\' WHERE time =\'"+date +"\'";
            
            int isBooked = statement.executeUpdate(sql);//executeQuery(sql)是查询  executeUpdate是删改
            
            
            statement.close();
            connection.close();
            populateTable();
            sendEmail(sponsorEmail, false, team);
        
        } catch (ClassNotFoundException | SQLException e) {
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "You need to check before set 'Rejected'.");
                return;
        }
    }//GEN-LAST:event_btnRejectActionPerformed
    
    /*发送邮件*/
    public static void sendEmail(String receiveMailAccount, boolean ifAccept,String club) throws Exception {
        // 1. 创建参数配置, 用于连接邮件服务器的参数配置
        Properties props = new Properties();                    // 参数配置
        props.setProperty("mail.transport.protocol", "smtp");   // 使用的协议（JavaMail规范要求）
        props.setProperty("mail.smtp.host", "smtp.126.com");   // 发件人的邮箱的 SMTP 服务器地址
        props.setProperty("mail.smtp.auth", "true");            // 需要请求认证
        Random random = new Random();
        String strVerificationCode = "";
        for (int i = 0; i < 6; i++){
            strVerificationCode= strVerificationCode + (random.nextInt(10));
            }
        // PS: 某些邮箱服务器要求 SMTP 连接需要使用 SSL 安全认证 (为了提高安全性, 邮箱支持SSL连接, 也可以自己开启),
        //     如果无法连接邮件服务器, 仔细查看控制台打印的 log, 如果有有类似 “连接失败, 要求 SSL 安全连接” 等错误,
        //     打开下面 /* ... */ 之间的注释代码, 开启 SSL 安全连接。
        /*
        // SMTP 服务器的端口 (非 SSL 连接的端口一般默认为 25, 可以不添加, 如果开启了 SSL 连接,
        //                  需要改为对应邮箱的 SMTP 服务器的端口, 具体可查看对应邮箱服务的帮助,
        //                  QQ邮箱的SMTP(SLL)端口为465或587, 其他邮箱自行去查看)
        final String smtpPort = "465";
        props.setProperty("mail.smtp.port", smtpPort);
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.socketFactory.port", smtpPort);
        */

        // 2. 根据配置创建会话对象, 用于和邮件服务器交互
        Session session = Session.getInstance(props);
        session.setDebug(true);                                 // 设置为debug模式, 可以查看详细的发送 log

        // 3. 创建一封邮件
        MimeMessage message;
        if(ifAccept == true){
            message = createMimeMessageAccept(session, "yidianhaoranlv@126.com", receiveMailAccount, club);
        }else{
            message = createMimeMessageReject(session, "yidianhaoranlv@126.com", receiveMailAccount, club);
        }
        

        // 4. 根据 Session 获取邮件传输对象
        Transport transport = session.getTransport();

        // 5. 使用 邮箱账号 和 密码 连接邮件服务器, 这里认证的邮箱必须与 message 中的发件人邮箱一致, 否则报错
        // 
        //    PS_01: 成败的判断关键在此一句, 如果连接服务器失败, 都会在控制台输出相应失败原因的 log,
        //           仔细查看失败原因, 有些邮箱服务器会返回错误码或查看错误类型的链接, 根据给出的错误
        //           类型到对应邮件服务器的帮助网站上查看具体失败原因。
        //
        //    PS_02: 连接失败的原因通常为以下几点, 仔细检查代码:
        //           (1) 邮箱没有开启 SMTP 服务;
        //           (2) 邮箱密码错误, 例如某些邮箱开启了独立密码;
        //           (3) 邮箱服务器要求必须要使用 SSL 安全连接;
        //           (4) 请求过于频繁或其他原因, 被邮件服务器拒绝服务;
        //           (5) 如果以上几点都确定无误, 到邮件服务器网站查找帮助。
        //
        //    PS_03: 仔细看log, 认真看log, 看懂log, 错误原因都在log已说明。
        transport.connect("yidianhaoranlv@126.com", "VTBKCYNTNIIYHNVU");

        // 6. 发送邮件, 发到所有的收件地址, message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
        transport.sendMessage(message, message.getAllRecipients());

        // 7. 关闭连接
        transport.close();
    }
    
    private static MimeMessage createMimeMessageAccept(Session session, String sendMail, String receiveMail, String club) throws Exception {
            // 1. 创建一封邮件
            MimeMessage message = new MimeMessage(session);

            // 2. From: 发件人（昵称有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改昵称）
            message.setFrom(new InternetAddress(sendMail, club, "UTF-8"));

            // 3. To: 收件人（可以增加多个收件人、抄送、密送）
            message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail, "", "UTF-8"));

            // 4. Subject: 邮件主题（标题有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改标题）
            message.setSubject("Spondor Quote Accepted", "UTF-8");


            // 5. Content: 邮件正文（可以使用html标签）（内容有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改发送内容）
            message.setContent("Thanks for your Spondor Quote! We have accepted.", "text/html;charset=UTF-8");

            // 6. 设置发件时间
            message.setSentDate(new Date());

            // 7. 保存设置
            message.saveChanges();

            return message;
        }
    private static MimeMessage createMimeMessageReject(Session session, String sendMail, String receiveMail, String club) throws Exception {
            // 1. 创建一封邮件
            MimeMessage message = new MimeMessage(session);

            // 2. From: 发件人（昵称有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改昵称）
            message.setFrom(new InternetAddress(sendMail, club, "UTF-8"));

            // 3. To: 收件人（可以增加多个收件人、抄送、密送）
            message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail, "", "UTF-8"));

            // 4. Subject: 邮件主题（标题有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改标题）
            message.setSubject("Spondor Quote Rejected", "UTF-8");


            // 5. Content: 邮件正文（可以使用html标签）（内容有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改发送内容）
            message.setContent("We are sorry that your quote doesn't meet our need. We're looking foward to a better quote from you.", "text/html;charset=UTF-8");

            // 6. 设置发件时间
            message.setSentDate(new Date());

            // 7. 保存设置
            message.saveChanges();

            return message;
        }
    private void populateTable() {
               // TODO add your handling code here:
                                                  
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbMySponser.getModel();//生成table
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
                String sqlMatList = "SELECT * FROM sponsorompany_sponsor_info WHERE team = \'"+team+"\'"; 
                
                ResultSet resultSet = statement.executeQuery(sqlMatList);   //搭配select使用，其他update什么的都不用

                while(resultSet.next()){
                Object[] row = new Object[4];
                row[0] = String.valueOf(resultSet.getObject("time")).replace("T", " ");
                row[1] = String.valueOf(resultSet.getObject("username"));
                row[2] = String.valueOf(resultSet.getObject("quote_price"));
                row[3] = String.valueOf(resultSet.getObject("status"));


                model.addRow(row);///添加的命令
                }
                
                resultSet.close();//close  搭配select使用，其他update什么的都不用
                statement.close();
                connection.close();
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, "There is no sponsor");
                return;
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptSponsor;
    private javax.swing.JButton btnReject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMySponser;
    // End of variables declaration//GEN-END:variables
}
