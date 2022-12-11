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
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
//import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


//import javax.swing.ButtonModel;
//import javax.swing.JButton;

/**
 *
 * @author Jiafeng
 */
public class AccountantSallaryStatisticJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorHistoryJPanel
     */
        Accountant accountant;
    
   
    public AccountantSallaryStatisticJPanel(Accountant accountantTemp) {
        initComponents();
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
        jLabel14 = new javax.swing.JLabel();
        submitToViewButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ChartTypeStatisticComboBox = new javax.swing.JComboBox<>();
        ShowSalaryChartjPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 139, 69));
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Salary Statistic");

        submitToViewButton.setText("Submit To View");
        submitToViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitToViewButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Chart Type:");

        ChartTypeStatisticComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pie Chart", "Bar Chart" }));
        ChartTypeStatisticComboBox.setMinimumSize(new java.awt.Dimension(76, 25));
        ChartTypeStatisticComboBox.setPreferredSize(new java.awt.Dimension(76, 25));

        ShowSalaryChartjPanel.setBackground(new java.awt.Color(0, 139, 69));
        ShowSalaryChartjPanel.setLayout(new javax.swing.BoxLayout(ShowSalaryChartjPanel, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel9)
                        .addGap(44, 44, 44)
                        .addComponent(ChartTypeStatisticComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(submitToViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(ShowSalaryChartjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel14)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ChartTypeStatisticComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitToViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowSalaryChartjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitToViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitToViewButtonActionPerformed
        // TODO add your handling code here:


        String chartTypeTemp = ChartTypeStatisticComboBox.getSelectedItem().toString();

        String dateTemp = "";

        DefaultPieDataset pieDataChart = new DefaultPieDataset();
        DefaultCategoryDataset barDataChart = new DefaultCategoryDataset();
        //
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/premierleague";
            String username = "root";
            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String sql = "SELECT "+
            "name"+
            ", "+
            "salary"+
            " FROM system_user_info WHERE "+
            "club=\'"+accountant.getClub()+"\'"; //2 represent doctor

            ResultSet resultSet = statement.executeQuery(sql);

            Integer gradeTemp = null;

            while(resultSet.next()){
                dateTemp = resultSet.getString("name");
                gradeTemp = resultSet.getInt("salary");
                barDataChart.setValue(gradeTemp,"Salary",dateTemp);
                pieDataChart.setValue(dateTemp, gradeTemp);
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        //       barDataChart.setValue(grade,playerNameTemp,Date);
        //       barDataChart.setValue(60.80,"Marks","B");
        //       barDataChart.setValue(10.80,"Marks","C");
        //       barDataChart.setValue(10.80,"Marks","D");
        //
        JFreeChart jchart1 = ChartFactory.createBarChart("salary", "dollar", "salary", barDataChart, PlotOrientation.VERTICAL, true, true, false);
        JFreeChart jchart2 = ChartFactory.createPieChart3D("salary", pieDataChart, true, true, false);

        PiePlot PieplotPie = (PiePlot)jchart2.getPlot();
        CategoryPlot Plot =  jchart1.getCategoryPlot();

        //       PieplotPie.setForegroundAlpha(TOP_ALIGNMENT);
        PieplotPie.setBackgroundPaint(new Color(0,139,69));
        PieplotPie.setSectionPaint(dateTemp, new Color(155,32,123));
        //       Plot.setBackgroundPaint(Color.WHITE);
        Plot.setBackgroundPaint(new Color(0,139,69));

        //        ChartFrame PieChartjPanel = new ChartFrame(gradeTypeTemp,jchart2);
        ChartPanel PieChartjPanel = new ChartPanel(jchart2);
        ChartPanel ChartjPanel = new ChartPanel(jchart1);

        if("Pie Chart".equals(chartTypeTemp)){
            ShowSalaryChartjPanel.removeAll();
            ShowSalaryChartjPanel.add(PieChartjPanel,BorderLayout.CENTER);
            ShowSalaryChartjPanel.validate();
            //            ShowChartjPanel.updateUI();
            //PieChartjPanel.setVisible(true);
            //PieChartjPanel.setSize(450, 500);
        }
        if("Bar Chart".equals(chartTypeTemp)){
            ShowSalaryChartjPanel.removeAll();
            ShowSalaryChartjPanel.add(ChartjPanel);
            ShowSalaryChartjPanel.updateUI();
        }
    }//GEN-LAST:event_submitToViewButtonActionPerformed

    
    private void fillingAppointmentHistoryTable() {
//        DefaultTableModel model = (DefaultTableModel) appointmentHistoryTable.getModel();
//        model.setRowCount(0);
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/premierleague";
//            String username = "root";
//            String password = "abcd1234!";
//            Connection connection = DriverManager.getConnection(url, username, password);
//            Statement statement = connection.createStatement();
//            
//            String sql = "SELECT * FROM club_diagnose_appointment WHERE "+
//                         "doctor_id=\'"+this.doctor.getUsername()+"\'";
//            ResultSet resultSet = statement.executeQuery(sql);
//            
//            while(resultSet.next()){
//                String playerUsernameTemp;
//                String playerNameTemp = null;
//                
//                Object[] row = new Object[6];
//                
//                row[0] = resultSet.getObject("id");
//                
//                row[1] = this.doctor.getName();
//
//                String playerUsername = resultSet.getObject("player_id").toString();        
//                int length1 = doctor.getTeam().getPlayerCatalog().getPlayerCata().size();
//                for(int i=0;i<length1;i++){
//                        playerUsernameTemp=doctor.getTeam().getPlayerCatalog().getPlayerCata().get(i).getUsername();
//                        playerNameTemp=doctor.getTeam().getPlayerCatalog().getPlayerCata().get(i).getName();
//                    if(playerUsernameTemp.equals(playerUsername)){
//                         break;
//                     }
//                 }
//                row[2] = playerNameTemp;
//               
//                row[3] = resultSet.getObject("date");
//                row[4] = resultSet.getObject("status");
//                row[5] = resultSet.getObject("result");
//                model.addRow(row);
//          }
//            resultSet.close();
//            statement.close();
//            connection.close();
//        }
//        catch(ClassNotFoundException | SQLException e)
//        {
//            e.printStackTrace();
//        } 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ChartTypeStatisticComboBox;
    private javax.swing.JPanel ShowSalaryChartjPanel;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel9;
    private javax.swing.ButtonGroup justSetColor;
    private javax.swing.JButton submitToViewButton;
    // End of variables declaration//GEN-END:variables
}
