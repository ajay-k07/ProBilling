/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import utils.InputValidate;


/**
 *
 * @author Ajai Lee
 */
public class DeleteSupplier extends javax.swing.JFrame {

    static DeleteSupplier instance;

    static void buildUI() {
        if (instance == null) {
            instance = new DeleteSupplier();
        }
        instance.setVisible(true);
        instance.requestFocus();
    }

    /**
     * Creates new form AddSupplier
     */
    private DeleteSupplier() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_phoneNo = new javax.swing.JTextField();
        txt_gstNo = new javax.swing.JTextField();
        txt_accountNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_extra = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_address = new javax.swing.JTextArea();
        cmd_save = new javax.swing.JButton();
        cmd_clear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(100, 100, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Phone Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(77, 100, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(74, 100, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Extra");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(74, 77, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Account Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(77, 24, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setText("GST NO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(100, 66, 0, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nameKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(97, 20, 0, 0);
        jPanel1.add(txt_name, gridBagConstraints);

        txt_phoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_phoneNoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_phoneNoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phoneNoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 173;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(74, 18, 0, 0);
        jPanel1.add(txt_phoneNo, gridBagConstraints);

        txt_gstNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_gstNoActionPerformed(evt);
            }
        });
        txt_gstNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_gstNoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_gstNoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 159;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(97, 18, 0, 0);
        jPanel1.add(txt_gstNo, gridBagConstraints);

        txt_accountNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_accountNoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_accountNoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 159;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(74, 18, 0, 0);
        jPanel1.add(txt_accountNo, gridBagConstraints);

        txt_extra.setColumns(20);
        txt_extra.setRows(5);
        jScrollPane1.setViewportView(txt_extra);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 221;
        gridBagConstraints.ipady = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(74, 18, 0, 194);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        txt_address.setColumns(20);
        txt_address.setRows(5);
        jScrollPane2.setViewportView(txt_address);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 235;
        gridBagConstraints.ipady = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(74, 18, 0, 0);
        jPanel1.add(jScrollPane2, gridBagConstraints);

        cmd_save.setText("Save");
        cmd_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmd_saveMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(77, 30, 0, 0);
        jPanel1.add(cmd_save, gridBagConstraints);

        cmd_clear.setText("Clear");
        cmd_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmd_clearMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(77, 101, 0, 0);
        jPanel1.add(cmd_clear, gridBagConstraints);

        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("jLabel7");
        jLabel7.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("jLabel7");
        jLabel8.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel1.add(jLabel8, gridBagConstraints);

        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("jLabel7");
        jLabel9.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel1.add(jLabel9, gridBagConstraints);

        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("jLabel7");
        jLabel10.setVisible(false);
        jLabel10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel10KeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel1.add(jLabel10, gridBagConstraints);

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("jLabel7");
        jLabel11.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel1.add(jLabel11, gridBagConstraints);

        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("jLabel7");
        jLabel12.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel1.add(jLabel12, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1347, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_gstNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_gstNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_gstNoActionPerformed

    private void cmd_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_saveMouseClicked
        // TODO add your handling code here:
        String name = txt_name.getText();
        String phoneNumber = txt_phoneNo.getText();
        String accountNumber = txt_accountNo.getText();
        String gstNo = txt_gstNo.getText();
        String address = txt_address.getText();
        String extra = txt_extra.getText();
        backend.SupplierBE.deleteSupplier(phoneNumber);
        JOptionPane.showMessageDialog(this, "Supplier Deleted Successfully");
        clear();
    }//GEN-LAST:event_cmd_saveMouseClicked

    private void cmd_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_clearMouseClicked
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_cmd_clearMouseClicked

    private void txt_gstNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_gstNoKeyTyped
        // TODO add your handling code here:
       
       
    }//GEN-LAST:event_txt_gstNoKeyTyped

    private void txt_phoneNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneNoKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt_phoneNoKeyPressed

    private void txt_phoneNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneNoKeyTyped
        // TODO add your handling code here:
          
       
         
    }//GEN-LAST:event_txt_phoneNoKeyTyped

    private void txt_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt_nameKeyTyped

    private void jLabel10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel10KeyTyped
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jLabel10KeyTyped

    private void txt_accountNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_accountNoKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_accountNoKeyTyped

    private void txt_phoneNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneNoKeyReleased
        // TODO add your handling code here:
         jLabel9.setText("Invalid Phone Number");
          jLabel9.setVisible(txt_phoneNo.getText().length()>10||txt_phoneNo.getText().length()<10);
     //   jLabel9.setVisible(InputValidate.validatePhoneNumber(txt_phoneNo.getText()));
    }//GEN-LAST:event_txt_phoneNoKeyReleased

    private void txt_accountNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_accountNoKeyReleased
        // TODO add your handling code here: 
        jLabel10.setText("Invalid Account Number");
        jLabel10.setVisible(!InputValidate.validateAccountNo(txt_accountNo.getText()));
    }//GEN-LAST:event_txt_accountNoKeyReleased

    private void txt_gstNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_gstNoKeyReleased
        // TODO add your handling code here:
        jLabel8.setText("Invalid GST");
        jLabel8.setVisible(!InputValidate.validateGst(txt_gstNo.getText()));
    }//GEN-LAST:event_txt_gstNoKeyReleased

    private void txt_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyReleased
        // TODO add your handling code here:
        jLabel7.setText("Invalid Name");
        jLabel7.setVisible(!InputValidate.validateName(txt_name.getText()));
    }//GEN-LAST:event_txt_nameKeyReleased

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
            java.util.logging.Logger.getLogger(DeleteSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmd_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_accountNo;
    private javax.swing.JTextArea txt_address;
    private javax.swing.JTextArea txt_extra;
    private javax.swing.JTextField txt_gstNo;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phoneNo;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        txt_name.setText("");
        txt_phoneNo.setText("");
        txt_accountNo.setText("");
        txt_gstNo.setText("");
        txt_address.setText("");
        txt_extra.setText("");//To change body of generated methods, choose Tools | Templates.
    }
}
