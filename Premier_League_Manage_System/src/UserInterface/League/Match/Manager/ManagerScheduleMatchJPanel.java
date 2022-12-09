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
import java.util.ArrayList;
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
public class ManagerScheduleMatchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorHistoryJPanel
     */
    Person manager;
//    int appointmentHistoryID;
//    String appointmentHistoryPlayerUserName;
//    String appointmentHistoryPlayerName;
    
    
    public static final String SportsInjuries1 = "Soft Tissue Injure";
    public static final String SportsInjuries2 = "Broken Bones Injure";
    public static final String SportsInjuries3 = "Traumatic Brain Injure";
    public static final String SportsInjuries4 = "Spinal Cord Injure";
    public static final String SportsInjuries5 = "Dislocations Injure";
    public static final String SportsInjuries6 = "Electrical Injure";
    public static final String SportsInjuries7 = "Fractures Injure";
    public static final String SportsInjuries8 = "Sprains Injure";
    public static final String SportsInjuries9 = "Strains Injure";
    
    public static final String MentalDiseases1 = "Anxiety";
    public static final String MentalDiseases2 = "Depression";
    public static final String MentalDiseases3 = "Bipolar Disorder";
    public static final String MentalDiseases4 = "Post-Traumatic Stress Disorder";
    public static final String MentalDiseases5 = "Schizophrenia";
    public static final String MentalDiseases6 = "Eating Disorder";
    public static final String MentalDiseases7 = "Disruptive Behaviour";
    public static final String MentalDiseases8 = "Dissocial Disorder";
    public static final String MentalDiseases9 = "Neurodevelopmental Disorder";
    
    public static final String InfectiousDiseases1 = "viruses";
    public static final String InfectiousDiseases2 = "bacteria";
    public static final String InfectiousDiseases3 = "fungi";
    public static final String InfectiousDiseases4 = "parasites";
    public static final String InfectiousDiseases5 = "prions";
    
    public static final String DeficiencyDiseases1 = "Protein Energy Malnutrition";
    public static final String DeficiencyDiseases2 = "Scurvy";
    public static final String DeficiencyDiseases3 = "Rickets";
    public static final String DeficiencyDiseases4 = "Beriberi";
    public static final String DeficiencyDiseases5 = "Hypocalcemia";
    public static final String DeficiencyDiseases6 = "Osteomalacia";
    public static final String DeficiencyDiseases7 = "Vitamin Deficiency";
    public static final String DeficiencyDiseases8 = "Pellagra";
    public static final String DeficiencyDiseases9 = "Xerophthalmia";
    public static final String DeficiencyDiseases10 = "Iron Deficiency";
    
    
    public static final String HereditaryDiseases1 = "Cardiovascular";
    public static final String HereditaryDiseases2 = "Diabetes";
    public static final String HereditaryDiseases3 = "Chronic Lung Illnesses";
    public static final String HereditaryDiseases4 = "Alzheimer's Disease";
    public static final String HereditaryDiseases5 = "Arthritis";
    public static final String HereditaryDiseases6 = "Cancer";
    public static final String HereditaryDiseases7 = "Dementia";
    public static final String HereditaryDiseases8 = "Heart Disease";
    public static final String HereditaryDiseases9 = "High Blood Pressure";
    public static final String HereditaryDiseases10 = "Multiple Sclerosis";
   
    public ManagerScheduleMatchJPanel(Person managerTemp) {
        initComponents();
        this.manager = managerTemp;
        
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
        
//        editSelectedAppointmentButton.setEnabled(false);
//        selectAppointmentButton.setEnabled(true);
//        freshButton.setEnabled(true);
        
//        saveVitalSignsFillButton.setEnabled(true);
//        submitVitalSignsFillButton.setEnabled(false);
//        editVitalSignsFillButton.setEnabled(false);
//        
//        saveSymptomFillButton.setEnabled(true);
//        editSymptomFillButton.setEnabled(false);
//        submitSymptomFillButton.setEnabled(false);
//        
//        chooseAPictureButton.setEnabled(true);
//        reselectPictureButton.setEnabled(false);
//        submitThisPictureButton.setEnabled(false);
        
        
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
        matchFirstTable = new javax.swing.JTable();
        beginYearjTextField = new javax.swing.JTextField();
        appointmentPlayerNamejTextField = new javax.swing.JTextField();
        appointmentPlayerUserNamejTextField = new javax.swing.JTextField();
        freshButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        matchSecondTable = new javax.swing.JTable();
        saveVitalSignsFillButton = new javax.swing.JButton();
        editVitalSignsFillButton = new javax.swing.JButton();
        submitVitalSignsFillButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        selectAppointmentButton1 = new javax.swing.JButton();
        editSelectedAppointmentButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        appointmentIDjTextField1 = new javax.swing.JTextField();
        automaticMatchGenerationButton = new javax.swing.JButton();
        selectAppointmentButton3 = new javax.swing.JButton();
        appointmentIDjTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        beginMonthjTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        beginDayjTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 139, 69));
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));

        matchFirstTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Home", "Away", "Date", "Referee"
            }
        ));
        jScrollPane1.setViewportView(matchFirstTable);

        beginYearjTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        beginYearjTextField.setMinimumSize(new java.awt.Dimension(64, 25));
        beginYearjTextField.setPreferredSize(new java.awt.Dimension(64, 25));

        appointmentPlayerNamejTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        appointmentPlayerNamejTextField.setMinimumSize(new java.awt.Dimension(64, 25));
        appointmentPlayerNamejTextField.setPreferredSize(new java.awt.Dimension(64, 25));

        appointmentPlayerUserNamejTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        appointmentPlayerUserNamejTextField.setMinimumSize(new java.awt.Dimension(64, 25));
        appointmentPlayerUserNamejTextField.setPreferredSize(new java.awt.Dimension(64, 25));

        freshButton.setText("<html>Fresh<br/>Table</html>");
        freshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freshButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home:");

        jLabel16.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Away:");

        jLabel15.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Date:");

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Please select an appointment for diagnosis");

        matchSecondTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Home", "Away", "Date", "Referee"
            }
        ));
        jScrollPane2.setViewportView(matchSecondTable);

        saveVitalSignsFillButton.setText("Save");
        saveVitalSignsFillButton.setMaximumSize(new java.awt.Dimension(80, 28));
        saveVitalSignsFillButton.setMinimumSize(new java.awt.Dimension(80, 28));
        saveVitalSignsFillButton.setPreferredSize(new java.awt.Dimension(80, 28));
        saveVitalSignsFillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveVitalSignsFillButtonActionPerformed(evt);
            }
        });

        editVitalSignsFillButton.setText("Edit");
        editVitalSignsFillButton.setMaximumSize(new java.awt.Dimension(80, 28));
        editVitalSignsFillButton.setMinimumSize(new java.awt.Dimension(80, 28));
        editVitalSignsFillButton.setPreferredSize(new java.awt.Dimension(80, 28));
        editVitalSignsFillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editVitalSignsFillButtonActionPerformed(evt);
            }
        });

        submitVitalSignsFillButton.setText("Submit");
        submitVitalSignsFillButton.setMaximumSize(new java.awt.Dimension(80, 28));
        submitVitalSignsFillButton.setMinimumSize(new java.awt.Dimension(80, 28));
        submitVitalSignsFillButton.setPreferredSize(new java.awt.Dimension(80, 28));
        submitVitalSignsFillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitVitalSignsFillButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        selectAppointmentButton1.setText("<html>Select One<br/>&nbsp&nbsp&nbsp Match</html>");
        selectAppointmentButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAppointmentButton1ActionPerformed(evt);
            }
        });

        editSelectedAppointmentButton1.setText("<html>Edit Selected<br/>&nbsp&nbsp&nbsp&nbsp&nbsp Match</html>");
        editSelectedAppointmentButton1.setActionCommand("<html>Edit Selected<br/>Match</html>");
        editSelectedAppointmentButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSelectedAppointmentButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Referee:");

        appointmentIDjTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        appointmentIDjTextField1.setMinimumSize(new java.awt.Dimension(64, 25));
        appointmentIDjTextField1.setPreferredSize(new java.awt.Dimension(64, 25));

        automaticMatchGenerationButton.setText("<html>Automatic Match<br/>&nbsp&nbsp&nbsp Generation</html>");
        automaticMatchGenerationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                automaticMatchGenerationButtonActionPerformed(evt);
            }
        });

        selectAppointmentButton3.setText("<html>Automatic Match<br/>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Referee</html>");
        selectAppointmentButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAppointmentButton3ActionPerformed(evt);
            }
        });

        appointmentIDjTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        appointmentIDjTextField2.setMinimumSize(new java.awt.Dimension(64, 25));
        appointmentIDjTextField2.setPreferredSize(new java.awt.Dimension(64, 25));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BeginYear:");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BeginMonth:");

        beginMonthjTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        beginMonthjTextField.setMinimumSize(new java.awt.Dimension(64, 25));
        beginMonthjTextField.setPreferredSize(new java.awt.Dimension(64, 25));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BeginDay:");

        beginDayjTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        beginDayjTextField.setMinimumSize(new java.awt.Dimension(64, 25));
        beginDayjTextField.setPreferredSize(new java.awt.Dimension(64, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(20, 20, 20))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(beginYearjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(beginMonthjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(beginDayjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(automaticMatchGenerationButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(105, 105, 105)
                                    .addComponent(jLabel16)
                                    .addGap(42, 42, 42)
                                    .addComponent(jLabel15))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(102, 102, 102)
                                    .addComponent(appointmentPlayerNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(appointmentPlayerUserNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(appointmentIDjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(freshButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(selectAppointmentButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(appointmentIDjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE)))
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editSelectedAppointmentButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(saveVitalSignsFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editVitalSignsFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(submitVitalSignsFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(selectAppointmentButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(appointmentPlayerNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(appointmentPlayerUserNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(appointmentIDjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editSelectedAppointmentButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(freshButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectAppointmentButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(appointmentIDjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveVitalSignsFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editVitalSignsFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitVitalSignsFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(beginYearjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(beginMonthjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(beginDayjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectAppointmentButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(automaticMatchGenerationButton))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void freshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freshButtonActionPerformed
        // TODO add your handling code here:
//        Enumeration<AbstractButton> button;
//        button=chooseAppointmentGroup.getElements();
//        AbstractButton buttonChoose; //buttonChoose = jButton1 is true
//        for(int i=0;i<chooseAppointmentGroup.getButtonCount();i++)
//        {
//            buttonChoose=button.nextElement();
//            buttonChoose.setBackground(new java.awt.Color(255, 255, 255));
//            buttonChoose.setForeground(Color.black);
//
//        }
//        freshButton.setBackground(new java.awt.Color(0, 0, 0));
//        freshButton.setForeground(Color.white);
//
//        fillingAppointmentHistoryTable();
    }//GEN-LAST:event_freshButtonActionPerformed

    private void saveVitalSignsFillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveVitalSignsFillButtonActionPerformed
        // TODO add your handling code here:

//        bodyTemperatureFillVitalSignsTextField.setEnabled(false);
//        plusRateInFillVitalSignsTextField.setEnabled(false);
//        breathingRateFillVitalSignsTextField.setEnabled(false);
//        bloodPressureFillVitalSignsTextField.setEnabled(false);
//        oxygenSaturationFillVitalSignsTextField.setEnabled(false);
//        heightFillVitalSignsTextField.setEnabled(false);
//        weightFillVitalSignsTextField.setEnabled(false);
//
//        submitVitalSignsFillButton.setEnabled(true);
//        editVitalSignsFillButton.setEnabled(true);
//        saveVitalSignsFillButton.setEnabled(false);
    }//GEN-LAST:event_saveVitalSignsFillButtonActionPerformed

    private void editVitalSignsFillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editVitalSignsFillButtonActionPerformed
        // TODO add your handling code here:

//        bodyTemperatureFillVitalSignsTextField.setEnabled(true);
//        plusRateInFillVitalSignsTextField.setEnabled(true);
//        breathingRateFillVitalSignsTextField.setEnabled(true);
//        bloodPressureFillVitalSignsTextField.setEnabled(true);
//        oxygenSaturationFillVitalSignsTextField.setEnabled(true);
//        heightFillVitalSignsTextField.setEnabled(true);
//        weightFillVitalSignsTextField.setEnabled(true);
//
//        submitVitalSignsFillButton.setEnabled(false);
//        editVitalSignsFillButton.setEnabled(false);
//        saveVitalSignsFillButton.setEnabled(true);

    }//GEN-LAST:event_editVitalSignsFillButtonActionPerformed

    private void submitVitalSignsFillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitVitalSignsFillButtonActionPerformed
        // TODO add your handling code here:
//        if(this.appointmentHistoryID != 0){
//            bodyTemperatureFillVitalSignsTextField.setEnabled(true);
//            plusRateInFillVitalSignsTextField.setEnabled(true);
//            breathingRateFillVitalSignsTextField.setEnabled(true);
//            bloodPressureFillVitalSignsTextField.setEnabled(true);
//            oxygenSaturationFillVitalSignsTextField.setEnabled(true);
//            heightFillVitalSignsTextField.setEnabled(true);
//            weightFillVitalSignsTextField.setEnabled(true);
//
//            submitVitalSignsFillButton.setEnabled(false);
//            editVitalSignsFillButton.setEnabled(false);
//            saveVitalSignsFillButton.setEnabled(true);
//
//            String bodyTemperatureFillVitalSignsTemp = bodyTemperatureFillVitalSignsTextField.getText();
//            String plusRateInFillVitalSignsTextFieldTemp = plusRateInFillVitalSignsTextField.getText();
//            String breathingRateFillVitalSignsTextFieldTemp = breathingRateFillVitalSignsTextField.getText();
//            String bloodPressureFillVitalSignsTextFieldTemp = bloodPressureFillVitalSignsTextField.getText();
//            String oxygenSaturationFillVitalSignsTextFieldTemp = oxygenSaturationFillVitalSignsTextField.getText();
//            String heightFillVitalSignsTextFieldTemp = heightFillVitalSignsTextField.getText();
//            String weightFillVitalSignsTextFieldTemp = weightFillVitalSignsTextField.getText();
//
//            bodyTemperatureFillVitalSignsTextField.setText("");
//            plusRateInFillVitalSignsTextField.setText("");
//            breathingRateFillVitalSignsTextField.setText("");
//            bloodPressureFillVitalSignsTextField.setText("");
//            oxygenSaturationFillVitalSignsTextField.setText("");
//            heightFillVitalSignsTextField.setText("");
//            weightFillVitalSignsTextField.setText("");

//            try{
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                String url = "jdbc:mysql://localhost:3306/premierleague";
//                String username = "root";
//                String password = "abcd1234!";
//                Connection connection = DriverManager.getConnection(url, username, password);
//                Statement statement = connection.createStatement();
//
//                String sql = "UPDATE club_diagnose_appointment SET "+
//                "body_temperature=\'"+bodyTemperatureFillVitalSignsTemp+"\', "+
//                "pluse_rate=\'"+plusRateInFillVitalSignsTextFieldTemp+"\', "+
//                "breathing_rate=\'"+breathingRateFillVitalSignsTextFieldTemp+"\', "+
//                "blood_pressure=\'"+bloodPressureFillVitalSignsTextFieldTemp+"\', "+
//                "oxygen_saturation=\'"+oxygenSaturationFillVitalSignsTextFieldTemp+"\', "+
//                "height=\'"+heightFillVitalSignsTextFieldTemp+"\', "+
//                "weight=\'"+weightFillVitalSignsTextFieldTemp+"\' "+
//                "WHERE id =\'" + this.appointmentHistoryID + "\'";
//                statement.executeUpdate(sql);
//                statement.close();
//                connection.close();
//            }
//            catch(ClassNotFoundException | SQLException e)
//            {
//                e.printStackTrace();
//            }
//        }
//        else{
//            JOptionPane.showMessageDialog(submitVitalSignsFillButton, "Please select an appointment first!");
//            bodyTemperatureFillVitalSignsTextField.setEnabled(true);
//            plusRateInFillVitalSignsTextField.setEnabled(true);
//            breathingRateFillVitalSignsTextField.setEnabled(true);
//            bloodPressureFillVitalSignsTextField.setEnabled(true);
//            oxygenSaturationFillVitalSignsTextField.setEnabled(true);
//            heightFillVitalSignsTextField.setEnabled(true);
//            weightFillVitalSignsTextField.setEnabled(true);
//
//            submitVitalSignsFillButton.setEnabled(false);
//            editVitalSignsFillButton.setEnabled(false);
//            saveVitalSignsFillButton.setEnabled(true);
//        }
    }//GEN-LAST:event_submitVitalSignsFillButtonActionPerformed

    private void selectAppointmentButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAppointmentButton1ActionPerformed
        // TODO add your handling code here:
//        Enumeration<AbstractButton> button;
//        button=chooseAppointmentGroup.getElements();
//        AbstractButton buttonChoose; //buttonChoose = jButton1 is true
//        for(int i=0;i<chooseAppointmentGroup.getButtonCount();i++)
//        {
//            buttonChoose=button.nextElement();
//            buttonChoose.setBackground(new java.awt.Color(255, 255, 255));
//            buttonChoose.setForeground(Color.black);
//
//        }
//        selectAppointmentButton.setBackground(new java.awt.Color(0, 0, 0));
//        selectAppointmentButton.setForeground(Color.white);
//
//        int selectedRowIndex = this.appointmentHistoryTable.getSelectedRow();
//        if(selectedRowIndex<0){
//            JOptionPane.showMessageDialog(selectAppointmentButton, "Please select an appointment first!");
//            return;
//        }
//        DefaultTableModel model = (DefaultTableModel) this.appointmentHistoryTable.getModel();
//
//        this.appointmentHistoryID = Integer.parseInt(String.valueOf(model.getValueAt(selectedRowIndex, 0)));
//        this.appointmentHistoryPlayerName = String.valueOf(model.getValueAt(selectedRowIndex, 2));
//
//        String playerNameTemp = null;
//        String playerUsernameTemp = null;
//        int length1 = doctor.getTeam().getPlayerCatalog().getPlayerCata().size();
//        for(int i=0;i<length1;i++){
//            playerUsernameTemp=doctor.getTeam().getPlayerCatalog().getPlayerCata().get(i).getUsername();
//            playerNameTemp=doctor.getTeam().getPlayerCatalog().getPlayerCata().get(i).getName();
//            if(this.appointmentHistoryPlayerName.equals(playerNameTemp)){
//                break;
//            }
//        }
//        appointmentHistoryPlayerUserName = playerUsernameTemp;
//
//        beginYearjTextField.setText(String.valueOf(this.appointmentHistoryID));
//        appointmentPlayerNamejTextField.setText(this.appointmentHistoryPlayerName);
//        appointmentPlayerUserNamejTextField.setText(this.appointmentHistoryPlayerUserName);
//
//        beginYearjTextField.setEnabled(false);
//        appointmentPlayerNamejTextField.setEnabled(false);
//        appointmentPlayerUserNamejTextField.setEnabled(false);
//        appointmentHistoryTable.setEnabled(false);
//
//        editSelectedAppointmentButton.setEnabled(true);
//        selectAppointmentButton.setEnabled(false);
//        freshButton.setEnabled(false);

    }//GEN-LAST:event_selectAppointmentButton1ActionPerformed

    private void editSelectedAppointmentButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSelectedAppointmentButton1ActionPerformed
        // TODO add your handling code here:
//        Enumeration<AbstractButton> button;
//        button=chooseAppointmentGroup.getElements();
//        AbstractButton buttonChoose; //buttonChoose = jButton1 is true
//        for(int i=0;i<chooseAppointmentGroup.getButtonCount();i++)
//        {
//            buttonChoose=button.nextElement();
//            buttonChoose.setBackground(new java.awt.Color(255, 255, 255));
//            buttonChoose.setForeground(Color.black);
//
//        }
//        editSelectedAppointmentButton.setBackground(new java.awt.Color(0, 0, 0));
//        editSelectedAppointmentButton.setForeground(Color.white);
//
//        beginYearjTextField.setEnabled(true);
//        appointmentPlayerNamejTextField.setEnabled(true);
//        appointmentPlayerUserNamejTextField.setEnabled(true);
//        appointmentHistoryTable.setEnabled(true);
//
//        editSelectedAppointmentButton.setEnabled(false);
//        selectAppointmentButton.setEnabled(true);
//        freshButton.setEnabled(true);
    }//GEN-LAST:event_editSelectedAppointmentButton1ActionPerformed

    public class Match{
        String match_home;
        String match_away;

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

        
        
    }
    private void automaticMatchGenerationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automaticMatchGenerationButtonActionPerformed
        // TODO add your handling code here:
//        this.PlayerCata = new ArrayList<Player>();
        ArrayList<String> ClubCata;
        ArrayList<Match> MatchCataFirstHalf;
        ArrayList<Match> MatchCataSecondHalf;
        
        ClubCata = new ArrayList<String>();
        MatchCataFirstHalf = new ArrayList<Match>();
        MatchCataSecondHalf = new ArrayList<Match>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/premierleague";
            String username = "root";
            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            String sql ="SELECT DISTINCT club FROM system_user_info WHERE "
                        + "(club IS NOT NULL) "
                        + "AND (club !=\'\');";

            ResultSet resultSet = statement.executeQuery(sql);
            
            //作为中间变量，便于将变量导入对象中 需要知道在哪个企业 负责哪个角色 且所属club是哪个
            //As an intermediate variable, it is easy to import the variables into the object. 
            //You need to know which company is responsible for which role and which club you belong to.
            String clubTemp = "";
            while(resultSet.next()){
                clubTemp = resultSet.getString("club");
                ClubCata.add(clubTemp);
//                System.out.println(clubTemp);
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
//        System.out.println(ClubCata.size());
//System.out.println(" ORIGIN 1   ");
        for(int i =0; i<(ClubCata.size());i++)
        {
            for(int j = i+1 ; j<(ClubCata.size());j++){
                 Match matchTemp = new Match(ClubCata.get(i),ClubCata.get(j));
                 MatchCataFirstHalf.add(matchTemp);
                 System.out.println(matchTemp.getMatch_home()+" "+matchTemp.getMatch_away());
            }
        }
//System.out.println(" ORIGIN 2   ");
        for(int i = (ClubCata.size()-1); i>-1;i--)
        {
            for(int j = i-1 ; j>-1;j--){
                 Match matchTemp = new Match(ClubCata.get(i),ClubCata.get(j));
                 MatchCataSecondHalf.add(matchTemp);
                 System.out.println(matchTemp.getMatch_home()+" "+matchTemp.getMatch_away());
            }
        }
        
//        System.out.println(" 1111111111111111111   ");
        
        Random random1 = new Random();
        Random random2 = new Random();
        for(int i = 0; i < MatchCataFirstHalf.size();i++)
        {
            int r1 = random1.nextInt(MatchCataFirstHalf.size());
            Match temp;
            temp = MatchCataFirstHalf.get(i);
            MatchCataFirstHalf.set(i, MatchCataFirstHalf.get(r1));
            MatchCataFirstHalf.set(r1, temp);
            
        }
//        for(int i = 0; i < MatchCataFirstHalf.size();i++)
//        {
//            System.out.println(MatchCataFirstHalf.get(i).match_home+" "+MatchCataFirstHalf.get(i).match_away);
//        }
//        System.out.println(" 222222222222222222   ");
        for(int i = 0; i < MatchCataSecondHalf.size();i++)
        {
            int r1 = random2.nextInt(MatchCataSecondHalf.size());
            Match temp;
            temp = MatchCataSecondHalf.get(i);
            MatchCataSecondHalf.set(i, MatchCataSecondHalf.get(r1));
            MatchCataSecondHalf.set(r1, temp);
            
        }
//        for(int i = 0; i < MatchCataSecondHalf.size();i++)
//        {
//            System.out.println(MatchCataSecondHalf.get(i).match_home+" "+MatchCataSecondHalf.get(i).match_away);
//        }
        
        

        DefaultTableModel model1 = (DefaultTableModel) matchFirstTable.getModel();
        model1.setRowCount(0);
        
        DefaultTableModel model2 = (DefaultTableModel) matchSecondTable.getModel();
        model2.setRowCount(0);
        
        for(int i = 0; i < MatchCataFirstHalf.size();i++){
                
            Object[] row = new Object[4];

            row[0] = MatchCataFirstHalf.get(i).match_away;

            row[1] = MatchCataFirstHalf.get(i).match_home;

            row[2] = "";

            row[3] = "";

            model1.addRow(row);
        }
        for(int i = 0; i < MatchCataSecondHalf.size();i++){
            Object[] row = new Object[4];

            row[0] = MatchCataSecondHalf.get(i).match_away;

            row[1] = MatchCataSecondHalf.get(i).match_home;

            row[2] = "";

            row[3] = "";

            model2.addRow(row);
        }
    }//GEN-LAST:event_automaticMatchGenerationButtonActionPerformed

    private void selectAppointmentButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAppointmentButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectAppointmentButton3ActionPerformed

    
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
    private javax.swing.JTextField appointmentIDjTextField1;
    private javax.swing.JTextField appointmentIDjTextField2;
    private javax.swing.JTextField appointmentPlayerNamejTextField;
    private javax.swing.JTextField appointmentPlayerUserNamejTextField;
    private javax.swing.JButton automaticMatchGenerationButton;
    private javax.swing.JTextField beginDayjTextField;
    private javax.swing.JTextField beginMonthjTextField;
    private javax.swing.JTextField beginYearjTextField;
    private javax.swing.JButton editSelectedAppointmentButton1;
    private javax.swing.JButton editVitalSignsFillButton;
    private javax.swing.JButton freshButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup justSetColor;
    private javax.swing.JTable matchFirstTable;
    private javax.swing.JTable matchSecondTable;
    private javax.swing.JButton saveVitalSignsFillButton;
    private javax.swing.JButton selectAppointmentButton1;
    private javax.swing.JButton selectAppointmentButton3;
    private javax.swing.JButton submitVitalSignsFillButton;
    // End of variables declaration//GEN-END:variables
}
