/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dentalclinic;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;





/**
 *
 * @author Dell
 */
public class PatientsForm extends javax.swing.JFrame {

    /**
     * Creates new form PatientsForm
     */
    
    Connection con = null;
    Statement st = null, st1 = null;
    ResultSet res = null, res1 = null;
    int key = 1;
    int patientID = 0;
    public PatientsForm() {
        initComponents();

        TableColumnModel columnModel = PatientsTbl.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(180);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(180);
        columnModel.getColumn(4).setPreferredWidth(150);
        columnModel.getColumn(5).setPreferredWidth(100);
        columnModel.getColumn(6).setPreferredWidth(180);

        PatientsTbl.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 25));
        PatientsTbl.getTableHeader().setOpaque(true);

        // Create a new instance of DefaultTableCellRenderer
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();

        // Set the background color
        headerRenderer.setBackground(new Color(2, 13, 41, 255));

        // Set the foreground color (font color)
        headerRenderer.setForeground(new Color(255, 255, 255)); // Set to white for example

        // Set the default renderer for the table header
        PatientsTbl.getTableHeader().setDefaultRenderer(headerRenderer);
        
        DisplayPatients();
        
        PatientCount();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        PatientName = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        Phone = new javax.swing.JTextField();
        PatientAllergies = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        PatientGender = new javax.swing.JComboBox<>();
        DOB = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        PatientAddress = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PatientsTbl = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(2, 13, 41));
        jLabel13.setText("Login:");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Downloads\\dental-logo.png")); // NOI18N

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(2, 13, 41));
        jButton1.setText("Login");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(2, 13, 41));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Downloads\\250x250.jpg")); // NOI18N

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Appointments");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Patients");

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Logout");

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Treatments");

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Prescriptions");

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Dashboard");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(32, 32, 32)
                .addComponent(jLabel14)
                .addGap(34, 34, 34)
                .addComponent(jLabel18)
                .addGap(42, 42, 42)
                .addComponent(jLabel19)
                .addGap(37, 37, 37)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(24, 24, 24))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(2, 13, 41));
        jLabel15.setText("Patients");

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(2, 13, 41));
        jLabel21.setText("Name:");

        PatientName.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        PatientName.setForeground(new java.awt.Color(2, 13, 41));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(2, 13, 41));
        jLabel22.setText("Phone:");

        Phone.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        Phone.setForeground(new java.awt.Color(2, 13, 41));

        PatientAllergies.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        PatientAllergies.setForeground(new java.awt.Color(2, 13, 41));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(2, 13, 41));
        jLabel23.setText("Address:");

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(2, 13, 41));
        jLabel24.setText("Gender:");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(2, 13, 41));
        jLabel25.setText("Date Of Birth:");

        PatientGender.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        PatientGender.setForeground(new java.awt.Color(2, 13, 41));
        PatientGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Rather not disclose" }));

        DOB.setForeground(new java.awt.Color(2, 13, 41));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(2, 13, 41));
        jLabel26.setText("Allergies:");

        PatientAddress.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        PatientAddress.setForeground(new java.awt.Color(2, 13, 41));

        PatientsTbl.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        PatientsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Patient's Name", "Phone", "Address", "Gender", "Allergies", "DOB"
            }
        ));
        PatientsTbl.setRowHeight(40);
        PatientsTbl.setSelectionBackground(new java.awt.Color(51, 153, 255));
        PatientsTbl.setSelectionForeground(new java.awt.Color(255, 255, 255));
        PatientsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientsTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PatientsTbl);

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(2, 13, 41));
        jButton2.setText("Delete");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(2, 13, 41));
        jButton3.setText("Add");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(2, 13, 41));
        jButton4.setText("Edit");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Downloads\\Oxygen-Icons.org-Oxygen-Actions-window-close-1-removebg-preview (2).png")); // NOI18N

        jButton6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(2, 13, 41));
        jButton6.setText("Clear All Fields");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)
                                    .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(PatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel24)
                                        .addComponent(PatientGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)
                                    .addComponent(PatientAllergies, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 283, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(37, 37, 37)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PatientAllergies)))))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if(PatientName.getText().isEmpty() || Phone.getText().isEmpty() || PatientAddress.getText().isEmpty() || 
                PatientAllergies.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "The text fields cant be empty. If you dont know some of the clients information"
                    + " you should write N/D(Not disclosed).");
        }else{
            try {
                PatientCount();
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/DentalClinicDatabase", "Dentist1", "DentalClinicDentist1");
                PreparedStatement add = con.prepareStatement("insert into PatientsTbl values(?, ?, ?, ?, ?, ?, ?)");
                add.setInt(1, patientID);
                add.setString(2, PatientName.getText());
                add.setString(3, Phone.getText());
                add.setString(4, PatientAddress.getText());;
                add.setString(5, PatientGender.getSelectedItem().toString());
                add.setString(6, PatientAllergies.getText());
                add.setString(7, DOB.getDate().toString());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Patient Successfully Added!");
                con.close();
                DisplayPatients();
                ClearAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void PatientsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientsTblMouseClicked
        DefaultTableModel model = (DefaultTableModel) PatientsTbl.getModel();
        int myIndex = PatientsTbl.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(myIndex, 0).toString());
        PatientName.setText(model.getValueAt(myIndex, 1).toString());
        Phone.setText(model.getValueAt(myIndex, 2).toString());
        PatientAddress.setText(model.getValueAt(myIndex, 3).toString());
        PatientGender.setSelectedItem(model.getValueAt(myIndex, 4).toString());
        PatientAllergies.setText(model.getValueAt(myIndex, 5).toString());
        Object value = model.getValueAt(myIndex, 6);
        SimpleDateFormat sdf = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
        Date date;
        try {
            date = sdf.parse((String) value);
            DOB.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(PatientsForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_PatientsTblMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
                if(key == 0){
            JOptionPane.showMessageDialog(this, "Patient needs to be selected!");
        }else{
            try {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/DentalClinicDatabase", "Dentist1", "DentalClinicDentist1");
                String query = "Update Dentist1.PatientsTbl set PatientName ='" + PatientName.getText() +
                         "'" + ", Phone ='" + Phone.getText() + "'" + ", PatientAddress ='" + PatientAddress.getText() + 
                        "'" + ", PatientGender ='" + PatientGender.getSelectedItem().toString() + "'" + ", PatientAllergies ='" +
                        PatientAllergies.getText() + "'" + ", DOB ='" + DOB.getDate().toString() + "'" + " where PatientID = " + key;
                Statement Update = con.createStatement();
                Update.execute(query);
                JOptionPane.showMessageDialog(this, "Patient Successfully Updated!");
                DisplayPatients();
                ClearAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if(key == 0){
            JOptionPane.showMessageDialog(this, "Patient needs to be selected!");
        }else{
            try {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/DentalClinicDatabase", "Dentist1", "DentalClinicDentist1");
                String query = "Delete from Dentist1.PatientsTbl where PatientID = " + key;
                Statement Delete = con.createStatement();
                Delete.execute(query);
                JOptionPane.showMessageDialog(this, "Patient Successfully Deleted!");
                DisplayPatients();
                ClearAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        ClearAll();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

private void ClearAll(){
    PatientName.setText("");
    Phone.setText("");
    PatientAddress.setText("");
    PatientGender.setSelectedItem("Male");
    PatientAllergies.setText("");
    Calendar currentDate = Calendar.getInstance();
    DOB.setCalendar(currentDate);
}
    
private void DisplayPatients(){
    try {
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/DentalClinicDatabase", "Dentist1", "DentalClinicDentist1");
        st = con.createStatement();
        res = st.executeQuery("SELECT * FROM Dentist1.PatientsTbl");

        // Set the table model only if it's not set yet
        if (PatientsTbl.getModel() == null) {
            PatientsTbl.setModel(DbUtils.resultSetToTableModel(res));
        } else {
            // If the table model is already set, just update the data
            ((DefaultTableModel) PatientsTbl.getModel()).setRowCount(0);
            while (res.next()) {
                Object[] row = new Object[res.getMetaData().getColumnCount()];
                for (int i = 0; i < row.length; i++) {
                    row[i] = res.getObject(i + 1);
                }
                ((DefaultTableModel) PatientsTbl.getModel()).addRow(row);
            }
        }
    } catch (Exception e) {
        e.printStackTrace(); // Handle exceptions properly in your application
    }
}

private void PatientCount(){
    try {
        st1 = con.createStatement();
        res1 = st1.executeQuery("Select Max(PatientID) from Dentist1.PatientsTbl");
        res1.next();
        patientID = res1.getInt(1) + 1;
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    
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
            java.util.logging.Logger.getLogger(PatientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DOB;
    private javax.swing.JTextField PatientAddress;
    private javax.swing.JTextField PatientAllergies;
    private javax.swing.JComboBox<String> PatientGender;
    private javax.swing.JTextField PatientName;
    private javax.swing.JTable PatientsTbl;
    private javax.swing.JTextField Phone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
