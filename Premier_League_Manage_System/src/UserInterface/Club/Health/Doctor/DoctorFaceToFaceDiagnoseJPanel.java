/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Club.Health.Doctor;

import TheClub.Health.Doctor.Doctor;
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
//import javax.swing.ButtonModel;
//import javax.swing.JButton;

/**
 *
 * @author Jiafeng
 */
public class DoctorFaceToFaceDiagnoseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorHistoryJPanel
     */
    Doctor doctor;
    int appointmentHistoryID;
    String appointmentHistoryPlayerUserName;
    String appointmentHistoryPlayerName;
    
    String path;
    
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
   
    public DoctorFaceToFaceDiagnoseJPanel(Doctor doctorTemp) {
        initComponents();
        this.doctor = doctorTemp;
//        jPanel1.add(jMenuBar1,BorderLayout.NORTH);
        setJPanelMenuBar(this, faceToFaceMainjPanel,faceToFaceMenuBar);
        fillingAppointmentHistoryTable();
        cards.removeAll();
        cards.add(chooseAppointmentCard1);
        cards.repaint();
        cards.revalidate();
        
        Enumeration<AbstractButton> button;
        button=chooseAppointmentGroup.getElements();
        AbstractButton buttonChoose; //buttonChoose = jButton1 is true
        for(int i=0;i<chooseAppointmentGroup.getButtonCount();i++)
        {
              buttonChoose=button.nextElement();
              buttonChoose.setBackground(new java.awt.Color(255, 255, 255));
              buttonChoose.setForeground(Color.black);
            
        }
        
        button=justSetColor.getElements();
        for(int i=0;i<justSetColor.getButtonCount();i++)
        {
              buttonChoose=button.nextElement();
              buttonChoose.setBackground(new java.awt.Color(255, 255, 255));
              buttonChoose.setForeground(Color.black);
            
        }
        
        editSelectedAppointmentButton.setEnabled(false);
        selectAppointmentButton.setEnabled(true);
        freshButton.setEnabled(true);
        
        saveVitalSignsFillButton.setEnabled(true);
        submitVitalSignsFillButton.setEnabled(false);
        editVitalSignsFillButton.setEnabled(false);
        
        saveSymptomFillButton.setEnabled(true);
        editSymptomFillButton.setEnabled(false);
        submitSymptomFillButton.setEnabled(false);
        
        chooseAPictureButton.setEnabled(true);
        reselectPictureButton.setEnabled(false);
        submitThisPictureButton.setEnabled(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseAppointmentGroup = new javax.swing.ButtonGroup();
        faceToFaceMenuBar = new javax.swing.JMenuBar();
        appointmentMenu = new javax.swing.JMenu();
        chooseAppointmentMenuItem = new javax.swing.JMenuItem();
        playerInfoMenu = new javax.swing.JMenu();
        basicInfoMenuItem = new javax.swing.JMenuItem();
        vitalSignHistoryMenuItem = new javax.swing.JMenuItem();
        symtomHistoryMenuItem = new javax.swing.JMenuItem();
        medicalPictureHistoryMenuItem = new javax.swing.JMenuItem();
        prescriptionHistoryMenuItem = new javax.swing.JMenuItem();
        solutionHistoryMenuItem = new javax.swing.JMenuItem();
        diagnoseMenu = new javax.swing.JMenu();
        vitalSignsMenuItem = new javax.swing.JMenuItem();
        symptomMenuItem = new javax.swing.JMenuItem();
        uploadPictureMenu = new javax.swing.JMenu();
        uploadPictureMenuItem = new javax.swing.JMenuItem();
        solutionMenu = new javax.swing.JMenu();
        prescriptionMenuItem = new javax.swing.JMenuItem();
        solutionMenuItem = new javax.swing.JMenuItem();
        previewPrintMenu = new javax.swing.JMenu();
        previewPrintMenuItem = new javax.swing.JMenuItem();
        justSetColor = new javax.swing.ButtonGroup();
        faceToFaceMainjPanel = new javax.swing.JPanel();
        cards = new javax.swing.JPanel();
        chooseAppointmentCard1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentHistoryTable = new javax.swing.JTable();
        freshButton = new javax.swing.JButton();
        backgroundPictureLabel = new javax.swing.JLabel();
        selectAppointmentButton = new javax.swing.JButton();
        editSelectedAppointmentButton = new javax.swing.JButton();
        appointmentIDjTextField = new javax.swing.JTextField();
        appointmentPlayerNamejTextField = new javax.swing.JTextField();
        appointmentPlayerUserNamejTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        basicInfoCard2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        vitalSignHistoryCard3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        symptomHistoryCard4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        medicalPictureHistoryCard5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        prescriptionHistoryCard6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        solutionHistoryCard7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        vitalSignsCard8 = new javax.swing.JPanel();
        bodyTemperatureFillVitalSignsTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        playerVitalsignsFillNameLabel = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        plusRateInFillVitalSignsTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        breathingRateFillVitalSignsTextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        bloodPressureFillVitalSignsTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        oxygenSaturationFillVitalSignsTextField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        heightFillVitalSignsTextField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        weightFillVitalSignsTextField = new javax.swing.JTextField();
        saveVitalSignsFillButton = new javax.swing.JButton();
        editVitalSignsFillButton = new javax.swing.JButton();
        submitVitalSignsFillButton = new javax.swing.JButton();
        symptomCard9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        playerSymptomFillNameLabel = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        diseaseTypejComboBox = new javax.swing.JComboBox<>();
        detailDiseasejComboBox = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        mainSymptom1FilljScrollPane = new javax.swing.JScrollPane();
        mainSymptom1FilljTextPane = new javax.swing.JTextPane();
        mainSymptom2FilljScrollPane = new javax.swing.JScrollPane();
        mainSymptom2FilljTextPane = new javax.swing.JTextPane();
        saveSymptomFillButton = new javax.swing.JButton();
        editSymptomFillButton = new javax.swing.JButton();
        submitSymptomFillButton = new javax.swing.JButton();
        uploadPictureCard10 = new javax.swing.JPanel();
        uploadPictureLabel = new javax.swing.JLabel();
        chooseAPictureButton = new javax.swing.JButton();
        reselectPictureButton = new javax.swing.JButton();
        submitThisPictureButton = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        playerPictureFillNameLabel = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        playerPictureFillNumberLabel = new javax.swing.JLabel();
        prescriptionCard11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        solutionCard12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        previewPrintCard13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        faceToFaceMenuBar.setMaximumSize(new java.awt.Dimension(700, 35));
        faceToFaceMenuBar.setMinimumSize(new java.awt.Dimension(700, 35));
        faceToFaceMenuBar.setPreferredSize(new java.awt.Dimension(700, 35));

        appointmentMenu.setText("Appointment");
        appointmentMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appointmentMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        appointmentMenu.setMaximumSize(new java.awt.Dimension(116, 35));
        appointmentMenu.setMinimumSize(new java.awt.Dimension(116, 35));
        appointmentMenu.setPreferredSize(new java.awt.Dimension(116, 35));

        chooseAppointmentMenuItem.setText("Choose Appointment");
        chooseAppointmentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseAppointmentMenuItemActionPerformed(evt);
            }
        });
        appointmentMenu.add(chooseAppointmentMenuItem);

        faceToFaceMenuBar.add(appointmentMenu);

        playerInfoMenu.setText("Player Info");
        playerInfoMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerInfoMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        playerInfoMenu.setMaximumSize(new java.awt.Dimension(116, 35));
        playerInfoMenu.setMinimumSize(new java.awt.Dimension(116, 35));
        playerInfoMenu.setPreferredSize(new java.awt.Dimension(116, 35));

        basicInfoMenuItem.setText("Basic Information");
        basicInfoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basicInfoMenuItemActionPerformed(evt);
            }
        });
        playerInfoMenu.add(basicInfoMenuItem);

        vitalSignHistoryMenuItem.setText("Vital Signs History");
        vitalSignHistoryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitalSignHistoryMenuItemActionPerformed(evt);
            }
        });
        playerInfoMenu.add(vitalSignHistoryMenuItem);

        symtomHistoryMenuItem.setText("Symptom History");
        symtomHistoryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symtomHistoryMenuItemActionPerformed(evt);
            }
        });
        playerInfoMenu.add(symtomHistoryMenuItem);

        medicalPictureHistoryMenuItem.setText("Medical Pictures History");
        medicalPictureHistoryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalPictureHistoryMenuItemActionPerformed(evt);
            }
        });
        playerInfoMenu.add(medicalPictureHistoryMenuItem);

        prescriptionHistoryMenuItem.setText("Prescriptions History");
        prescriptionHistoryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescriptionHistoryMenuItemActionPerformed(evt);
            }
        });
        playerInfoMenu.add(prescriptionHistoryMenuItem);

        solutionHistoryMenuItem.setText("Solutions History");
        solutionHistoryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionHistoryMenuItemActionPerformed(evt);
            }
        });
        playerInfoMenu.add(solutionHistoryMenuItem);

        faceToFaceMenuBar.add(playerInfoMenu);

        diagnoseMenu.setText("Diagnose");
        diagnoseMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diagnoseMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        diagnoseMenu.setMaximumSize(new java.awt.Dimension(116, 35));
        diagnoseMenu.setMinimumSize(new java.awt.Dimension(116, 35));
        diagnoseMenu.setPreferredSize(new java.awt.Dimension(116, 35));

        vitalSignsMenuItem.setText("Fill Vital Signs");
        vitalSignsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitalSignsMenuItemActionPerformed(evt);
            }
        });
        diagnoseMenu.add(vitalSignsMenuItem);

        symptomMenuItem.setText("Fill Symptom");
        symptomMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptomMenuItemActionPerformed(evt);
            }
        });
        diagnoseMenu.add(symptomMenuItem);

        faceToFaceMenuBar.add(diagnoseMenu);

        uploadPictureMenu.setText("Picture");
        uploadPictureMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uploadPictureMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uploadPictureMenu.setMaximumSize(new java.awt.Dimension(116, 35));
        uploadPictureMenu.setMinimumSize(new java.awt.Dimension(116, 35));
        uploadPictureMenu.setPreferredSize(new java.awt.Dimension(116, 35));

        uploadPictureMenuItem.setText("Upload Medical Picture");
        uploadPictureMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPictureMenuItemActionPerformed(evt);
            }
        });
        uploadPictureMenu.add(uploadPictureMenuItem);

        faceToFaceMenuBar.add(uploadPictureMenu);

        solutionMenu.setText("Solution");
        solutionMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        solutionMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        solutionMenu.setMaximumSize(new java.awt.Dimension(116, 35));
        solutionMenu.setMinimumSize(new java.awt.Dimension(116, 35));
        solutionMenu.setPreferredSize(new java.awt.Dimension(116, 35));

        prescriptionMenuItem.setText("Fill Prescription");
        prescriptionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescriptionMenuItemActionPerformed(evt);
            }
        });
        solutionMenu.add(prescriptionMenuItem);

        solutionMenuItem.setText("Fill Solution");
        solutionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionMenuItemActionPerformed(evt);
            }
        });
        solutionMenu.add(solutionMenuItem);

        faceToFaceMenuBar.add(solutionMenu);

        previewPrintMenu.setText("Review Print");
        previewPrintMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        previewPrintMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        previewPrintMenu.setMaximumSize(new java.awt.Dimension(116, 35));
        previewPrintMenu.setMinimumSize(new java.awt.Dimension(116, 35));
        previewPrintMenu.setPreferredSize(new java.awt.Dimension(116, 35));

        previewPrintMenuItem.setText("Output Doc");
        previewPrintMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewPrintMenuItemActionPerformed(evt);
            }
        });
        previewPrintMenu.add(previewPrintMenuItem);

        faceToFaceMenuBar.add(previewPrintMenu);

        setBackground(new java.awt.Color(0, 139, 69));
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));

        faceToFaceMainjPanel.setBackground(new java.awt.Color(0, 139, 69));
        faceToFaceMainjPanel.setMinimumSize(new java.awt.Dimension(700, 600));
        faceToFaceMainjPanel.setPreferredSize(new java.awt.Dimension(700, 600));

        cards.setBackground(new java.awt.Color(0, 139, 69));
        cards.setMaximumSize(new java.awt.Dimension(700, 565));
        cards.setMinimumSize(new java.awt.Dimension(700, 565));
        cards.setPreferredSize(new java.awt.Dimension(700, 565));
        cards.setLayout(new java.awt.CardLayout());

        chooseAppointmentCard1.setBackground(new java.awt.Color(0, 139, 69));
        chooseAppointmentCard1.setMaximumSize(new java.awt.Dimension(700, 565));
        chooseAppointmentCard1.setMinimumSize(new java.awt.Dimension(700, 565));
        chooseAppointmentCard1.setPreferredSize(new java.awt.Dimension(700, 565));

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Please select an appointment for diagnosis");

        appointmentHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Doctor", "Player", "Date", "Status", "Result"
            }
        ));
        jScrollPane1.setViewportView(appointmentHistoryTable);

        freshButton.setText("<html>Fresh<br/>Table</html>");
        chooseAppointmentGroup.add(freshButton);
        freshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freshButtonActionPerformed(evt);
            }
        });

        backgroundPictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TheSystem/Common/SelfDesignIcon/700_565_selfDesigned_SoccerField_Card.png"))); // NOI18N
        backgroundPictureLabel.setAlignmentY(0.0F);
        backgroundPictureLabel.setMaximumSize(new java.awt.Dimension(700, 565));
        backgroundPictureLabel.setMinimumSize(new java.awt.Dimension(700, 565));

        selectAppointmentButton.setText("<html>&nbsp Select One<br/>Appointment</html>");
        chooseAppointmentGroup.add(selectAppointmentButton);
        selectAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAppointmentButtonActionPerformed(evt);
            }
        });

        editSelectedAppointmentButton.setText("<html>Edit Selected<br/>Appointment</html>");
        chooseAppointmentGroup.add(editSelectedAppointmentButton);
        editSelectedAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSelectedAppointmentButtonActionPerformed(evt);
            }
        });

        appointmentIDjTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        appointmentIDjTextField.setMinimumSize(new java.awt.Dimension(64, 25));
        appointmentIDjTextField.setPreferredSize(new java.awt.Dimension(64, 25));

        appointmentPlayerNamejTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        appointmentPlayerNamejTextField.setMinimumSize(new java.awt.Dimension(64, 25));
        appointmentPlayerNamejTextField.setPreferredSize(new java.awt.Dimension(64, 25));

        appointmentPlayerUserNamejTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        appointmentPlayerUserNamejTextField.setMinimumSize(new java.awt.Dimension(64, 25));
        appointmentPlayerUserNamejTextField.setPreferredSize(new java.awt.Dimension(64, 25));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Appointment ID:");

        jLabel15.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Doctor Name:");

        jLabel16.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Player Name:");

        javax.swing.GroupLayout chooseAppointmentCard1Layout = new javax.swing.GroupLayout(chooseAppointmentCard1);
        chooseAppointmentCard1.setLayout(chooseAppointmentCard1Layout);
        chooseAppointmentCard1Layout.setHorizontalGroup(
            chooseAppointmentCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseAppointmentCard1Layout.createSequentialGroup()
                .addGroup(chooseAppointmentCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chooseAppointmentCard1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(chooseAppointmentCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(chooseAppointmentCard1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(chooseAppointmentCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(chooseAppointmentCard1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(appointmentIDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(chooseAppointmentCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(chooseAppointmentCard1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(appointmentPlayerNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel16))
                                .addGap(27, 27, 27)
                                .addGroup(chooseAppointmentCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(appointmentPlayerUserNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(freshButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(chooseAppointmentCard1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(selectAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(editSelectedAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(chooseAppointmentCard1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel14)))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(chooseAppointmentCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backgroundPictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        chooseAppointmentCard1Layout.setVerticalGroup(
            chooseAppointmentCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseAppointmentCard1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(chooseAppointmentCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chooseAppointmentCard1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(freshButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chooseAppointmentCard1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(chooseAppointmentCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(chooseAppointmentCard1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(appointmentIDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(chooseAppointmentCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chooseAppointmentCard1Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(appointmentPlayerUserNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chooseAppointmentCard1Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(appointmentPlayerNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(chooseAppointmentCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editSelectedAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(chooseAppointmentCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backgroundPictureLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cards.add(chooseAppointmentCard1, "card2");

        basicInfoCard2.setBackground(new java.awt.Color(0, 139, 69));
        basicInfoCard2.setMaximumSize(new java.awt.Dimension(700, 565));
        basicInfoCard2.setMinimumSize(new java.awt.Dimension(700, 565));

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout basicInfoCard2Layout = new javax.swing.GroupLayout(basicInfoCard2);
        basicInfoCard2.setLayout(basicInfoCard2Layout);
        basicInfoCard2Layout.setHorizontalGroup(
            basicInfoCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basicInfoCard2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(123, 123, 123))
        );
        basicInfoCard2Layout.setVerticalGroup(
            basicInfoCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicInfoCard2Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cards.add(basicInfoCard2, "card2");

        vitalSignHistoryCard3.setBackground(new java.awt.Color(0, 139, 69));
        vitalSignHistoryCard3.setMaximumSize(new java.awt.Dimension(700, 565));
        vitalSignHistoryCard3.setMinimumSize(new java.awt.Dimension(700, 565));

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout vitalSignHistoryCard3Layout = new javax.swing.GroupLayout(vitalSignHistoryCard3);
        vitalSignHistoryCard3.setLayout(vitalSignHistoryCard3Layout);
        vitalSignHistoryCard3Layout.setHorizontalGroup(
            vitalSignHistoryCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vitalSignHistoryCard3Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel3)
                .addContainerGap(491, Short.MAX_VALUE))
        );
        vitalSignHistoryCard3Layout.setVerticalGroup(
            vitalSignHistoryCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vitalSignHistoryCard3Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel3)
                .addContainerGap(374, Short.MAX_VALUE))
        );

        cards.add(vitalSignHistoryCard3, "card2");

        symptomHistoryCard4.setBackground(new java.awt.Color(0, 139, 69));
        symptomHistoryCard4.setMaximumSize(new java.awt.Dimension(700, 565));
        symptomHistoryCard4.setMinimumSize(new java.awt.Dimension(700, 565));

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout symptomHistoryCard4Layout = new javax.swing.GroupLayout(symptomHistoryCard4);
        symptomHistoryCard4.setLayout(symptomHistoryCard4Layout);
        symptomHistoryCard4Layout.setHorizontalGroup(
            symptomHistoryCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(symptomHistoryCard4Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel4)
                .addContainerGap(462, Short.MAX_VALUE))
        );
        symptomHistoryCard4Layout.setVerticalGroup(
            symptomHistoryCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(symptomHistoryCard4Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel4)
                .addContainerGap(360, Short.MAX_VALUE))
        );

        cards.add(symptomHistoryCard4, "card2");

        medicalPictureHistoryCard5.setBackground(new java.awt.Color(0, 139, 69));
        medicalPictureHistoryCard5.setMaximumSize(new java.awt.Dimension(700, 565));
        medicalPictureHistoryCard5.setMinimumSize(new java.awt.Dimension(700, 565));

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout medicalPictureHistoryCard5Layout = new javax.swing.GroupLayout(medicalPictureHistoryCard5);
        medicalPictureHistoryCard5.setLayout(medicalPictureHistoryCard5Layout);
        medicalPictureHistoryCard5Layout.setHorizontalGroup(
            medicalPictureHistoryCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicalPictureHistoryCard5Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel5)
                .addContainerGap(490, Short.MAX_VALUE))
        );
        medicalPictureHistoryCard5Layout.setVerticalGroup(
            medicalPictureHistoryCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicalPictureHistoryCard5Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel5)
                .addContainerGap(307, Short.MAX_VALUE))
        );

        cards.add(medicalPictureHistoryCard5, "card2");

        prescriptionHistoryCard6.setBackground(new java.awt.Color(0, 139, 69));
        prescriptionHistoryCard6.setMaximumSize(new java.awt.Dimension(700, 565));
        prescriptionHistoryCard6.setMinimumSize(new java.awt.Dimension(700, 565));

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout prescriptionHistoryCard6Layout = new javax.swing.GroupLayout(prescriptionHistoryCard6);
        prescriptionHistoryCard6.setLayout(prescriptionHistoryCard6Layout);
        prescriptionHistoryCard6Layout.setHorizontalGroup(
            prescriptionHistoryCard6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prescriptionHistoryCard6Layout.createSequentialGroup()
                .addContainerGap(456, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(206, 206, 206))
        );
        prescriptionHistoryCard6Layout.setVerticalGroup(
            prescriptionHistoryCard6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prescriptionHistoryCard6Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel6)
                .addContainerGap(373, Short.MAX_VALUE))
        );

        cards.add(prescriptionHistoryCard6, "card2");

        solutionHistoryCard7.setBackground(new java.awt.Color(0, 139, 69));
        solutionHistoryCard7.setMaximumSize(new java.awt.Dimension(700, 565));
        solutionHistoryCard7.setMinimumSize(new java.awt.Dimension(700, 565));

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout solutionHistoryCard7Layout = new javax.swing.GroupLayout(solutionHistoryCard7);
        solutionHistoryCard7.setLayout(solutionHistoryCard7Layout);
        solutionHistoryCard7Layout.setHorizontalGroup(
            solutionHistoryCard7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solutionHistoryCard7Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel7)
                .addContainerGap(472, Short.MAX_VALUE))
        );
        solutionHistoryCard7Layout.setVerticalGroup(
            solutionHistoryCard7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solutionHistoryCard7Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel7)
                .addContainerGap(395, Short.MAX_VALUE))
        );

        cards.add(solutionHistoryCard7, "card2");

        vitalSignsCard8.setBackground(new java.awt.Color(0, 139, 69));
        vitalSignsCard8.setMaximumSize(new java.awt.Dimension(700, 565));
        vitalSignsCard8.setMinimumSize(new java.awt.Dimension(700, 565));

        jLabel17.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Body Temperature :");

        jLabel18.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Please fill in the vital signs of player :");

        playerVitalsignsFillNameLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        playerVitalsignsFillNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        playerVitalsignsFillNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerVitalsignsFillNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        playerVitalsignsFillNameLabel.setMaximumSize(new java.awt.Dimension(181, 33));
        playerVitalsignsFillNameLabel.setMinimumSize(new java.awt.Dimension(181, 33));
        playerVitalsignsFillNameLabel.setPreferredSize(new java.awt.Dimension(181, 33));

        jLabel19.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Pluse Rate :");

        jLabel20.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Breathing Rate :");

        jLabel21.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Blood Pressure :");

        jLabel22.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Oxygen Saturation :");

        jLabel23.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Height :");

        jLabel24.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Weight :");

        saveVitalSignsFillButton.setText("Save");
        justSetColor.add(saveVitalSignsFillButton);
        saveVitalSignsFillButton.setMaximumSize(new java.awt.Dimension(80, 28));
        saveVitalSignsFillButton.setMinimumSize(new java.awt.Dimension(80, 28));
        saveVitalSignsFillButton.setPreferredSize(new java.awt.Dimension(80, 28));
        saveVitalSignsFillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveVitalSignsFillButtonActionPerformed(evt);
            }
        });

        editVitalSignsFillButton.setText("Edit");
        justSetColor.add(editVitalSignsFillButton);
        editVitalSignsFillButton.setMaximumSize(new java.awt.Dimension(80, 28));
        editVitalSignsFillButton.setMinimumSize(new java.awt.Dimension(80, 28));
        editVitalSignsFillButton.setPreferredSize(new java.awt.Dimension(80, 28));
        editVitalSignsFillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editVitalSignsFillButtonActionPerformed(evt);
            }
        });

        submitVitalSignsFillButton.setText("Submit");
        justSetColor.add(submitVitalSignsFillButton);
        submitVitalSignsFillButton.setMaximumSize(new java.awt.Dimension(80, 28));
        submitVitalSignsFillButton.setMinimumSize(new java.awt.Dimension(80, 28));
        submitVitalSignsFillButton.setPreferredSize(new java.awt.Dimension(80, 28));
        submitVitalSignsFillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitVitalSignsFillButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vitalSignsCard8Layout = new javax.swing.GroupLayout(vitalSignsCard8);
        vitalSignsCard8.setLayout(vitalSignsCard8Layout);
        vitalSignsCard8Layout.setHorizontalGroup(
            vitalSignsCard8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vitalSignsCard8Layout.createSequentialGroup()
                .addGroup(vitalSignsCard8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vitalSignsCard8Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(vitalSignsCard8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(vitalSignsCard8Layout.createSequentialGroup()
                                .addComponent(saveVitalSignsFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(editVitalSignsFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitVitalSignsFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(vitalSignsCard8Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(weightFillVitalSignsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(vitalSignsCard8Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(heightFillVitalSignsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(vitalSignsCard8Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oxygenSaturationFillVitalSignsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(vitalSignsCard8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(vitalSignsCard8Layout.createSequentialGroup()
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bloodPressureFillVitalSignsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(vitalSignsCard8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(vitalSignsCard8Layout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(breathingRateFillVitalSignsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(vitalSignsCard8Layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(plusRateInFillVitalSignsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(vitalSignsCard8Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bodyTemperatureFillVitalSignsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(vitalSignsCard8Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel18))
                    .addGroup(vitalSignsCard8Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(playerVitalsignsFillNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        vitalSignsCard8Layout.setVerticalGroup(
            vitalSignsCard8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vitalSignsCard8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playerVitalsignsFillNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(vitalSignsCard8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bodyTemperatureFillVitalSignsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vitalSignsCard8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plusRateInFillVitalSignsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vitalSignsCard8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breathingRateFillVitalSignsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vitalSignsCard8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodPressureFillVitalSignsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vitalSignsCard8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oxygenSaturationFillVitalSignsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vitalSignsCard8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightFillVitalSignsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vitalSignsCard8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightFillVitalSignsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(vitalSignsCard8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveVitalSignsFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editVitalSignsFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitVitalSignsFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        cards.add(vitalSignsCard8, "card2");

        symptomCard9.setBackground(new java.awt.Color(0, 139, 69));
        symptomCard9.setMaximumSize(new java.awt.Dimension(700, 565));
        symptomCard9.setMinimumSize(new java.awt.Dimension(700, 565));

        jLabel26.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Please fill in the symptom of player :");

        playerSymptomFillNameLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        playerSymptomFillNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        playerSymptomFillNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerSymptomFillNameLabel.setMaximumSize(new java.awt.Dimension(181, 33));
        playerSymptomFillNameLabel.setMinimumSize(new java.awt.Dimension(181, 33));
        playerSymptomFillNameLabel.setPreferredSize(new java.awt.Dimension(181, 33));

        jLabel27.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Disease Type :");

        diseaseTypejComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        diseaseTypejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sports Injuries", "Mental diseases", "Infectious diseases", "Deficiency diseases", "Hereditary diseases" }));
        diseaseTypejComboBox.setSelectedIndex(-1);
        diseaseTypejComboBox.setMaximumSize(new java.awt.Dimension(240, 30));
        diseaseTypejComboBox.setMinimumSize(new java.awt.Dimension(240, 30));
        diseaseTypejComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                diseaseTypejComboBoxItemStateChanged(evt);
            }
        });

        detailDiseasejComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        detailDiseasejComboBox.setMaximumSize(new java.awt.Dimension(240, 30));
        detailDiseasejComboBox.setMinimumSize(new java.awt.Dimension(240, 30));

        jLabel28.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Main Symptom 1 :");

        jLabel29.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Detail Disease :");

        jLabel30.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Main Symptom 2 :");

        mainSymptom1FilljScrollPane.setViewportView(mainSymptom1FilljTextPane);

        mainSymptom2FilljScrollPane.setViewportView(mainSymptom2FilljTextPane);

        saveSymptomFillButton.setText("Save");
        justSetColor.add(saveSymptomFillButton);
        saveSymptomFillButton.setMaximumSize(new java.awt.Dimension(80, 28));
        saveSymptomFillButton.setMinimumSize(new java.awt.Dimension(80, 28));
        saveSymptomFillButton.setPreferredSize(new java.awt.Dimension(80, 28));
        saveSymptomFillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSymptomFillButtonActionPerformed(evt);
            }
        });

        editSymptomFillButton.setText("Edit");
        justSetColor.add(editSymptomFillButton);
        editSymptomFillButton.setMaximumSize(new java.awt.Dimension(80, 28));
        editSymptomFillButton.setMinimumSize(new java.awt.Dimension(80, 28));
        editSymptomFillButton.setPreferredSize(new java.awt.Dimension(80, 28));
        editSymptomFillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSymptomFillButtonActionPerformed(evt);
            }
        });

        submitSymptomFillButton.setText("Submit");
        justSetColor.add(submitSymptomFillButton);
        submitSymptomFillButton.setMaximumSize(new java.awt.Dimension(80, 28));
        submitSymptomFillButton.setMinimumSize(new java.awt.Dimension(80, 28));
        submitSymptomFillButton.setPreferredSize(new java.awt.Dimension(80, 28));
        submitSymptomFillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitSymptomFillButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout symptomCard9Layout = new javax.swing.GroupLayout(symptomCard9);
        symptomCard9.setLayout(symptomCard9Layout);
        symptomCard9Layout.setHorizontalGroup(
            symptomCard9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(symptomCard9Layout.createSequentialGroup()
                .addGroup(symptomCard9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(symptomCard9Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel26))
                    .addGroup(symptomCard9Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(symptomCard9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mainSymptom1FilljScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(symptomCard9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(symptomCard9Layout.createSequentialGroup()
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(detailDiseasejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(symptomCard9Layout.createSequentialGroup()
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(diseaseTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(symptomCard9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, symptomCard9Layout.createSequentialGroup()
                                    .addComponent(saveSymptomFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editSymptomFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21)
                                    .addComponent(submitSymptomFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(mainSymptom2FilljScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, symptomCard9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(playerSymptomFillNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );
        symptomCard9Layout.setVerticalGroup(
            symptomCard9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(symptomCard9Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerSymptomFillNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(symptomCard9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diseaseTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(symptomCard9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailDiseasejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainSymptom1FilljScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainSymptom2FilljScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(symptomCard9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveSymptomFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editSymptomFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitSymptomFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        cards.add(symptomCard9, "card2");

        uploadPictureCard10.setBackground(new java.awt.Color(0, 139, 69));
        uploadPictureCard10.setMaximumSize(new java.awt.Dimension(700, 565));
        uploadPictureCard10.setMinimumSize(new java.awt.Dimension(700, 565));

        chooseAPictureButton.setText("Choose a picture");
        justSetColor.add(chooseAPictureButton);
        chooseAPictureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseAPictureButtonActionPerformed(evt);
            }
        });

        reselectPictureButton.setText("Reselect Picture");
        justSetColor.add(reselectPictureButton);
        reselectPictureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reselectPictureButtonActionPerformed(evt);
            }
        });

        submitThisPictureButton.setText("Submit This Picture");
        justSetColor.add(submitThisPictureButton);
        submitThisPictureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitThisPictureButtonActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Please upload medical picture of player :");

        playerPictureFillNameLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        playerPictureFillNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        playerPictureFillNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerPictureFillNameLabel.setMaximumSize(new java.awt.Dimension(181, 33));
        playerPictureFillNameLabel.setMinimumSize(new java.awt.Dimension(181, 33));
        playerPictureFillNameLabel.setPreferredSize(new java.awt.Dimension(181, 33));

        jLabel32.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Now upload is No. ");

        playerPictureFillNumberLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        playerPictureFillNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        playerPictureFillNumberLabel.setMaximumSize(new java.awt.Dimension(181, 33));
        playerPictureFillNumberLabel.setMinimumSize(new java.awt.Dimension(181, 33));
        playerPictureFillNumberLabel.setPreferredSize(new java.awt.Dimension(181, 33));

        javax.swing.GroupLayout uploadPictureCard10Layout = new javax.swing.GroupLayout(uploadPictureCard10);
        uploadPictureCard10.setLayout(uploadPictureCard10Layout);
        uploadPictureCard10Layout.setHorizontalGroup(
            uploadPictureCard10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uploadPictureCard10Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(playerPictureFillNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uploadPictureCard10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(uploadPictureCard10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(uploadPictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(153, 153, 153))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uploadPictureCard10Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(uploadPictureCard10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uploadPictureCard10Layout.createSequentialGroup()
                        .addComponent(chooseAPictureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(reselectPictureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(submitThisPictureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uploadPictureCard10Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerPictureFillNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );
        uploadPictureCard10Layout.setVerticalGroup(
            uploadPictureCard10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uploadPictureCard10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerPictureFillNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uploadPictureCard10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addComponent(playerPictureFillNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uploadPictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uploadPictureCard10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseAPictureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reselectPictureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitThisPictureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cards.add(uploadPictureCard10, "card2");

        prescriptionCard11.setBackground(new java.awt.Color(0, 139, 69));
        prescriptionCard11.setMaximumSize(new java.awt.Dimension(700, 565));
        prescriptionCard11.setMinimumSize(new java.awt.Dimension(700, 565));

        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout prescriptionCard11Layout = new javax.swing.GroupLayout(prescriptionCard11);
        prescriptionCard11.setLayout(prescriptionCard11Layout);
        prescriptionCard11Layout.setHorizontalGroup(
            prescriptionCard11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prescriptionCard11Layout.createSequentialGroup()
                .addContainerGap(499, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(156, 156, 156))
        );
        prescriptionCard11Layout.setVerticalGroup(
            prescriptionCard11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prescriptionCard11Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel11)
                .addContainerGap(376, Short.MAX_VALUE))
        );

        cards.add(prescriptionCard11, "card2");

        solutionCard12.setBackground(new java.awt.Color(0, 139, 69));
        solutionCard12.setMaximumSize(new java.awt.Dimension(700, 565));
        solutionCard12.setMinimumSize(new java.awt.Dimension(700, 565));

        jLabel12.setText("jLabel12");

        javax.swing.GroupLayout solutionCard12Layout = new javax.swing.GroupLayout(solutionCard12);
        solutionCard12.setLayout(solutionCard12Layout);
        solutionCard12Layout.setHorizontalGroup(
            solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solutionCard12Layout.createSequentialGroup()
                .addContainerGap(499, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(156, 156, 156))
        );
        solutionCard12Layout.setVerticalGroup(
            solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solutionCard12Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel12)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        cards.add(solutionCard12, "card2");

        previewPrintCard13.setBackground(new java.awt.Color(0, 139, 69));
        previewPrintCard13.setMaximumSize(new java.awt.Dimension(700, 565));
        previewPrintCard13.setMinimumSize(new java.awt.Dimension(700, 565));

        jLabel13.setText("jLabel13");

        javax.swing.GroupLayout previewPrintCard13Layout = new javax.swing.GroupLayout(previewPrintCard13);
        previewPrintCard13.setLayout(previewPrintCard13Layout);
        previewPrintCard13Layout.setHorizontalGroup(
            previewPrintCard13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, previewPrintCard13Layout.createSequentialGroup()
                .addContainerGap(440, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(215, 215, 215))
        );
        previewPrintCard13Layout.setVerticalGroup(
            previewPrintCard13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(previewPrintCard13Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel13)
                .addContainerGap(419, Short.MAX_VALUE))
        );

        cards.add(previewPrintCard13, "card2");

        javax.swing.GroupLayout faceToFaceMainjPanelLayout = new javax.swing.GroupLayout(faceToFaceMainjPanel);
        faceToFaceMainjPanel.setLayout(faceToFaceMainjPanelLayout);
        faceToFaceMainjPanelLayout.setHorizontalGroup(
            faceToFaceMainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faceToFaceMainjPanelLayout.createSequentialGroup()
                .addComponent(cards, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        faceToFaceMainjPanelLayout.setVerticalGroup(
            faceToFaceMainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, faceToFaceMainjPanelLayout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(cards, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(faceToFaceMainjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(faceToFaceMainjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chooseAppointmentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseAppointmentMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(chooseAppointmentCard1);
        cards.repaint();
        cards.revalidate();
        
        Enumeration<AbstractButton> button;
        button=chooseAppointmentGroup.getElements();
        AbstractButton buttonChoose; //buttonChoose = jButton1 is true
        for(int i=0;i<chooseAppointmentGroup.getButtonCount();i++)
        {
              buttonChoose=button.nextElement();
              buttonChoose.setBackground(new java.awt.Color(255, 255, 255));
              buttonChoose.setForeground(Color.black);
            
        }   
    }//GEN-LAST:event_chooseAppointmentMenuItemActionPerformed

    private void basicInfoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basicInfoMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(basicInfoCard2);
        cards.repaint();
        cards.revalidate();
    }//GEN-LAST:event_basicInfoMenuItemActionPerformed

    private void vitalSignHistoryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitalSignHistoryMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(vitalSignHistoryCard3);
        cards.repaint();
        cards.revalidate();
    }//GEN-LAST:event_vitalSignHistoryMenuItemActionPerformed

    private void symtomHistoryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symtomHistoryMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(symptomHistoryCard4);
        cards.repaint();
        cards.revalidate();
    }//GEN-LAST:event_symtomHistoryMenuItemActionPerformed

    private void medicalPictureHistoryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalPictureHistoryMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(medicalPictureHistoryCard5);
        cards.repaint();
        cards.revalidate();
    }//GEN-LAST:event_medicalPictureHistoryMenuItemActionPerformed

    private void prescriptionHistoryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescriptionHistoryMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(prescriptionHistoryCard6);
        cards.repaint();
        cards.revalidate();
    }//GEN-LAST:event_prescriptionHistoryMenuItemActionPerformed

    private void solutionHistoryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionHistoryMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(solutionHistoryCard7);
        cards.repaint();
        cards.revalidate();
    }//GEN-LAST:event_solutionHistoryMenuItemActionPerformed

    private void vitalSignsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitalSignsMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(vitalSignsCard8);
        cards.repaint();
        cards.revalidate();
        playerVitalsignsFillNameLabel.setText(appointmentHistoryPlayerName);
    }//GEN-LAST:event_vitalSignsMenuItemActionPerformed

    private void symptomMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptomMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(symptomCard9);
        cards.repaint();
        cards.revalidate();
        playerSymptomFillNameLabel.setText(appointmentHistoryPlayerName);
    }//GEN-LAST:event_symptomMenuItemActionPerformed

    private void uploadPictureMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPictureMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(uploadPictureCard10);
        cards.repaint();
        cards.revalidate();
        
        ArrayList<Integer> appointment_id_read_temp;
        ArrayList<String> path_read_temp;

        appointment_id_read_temp = new ArrayList<Integer>();
        path_read_temp = new ArrayList<String>();
        
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/premierleague";
                String username = "root";
                String password = "abcd1234!";
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();

                String sql = "SELECT * FROM club_diagnose_medical_picture WHERE "+
                "appointment_id=\'"+this.appointmentHistoryID+"\'";
                ResultSet resultSet = statement.executeQuery(sql);

                while(resultSet.next()){
                    appointment_id_read_temp.add(resultSet.getInt("pictureNumberName"));
                    path_read_temp.add(resultSet.getString("path"));
                }
                resultSet.close();
                statement.close();
                connection.close();
            }
            catch(ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
            
            playerPictureFillNumberLabel.setText(Integer.toString(appointment_id_read_temp.size()+1)); 
            playerPictureFillNameLabel.setText(appointmentHistoryPlayerName);
        
    }//GEN-LAST:event_uploadPictureMenuItemActionPerformed

    private void prescriptionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescriptionMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(prescriptionCard11);
        cards.repaint();
        cards.revalidate();
    }//GEN-LAST:event_prescriptionMenuItemActionPerformed

    private void solutionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(solutionCard12);
        cards.repaint();
        cards.revalidate();
    }//GEN-LAST:event_solutionMenuItemActionPerformed

    private void previewPrintMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewPrintMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(previewPrintCard13);
        cards.repaint();
        cards.revalidate();
    }//GEN-LAST:event_previewPrintMenuItemActionPerformed

    private void freshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freshButtonActionPerformed
        // TODO add your handling code here:
        Enumeration<AbstractButton> button;
        button=chooseAppointmentGroup.getElements();
        AbstractButton buttonChoose; //buttonChoose = jButton1 is true
        for(int i=0;i<chooseAppointmentGroup.getButtonCount();i++)
        {
            buttonChoose=button.nextElement();
            buttonChoose.setBackground(new java.awt.Color(255, 255, 255));
            buttonChoose.setForeground(Color.black);

        }
        freshButton.setBackground(new java.awt.Color(0, 0, 0));
        freshButton.setForeground(Color.white);
        
        fillingAppointmentHistoryTable();
    }//GEN-LAST:event_freshButtonActionPerformed

    private void selectAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAppointmentButtonActionPerformed
        // TODO add your handling code here:
        Enumeration<AbstractButton> button;
        button=chooseAppointmentGroup.getElements();
        AbstractButton buttonChoose; //buttonChoose = jButton1 is true
        for(int i=0;i<chooseAppointmentGroup.getButtonCount();i++)
        {
            buttonChoose=button.nextElement();
            buttonChoose.setBackground(new java.awt.Color(255, 255, 255));
            buttonChoose.setForeground(Color.black);

        }
        selectAppointmentButton.setBackground(new java.awt.Color(0, 0, 0));
        selectAppointmentButton.setForeground(Color.white);
        
        int selectedRowIndex = this.appointmentHistoryTable.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(selectAppointmentButton, "Please select an appointment first!");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) this.appointmentHistoryTable.getModel();
        
        this.appointmentHistoryID = Integer.parseInt(String.valueOf(model.getValueAt(selectedRowIndex, 0)));
        this.appointmentHistoryPlayerName = String.valueOf(model.getValueAt(selectedRowIndex, 2));
        
        String playerNameTemp = null;
        String playerUsernameTemp = null;    
        int length1 = doctor.getTeam().getPlayerCatalog().getPlayerCata().size();
        for(int i=0;i<length1;i++){
                playerUsernameTemp=doctor.getTeam().getPlayerCatalog().getPlayerCata().get(i).getUsername();
                playerNameTemp=doctor.getTeam().getPlayerCatalog().getPlayerCata().get(i).getName();
            if(this.appointmentHistoryPlayerName.equals(playerNameTemp)){
                 break;
             }
        }
        appointmentHistoryPlayerUserName = playerUsernameTemp;
        
        appointmentIDjTextField.setText(String.valueOf(this.appointmentHistoryID));
        appointmentPlayerNamejTextField.setText(this.appointmentHistoryPlayerName);
        appointmentPlayerUserNamejTextField.setText(this.appointmentHistoryPlayerUserName);  
        
        appointmentIDjTextField.setEnabled(false);
        appointmentPlayerNamejTextField.setEnabled(false);
        appointmentPlayerUserNamejTextField.setEnabled(false);
        appointmentHistoryTable.setEnabled(false);
        
        editSelectedAppointmentButton.setEnabled(true);
        selectAppointmentButton.setEnabled(false);
        freshButton.setEnabled(false);
        
    }//GEN-LAST:event_selectAppointmentButtonActionPerformed

    private void editSelectedAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSelectedAppointmentButtonActionPerformed
        // TODO add your handling code here:
        Enumeration<AbstractButton> button;
        button=chooseAppointmentGroup.getElements();
        AbstractButton buttonChoose; //buttonChoose = jButton1 is true
        for(int i=0;i<chooseAppointmentGroup.getButtonCount();i++)
        {
            buttonChoose=button.nextElement();
            buttonChoose.setBackground(new java.awt.Color(255, 255, 255));
            buttonChoose.setForeground(Color.black);

        }
        editSelectedAppointmentButton.setBackground(new java.awt.Color(0, 0, 0));
        editSelectedAppointmentButton.setForeground(Color.white);
        
        appointmentIDjTextField.setEnabled(true);
        appointmentPlayerNamejTextField.setEnabled(true);
        appointmentPlayerUserNamejTextField.setEnabled(true);
        appointmentHistoryTable.setEnabled(true);
        
        editSelectedAppointmentButton.setEnabled(false);
        selectAppointmentButton.setEnabled(true);
        freshButton.setEnabled(true);
    }//GEN-LAST:event_editSelectedAppointmentButtonActionPerformed

    private void saveVitalSignsFillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveVitalSignsFillButtonActionPerformed
        // TODO add your handling code here:
        
        bodyTemperatureFillVitalSignsTextField.setEnabled(false);
        plusRateInFillVitalSignsTextField.setEnabled(false);
        breathingRateFillVitalSignsTextField.setEnabled(false);
        bloodPressureFillVitalSignsTextField.setEnabled(false);
        oxygenSaturationFillVitalSignsTextField.setEnabled(false);
        heightFillVitalSignsTextField.setEnabled(false);
        weightFillVitalSignsTextField.setEnabled(false);
        
        submitVitalSignsFillButton.setEnabled(true);
        editVitalSignsFillButton.setEnabled(true);
        saveVitalSignsFillButton.setEnabled(false);
    }//GEN-LAST:event_saveVitalSignsFillButtonActionPerformed

    private void editVitalSignsFillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editVitalSignsFillButtonActionPerformed
        // TODO add your handling code here:
        
        bodyTemperatureFillVitalSignsTextField.setEnabled(true);
        plusRateInFillVitalSignsTextField.setEnabled(true);
        breathingRateFillVitalSignsTextField.setEnabled(true);
        bloodPressureFillVitalSignsTextField.setEnabled(true);
        oxygenSaturationFillVitalSignsTextField.setEnabled(true);
        heightFillVitalSignsTextField.setEnabled(true);
        weightFillVitalSignsTextField.setEnabled(true);
        
        submitVitalSignsFillButton.setEnabled(false);
        editVitalSignsFillButton.setEnabled(false);
        saveVitalSignsFillButton.setEnabled(true);
        
    }//GEN-LAST:event_editVitalSignsFillButtonActionPerformed

    private void submitVitalSignsFillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitVitalSignsFillButtonActionPerformed
        // TODO add your handling code here:
        if(this.appointmentHistoryID != 0){
            bodyTemperatureFillVitalSignsTextField.setEnabled(true);
            plusRateInFillVitalSignsTextField.setEnabled(true);
            breathingRateFillVitalSignsTextField.setEnabled(true);
            bloodPressureFillVitalSignsTextField.setEnabled(true);
            oxygenSaturationFillVitalSignsTextField.setEnabled(true);
            heightFillVitalSignsTextField.setEnabled(true);
            weightFillVitalSignsTextField.setEnabled(true);

            submitVitalSignsFillButton.setEnabled(false);
            editVitalSignsFillButton.setEnabled(false);
            saveVitalSignsFillButton.setEnabled(true);


            String bodyTemperatureFillVitalSignsTemp = bodyTemperatureFillVitalSignsTextField.getText();
            String plusRateInFillVitalSignsTextFieldTemp = plusRateInFillVitalSignsTextField.getText();
            String breathingRateFillVitalSignsTextFieldTemp = breathingRateFillVitalSignsTextField.getText();
            String bloodPressureFillVitalSignsTextFieldTemp = bloodPressureFillVitalSignsTextField.getText();
            String oxygenSaturationFillVitalSignsTextFieldTemp = oxygenSaturationFillVitalSignsTextField.getText();
            String heightFillVitalSignsTextFieldTemp = heightFillVitalSignsTextField.getText();
            String weightFillVitalSignsTextFieldTemp = weightFillVitalSignsTextField.getText();

            bodyTemperatureFillVitalSignsTextField.setText("");
            plusRateInFillVitalSignsTextField.setText("");
            breathingRateFillVitalSignsTextField.setText("");
            bloodPressureFillVitalSignsTextField.setText("");
            oxygenSaturationFillVitalSignsTextField.setText("");
            heightFillVitalSignsTextField.setText("");
            weightFillVitalSignsTextField.setText("");
          
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/premierleague";
                String username = "root";
                String password = "abcd1234!";
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();
           
                String sql = "UPDATE club_diagnose_appointment SET "+
                             "body_temperature=\'"+bodyTemperatureFillVitalSignsTemp+"\', "+
                             "pluse_rate=\'"+plusRateInFillVitalSignsTextFieldTemp+"\', "+
                             "breathing_rate=\'"+breathingRateFillVitalSignsTextFieldTemp+"\', "+
                             "blood_pressure=\'"+bloodPressureFillVitalSignsTextFieldTemp+"\', "+
                             "oxygen_saturation=\'"+oxygenSaturationFillVitalSignsTextFieldTemp+"\', "+
                             "height=\'"+heightFillVitalSignsTextFieldTemp+"\', "+
                             "weight=\'"+weightFillVitalSignsTextFieldTemp+"\' "+
                             "WHERE id =\'" + this.appointmentHistoryID + "\'";
                statement.executeUpdate(sql);
                statement.close();
                connection.close();
            }
            catch(ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(submitVitalSignsFillButton, "Please select an appointment first!");
            bodyTemperatureFillVitalSignsTextField.setEnabled(true);
            plusRateInFillVitalSignsTextField.setEnabled(true);
            breathingRateFillVitalSignsTextField.setEnabled(true);
            bloodPressureFillVitalSignsTextField.setEnabled(true);
            oxygenSaturationFillVitalSignsTextField.setEnabled(true);
            heightFillVitalSignsTextField.setEnabled(true);
            weightFillVitalSignsTextField.setEnabled(true);

            submitVitalSignsFillButton.setEnabled(false);
            editVitalSignsFillButton.setEnabled(false);
            saveVitalSignsFillButton.setEnabled(true);
        }
    }//GEN-LAST:event_submitVitalSignsFillButtonActionPerformed

    private void diseaseTypejComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_diseaseTypejComboBoxItemStateChanged
        // TODO add your handling code here:
        
        int symptomDiseasesTypeTemp=diseaseTypejComboBox.getSelectedIndex();
         detailDiseasejComboBox.removeAllItems();
         switch(symptomDiseasesTypeTemp){
            case 0: detailDiseasejComboBox.addItem(SportsInjuries1);  
                    detailDiseasejComboBox.addItem(SportsInjuries2); 
                    detailDiseasejComboBox.addItem(SportsInjuries3);
                    detailDiseasejComboBox.addItem(SportsInjuries4); 
                    detailDiseasejComboBox.addItem(SportsInjuries5); 
                    detailDiseasejComboBox.addItem(SportsInjuries6); 
                    detailDiseasejComboBox.addItem(SportsInjuries7); 
                    detailDiseasejComboBox.addItem(SportsInjuries8); 
                    detailDiseasejComboBox.addItem(SportsInjuries9); 
                    break;
            case 1: detailDiseasejComboBox.addItem(MentalDiseases1);  
                    detailDiseasejComboBox.addItem(MentalDiseases2); 
                    detailDiseasejComboBox.addItem(MentalDiseases3);
                    detailDiseasejComboBox.addItem(MentalDiseases4); 
                    detailDiseasejComboBox.addItem(MentalDiseases5); 
                    detailDiseasejComboBox.addItem(MentalDiseases6); 
                    detailDiseasejComboBox.addItem(MentalDiseases7); 
                    detailDiseasejComboBox.addItem(MentalDiseases8); 
                    detailDiseasejComboBox.addItem(MentalDiseases9); 
                    break;
            case 2: detailDiseasejComboBox.addItem(InfectiousDiseases1);  
                    detailDiseasejComboBox.addItem(InfectiousDiseases2); 
                    detailDiseasejComboBox.addItem(InfectiousDiseases3); 
                    detailDiseasejComboBox.addItem(InfectiousDiseases4); 
                    detailDiseasejComboBox.addItem(InfectiousDiseases5); 
                    break;
            case 3: detailDiseasejComboBox.addItem(DeficiencyDiseases1);  
                    detailDiseasejComboBox.addItem(DeficiencyDiseases2); 
                    detailDiseasejComboBox.addItem(DeficiencyDiseases3);
                    detailDiseasejComboBox.addItem(DeficiencyDiseases4); 
                    detailDiseasejComboBox.addItem(DeficiencyDiseases5); 
                    detailDiseasejComboBox.addItem(DeficiencyDiseases6); 
                    detailDiseasejComboBox.addItem(DeficiencyDiseases7); 
                    detailDiseasejComboBox.addItem(DeficiencyDiseases8); 
                    detailDiseasejComboBox.addItem(DeficiencyDiseases9); 
                    detailDiseasejComboBox.addItem(DeficiencyDiseases10); 
                    break;
            case 4: detailDiseasejComboBox.addItem(HereditaryDiseases1);  
                    detailDiseasejComboBox.addItem(HereditaryDiseases2); 
                    detailDiseasejComboBox.addItem(HereditaryDiseases3);
                    detailDiseasejComboBox.addItem(HereditaryDiseases4); 
                    detailDiseasejComboBox.addItem(HereditaryDiseases5); 
                    detailDiseasejComboBox.addItem(HereditaryDiseases6); 
                    detailDiseasejComboBox.addItem(HereditaryDiseases7); 
                    detailDiseasejComboBox.addItem(HereditaryDiseases8); 
                    detailDiseasejComboBox.addItem(HereditaryDiseases9); 
                    detailDiseasejComboBox.addItem(HereditaryDiseases10); 
                    break;
            default:
                    break;
         }
    }//GEN-LAST:event_diseaseTypejComboBoxItemStateChanged

    private void saveSymptomFillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSymptomFillButtonActionPerformed
        // TODO add your handling code here:
        diseaseTypejComboBox.setEnabled(false);
        detailDiseasejComboBox.setEnabled(false);
        mainSymptom1FilljTextPane.setEnabled(false);
        mainSymptom2FilljTextPane.setEnabled(false);
        
        saveSymptomFillButton.setEnabled(false);
        editSymptomFillButton.setEnabled(true);
        submitSymptomFillButton.setEnabled(true); 
    }//GEN-LAST:event_saveSymptomFillButtonActionPerformed

    private void editSymptomFillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSymptomFillButtonActionPerformed
        // TODO add your handling code here:
        diseaseTypejComboBox.setEnabled(true);
        detailDiseasejComboBox.setEnabled(true);
        mainSymptom1FilljTextPane.setEnabled(true);
        mainSymptom2FilljTextPane.setEnabled(true);
        
        saveSymptomFillButton.setEnabled(true);
        editSymptomFillButton.setEnabled(false);
        submitSymptomFillButton.setEnabled(false);
    }//GEN-LAST:event_editSymptomFillButtonActionPerformed

    private void submitSymptomFillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitSymptomFillButtonActionPerformed
        // TODO add your handling code here:
        if(this.appointmentHistoryID != 0){
            diseaseTypejComboBox.setEnabled(true);
            detailDiseasejComboBox.setEnabled(true);
            mainSymptom1FilljTextPane.setEnabled(true);
            mainSymptom2FilljTextPane.setEnabled(true);

            saveSymptomFillButton.setEnabled(true);
            editSymptomFillButton.setEnabled(false);
            submitSymptomFillButton.setEnabled(false);


            String diseaseTypeFillSymptomTemp = diseaseTypejComboBox.getSelectedItem().toString();
            String detailDiseaseFillSymptomTemp = detailDiseasejComboBox.getSelectedItem().toString();
            String mainSymptom1FillTemp = mainSymptom1FilljTextPane.getText();
            String mainSymptom2FillTemp = mainSymptom2FilljTextPane.getText();
            
            diseaseTypejComboBox.setSelectedIndex(-1);
            detailDiseasejComboBox.setSelectedIndex(-1);
            mainSymptom1FilljTextPane.setText("");
            mainSymptom2FilljTextPane.setText("");
          
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/premierleague";
                String username = "root";
                String password = "abcd1234!";
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();
           
                String sql = "UPDATE club_diagnose_appointment SET "+
                             "diseaseType=\'"+diseaseTypeFillSymptomTemp+"\', "+
                             "detailDisease=\'"+detailDiseaseFillSymptomTemp+"\', "+
                             "mainSymptom1=\'"+mainSymptom1FillTemp+"\', "+
                             "mainSymptom2=\'"+mainSymptom2FillTemp+"\' "+
                             "WHERE id =\'" + this.appointmentHistoryID + "\'";
                statement.executeUpdate(sql);
                statement.close();
                connection.close();
            }
            catch(ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(submitVitalSignsFillButton, "Please select an appointment first!");
            diseaseTypejComboBox.setEnabled(true);
            detailDiseasejComboBox.setEnabled(true);
            mainSymptom1FilljTextPane.setEnabled(true);
            mainSymptom2FilljTextPane.setEnabled(true);
            
            saveSymptomFillButton.setEnabled(true);
            editSymptomFillButton.setEnabled(false);
            submitSymptomFillButton.setEnabled(false);
        }
    }//GEN-LAST:event_submitSymptomFillButtonActionPerformed

    private void submitThisPictureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitThisPictureButtonActionPerformed
        // TODO add your handling code here:
        if(this.appointmentHistoryID != 0){
            int pictureNumberName_write_temp;
            String outputPathAndName = null;
            
            boolean jpgOrNot = this.path.toLowerCase().endsWith(".jpg");
            boolean pngOrNot = this.path.toLowerCase().endsWith(".png");

            ArrayList<Integer> appointment_id_read_temp;
            ArrayList<String> path_read_temp;

            appointment_id_read_temp = new ArrayList<Integer>();
            path_read_temp = new ArrayList<String>();

            //READ
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/premierleague";
                String username = "root";
                String password = "abcd1234!";
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();

                String sql = "SELECT * FROM club_diagnose_medical_picture WHERE "+
                "appointment_id=\'"+this.appointmentHistoryID+"\'";
                ResultSet resultSet = statement.executeQuery(sql);

                while(resultSet.next()){
                    appointment_id_read_temp.add(resultSet.getInt("pictureNumberName"));
                    path_read_temp.add(resultSet.getString("path"));
                }
                resultSet.close();
                statement.close();
                connection.close();
            }
            catch(ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
            
            pictureNumberName_write_temp=appointment_id_read_temp.size()+1; //get number in the picture
            
            if(jpgOrNot){
                outputPathAndName="src/TheSystem/Common/PlayerMedicalPicture/"
                +appointmentHistoryID
                + "_"
                + Integer.toString(pictureNumberName_write_temp)
                +  ".jpg";
                readToWritePicture(this.path, outputPathAndName, "jpg");
            }
            if(pngOrNot){
                outputPathAndName="src/TheSystem/Common/PlayerMedicalPicture/"
                +appointmentHistoryID
                + "_"
                + Integer.toString(pictureNumberName_write_temp)
                +  ".jpg";
                readToWritePicture(this.path, outputPathAndName, "png");
            }

            //WRITE
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/premierleague";
                String username = "root";
                String password = "abcd1234!";
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();

                String sql = "INSERT INTO club_diagnose_medical_picture (appointment_id, pictureNumberName, path) VALUES ("+
                "\'"+this.appointmentHistoryID+"\', "+
                "\'"+pictureNumberName_write_temp+"\', "+
                "\'"+outputPathAndName+"\')";
                statement.executeUpdate(sql);
                statement.close();
                connection.close();
            }
            catch(ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
            
            chooseAPictureButton.setEnabled(true);
            reselectPictureButton.setEnabled(false);
            submitThisPictureButton.setEnabled(false);
            resizeImageToBackground(null, uploadPictureLabel);
        }else{
            JOptionPane.showMessageDialog(submitVitalSignsFillButton, "Please select an appointment first!");
            chooseAPictureButton.setEnabled(true);
            reselectPictureButton.setEnabled(false);
            submitThisPictureButton.setEnabled(false);
            resizeImageToBackground(null, uploadPictureLabel);
            
        }
    }//GEN-LAST:event_submitThisPictureButtonActionPerformed

    private void reselectPictureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reselectPictureButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reselectPictureButtonActionPerformed

    private void chooseAPictureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseAPictureButtonActionPerformed
        // TODO add your handling code here:
        
        this.path=choosePicture(chooseAPictureButton,uploadPictureLabel);
        if(("ERROR FILE SUFFIX".equals(this.path)) || ("NO File Select".equals(this.path)) || (this.path == null)){
            chooseAPictureButton.setEnabled(true);
            reselectPictureButton.setEnabled(false);
            submitThisPictureButton.setEnabled(false);
        }
        else{
            chooseAPictureButton.setEnabled(false);
            reselectPictureButton.setEnabled(true);
            submitThisPictureButton.setEnabled(true);
        }
    }//GEN-LAST:event_chooseAPictureButtonActionPerformed


    public static void setJPanelMenuBar(JPanel parent, JPanel child, JMenuBar menuBar) {
        parent.removeAll();
        parent.setLayout(new BorderLayout());
        JRootPane root = new JRootPane();
        parent.add(root, BorderLayout.CENTER);
        root.setJMenuBar(menuBar);
        root.getContentPane().add(child);
        parent.putClientProperty("root", root);  //if you need later
    }
    
    private void fillingAppointmentHistoryTable() {
        DefaultTableModel model = (DefaultTableModel) appointmentHistoryTable.getModel();
        model.setRowCount(0);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/premierleague";
            String username = "root";
            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            String sql = "SELECT * FROM club_diagnose_appointment WHERE "+
                         "doctor_id=\'"+this.doctor.getUsername()+"\'";
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
                String playerUsernameTemp;
                String playerNameTemp = null;
                
                Object[] row = new Object[6];
                
                row[0] = resultSet.getObject("id");
                
                row[1] = this.doctor.getName();

                String playerUsername = resultSet.getObject("player_id").toString();        
                int length1 = doctor.getTeam().getPlayerCatalog().getPlayerCata().size();
                for(int i=0;i<length1;i++){
                        playerUsernameTemp=doctor.getTeam().getPlayerCatalog().getPlayerCata().get(i).getUsername();
                        playerNameTemp=doctor.getTeam().getPlayerCatalog().getPlayerCata().get(i).getName();
                    if(playerUsernameTemp.equals(playerUsername)){
                         break;
                     }
                 }
                row[2] = playerNameTemp;
               
                row[3] = resultSet.getObject("date");
                row[4] = resultSet.getObject("status");
                row[5] = resultSet.getObject("result");
                model.addRow(row);
          }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        } 
    }
    
     public void resizeImageToBackground(String path, javax.swing.JLabel objectedShowLabelName){
        ImageIcon oldIcon= new ImageIcon(path);
        Image oldImage = oldIcon.getImage();
        Image newImage= oldImage.getScaledInstance(objectedShowLabelName.getWidth(), objectedShowLabelName.getHeight(), Image.SCALE_AREA_AVERAGING);
        ImageIcon newIcon = new ImageIcon(newImage);
        objectedShowLabelName.setIcon(newIcon);
    }
    
    public void readToWritePicture(String inputPathAndName, String outputPathAndName, String fileFormatSuffix){
        BufferedImage image = null;
        File file = null;
        //read picture
        try{
          file = new File(inputPathAndName);
          image = ImageIO.read(file);
          System.out.println("Reading complete.");
          }
        catch(IOException e){
            System.out.println("Error: "+e);
          }
        //write picture
        try{
            file = new File(outputPathAndName);
            ImageIO.write(image, fileFormatSuffix, file);
            System.out.println("Writing complete.");
        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }
    }
        
    public String choosePicture(javax.swing.JButton SubmitButtonName, javax.swing.JLabel objectedShowLabelName){
        String readPath = null;
        String outputPath = null;
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.dir")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".jpg and .png","png","jpg");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            readPath = selectedFile.getAbsolutePath();
            boolean jpgOrNot = readPath.toLowerCase().endsWith(".jpg");
            boolean pngOrNot = readPath.toLowerCase().endsWith(".png");
            if (jpgOrNot||pngOrNot){
                 resizeImageToBackground(readPath,objectedShowLabelName);
                 outputPath=readPath;
            }
            else{
                JOptionPane.showMessageDialog(SubmitButtonName, "Please select the correct file format suffix!");
                outputPath = "ERROR FILE SUFFIX";
            }
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(SubmitButtonName, "Please select a file!");
            outputPath = "NO File Select";
        }
        return outputPath;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointmentHistoryTable;
    private javax.swing.JTextField appointmentIDjTextField;
    private javax.swing.JMenu appointmentMenu;
    private javax.swing.JTextField appointmentPlayerNamejTextField;
    private javax.swing.JTextField appointmentPlayerUserNamejTextField;
    private javax.swing.JLabel backgroundPictureLabel;
    private javax.swing.JPanel basicInfoCard2;
    private javax.swing.JMenuItem basicInfoMenuItem;
    private javax.swing.JTextField bloodPressureFillVitalSignsTextField;
    private javax.swing.JTextField bodyTemperatureFillVitalSignsTextField;
    private javax.swing.JTextField breathingRateFillVitalSignsTextField;
    private javax.swing.JPanel cards;
    private javax.swing.JButton chooseAPictureButton;
    private javax.swing.JPanel chooseAppointmentCard1;
    private javax.swing.ButtonGroup chooseAppointmentGroup;
    private javax.swing.JMenuItem chooseAppointmentMenuItem;
    private javax.swing.JComboBox<String> detailDiseasejComboBox;
    private javax.swing.JMenu diagnoseMenu;
    private javax.swing.JComboBox<String> diseaseTypejComboBox;
    private javax.swing.JButton editSelectedAppointmentButton;
    private javax.swing.JButton editSymptomFillButton;
    private javax.swing.JButton editVitalSignsFillButton;
    private javax.swing.JPanel faceToFaceMainjPanel;
    private javax.swing.JMenuBar faceToFaceMenuBar;
    private javax.swing.JButton freshButton;
    private javax.swing.JTextField heightFillVitalSignsTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup justSetColor;
    private javax.swing.JScrollPane mainSymptom1FilljScrollPane;
    private javax.swing.JTextPane mainSymptom1FilljTextPane;
    private javax.swing.JScrollPane mainSymptom2FilljScrollPane;
    private javax.swing.JTextPane mainSymptom2FilljTextPane;
    private javax.swing.JPanel medicalPictureHistoryCard5;
    private javax.swing.JMenuItem medicalPictureHistoryMenuItem;
    private javax.swing.JTextField oxygenSaturationFillVitalSignsTextField;
    private javax.swing.JMenu playerInfoMenu;
    private javax.swing.JLabel playerPictureFillNameLabel;
    private javax.swing.JLabel playerPictureFillNumberLabel;
    private javax.swing.JLabel playerSymptomFillNameLabel;
    private javax.swing.JLabel playerVitalsignsFillNameLabel;
    private javax.swing.JTextField plusRateInFillVitalSignsTextField;
    private javax.swing.JPanel prescriptionCard11;
    private javax.swing.JPanel prescriptionHistoryCard6;
    private javax.swing.JMenuItem prescriptionHistoryMenuItem;
    private javax.swing.JMenuItem prescriptionMenuItem;
    private javax.swing.JPanel previewPrintCard13;
    private javax.swing.JMenu previewPrintMenu;
    private javax.swing.JMenuItem previewPrintMenuItem;
    private javax.swing.JButton reselectPictureButton;
    private javax.swing.JButton saveSymptomFillButton;
    private javax.swing.JButton saveVitalSignsFillButton;
    private javax.swing.JButton selectAppointmentButton;
    private javax.swing.JPanel solutionCard12;
    private javax.swing.JPanel solutionHistoryCard7;
    private javax.swing.JMenuItem solutionHistoryMenuItem;
    private javax.swing.JMenu solutionMenu;
    private javax.swing.JMenuItem solutionMenuItem;
    private javax.swing.JButton submitSymptomFillButton;
    private javax.swing.JButton submitThisPictureButton;
    private javax.swing.JButton submitVitalSignsFillButton;
    private javax.swing.JPanel symptomCard9;
    private javax.swing.JPanel symptomHistoryCard4;
    private javax.swing.JMenuItem symptomMenuItem;
    private javax.swing.JMenuItem symtomHistoryMenuItem;
    private javax.swing.JPanel uploadPictureCard10;
    private javax.swing.JLabel uploadPictureLabel;
    private javax.swing.JMenu uploadPictureMenu;
    private javax.swing.JMenuItem uploadPictureMenuItem;
    private javax.swing.JPanel vitalSignHistoryCard3;
    private javax.swing.JMenuItem vitalSignHistoryMenuItem;
    private javax.swing.JPanel vitalSignsCard8;
    private javax.swing.JMenuItem vitalSignsMenuItem;
    private javax.swing.JTextField weightFillVitalSignsTextField;
    // End of variables declaration//GEN-END:variables
}