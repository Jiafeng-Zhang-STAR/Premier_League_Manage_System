/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Test.Feng;
import UserInterface.Club.Finance.Accountant.AccountantJFrame; 
//导入Accountant的UI界面类 Import the Accountant UI class
import UserInterface.Club.Health.Doctor.DoctorJFrame;
//导入Doctor的UI界面类 Import the Doctor UI class
import UserInterface.League.Match.Manager.ManagerJFrame;
//导入Manager的UI界面类 Import the Manager UI class

import TheSystem.Common.Person.Person;
import UserInterface.Club.ClubManagement.ClubManager.ClubManagerJFrame;
import UserInterface.Club.Team.Coach.CoachMainJFrame;
import UserInterface.Club.Team.Player.PlayerMainJFrame;
import UserInterface.Fans.BuyTicketJFrame;
import UserInterface.SponsorCompany.Management.Manager.SponsorJFrame;
import UserInterface.TicketCompany.TicketDepartment.TicketManager.TicketManagerJFrame;
//import UserInterface.Club.Team.Player.PlayerJFrame;
////导入Common的个人原始信息类 Import Common's personal original information class

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Jiafeng
 */
public class TestMainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form TestMainJFrame
     */
    public TestMainJFrame() {
        initComponents();
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
        loginButton = new javax.swing.JButton();
        passwordTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 300));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel2.setText("PassWord");

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginButton))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(registerButton))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String userName = usernameTextField.getText();
        String passWord = passwordTextField.getText();
        

        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/premierleague";
            String username = "root";
            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            String sql = "SELECT * FROM system_user_info WHERE "+
                         "username=\'"+userName+"\' AND "+
                         "password=\'"+passWord+"\'";

            ResultSet resultSet = statement.executeQuery(sql);
            
            //作为中间变量，便于将变量导入对象中 需要知道在哪个企业 负责哪个角色 且所属club是哪个
            //As an intermediate variable, it is easy to import the variables into the object. 
            //You need to know which company is responsible for which role and which club you belong to.
            String userNameTemp = "";
            String passWordTemp = "";
            int enterpriseTypeTemp = 0;
            int roleTypeTemp = 0;
            String clubTemp = "";
            String nameTemp = "";
            int genderTemp = 0;
            int ageTemp = 0;
            String nationTemp = "";
            String addressTemp = "";
            String zipTemp = "";
            
            //不是一定要加的，用来判断有多少个结果，只是为了错误提示所以加上 
            //Not necessarily added, to determine how many results, just for the error message so add
            boolean notFound = true; 
            
            while(resultSet.next()){
                userNameTemp = resultSet.getString("username");
                passWordTemp = resultSet.getString("password");
                enterpriseTypeTemp = resultSet.getInt("enterprise_type");
                roleTypeTemp = resultSet.getInt("role_type");
                clubTemp = resultSet.getString("club");
                nameTemp = resultSet.getString("name");
                genderTemp = resultSet.getInt("gender");
                ageTemp = resultSet.getInt("age");
                nationTemp = resultSet.getString("nation");
                addressTemp = resultSet.getString("address");
                zipTemp = resultSet.getString("zip");

//                System.out.println(userNameTemp + " "+ addressTemp);//数据库测试点 核对数据正确与否 Database test points Verify data is correct or not
                notFound = false;
            }
            
            if(notFound){
                JOptionPane.showMessageDialog(rootPane, "Invalid username, password or type");
            }
            else{
                if (enterpriseTypeTemp == 1 && roleTypeTemp == 1) {
                    Person person = new Person();
                    person.setUsername(userNameTemp);
                    person.setPassword(passWordTemp);
                    person.setEnterpriseType(enterpriseTypeTemp);
                    person.setRoleType(roleTypeTemp);
                    person.setClub(clubTemp);
                    person.setName(nameTemp);
                    person.setGender(genderTemp);
                    person.setAge(ageTemp);
                    person.setNation(nationTemp);
                    person.setAddress(addressTemp);
                    person.setZip(zipTemp);
                    dispose();
                    new AccountantJFrame(person).setVisible(true);
                } else if (enterpriseTypeTemp == 1 && roleTypeTemp == 2) {
                    Person person = new Person();
                    person.setUsername(userNameTemp);
                    person.setPassword(passWordTemp);
                    person.setEnterpriseType(enterpriseTypeTemp);
                    person.setRoleType(roleTypeTemp);
                    person.setClub(clubTemp);
                    person.setName(nameTemp);
                    person.setGender(genderTemp);
                    person.setAge(ageTemp);
                    person.setNation(nationTemp);
                    person.setAddress(addressTemp);
                    person.setZip(zipTemp);
                    dispose();
                    new DoctorJFrame(person).setVisible(true);
                }else if (enterpriseTypeTemp == 1 && roleTypeTemp == 3) {
                    Person person = new Person();
                    person.setUsername(userNameTemp);
                    person.setPassword(passWordTemp);
                    person.setEnterpriseType(enterpriseTypeTemp);
                    person.setRoleType(roleTypeTemp);
                    person.setClub(clubTemp);
                    person.setName(nameTemp);
                    person.setGender(genderTemp);
                    person.setAge(ageTemp);
                    person.setNation(nationTemp);
                    person.setAddress(addressTemp);
                    person.setZip(zipTemp);
                    dispose();
                    new CoachMainJFrame(person).setVisible(true);
                }else if (enterpriseTypeTemp == 1 && roleTypeTemp == 4) {
                    Person person = new Person();
                    person.setUsername(userNameTemp);
                    person.setPassword(passWordTemp);
                    person.setEnterpriseType(enterpriseTypeTemp);
                    person.setRoleType(roleTypeTemp);
                    person.setClub(clubTemp);
                    person.setName(nameTemp);
                    person.setGender(genderTemp);
                    person.setAge(ageTemp);
                    person.setNation(nationTemp);
                    person.setAddress(addressTemp);
                    person.setZip(zipTemp);
                    dispose();
                    new PlayerMainJFrame(person).setVisible(true);
                }else if (enterpriseTypeTemp == 1 && roleTypeTemp == 5) {
                    Person person = new Person();
                    person.setUsername(userNameTemp);
                    person.setPassword(passWordTemp);
                    person.setEnterpriseType(enterpriseTypeTemp);
                    person.setRoleType(roleTypeTemp);
                    person.setClub(clubTemp);
                    person.setName(nameTemp);
                    person.setGender(genderTemp);
                    person.setAge(ageTemp);
                    person.setNation(nationTemp);
                    person.setAddress(addressTemp);
                    person.setZip(zipTemp);
                    dispose();
                    new ClubManagerJFrame(person).setVisible(true);
                } else if(enterpriseTypeTemp == 2 && roleTypeTemp == 1) {
                    Person person = new Person();
                    person.setUsername(userNameTemp);
                    person.setPassword(passWordTemp);
                    person.setEnterpriseType(enterpriseTypeTemp);
                    person.setRoleType(roleTypeTemp);
                    person.setClub(clubTemp);
                    person.setName(nameTemp);
                    person.setGender(genderTemp);
                    person.setAge(ageTemp);
                    person.setNation(nationTemp);
                    person.setAddress(addressTemp);
                    person.setZip(zipTemp);
                    dispose();
                    new ManagerJFrame(person).setVisible(true);
                }else if(enterpriseTypeTemp == 3 && roleTypeTemp == 1) {
                    Person person = new Person();
                    person.setUsername(userNameTemp);
                    person.setPassword(passWordTemp);
                    person.setEnterpriseType(enterpriseTypeTemp);
                    person.setRoleType(roleTypeTemp);
                    person.setClub(clubTemp);
                    person.setName(nameTemp);
                    person.setGender(genderTemp);
                    person.setAge(ageTemp);
                    person.setNation(nationTemp);
                    person.setAddress(addressTemp);
                    person.setZip(zipTemp);
                    dispose();
                    new SponsorJFrame(person).setVisible(true);
                }else if(enterpriseTypeTemp == 4 && roleTypeTemp == 1) {
                    Person person = new Person();
                    person.setUsername(userNameTemp);
                    person.setPassword(passWordTemp);
                    person.setEnterpriseType(enterpriseTypeTemp);
                    person.setRoleType(roleTypeTemp);
                    person.setClub(clubTemp);
                    person.setName(nameTemp);
                    person.setGender(genderTemp);
                    person.setAge(ageTemp);
                    person.setNation(nationTemp);
                    person.setAddress(addressTemp);
                    person.setZip(zipTemp);
                    dispose();
                    new TicketManagerJFrame(person).setVisible(true);
                }else if(enterpriseTypeTemp == 5 && roleTypeTemp == 1) {
                    Person person = new Person();
                    person.setUsername(userNameTemp);
                    person.setPassword(passWordTemp);
                    person.setEnterpriseType(enterpriseTypeTemp);
                    person.setRoleType(roleTypeTemp);
                    person.setClub(clubTemp);
                    person.setName(nameTemp);
                    person.setGender(genderTemp);
                    person.setAge(ageTemp);
                    person.setNation(nationTemp);
                    person.setAddress(addressTemp);
                    person.setZip(zipTemp);
                    dispose();
                    new BuyTicketJFrame(person).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Invalid type");
                }
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_registerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TestMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestMainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
