
package rent;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

 
    public SignUp() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 47, 76));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(40, 64, 87));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(32, 47, 76));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(227, 216, 216))); // NOI18N

        lblUsername.setBackground(new java.awt.Color(255, 255, 255));
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("User Name:");

        lblPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");

        txtUsername.setBackground(new java.awt.Color(32, 47, 76));
        txtUsername.setBorder(null);

        lblRole.setBackground(new java.awt.Color(255, 255, 255));
        lblRole.setForeground(new java.awt.Color(255, 255, 255));
        lblRole.setText("Role:");

        lblFullname.setBackground(new java.awt.Color(255, 255, 255));
        lblFullname.setForeground(new java.awt.Color(255, 255, 255));
        lblFullname.setText("Full Name:");

        txtFullname.setBackground(new java.awt.Color(32, 47, 76));
        txtFullname.setBorder(null);
        txtFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullnameActionPerformed(evt);
            }
        });

        cbbRole.setBackground(new java.awt.Color(230, 229, 231));
        cbbRole.setEditable(true);
        cbbRole.setForeground(new java.awt.Color(116, 81, 116));
        cbbRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ROLE", "Admin", "Staff" }));
        cbbRole.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);

        btnAdd.setBackground(new java.awt.Color(32, 47, 76));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add Green Button.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(32, 47, 76));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Yellow Ball.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(32, 47, 76));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rent/Cancel Red Button.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(32, 47, 76));
        txtPassword.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(lblFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(btnReset)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(cbbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30))
                                .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3)
                        .addGap(8, 8, 8)))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 450));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 450));

        jPanel2.setBackground(new java.awt.Color(242, 236, 236));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\image_car\\Mustang-Backgrounds-HD-Free-Download-620x388.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 0, 460, 450));

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
       
        new loginN11().setVisible(true);
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
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
    private javax.swing.JPanel jPanel2;
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
