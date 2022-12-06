/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Club.Team.Player;

import java.text.SimpleDateFormat;
//import java.awt.Graphics;

/**
 *
 * @author Jiafeng
 */
public class PlayerHealthJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form DoctorHistoryJPanel
     */
    boolean calendarJPanelStatus = false;
    public PlayerHealthJPanel() {
//        Graphics g = jpanel1;
//        Graphics2D g2d=(Graphics2D) g;
//        g2d.drawLine(120, 50, 360, 50);
// 
//        g2d.draw(new Line2D.Double(59.2d, 99.8d, 419.1d, 99.8d));
        initComponents();
//        cardLayout = (CardLayout)(cards.getLayout());
//        cardLayout.show(cardjPanel, "jPanel1");
//        jTextField1.setName(String.valueOf(jCalendar1.getDate()));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cards = new javax.swing.JPanel();
        healthChatCard1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        onlineDiagnosisCard2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        appointmentCard3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        openCalendarButton4 = new javax.swing.JButton();
        saveDateButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        calendarJPanel = new javax.swing.JPanel();
        jCalendar = new com.toedter.calendar.JCalendar();
        chooseDate = new javax.swing.JButton();
        clearDate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(495, 600));
        setMinimumSize(new java.awt.Dimension(295, 600));
        setPreferredSize(new java.awt.Dimension(495, 600));

        cards.setMaximumSize(new java.awt.Dimension(460, 530));
        cards.setMinimumSize(new java.awt.Dimension(460, 530));
        cards.setPreferredSize(new java.awt.Dimension(460, 530));
        cards.setLayout(new java.awt.CardLayout());

        healthChatCard1.setMaximumSize(new java.awt.Dimension(460, 530));
        healthChatCard1.setMinimumSize(new java.awt.Dimension(460, 530));
        healthChatCard1.setPreferredSize(new java.awt.Dimension(460, 530));

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout healthChatCard1Layout = new javax.swing.GroupLayout(healthChatCard1);
        healthChatCard1.setLayout(healthChatCard1Layout);
        healthChatCard1Layout.setHorizontalGroup(
            healthChatCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(healthChatCard1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addContainerGap(259, Short.MAX_VALUE))
        );
        healthChatCard1Layout.setVerticalGroup(
            healthChatCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(healthChatCard1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel1)
                .addContainerGap(390, Short.MAX_VALUE))
        );

        cards.add(healthChatCard1, "card1");

        onlineDiagnosisCard2.setMaximumSize(new java.awt.Dimension(460, 530));
        onlineDiagnosisCard2.setMinimumSize(new java.awt.Dimension(460, 530));
        onlineDiagnosisCard2.setPreferredSize(new java.awt.Dimension(460, 530));

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout onlineDiagnosisCard2Layout = new javax.swing.GroupLayout(onlineDiagnosisCard2);
        onlineDiagnosisCard2.setLayout(onlineDiagnosisCard2Layout);
        onlineDiagnosisCard2Layout.setHorizontalGroup(
            onlineDiagnosisCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, onlineDiagnosisCard2Layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(195, 195, 195))
        );
        onlineDiagnosisCard2Layout.setVerticalGroup(
            onlineDiagnosisCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onlineDiagnosisCard2Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel2)
                .addContainerGap(325, Short.MAX_VALUE))
        );

        cards.add(onlineDiagnosisCard2, "card2");

        appointmentCard3.setMaximumSize(new java.awt.Dimension(460, 530));
        appointmentCard3.setMinimumSize(new java.awt.Dimension(460, 530));
        appointmentCard3.setPreferredSize(new java.awt.Dimension(460, 530));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        openCalendarButton4.setText("...");
        openCalendarButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openCalendarButton4ActionPerformed(evt);
            }
        });

        saveDateButton5.setText("Save");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        calendarJPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        calendarJPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCalendar.setDecorationBackgroundColor(new java.awt.Color(0, 0, 0));
        jCalendar.setSundayForeground(new java.awt.Color(255, 51, 51));
        jCalendar.setWeekOfYearVisible(false);
        jCalendar.setWeekdayForeground(new java.awt.Color(255, 255, 255));

        chooseDate.setText("Choose Date");
        chooseDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseDateActionPerformed(evt);
            }
        });

        clearDate.setText("Clear");

        javax.swing.GroupLayout calendarJPanelLayout = new javax.swing.GroupLayout(calendarJPanel);
        calendarJPanel.setLayout(calendarJPanelLayout);
        calendarJPanelLayout.setHorizontalGroup(
            calendarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calendarJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(calendarJPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(chooseDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearDate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        calendarJPanelLayout.setVerticalGroup(
            calendarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calendarJPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(calendarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(calendarJPanelLayout.createSequentialGroup()
                        .addComponent(chooseDate)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(clearDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout appointmentCard3Layout = new javax.swing.GroupLayout(appointmentCard3);
        appointmentCard3.setLayout(appointmentCard3Layout);
        appointmentCard3Layout.setHorizontalGroup(
            appointmentCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentCard3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appointmentCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendarJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(appointmentCard3Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openCalendarButton4)
                        .addGap(12, 12, 12)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveDateButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        appointmentCard3Layout.setVerticalGroup(
            appointmentCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentCard3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(appointmentCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saveDateButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(appointmentCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(openCalendarButton4))
                    .addComponent(jComboBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calendarJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        cards.add(appointmentCard3, "card3");

        jButton1.setText("<html>Health Chart</html>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<html>&nbsp&nbsp&nbsp&nbsp&nbsp Medical Assistance <br/>(remote online diagnosis)</html>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("<html>&#8202 Medical Assistance<br/>(make appointment)</html>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cards, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cards.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(healthChatCard1);
        cards.repaint();
        cards.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(onlineDiagnosisCard2);
        cards.repaint();
        cards.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        cards.removeAll();
        cards.add(appointmentCard3);
        cards.repaint();
        cards.revalidate();
        calendarJPanel.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void openCalendarButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openCalendarButton4ActionPerformed
        // TODO add your handling code here:
        if(!calendarJPanelStatus){
            calendarJPanel.setVisible(true);
            calendarJPanelStatus=true;
        }
        else{
            calendarJPanel.setVisible(false);
            calendarJPanelStatus=false;
        }
    }//GEN-LAST:event_openCalendarButton4ActionPerformed

    private void chooseDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseDateActionPerformed
        // TODO add your handling code here:
         SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
         String dateTime = dateForm.format(jCalendar.getDate());   
         jTextField1.setText(dateTime);
         calendarJPanelStatus = false;
         calendarJPanel.setVisible(false);
    }//GEN-LAST:event_chooseDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appointmentCard3;
    private javax.swing.JPanel calendarJPanel;
    private javax.swing.JPanel cards;
    private javax.swing.JButton chooseDate;
    private javax.swing.JButton clearDate;
    private javax.swing.JPanel healthChatCard1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel onlineDiagnosisCard2;
    private javax.swing.JButton openCalendarButton4;
    private javax.swing.JButton saveDateButton5;
    // End of variables declaration//GEN-END:variables
}
