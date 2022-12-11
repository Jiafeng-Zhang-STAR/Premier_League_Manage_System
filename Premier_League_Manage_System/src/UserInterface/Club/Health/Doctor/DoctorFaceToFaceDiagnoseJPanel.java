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
import static java.lang.Float.parseFloat;
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
    String appointmentDate;
    
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
        solutionHistoryMenuItem = new javax.swing.JMenuItem();
        diagnoseMenu = new javax.swing.JMenu();
        vitalSignsMenuItem = new javax.swing.JMenuItem();
        symptomMenuItem = new javax.swing.JMenuItem();
        uploadPictureMenu = new javax.swing.JMenu();
        uploadPictureMenuItem = new javax.swing.JMenuItem();
        solutionMenu = new javax.swing.JMenu();
        solutionMenuItem = new javax.swing.JMenuItem();
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
        jLabel25 = new javax.swing.JLabel();
        patientAgeLabel = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        patientGenderLabel = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        patientZipLabel = new javax.swing.JLabel();
        patientGNationLabel = new javax.swing.JLabel();
        patientAddressLabel = new javax.swing.JLabel();
        patientNameLabel = new javax.swing.JLabel();
        vitalSignHistoryCard3 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        vitalSignsTable = new javax.swing.JTable();
        symptomHistoryCard4 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        symptomTable = new javax.swing.JTable();
        medicalPictureHistoryCard5 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        viewPictureTable = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        chooseToViewPicture = new javax.swing.JButton();
        viewPictureLabel = new javax.swing.JLabel();
        solutionHistoryCard7 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        solutionTable = new javax.swing.JTable();
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
        solutionCard12 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        editSolutionFillButton = new javax.swing.JButton();
        medicine1ComboBox = new javax.swing.JComboBox<>();
        submitSolutionFillButton = new javax.swing.JButton();
        medicine2ComboBox = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        mainSymptom2FilljScrollPane1 = new javax.swing.JScrollPane();
        additionalMedicinejTextPane = new javax.swing.JTextPane();
        jLabel37 = new javax.swing.JLabel();
        playerSymptomFillNameLabel1 = new javax.swing.JLabel();
        saveSolutionFillButton = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        medicine3ComboBox = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        StatusComboBox = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        resultComboBox = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        mainSymptom2FilljScrollPane2 = new javax.swing.JScrollPane();
        solutionjTextPane = new javax.swing.JTextPane();

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
        uploadPictureMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPictureMenuActionPerformed(evt);
            }
        });

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

        solutionMenuItem.setText("Fill Solution");
        solutionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionMenuItemActionPerformed(evt);
            }
        });
        solutionMenu.add(solutionMenuItem);

        faceToFaceMenuBar.add(solutionMenu);

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

        backgroundPictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TheSystem/Common/SelfDesignIcon/700_565_selfDesigned_SoccerField_NoStrips_Card.png"))); // NOI18N
        backgroundPictureLabel.setAlignmentY(0.0F);

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

        jLabel25.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Patient Basic Information");

        patientAgeLabel.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        patientAgeLabel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel44.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("gender :");

        jLabel45.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Name :");

        patientGenderLabel.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        patientGenderLabel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel48.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("age :");

        jLabel49.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("nation :");

        jLabel50.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("address :");

        jLabel51.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("zip :");

        patientZipLabel.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        patientZipLabel.setForeground(new java.awt.Color(255, 255, 255));

        patientGNationLabel.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        patientGNationLabel.setForeground(new java.awt.Color(255, 255, 255));

        patientAddressLabel.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        patientAddressLabel.setForeground(new java.awt.Color(255, 255, 255));

        patientNameLabel.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        patientNameLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout basicInfoCard2Layout = new javax.swing.GroupLayout(basicInfoCard2);
        basicInfoCard2.setLayout(basicInfoCard2Layout);
        basicInfoCard2Layout.setHorizontalGroup(
            basicInfoCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicInfoCard2Layout.createSequentialGroup()
                .addGroup(basicInfoCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(basicInfoCard2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(basicInfoCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(basicInfoCard2Layout.createSequentialGroup()
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(patientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(basicInfoCard2Layout.createSequentialGroup()
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(patientAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(basicInfoCard2Layout.createSequentialGroup()
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(patientGNationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(basicInfoCard2Layout.createSequentialGroup()
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(patientAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(basicInfoCard2Layout.createSequentialGroup()
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(patientZipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(basicInfoCard2Layout.createSequentialGroup()
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(patientGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(basicInfoCard2Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel25)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        basicInfoCard2Layout.setVerticalGroup(
            basicInfoCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicInfoCard2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(basicInfoCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(basicInfoCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basicInfoCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basicInfoCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientGNationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basicInfoCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(basicInfoCard2Layout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(basicInfoCard2Layout.createSequentialGroup()
                        .addComponent(patientAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(patientZipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        cards.add(basicInfoCard2, "card2");

        vitalSignHistoryCard3.setBackground(new java.awt.Color(0, 139, 69));
        vitalSignHistoryCard3.setMaximumSize(new java.awt.Dimension(700, 565));
        vitalSignHistoryCard3.setMinimumSize(new java.awt.Dimension(700, 565));

        jLabel34.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("vital signs History");

        vitalSignsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "date", "temperature", "pluse rate", "breath", "blood pressure", "oxygen saturation", "height", "weight"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(vitalSignsTable);

        javax.swing.GroupLayout vitalSignHistoryCard3Layout = new javax.swing.GroupLayout(vitalSignHistoryCard3);
        vitalSignHistoryCard3.setLayout(vitalSignHistoryCard3Layout);
        vitalSignHistoryCard3Layout.setHorizontalGroup(
            vitalSignHistoryCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vitalSignHistoryCard3Layout.createSequentialGroup()
                .addGroup(vitalSignHistoryCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vitalSignHistoryCard3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vitalSignHistoryCard3Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel34)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        vitalSignHistoryCard3Layout.setVerticalGroup(
            vitalSignHistoryCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vitalSignHistoryCard3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        cards.add(vitalSignHistoryCard3, "card2");

        symptomHistoryCard4.setBackground(new java.awt.Color(0, 139, 69));
        symptomHistoryCard4.setMaximumSize(new java.awt.Dimension(700, 565));
        symptomHistoryCard4.setMinimumSize(new java.awt.Dimension(700, 565));

        jLabel39.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Symptom History:");

        symptomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Disease Type", "Detail Disease", "Main Symptom1", "Main Symptom2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(symptomTable);

        javax.swing.GroupLayout symptomHistoryCard4Layout = new javax.swing.GroupLayout(symptomHistoryCard4);
        symptomHistoryCard4.setLayout(symptomHistoryCard4Layout);
        symptomHistoryCard4Layout.setHorizontalGroup(
            symptomHistoryCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(symptomHistoryCard4Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel39)
                .addContainerGap(280, Short.MAX_VALUE))
            .addGroup(symptomHistoryCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(symptomHistoryCard4Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        symptomHistoryCard4Layout.setVerticalGroup(
            symptomHistoryCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(symptomHistoryCard4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(490, Short.MAX_VALUE))
            .addGroup(symptomHistoryCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(symptomHistoryCard4Layout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(93, Short.MAX_VALUE)))
        );

        cards.add(symptomHistoryCard4, "card2");

        medicalPictureHistoryCard5.setBackground(new java.awt.Color(0, 139, 69));
        medicalPictureHistoryCard5.setMaximumSize(new java.awt.Dimension(700, 565));
        medicalPictureHistoryCard5.setMinimumSize(new java.awt.Dimension(700, 565));

        jLabel40.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Medical Picture History:");

        viewPictureTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "date", "Picture Number", "Relative Path"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(viewPictureTable);

        jLabel42.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Choose One Records :");

        chooseToViewPicture.setText(" View Picture");
        chooseToViewPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseToViewPictureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout medicalPictureHistoryCard5Layout = new javax.swing.GroupLayout(medicalPictureHistoryCard5);
        medicalPictureHistoryCard5.setLayout(medicalPictureHistoryCard5Layout);
        medicalPictureHistoryCard5Layout.setHorizontalGroup(
            medicalPictureHistoryCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medicalPictureHistoryCard5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addGap(225, 225, 225))
            .addGroup(medicalPictureHistoryCard5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(medicalPictureHistoryCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseToViewPicture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(medicalPictureHistoryCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(medicalPictureHistoryCard5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(medicalPictureHistoryCard5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(viewPictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        medicalPictureHistoryCard5Layout.setVerticalGroup(
            medicalPictureHistoryCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicalPictureHistoryCard5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medicalPictureHistoryCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(medicalPictureHistoryCard5Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(chooseToViewPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewPictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        cards.add(medicalPictureHistoryCard5, "card2");

        solutionHistoryCard7.setBackground(new java.awt.Color(0, 139, 69));
        solutionHistoryCard7.setMaximumSize(new java.awt.Dimension(700, 565));
        solutionHistoryCard7.setMinimumSize(new java.awt.Dimension(700, 565));

        jLabel41.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Solution History");

        solutionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "date", "medicine1", "medicine2", "medicine3", "add medicine", "solution", "result", "status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(solutionTable);

        javax.swing.GroupLayout solutionHistoryCard7Layout = new javax.swing.GroupLayout(solutionHistoryCard7);
        solutionHistoryCard7.setLayout(solutionHistoryCard7Layout);
        solutionHistoryCard7Layout.setHorizontalGroup(
            solutionHistoryCard7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solutionHistoryCard7Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel41)
                .addContainerGap(284, Short.MAX_VALUE))
            .addGroup(solutionHistoryCard7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(solutionHistoryCard7Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        solutionHistoryCard7Layout.setVerticalGroup(
            solutionHistoryCard7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solutionHistoryCard7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel41)
                .addContainerGap(497, Short.MAX_VALUE))
            .addGroup(solutionHistoryCard7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(solutionHistoryCard7Layout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(93, Short.MAX_VALUE)))
        );

        cards.add(solutionHistoryCard7, "card2");

        vitalSignsCard8.setBackground(new java.awt.Color(0, 139, 69));
        vitalSignsCard8.setMaximumSize(new java.awt.Dimension(700, 565));
        vitalSignsCard8.setMinimumSize(new java.awt.Dimension(700, 565));

        bodyTemperatureFillVitalSignsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodyTemperatureFillVitalSignsTextFieldActionPerformed(evt);
            }
        });

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
        diseaseTypejComboBox.setMaximumSize(new java.awt.Dimension(240, 30));
        diseaseTypejComboBox.setMinimumSize(new java.awt.Dimension(240, 30));
        diseaseTypejComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                diseaseTypejComboBoxItemStateChanged(evt);
            }
        });

        detailDiseasejComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        detailDiseasejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select Disease Type First" }));
        detailDiseasejComboBox.setMaximumSize(new java.awt.Dimension(240, 30));
        detailDiseasejComboBox.setMinimumSize(new java.awt.Dimension(240, 30));
        detailDiseasejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailDiseasejComboBoxActionPerformed(evt);
            }
        });

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

        solutionCard12.setBackground(new java.awt.Color(0, 139, 69));
        solutionCard12.setMaximumSize(new java.awt.Dimension(700, 565));
        solutionCard12.setMinimumSize(new java.awt.Dimension(700, 565));

        jLabel33.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Normal Medicine 1 :");

        editSolutionFillButton.setText("Edit");
        editSolutionFillButton.setMaximumSize(new java.awt.Dimension(80, 28));
        editSolutionFillButton.setMinimumSize(new java.awt.Dimension(80, 28));
        editSolutionFillButton.setPreferredSize(new java.awt.Dimension(80, 28));
        editSolutionFillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSolutionFillButtonActionPerformed(evt);
            }
        });

        medicine1ComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        medicine1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Losartan", "Antibiotics", "Albuterol", "Antihistamines" }));
        medicine1ComboBox.setMaximumSize(new java.awt.Dimension(240, 30));
        medicine1ComboBox.setMinimumSize(new java.awt.Dimension(240, 30));

        submitSolutionFillButton.setText("Submit");
        submitSolutionFillButton.setMaximumSize(new java.awt.Dimension(80, 28));
        submitSolutionFillButton.setMinimumSize(new java.awt.Dimension(80, 28));
        submitSolutionFillButton.setPreferredSize(new java.awt.Dimension(80, 28));
        submitSolutionFillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitSolutionFillButtonActionPerformed(evt);
            }
        });

        medicine2ComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        medicine2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gabapentin", "Omeprazole", "Atorvastatin" }));
        medicine2ComboBox.setMaximumSize(new java.awt.Dimension(240, 30));
        medicine2ComboBox.setMinimumSize(new java.awt.Dimension(240, 30));

        jLabel35.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Normal Medicine 2 :");

        jLabel36.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Additional Medicine :");

        mainSymptom2FilljScrollPane1.setViewportView(additionalMedicinejTextPane);

        jLabel37.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Please fill in the prescription, solution , status and result of player :");

        playerSymptomFillNameLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        playerSymptomFillNameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        playerSymptomFillNameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerSymptomFillNameLabel1.setMaximumSize(new java.awt.Dimension(181, 33));
        playerSymptomFillNameLabel1.setMinimumSize(new java.awt.Dimension(181, 33));
        playerSymptomFillNameLabel1.setPreferredSize(new java.awt.Dimension(181, 33));

        saveSolutionFillButton.setText("Save");
        saveSolutionFillButton.setMaximumSize(new java.awt.Dimension(80, 28));
        saveSolutionFillButton.setMinimumSize(new java.awt.Dimension(80, 28));
        saveSolutionFillButton.setPreferredSize(new java.awt.Dimension(80, 28));
        saveSolutionFillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSolutionFillButtonActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Normal Medicine 3 :");

        medicine3ComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        medicine3ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Synthroid", "Crestor", "Ventolin", "Nexium", "Advair Diskus", "Lantus Solostar", "Vyvanse", "Lyrica", "Spiriva Handihaler", "Januvia" }));
        medicine3ComboBox.setMaximumSize(new java.awt.Dimension(240, 30));
        medicine3ComboBox.setMinimumSize(new java.awt.Dimension(240, 30));

        jLabel46.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Status :");

        StatusComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        StatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Finish", "Cancel", "Waiting", "Agree", "Processing" }));
        StatusComboBox.setMaximumSize(new java.awt.Dimension(240, 30));
        StatusComboBox.setMinimumSize(new java.awt.Dimension(240, 30));

        jLabel47.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Result :");

        resultComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resultComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Resolve", "Need to review", "Transfer to hospital", "Stop play and rest" }));
        resultComboBox.setMaximumSize(new java.awt.Dimension(240, 30));
        resultComboBox.setMinimumSize(new java.awt.Dimension(240, 30));

        jLabel38.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Additional Solution :");

        mainSymptom2FilljScrollPane2.setViewportView(solutionjTextPane);

        javax.swing.GroupLayout solutionCard12Layout = new javax.swing.GroupLayout(solutionCard12);
        solutionCard12.setLayout(solutionCard12Layout);
        solutionCard12Layout.setHorizontalGroup(
            solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solutionCard12Layout.createSequentialGroup()
                .addGroup(solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, solutionCard12Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(solutionCard12Layout.createSequentialGroup()
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(medicine2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(solutionCard12Layout.createSequentialGroup()
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(medicine1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(solutionCard12Layout.createSequentialGroup()
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(medicine3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(solutionCard12Layout.createSequentialGroup()
                                .addComponent(saveSolutionFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(editSolutionFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(submitSolutionFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(solutionCard12Layout.createSequentialGroup()
                                    .addGroup(solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(StatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(resultComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(solutionCard12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainSymptom2FilljScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainSymptom2FilljScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solutionCard12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solutionCard12Layout.createSequentialGroup()
                        .addComponent(playerSymptomFillNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solutionCard12Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(41, 41, 41))))
        );
        solutionCard12Layout.setVerticalGroup(
            solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solutionCard12Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerSymptomFillNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicine1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicine2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicine3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainSymptom2FilljScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(mainSymptom2FilljScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(solutionCard12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveSolutionFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editSolutionFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitSolutionFillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        cards.add(solutionCard12, "card12");

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
                
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/premierleague";
            String username = "root";
            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            String sql = "SELECT * FROM system_user_info WHERE "+
                         "username=\'"+this.appointmentHistoryPlayerUserName+"\'";
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
                
                
                patientNameLabel.setText(resultSet.getString("name"));
                patientGenderLabel.setText(resultSet.getString("gender"));
                patientAgeLabel.setText(resultSet.getString("age"));
                patientGNationLabel.setText(resultSet.getString("nation"));
                patientAddressLabel.setText(resultSet.getString("address"));
                patientZipLabel.setText(resultSet.getString("zip"));
                
          }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        } 
                
    }//GEN-LAST:event_basicInfoMenuItemActionPerformed

    private void vitalSignHistoryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitalSignHistoryMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(vitalSignHistoryCard3);
        cards.repaint();
        cards.revalidate();
        
        DefaultTableModel model = (DefaultTableModel) vitalSignsTable.getModel();
        model.setRowCount(0);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/premierleague";
            String username = "root";
            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            String sql = "SELECT * FROM club_diagnose_appointment WHERE "+
                         "player_id=\'"+appointmentHistoryPlayerUserName+"\'";
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
                
                Object[] row = new Object[8];
                
                row[0] = resultSet.getObject("date");
                
                row[1] = resultSet.getObject("body_temperature");

                row[2] = resultSet.getObject("pluse_rate");
               
                row[3] = resultSet.getObject("breathing_rate");
                row[4] = resultSet.getObject("blood_pressure");
                row[5] = resultSet.getObject("oxygen_saturation");
                row[6] = resultSet.getObject("height");
                row[7] = resultSet.getObject("weight");
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
    }//GEN-LAST:event_vitalSignHistoryMenuItemActionPerformed

    private void symtomHistoryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symtomHistoryMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(symptomHistoryCard4);
        cards.repaint();
        cards.revalidate();
        
        DefaultTableModel model = (DefaultTableModel) symptomTable.getModel();
        model.setRowCount(0);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/premierleague";
            String username = "root";
            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            String sql = "SELECT * FROM club_diagnose_appointment WHERE "+
                         "player_id=\'"+appointmentHistoryPlayerUserName+"\'";
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
                
                Object[] row = new Object[8];
                
                row[0] = resultSet.getObject("date");
                
                row[1] = resultSet.getObject("diseaseType");
                
                row[2] = resultSet.getObject("detailDisease");

                row[3] = resultSet.getObject("mainSymptom1");
               
                row[4] = resultSet.getObject("mainSymptom2");
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
    }//GEN-LAST:event_symtomHistoryMenuItemActionPerformed

    private void medicalPictureHistoryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalPictureHistoryMenuItemActionPerformed
        // TODO add your handling code here:
        
        cards.removeAll();
        cards.add(medicalPictureHistoryCard5);
        cards.repaint();
        cards.revalidate();
        DefaultTableModel model = (DefaultTableModel) viewPictureTable.getModel();
        model.setRowCount(0);
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
                
                Object[] row = new Object[3];
                
                row[0] = resultSet.getObject("date");
                
                row[1] = resultSet.getObject("pictureNumberName");

                row[2] = resultSet.getObject("path");
               
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
    }//GEN-LAST:event_medicalPictureHistoryMenuItemActionPerformed

    private void solutionHistoryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionHistoryMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(solutionHistoryCard7);
        cards.repaint();
        cards.revalidate();
        
        DefaultTableModel model = (DefaultTableModel) solutionTable.getModel();
        model.setRowCount(0);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/premierleague";
            String username = "root";
            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            String sql = "SELECT * FROM club_diagnose_appointment WHERE "+
                         "player_id=\'"+appointmentHistoryPlayerUserName+"\'";
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
                
                Object[] row = new Object[8];
                
                row[0] = resultSet.getObject("date");
                
                row[1] = resultSet.getObject("medicine1");

                row[2] = resultSet.getObject("medicine2");
               
                row[3] = resultSet.getObject("medicine3");
                row[4] = resultSet.getObject("additionalMedicine");
                row[5] = resultSet.getObject("solution");
                row[6] = resultSet.getObject("result");
                row[7] = resultSet.getObject("status");
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

    private void solutionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionMenuItemActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(solutionCard12);
        cards.repaint();
        cards.revalidate();
        
    }//GEN-LAST:event_solutionMenuItemActionPerformed

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
        this.appointmentDate=String.valueOf(model.getValueAt(selectedRowIndex, 3));
        
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

    private boolean containNumber(String a){
        boolean flag = false;
        
        for(int i = 0;i<a.length();i++){
            char c = a.charAt(i);
            
            if(c>48 & c<57){
                flag = true;
                
            }
        }
        return flag;
    }
    
    private boolean containLetter(String a){
        boolean flag = false;
        for(int i = 0;i<a.length();i++){
            char c = a.charAt(i);
            if(!Character.isDigit(c)){
                flag = true;
            }
        }
        return flag;
    } 
    
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

            if(bodyTemperatureFillVitalSignsTextField.getText().length()==0 ||
               plusRateInFillVitalSignsTextField.getText().length()==0 ||
               breathingRateFillVitalSignsTextField.getText().length()==0 ||
                bloodPressureFillVitalSignsTextField.getText().length()==0 ||
                oxygenSaturationFillVitalSignsTextField.getText().length()==0 ||
                heightFillVitalSignsTextField.getText().length()==0 ||
                weightFillVitalSignsTextField.getText().length()==0
                ){JOptionPane.showMessageDialog(submitVitalSignsFillButton, "Please fill the empty field");}
            else{
            float bodyTemperatureFillVitalSignsTemp = parseFloat(bodyTemperatureFillVitalSignsTextField.getText());
            float plusRateInFillVitalSignsTextFieldTemp = parseFloat(plusRateInFillVitalSignsTextField.getText());
            float breathingRateFillVitalSignsTextFieldTemp = parseFloat(breathingRateFillVitalSignsTextField.getText());
            float bloodPressureFillVitalSignsTextFieldTemp = parseFloat(bloodPressureFillVitalSignsTextField.getText());
            float oxygenSaturationFillVitalSignsTextFieldTemp = parseFloat(oxygenSaturationFillVitalSignsTextField.getText());
            float heightFillVitalSignsTextFieldTemp = parseFloat(heightFillVitalSignsTextField.getText());
            float weightFillVitalSignsTextFieldTemp = parseFloat(weightFillVitalSignsTextField.getText());

            
            if(this.containNumber(bodyTemperatureFillVitalSignsTextField.getText())){
                if(this.containNumber(plusRateInFillVitalSignsTextField.getText())){
                    if(this.containNumber(breathingRateFillVitalSignsTextField.getText())){
                        if(this.containNumber(bloodPressureFillVitalSignsTextField.getText())){
                            if(this.containNumber(oxygenSaturationFillVitalSignsTextField.getText())){
                                 if(this.containNumber(heightFillVitalSignsTextField.getText())){
                                     if(this.containNumber(weightFillVitalSignsTextField.getText())){
 if(((bodyTemperatureFillVitalSignsTemp>-40)&&(bodyTemperatureFillVitalSignsTemp<60))&&((plusRateInFillVitalSignsTextFieldTemp>-1)&&(plusRateInFillVitalSignsTextFieldTemp<400))){
     if(((breathingRateFillVitalSignsTextFieldTemp>-1)&&(breathingRateFillVitalSignsTextFieldTemp<190))&&((bloodPressureFillVitalSignsTextFieldTemp>-1)&&(bloodPressureFillVitalSignsTextFieldTemp<280))){
         if(((oxygenSaturationFillVitalSignsTextFieldTemp>-1)&&(oxygenSaturationFillVitalSignsTextFieldTemp<110))&&((heightFillVitalSignsTextFieldTemp>20)&&(heightFillVitalSignsTextFieldTemp<300))){
             if((weightFillVitalSignsTextFieldTemp>5)&&(weightFillVitalSignsTextFieldTemp<400)){
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
             else
             {
                 JOptionPane.showMessageDialog(submitVitalSignsFillButton, "c cm kg and so on, Please enter correct value area! Too big or too small(oxy genSaturation<110 Temperature<60)");
             }
         }
         else{
         JOptionPane.showMessageDialog(submitVitalSignsFillButton, "c cm kg and so on, Please enter correct value area! Too big or too small oxy genSaturation<110 Temperature<60");
         }
     }
     else{
         JOptionPane.showMessageDialog(submitVitalSignsFillButton, "c cm kg and so on, Please enter correct value area! Too big or too small oxy genSaturation<110 Temperature<60");
     }
 }
 else
 {
 JOptionPane.showMessageDialog(submitVitalSignsFillButton, "c cm kg and so on, Please enter correct value area! Too big or too small oxy genSaturation<110 Temperature<60");
 }

                                    }
                                     else{JOptionPane.showMessageDialog(submitVitalSignsFillButton, "These date must be numbers");}
                                }else{JOptionPane.showMessageDialog(submitVitalSignsFillButton, "These date must be numbers");}
                            }else{JOptionPane.showMessageDialog(submitVitalSignsFillButton, "These date must be numbers");}
                        }else{JOptionPane.showMessageDialog(submitVitalSignsFillButton, "These date must be numbers");}
                    }else{JOptionPane.showMessageDialog(submitVitalSignsFillButton, "These date must be numbers");}
                }else{JOptionPane.showMessageDialog(submitVitalSignsFillButton, "These date must be numbers");}
            }else{JOptionPane.showMessageDialog(submitVitalSignsFillButton, "These date must be numbers");}
            
            
        }}
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

                String sql = "INSERT INTO club_diagnose_medical_picture (appointment_id, pictureNumberName, date, path) VALUES ("+
                "\'"+this.appointmentHistoryID+"\', "+
                "\'"+pictureNumberName_write_temp+"\', "+
                "\'"+this.appointmentDate+"\', "+
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
            chooseAPictureButton.setEnabled(true);
            reselectPictureButton.setEnabled(false);
            submitThisPictureButton.setEnabled(false);
            resizeImageToBackground(null, uploadPictureLabel);
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

    private void editSolutionFillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSolutionFillButtonActionPerformed
        // TODO add your handling code here:
 
        medicine1ComboBox.setEnabled(true);
        medicine2ComboBox.setEnabled(true);
        medicine3ComboBox.setEnabled(true);
        additionalMedicinejTextPane.setEnabled(true);
        solutionjTextPane.setEnabled(true);
        StatusComboBox.setEnabled(true);
        resultComboBox.setEnabled(true);
        
        saveSolutionFillButton.setEnabled(true);
        editSolutionFillButton.setEnabled(false);
        submitSolutionFillButton.setEnabled(false);
    }//GEN-LAST:event_editSolutionFillButtonActionPerformed

    private void submitSolutionFillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitSolutionFillButtonActionPerformed
        // TODO add your handling code here:
            
          if(this.appointmentHistoryID != 0){
            medicine1ComboBox.setEnabled(true);
            medicine2ComboBox.setEnabled(true);
            medicine3ComboBox.setEnabled(true);
            additionalMedicinejTextPane.setEnabled(true);
            solutionjTextPane.setEnabled(true);
            StatusComboBox.setEnabled(true);
            resultComboBox.setEnabled(true);
            
            saveSolutionFillButton.setEnabled(true);
            editSolutionFillButton.setEnabled(false);
            submitSolutionFillButton.setEnabled(false);

            
            String medicine1ComboBoxTemp = medicine1ComboBox.getSelectedItem().toString();
            String medicine2ComboBoxTemp = medicine2ComboBox.getSelectedItem().toString();
            String medicine3ComboBoxTemp = medicine3ComboBox.getSelectedItem().toString();
            
            
            String additionalMedicinejTextPaneTemp = additionalMedicinejTextPane.getText();
            String solutionjTextPaneTemp = solutionjTextPane.getText();
            
            String StatusComboBoxTemp = StatusComboBox.getSelectedItem().toString();
            String resultComboBoxTemp = resultComboBox.getSelectedItem().toString();
            
            
            medicine1ComboBox.setSelectedIndex(-1);
            medicine2ComboBox.setSelectedIndex(-1);
            medicine3ComboBox.setSelectedIndex(-1);
           
            additionalMedicinejTextPane.setText("");
            solutionjTextPane.setText("");
            
            StatusComboBox.setSelectedIndex(-1);
            resultComboBox.setSelectedIndex(-1);

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/premierleague";
                String username = "root";
                String password = "abcd1234!";
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();
           
                String sql = "UPDATE club_diagnose_appointment SET "+
                             "medicine1=\'"+medicine1ComboBoxTemp+"\', "+
                             "medicine2=\'"+medicine2ComboBoxTemp+"\', "+
                             "medicine3=\'"+medicine3ComboBoxTemp+"\', "+
                             "additionalMedicine=\'"+additionalMedicinejTextPaneTemp+"\', "+
                             "solution=\'"+solutionjTextPaneTemp+"\', "+
                             "status=\'"+StatusComboBoxTemp+"\', "+
                             "result=\'"+resultComboBoxTemp+"\' "+
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
            medicine1ComboBox.setEnabled(true);
            medicine2ComboBox.setEnabled(true);
            medicine3ComboBox.setEnabled(true);
            additionalMedicinejTextPane.setEnabled(true);
            solutionjTextPane.setEnabled(true);
            StatusComboBox.setEnabled(true);
            resultComboBox.setEnabled(true);
            
            saveSolutionFillButton.setEnabled(true);
            editSolutionFillButton.setEnabled(false);
            submitSolutionFillButton.setEnabled(false);
        }
        
    }//GEN-LAST:event_submitSolutionFillButtonActionPerformed

    private void saveSolutionFillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSolutionFillButtonActionPerformed
        // TODO add your handling code here:
        
        medicine1ComboBox.setEnabled(false);
        medicine2ComboBox.setEnabled(false);
        medicine3ComboBox.setEnabled(false);
        additionalMedicinejTextPane.setEnabled(false);
        solutionjTextPane.setEnabled(false);
        StatusComboBox.setEnabled(false);
        resultComboBox.setEnabled(false);
        
        saveSolutionFillButton.setEnabled(false);
        editSolutionFillButton.setEnabled(true);
        submitSolutionFillButton.setEnabled(true); 
         
    }//GEN-LAST:event_saveSolutionFillButtonActionPerformed

    private void bodyTemperatureFillVitalSignsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodyTemperatureFillVitalSignsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bodyTemperatureFillVitalSignsTextFieldActionPerformed

    private void detailDiseasejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailDiseasejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detailDiseasejComboBoxActionPerformed

    private void chooseToViewPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseToViewPictureActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = this.viewPictureTable.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(selectAppointmentButton, "Please select an appointment first!");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) this.viewPictureTable.getModel();
        
        String path = String.valueOf(model.getValueAt(selectedRowIndex, 2));
        
        resizeImageToBackground(path,viewPictureLabel);
    }//GEN-LAST:event_chooseToViewPictureActionPerformed

    private void uploadPictureMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPictureMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadPictureMenuActionPerformed


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
//          System.out.println("Reading complete.");
          }
        catch(IOException e){
//            System.out.println("Error: "+e);
          }
        //write picture
        try{
            file = new File(outputPathAndName);
            ImageIO.write(image, fileFormatSuffix, file);
//            System.out.println("Writing complete.");
        }
        catch(IOException e){
//            System.out.println("Error: "+e);
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
    private javax.swing.JComboBox<String> StatusComboBox;
    private javax.swing.JTextPane additionalMedicinejTextPane;
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
    private javax.swing.JButton chooseToViewPicture;
    private javax.swing.JComboBox<String> detailDiseasejComboBox;
    private javax.swing.JMenu diagnoseMenu;
    private javax.swing.JComboBox<String> diseaseTypejComboBox;
    private javax.swing.JButton editSelectedAppointmentButton;
    private javax.swing.JButton editSolutionFillButton;
    private javax.swing.JButton editSymptomFillButton;
    private javax.swing.JButton editVitalSignsFillButton;
    private javax.swing.JPanel faceToFaceMainjPanel;
    private javax.swing.JMenuBar faceToFaceMenuBar;
    private javax.swing.JButton freshButton;
    private javax.swing.JTextField heightFillVitalSignsTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.ButtonGroup justSetColor;
    private javax.swing.JScrollPane mainSymptom1FilljScrollPane;
    private javax.swing.JTextPane mainSymptom1FilljTextPane;
    private javax.swing.JScrollPane mainSymptom2FilljScrollPane;
    private javax.swing.JScrollPane mainSymptom2FilljScrollPane1;
    private javax.swing.JScrollPane mainSymptom2FilljScrollPane2;
    private javax.swing.JTextPane mainSymptom2FilljTextPane;
    private javax.swing.JPanel medicalPictureHistoryCard5;
    private javax.swing.JMenuItem medicalPictureHistoryMenuItem;
    private javax.swing.JComboBox<String> medicine1ComboBox;
    private javax.swing.JComboBox<String> medicine2ComboBox;
    private javax.swing.JComboBox<String> medicine3ComboBox;
    private javax.swing.JTextField oxygenSaturationFillVitalSignsTextField;
    private javax.swing.JLabel patientAddressLabel;
    private javax.swing.JLabel patientAgeLabel;
    private javax.swing.JLabel patientGNationLabel;
    private javax.swing.JLabel patientGenderLabel;
    private javax.swing.JLabel patientNameLabel;
    private javax.swing.JLabel patientZipLabel;
    private javax.swing.JMenu playerInfoMenu;
    private javax.swing.JLabel playerPictureFillNameLabel;
    private javax.swing.JLabel playerPictureFillNumberLabel;
    private javax.swing.JLabel playerSymptomFillNameLabel;
    private javax.swing.JLabel playerSymptomFillNameLabel1;
    private javax.swing.JLabel playerVitalsignsFillNameLabel;
    private javax.swing.JTextField plusRateInFillVitalSignsTextField;
    private javax.swing.JButton reselectPictureButton;
    private javax.swing.JComboBox<String> resultComboBox;
    private javax.swing.JButton saveSolutionFillButton;
    private javax.swing.JButton saveSymptomFillButton;
    private javax.swing.JButton saveVitalSignsFillButton;
    private javax.swing.JButton selectAppointmentButton;
    private javax.swing.JPanel solutionCard12;
    private javax.swing.JPanel solutionHistoryCard7;
    private javax.swing.JMenuItem solutionHistoryMenuItem;
    private javax.swing.JMenu solutionMenu;
    private javax.swing.JMenuItem solutionMenuItem;
    private javax.swing.JTable solutionTable;
    private javax.swing.JTextPane solutionjTextPane;
    private javax.swing.JButton submitSolutionFillButton;
    private javax.swing.JButton submitSymptomFillButton;
    private javax.swing.JButton submitThisPictureButton;
    private javax.swing.JButton submitVitalSignsFillButton;
    private javax.swing.JPanel symptomCard9;
    private javax.swing.JPanel symptomHistoryCard4;
    private javax.swing.JMenuItem symptomMenuItem;
    private javax.swing.JTable symptomTable;
    private javax.swing.JMenuItem symtomHistoryMenuItem;
    private javax.swing.JPanel uploadPictureCard10;
    private javax.swing.JLabel uploadPictureLabel;
    private javax.swing.JMenu uploadPictureMenu;
    private javax.swing.JMenuItem uploadPictureMenuItem;
    private javax.swing.JLabel viewPictureLabel;
    private javax.swing.JTable viewPictureTable;
    private javax.swing.JPanel vitalSignHistoryCard3;
    private javax.swing.JMenuItem vitalSignHistoryMenuItem;
    private javax.swing.JPanel vitalSignsCard8;
    private javax.swing.JMenuItem vitalSignsMenuItem;
    private javax.swing.JTable vitalSignsTable;
    private javax.swing.JTextField weightFillVitalSignsTextField;
    // End of variables declaration//GEN-END:variables
}
