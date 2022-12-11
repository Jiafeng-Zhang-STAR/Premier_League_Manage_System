/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.League.Match.Manager;

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
import java.util.HashSet;
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
public class ManagerClubStatisticJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorHistoryJPanel
     */
    Person manager;
    ArrayList<ClubGradeSum> clubGradeSumCata;
    
    
    public class PlayerClub{
        String PlayerTemp;
        String ClubTemp;
        int passTemp;
        int shotTemp;
        int defendTemp;

        public PlayerClub() {
        }

        public String getPlayerTemp() {
            return PlayerTemp;
        }

        public void setPlayerTemp(String PlayerTemp) {
            this.PlayerTemp = PlayerTemp;
        }

        public String getClubTemp() {
            return ClubTemp;
        }

        public void setClubTemp(String ClubTemp) {
            this.ClubTemp = ClubTemp;
        }

        public int getPassTemp() {
            return passTemp;
        }

        public void setPassTemp(int passTemp) {
            this.passTemp = passTemp;
        }

        public int getShotTemp() {
            return shotTemp;
        }

        public void setShotTemp(int shotTemp) {
            this.shotTemp = shotTemp;
        }

        public int getDefendTemp() {
            return defendTemp;
        }

        public void setDefendTemp(int defendTemp) {
            this.defendTemp = defendTemp;
        }
        
    }
    
    public class ClubGradeSum{
        String ClubTempFinal;
        int passFinalSumTemp;
        int shotFinalSumTemp;
        int defendFinalSumTemp;

        public ClubGradeSum() {
        }

        public String getClubTempFinal() {
            return ClubTempFinal;
        }

        public void setClubTempFinal(String ClubTempFinal) {
            this.ClubTempFinal = ClubTempFinal;
        }

        public int getPassFinalSumTemp() {
            return passFinalSumTemp;
        }

        public void setPassFinalSumTemp(int passFinalSumTemp) {
            this.passFinalSumTemp = passFinalSumTemp;
        }

        public int getShotFinalSumTemp() {
            return shotFinalSumTemp;
        }

        public void setShotFinalSumTemp(int shotFinalSumTemp) {
            this.shotFinalSumTemp = shotFinalSumTemp;
        }

        public int getDefendFinalSumTemp() {
            return defendFinalSumTemp;
        }

        public void setDefendFinalSumTemp(int defendFinalSumTemp) {
            this.defendFinalSumTemp = defendFinalSumTemp;
        }
        
        
    }
    
   
    public ManagerClubStatisticJPanel(Person managerTemp) {
        initComponents();
        ArrayList<PlayerClub> PlayerClubCata;
//        ArrayList<String> TempClubCata;
        
//        ArrayList<ClubGradeSum> clubGradeSumCata;
        
        HashSet<String> sets = new HashSet<>();

        PlayerClubCata = new ArrayList<PlayerClub>();
//        TempClubCata = new ArrayList<String>();
        clubGradeSumCata = new ArrayList<ClubGradeSum>();
        
        
        
        
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
        
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/premierleague";
                String username = "root";
                String password = "abcd1234!";
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();

                String sql ="SELECT player, pass, shot, defend FROM fan_rate WHERE "
                            + "(player IS NOT NULL) "
                            + "AND (player !=\'\');";

                ResultSet resultSet = statement.executeQuery(sql);

                //作为中间变量，便于将变量导入对象中 需要知道在哪个企业 负责哪个角色 且所属club是哪个
                //As an intermediate variable, it is easy to import the variables into the object. 
                //You need to know which company is responsible for which role and which club you belong to.
                while(resultSet.next()){
                    String commonName = null;
                    PlayerClub playerClubTemp = new PlayerClub();
                    
                    commonName = resultSet.getString("player");
                    playerClubTemp.setPlayerTemp(commonName);
                    playerClubTemp.setPassTemp(resultSet.getInt("pass"));
                    playerClubTemp.setShotTemp(resultSet.getInt("shot"));
                    playerClubTemp.setDefendTemp(resultSet.getInt("defend"));
                    PlayerClubCata.add(playerClubTemp);
    //                System.out.println(clubTemp);
                }
            } 
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        
        for (int i = 0; i< PlayerClubCata.size();i++){
            try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/premierleague";
                    String username = "root";
                    String password = "abcd1234!";
                    Connection connection = DriverManager.getConnection(url, username, password);
                    Statement statement = connection.createStatement();

                    String sql ="SELECT club FROM system_user_info WHERE "
                                + "name=\'"+PlayerClubCata.get(i).getPlayerTemp()+"\'";

                    ResultSet resultSetTemp = statement.executeQuery(sql);

                    while(resultSetTemp.next()){
                        PlayerClubCata.get(i).setClubTemp(resultSetTemp.getString("club"));
                        if(sets.add(PlayerClubCata.get(i).getClubTemp()))
                        {
                            ClubNameStatisticComboBox.addItem(PlayerClubCata.get(i).getClubTemp());

                            ClubGradeSum clubGradeSumTemp = new ClubGradeSum();
                            clubGradeSumTemp.setClubTempFinal(PlayerClubCata.get(i).getClubTemp());
                            clubGradeSumCata.add(clubGradeSumTemp);
                        }
                    }
                } 
            catch(ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
        }
        
        for(int i =0 ; i< clubGradeSumCata.size();i++){
            int passSumTemp = 0;
            int shotSumTemp = 0;
            int defendSumTemp = 0;
            for (int j = 0; j< PlayerClubCata.size();j++)
                {
                    if(clubGradeSumCata.get(i).getClubTempFinal().equals(PlayerClubCata.get(j).getClubTemp())){
                        passSumTemp = passSumTemp + PlayerClubCata.get(j).getPassTemp();
                        shotSumTemp = shotSumTemp + PlayerClubCata.get(j).getShotTemp();
                        defendSumTemp = defendSumTemp + PlayerClubCata.get(j).getDefendTemp();
                    }
                }
            clubGradeSumCata.get(i).setPassFinalSumTemp(passSumTemp);
            clubGradeSumCata.get(i).setShotFinalSumTemp(shotSumTemp);
            clubGradeSumCata.get(i).setDefendFinalSumTemp(defendSumTemp); 
            
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
        ClubNameStatisticComboBox = new javax.swing.JComboBox<>();
        submitToViewButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ChartTypeStatisticComboBox = new javax.swing.JComboBox<>();
        ShowChartjPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 139, 69));
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Club Statistic");

        ClubNameStatisticComboBox.setMinimumSize(new java.awt.Dimension(76, 25));
        ClubNameStatisticComboBox.setPreferredSize(new java.awt.Dimension(76, 25));

        submitToViewButton.setText("Submit To View");
        submitToViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitToViewButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Club Name:");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Chart Type:");

        ChartTypeStatisticComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pie Chart", "Bar Chart" }));
        ChartTypeStatisticComboBox.setSelectedIndex(-1);
        ChartTypeStatisticComboBox.setMinimumSize(new java.awt.Dimension(76, 25));
        ChartTypeStatisticComboBox.setPreferredSize(new java.awt.Dimension(76, 25));

        ShowChartjPanel.setBackground(new java.awt.Color(0, 139, 69));
        ShowChartjPanel.setLayout(new javax.swing.BoxLayout(ShowChartjPanel, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShowChartjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel7))
                                    .addComponent(ClubNameStatisticComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(ChartTypeStatisticComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addComponent(submitToViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClubNameStatisticComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(submitToViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChartTypeStatisticComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShowChartjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitToViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitToViewButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<String> OneTypeGrade;
        OneTypeGrade = new ArrayList<String>();
        
        int index = 0;
        if(ClubNameStatisticComboBox.getSelectedIndex()==-1){JOptionPane.showMessageDialog(submitToViewButton, "You should choose all items");}
        else{
            if(ChartTypeStatisticComboBox.getSelectedIndex()==-1){JOptionPane.showMessageDialog(submitToViewButton, "You should choose all items");}
            else{
                 String clubNameTemp = ClubNameStatisticComboBox.getSelectedItem().toString();
        
        
            String chartTypeTemp = ChartTypeStatisticComboBox.getSelectedItem().toString();


            DefaultPieDataset pieDataChart = new DefaultPieDataset();
            DefaultCategoryDataset barDataChart = new DefaultCategoryDataset();

            for(int i = 0; i <clubGradeSumCata.size();i++ ){
                if(clubNameTemp==clubGradeSumCata.get(i).getClubTempFinal()){
                    index = i;
                }
            }
                barDataChart.setValue(clubGradeSumCata.get(index).getPassFinalSumTemp(),clubNameTemp+"Total Times","Club Pass Times");
                barDataChart.setValue(clubGradeSumCata.get(index).getShotFinalSumTemp(),"Total Times","Club Shot Times");
                barDataChart.setValue(clubGradeSumCata.get(index).getDefendFinalSumTemp(),"Total Times","Club Defend Times");
                pieDataChart.setValue(clubNameTemp+" Club Pass Times", clubGradeSumCata.get(index).getPassFinalSumTemp());
                pieDataChart.setValue(clubNameTemp+" Club Shot Times", clubGradeSumCata.get(index).getShotFinalSumTemp());
                pieDataChart.setValue(clubNameTemp+" Club Defend Times", clubGradeSumCata.get(index).getDefendFinalSumTemp());

    //       barDataChart.setValue(grade,playerNameTemp,Date);
    //       barDataChart.setValue(60.80,"Marks","B");
    //       barDataChart.setValue(10.80,"Marks","C");
    //       barDataChart.setValue(10.80,"Marks","D");
    //       
           JFreeChart jchart1 = ChartFactory.createBarChart(clubNameTemp+ "Different Types Times", "Different Types", clubNameTemp+"Total Times", barDataChart, PlotOrientation.VERTICAL, true, true, false);
           JFreeChart jchart2 = ChartFactory.createPieChart3D(clubNameTemp+ "Different Types Times", pieDataChart, true, true, false);

           PiePlot PieplotPie = (PiePlot)jchart2.getPlot();
           CategoryPlot Plot =  jchart1.getCategoryPlot();

    //       PieplotPie.setForegroundAlpha(TOP_ALIGNMENT);
           PieplotPie.setBackgroundPaint(new Color(0,139,69));
           PieplotPie.setSectionPaint(clubNameTemp+" Club Pass Times", new Color(155,32,123));
    //       Plot.setBackgroundPaint(Color.WHITE);
           Plot.setBackgroundPaint(new Color(0,139,69));

    //        ChartFrame PieChartjPanel = new ChartFrame(gradeTypeTemp,jchart2);
            ChartPanel PieChartjPanel = new ChartPanel(jchart2);
            ChartPanel ChartjPanel = new ChartPanel(jchart1);

            if("Pie Chart".equals(chartTypeTemp)){
                ShowChartjPanel.removeAll();
                ShowChartjPanel.add(PieChartjPanel,BorderLayout.CENTER);
                ShowChartjPanel.validate();
    //            ShowChartjPanel.updateUI();
    //PieChartjPanel.setVisible(true);
    //PieChartjPanel.setSize(450, 500);
            }
            if("Bar Chart".equals(chartTypeTemp)){
                ShowChartjPanel.removeAll();
                ShowChartjPanel.add(ChartjPanel);
                ShowChartjPanel.updateUI();
            }
            }
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
    private javax.swing.JComboBox<String> ClubNameStatisticComboBox;
    private javax.swing.JPanel ShowChartjPanel;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.ButtonGroup justSetColor;
    private javax.swing.JButton submitToViewButton;
    // End of variables declaration//GEN-END:variables
}
