
package rent;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddNewUser extends javax.swing.JFrame {

 
    public AddNewUser() {
        initComponents();
    }

        public void Reset() {
        txtUsername.setText("");
        txtPassword.setText("");
        txtFullname.setText("");
        cbbRole.setSelectedIndex(0);
    }
        Connection conn;
    PreparedStatement pst;
public void EvtAdd()  {
    
        String pass = new String(txtPassword.getPassword());
        if (txtUsername.getText().equals("") || pass.equals("") || cbbRole.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this,"ERROR_EMPTY_FIELD", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ResultSet rs = null;
        String sql = "INSERT usersystem(IDRole,Username,Password,Fullname) VALUES (?,?,?,?)";
        String[] data = {Integer.toString(cbbRole.getSelectedIndex()), txtUsername.getText(), pass, txtFullname.getText()};
        if (DBHandleData.CheckForInsert("SELECT Fullname FROM usersystem WHERE IDRole = 2", txtUsername.getText())) {
            JOptionPane.showMessageDialog(this, "ADD_ERROR_EXIST", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        } else {
            int rows = DBHandleData.UpdateData(sql, data);
            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "ADD_SUCCESSFULL");
                Reset();
            } else {
                JOptionPane.showMessageDialog(this, "ADD_FAILURE");
                txtFullname.requestFocus();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblRole = new javax.swing.JLabel();
        lblFullname = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        cbbRole = new javax.swing.JComboBox();
        btnAdd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(66, 50, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(101, 77, 54));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_car/category-carousel_luxury-2x.jpg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 450, 410));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 430));

        jPanel4.setBackground(new java.awt.Color(66, 50, 34));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(227, 216, 216))); // NOI18N

        lblUsername.setBackground(new java.awt.Color(255, 255, 255));
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("User Name:");

        lblPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");

        txtUsername.setBackground(new java.awt.Color(66, 50, 34));
        txtUsername.setBorder(null);

        lblRole.setBackground(new java.awt.Color(255, 255, 255));
        lblRole.setForeground(new java.awt.Color(255, 255, 255));
        lblRole.setText("Role:");

        lblFullname.setBackground(new java.awt.Color(255, 255, 255));
        lblFullname.setForeground(new java.awt.Color(255, 255, 255));
        lblFullname.setText("Full Name:");

        txtFullname.setBackground(new java.awt.Color(66, 50, 34));
        txtFullname.setBorder(null);
        txtFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullnameActionPerformed(evt);
            }
        });

        cbbRole.setBackground(new java.awt.Color(151, 130, 76));
        cbbRole.setEditable(true);
        cbbRole.setForeground(new java.awt.Color(111, 77, 44));
        cbbRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ROLE", "Admin", "Staff" }));
        cbbRole.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbbRole.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAdd.setBackground(new java.awt.Color(66, 45, 24));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(66, 45, 24));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(66, 45, 24));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(66, 50, 34));
        txtPassword.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPassword))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 310, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        EvtAdd();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
       
        new CarRental().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullnameActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox cbbRole;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
