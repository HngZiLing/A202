/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_lab;

/**
 *
 * @author Acer
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        duration = new javax.swing.JLabel();
        hoursTF = new javax.swing.JTextField();
        dayType = new javax.swing.JLabel();
        dayCB = new javax.swing.JComboBox<>();
        hour = new javax.swing.JLabel();
        noRB = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        yesRB = new javax.swing.JRadioButton();
        calcBTN = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputTA = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("XYZ Fitness Center Charge Calculator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("XYZFrame"); // NOI18N

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        duration.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        duration.setText("Duration");

        hoursTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursTFActionPerformed(evt);
            }
        });

        dayType.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        dayType.setText("Day type");

        dayCB.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        dayCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Weekday", "Weekend" }));
        dayCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayCBActionPerformed(evt);
            }
        });

        hour.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        hour.setText("hour (s)");

        noRB.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        noRB.setText("No");
        noRB.setToolTipText("");
        noRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noRBActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel4.setText("Member");

        yesRB.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        yesRB.setText("Yes");
        yesRB.setToolTipText("");
        yesRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesRBActionPerformed(evt);
            }
        });

        calcBTN.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        calcBTN.setText("Calculate");
        calcBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBTNActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hoursTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noRB)
                                    .addComponent(yesRB)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(calcBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGap(28, 28, 28)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(dayType, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dayCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hour)
                    .addComponent(duration))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(yesRB))
                .addGap(4, 4, 4)
                .addComponent(noRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reset)
                    .addComponent(calcBTN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        outputTA.setColumns(20);
        outputTA.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        outputTA.setRows(5);
        jScrollPane2.setViewportView(outputTA);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("XYZ Fitness Centre");
        jLabel5.setToolTipText("");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hoursTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoursTFActionPerformed

    private void noRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noRBActionPerformed

    private void yesRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesRBActionPerformed

    private void calcBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBTNActionPerformed
        // TODO add your handling code here:
        
        int hour = 0;
        String dayType = null;        
        double charge = 0.0;
        boolean member;
        
        try {
            hour = Integer.parseInt(hoursTF.getText());
            if (hour < 1 || hour > 12)
                throw new Exception("Value should be between 1 and 12");
            dayType = (String) dayCB.getSelectedItem();
            
            if(yesRB.isSelected())
            {   
                member = true;
                
                if (dayType.equals("Weekday"))
                    charge = hour * 3.0;    
             
                else if (dayType.equals("Weekend"))
                    charge = hour * 4.0;            
            }
            
            if (noRB.isSelected())
            {
                member = false;
                
                if (dayType.equals("Weekday"))
                charge = hour * 5.0;               
             
                else if (dayType.equals("Weekend"))
                charge = hour * 6.0;             
            }
      
            outputTA.setText(String.format("Please pay RM%.2f ", charge));
            
        } catch (NumberFormatException e) {
            outputTA.setText("Error : Enter valid Integer only");
        } catch (Exception e) {
            outputTA.setText(e.getMessage());
        }
    }//GEN-LAST:event_calcBTNActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        
        hoursTF.setText(null);
        dayCB.setSelectedIndex(0);
        yesRB.setSelected(false);
        noRB.setSelected(false);
        outputTA.setText(null);
    }//GEN-LAST:event_resetActionPerformed

    private void dayCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayCBActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcBTN;
    private javax.swing.JComboBox<String> dayCB;
    private javax.swing.JLabel dayType;
    private javax.swing.JLabel duration;
    private javax.swing.JLabel hour;
    private javax.swing.JTextField hoursTF;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton noRB;
    private javax.swing.JTextArea outputTA;
    private javax.swing.JButton reset;
    private javax.swing.JRadioButton yesRB;
    // End of variables declaration//GEN-END:variables
}