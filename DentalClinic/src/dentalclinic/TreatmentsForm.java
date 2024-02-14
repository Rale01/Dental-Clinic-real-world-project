/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dentalclinic;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class TreatmentsForm extends javax.swing.JFrame {

    /**
     * Creates new form TreatmentsForm
     */
    
    Connection con = null;
    Statement st = null, st1 = null;
    ResultSet res = null, res1 = null;
    int treatmentID = 0;
    int key = 0;
    
    public TreatmentsForm() {
        initComponents();
        
        TreatmentLbl.setFont(new Font("Century Gothic", Font.PLAIN, 38));
        TreatmentLbl.setForeground(new Color(11, 112, 164, 255));
        
        TableColumnModel columnModel = TreatmentsTbl.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(180);
        columnModel.getColumn(2).setPreferredWidth(150);

        TreatmentsTbl.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 25));
        TreatmentsTbl.getTableHeader().setOpaque(true);

        // Create a new instance of DefaultTableCellRenderer
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();

        // Set the background color
        headerRenderer.setBackground(new Color(2, 13, 41, 255));

        // Set the foreground color (font color)
        headerRenderer.setForeground(new Color(255, 255, 255)); // Set to white for example

        // Set the default renderer for the table header
        TreatmentsTbl.getTableHeader().setDefaultRenderer(headerRenderer);
        
        
        DisplayTreatments();       
        TreatmentCount();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        TreatmentLbl = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        TreatmentName = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TreatmentsTbl = new javax.swing.JTable();
        DeleteBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        TreatmentCost = new javax.swing.JTextField();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ClearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(2, 13, 41));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Downloads\\250x250.jpg")); // NOI18N

        jLabel36.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Appointments");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel36MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel36MouseExited(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Patients");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel37MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel37MouseExited(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Logout");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel38MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel38MouseExited(evt);
            }
        });

        TreatmentLbl.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        TreatmentLbl.setForeground(new java.awt.Color(255, 255, 255));
        TreatmentLbl.setText("Treatments");

        jLabel40.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Prescriptions");
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel40MouseExited(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Dashboard");
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel41MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel41MouseExited(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(2, 13, 41));
        jLabel42.setText("Treatments");

        jLabel43.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(2, 13, 41));
        jLabel43.setText("Name:");

        TreatmentName.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        TreatmentName.setForeground(new java.awt.Color(2, 13, 41));

        jLabel44.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(2, 13, 41));
        jLabel44.setText("Cost:");

        TreatmentsTbl.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        TreatmentsTbl.setForeground(new java.awt.Color(2, 13, 41));
        TreatmentsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Cost"
            }
        ));
        TreatmentsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreatmentsTblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TreatmentsTbl);

        DeleteBtn.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(2, 13, 41));
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        AddBtn.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(2, 13, 41));
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(2, 13, 41));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        TreatmentCost.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        TreatmentCost.setForeground(new java.awt.Color(2, 13, 41));

        jComboBox8.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jComboBox8.setForeground(new java.awt.Color(2, 13, 41));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Downloads\\Oxygen-Icons.org-Oxygen-Actions-window-close-1-removebg-preview (2).png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        ClearBtn.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(2, 13, 41));
        ClearBtn.setText("Clear All Fields");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TreatmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TreatmentCost, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel44))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))))
                .addContainerGap())
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(296, 296, 296)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(448, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TreatmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TreatmentCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(AddBtn)
                    .addComponent(ClearBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(449, 449, 449)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(320, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel38)
                        .addGap(158, 158, 158))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel37))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel36))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(TreatmentLbl))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel40))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel41))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addGap(32, 32, 32)
                .addComponent(jLabel36)
                .addGap(34, 34, 34)
                .addComponent(TreatmentLbl)
                .addGap(42, 42, 42)
                .addComponent(jLabel40)
                .addGap(37, 37, 37)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(89, 89, 89))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        ClearAll();
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        ClearAll();// TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
                if(TreatmentName.getText().isEmpty() || TreatmentCost.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "The fields for treatment name and cost shouldnt be empty!");
        }else{
            try {
                TreatmentCount();
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/DentalClinicDatabase", "Dentist1", "DentalClinicDentist1");
                PreparedStatement add = con.prepareStatement("insert into TreatmentsTbl values(?, ?, ?)");
                add.setInt(1, treatmentID);
                add.setString(2, TreatmentName.getText());
                add.setInt(3, Integer.valueOf(TreatmentCost.getText()));
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Treatment Successfully Added!");
                con.close();
                DisplayTreatments();
                ClearAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void TreatmentsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreatmentsTblMouseClicked
        DefaultTableModel model = (DefaultTableModel) TreatmentsTbl.getModel();
        int myIndex = TreatmentsTbl.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(myIndex, 0).toString());
        TreatmentName.setText(model.getValueAt(myIndex, 1).toString());
        TreatmentCost.setText(model.getValueAt(myIndex, 2).toString());
    }//GEN-LAST:event_TreatmentsTblMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
            if(key == 0){
            JOptionPane.showMessageDialog(this, "Treatment needs to be selected!");
        }else{
            try {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/DentalClinicDatabase", "Dentist1", "DentalClinicDentist1");
                String query = "Delete from Dentist1.TreatmentsTbl where TreatmentID = " + key;
                Statement Delete = con.createStatement();
                Delete.execute(query);
                JOptionPane.showMessageDialog(this, "Treatment Successfully Deleted!");
                DisplayTreatments();
                ClearAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(key == 0){
            JOptionPane.showMessageDialog(this, "Patient needs to be selected!");
        }else{
            try {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/DentalClinicDatabase", "Dentist1", "DentalClinicDentist1");
                String query = "Update Dentist1.TreatmentsTbl set TreatmentName ='" + TreatmentName.getText() +
                         "'" + ", TreatmentCost =" +  Integer.parseInt(TreatmentCost.getText()) + " where TreatmentID = " + key;
                Statement Update = con.createStatement();
                Update.execute(query);
                JOptionPane.showMessageDialog(this, "Treatment Successfully Updated!");
                DisplayTreatments();
                ClearAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
                System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        new PatientsForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        new AppointmentsForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        new PrescriptionsForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        new DashboardForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseEntered
        jLabel37.setFont(new Font("Century Gothic", Font.PLAIN, 38));
        jLabel37.setForeground(new Color(11, 112, 164, 255));
        jLabel37.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel37MouseEntered

    private void jLabel37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseExited
        jLabel37.setFont(new Font("Century Gothic", Font.PLAIN, 36));
        jLabel37.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_jLabel37MouseExited

    private void jLabel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseEntered
        jLabel36.setFont(new Font("Century Gothic", Font.PLAIN, 38));
        jLabel36.setForeground(new Color(11, 112, 164, 255));
        jLabel36.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel36MouseEntered

    private void jLabel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseExited
        jLabel36.setFont(new Font("Century Gothic", Font.PLAIN, 36));
        jLabel36.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_jLabel36MouseExited

    private void jLabel40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseEntered
        jLabel40.setFont(new Font("Century Gothic", Font.PLAIN, 38));
        jLabel40.setForeground(new Color(11, 112, 164, 255));
        jLabel40.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel40MouseEntered

    private void jLabel40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseExited
        jLabel40.setFont(new Font("Century Gothic", Font.PLAIN, 36));
        jLabel40.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_jLabel40MouseExited

    private void jLabel41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseEntered
        jLabel41.setFont(new Font("Century Gothic", Font.PLAIN, 38));
        jLabel41.setForeground(new Color(11, 112, 164, 255));
        jLabel41.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel41MouseEntered

    private void jLabel41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseExited
        jLabel41.setFont(new Font("Century Gothic", Font.PLAIN, 36));
        jLabel41.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_jLabel41MouseExited

    private void jLabel38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseEntered
        jLabel38.setFont(new Font("Century Gothic", Font.PLAIN, 38));
        jLabel38.setForeground(new Color(11, 112, 164, 255));
        jLabel38.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel38MouseEntered

    private void jLabel38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseExited
        jLabel38.setFont(new Font("Century Gothic", Font.PLAIN, 36));
        jLabel38.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_jLabel38MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel4MouseExited

    
    private void ClearAll(){
    TreatmentName.setText("");
    TreatmentCost.setText("");
}
    
    private void DisplayTreatments(){
    try {
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/DentalClinicDatabase", "Dentist1", "DentalClinicDentist1");
        st = con.createStatement();
        res = st.executeQuery("SELECT * FROM Dentist1.TreatmentsTbl");

        // Set the table model only if it's not set yet
        if (TreatmentsTbl.getModel() == null) {
            TreatmentsTbl.setModel(DbUtils.resultSetToTableModel(res));
        } else {
            // If the table model is already set, just update the data
            ((DefaultTableModel) TreatmentsTbl.getModel()).setRowCount(0);
            while (res.next()) {
                Object[] row = new Object[res.getMetaData().getColumnCount()];
                for (int i = 0; i < row.length; i++) {
                    row[i] = res.getObject(i + 1);
                }
                ((DefaultTableModel) TreatmentsTbl.getModel()).addRow(row);
            }
        }
    } catch (Exception e) {
        e.printStackTrace(); // Handle exceptions properly in your application
    }
}
    
    private void TreatmentCount(){
    try {
        st1 = con.createStatement();
        res1 = st1.executeQuery("Select Max(TreatmentID) from Dentist1.TreatmentsTbl");
        res1.next();
        treatmentID = res1.getInt(1) + 1;
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
            java.util.logging.Logger.getLogger(TreatmentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TreatmentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TreatmentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TreatmentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TreatmentsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField TreatmentCost;
    private javax.swing.JLabel TreatmentLbl;
    private javax.swing.JTextField TreatmentName;
    private javax.swing.JTable TreatmentsTbl;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
