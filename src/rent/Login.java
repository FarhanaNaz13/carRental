
package rent;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        this.icon1.setVisible(false);
    }
    Connection conn;
    PreparedStatement pst;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        check = new javax.swing.JCheckBox();
        txtpass = new javax.swing.JPasswordField();
        icon2 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        LoginAsCombo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PinkCar");
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(0, 204, 204));
        setIconImage(getIconImage());

        jPanel3.setBackground(new java.awt.Color(227, 230, 233));

        jPanel4.setBackground(new java.awt.Color(131, 170, 170));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(0, 204, 204));
        jButton3.setText("Sign Up");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\CarRental\\src\\rent\\v1 (1).png")); // NOI18N

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(152, 215, 215));
        jLabel1.setText(" PinkCar Shop");

        jPanel1.setBackground(new java.awt.Color(198, 36, 36));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SIGN IN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(207, 168, 197))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(55, 107, 107));

        jLabel6.setBackground(java.awt.Color.gray);
        jLabel6.setForeground(new java.awt.Color(200, 146, 167));
        jLabel6.setText("User name");

        jLabel7.setBackground(java.awt.Color.gray);
        jLabel7.setForeground(new java.awt.Color(200, 146, 167));
        jLabel7.setText("Password");

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(170, 135, 160));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(170, 135, 160));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        check.setForeground(new java.awt.Color(200, 146, 167));
        check.setText("show password");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        icon2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\CarRental\\src\\rent\\eye_24px.png")); // NOI18N
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon2MousePressed(evt);
            }
        });

        icon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\CarRental\\src\\rent\\a2.png")); // NOI18N
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon1MousePressed(evt);
            }
        });

        LoginAsCombo.setBackground(new java.awt.Color(182, 200, 200));
        LoginAsCombo.setForeground(new java.awt.Color(0, 204, 204));
        LoginAsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        LoginAsCombo.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        LoginAsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginAsComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LoginAsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(check)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(icon1)
                                .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginAsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton1))))
        );

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        jPanel5.setBackground(new java.awt.Color(204, 5, 5));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\CarRental\\src\\images\\editred.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(33, 33, 33))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(txtusername.getText(). equals("") || txtpass.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please fill All Fields");
        }else
        {
            String username = txtusername.getText();
            String pass = txtpass.getText();
    
       
       /* if (username.equals("naz")&& pass.equals("123")){
            JOptionPane.showMessageDialog(this,"LOGIN_SUCCESSFULL");
            CarRental m= new CarRental();
            
            m.setVisible(true);
            this.hide();
        }else{
            JOptionPane.showMessageDialog(this,"username and Password do not match");
        }*/
        
           ResultSet rs = null;
           char[] passChars = txtpass.getPassword();
           String password = new String(passChars);
           int category = LoginAsCombo.getSelectedIndex() + 1;
        
           
        try { 
            
            conn = (Connection) DBAccess.getConnection();
             String sql;
             sql = "SELECT * FROM UserSystem WHERE username='" + txtusername.getText() + "'  AND password='"
               
               + password + "'AND IDRole='" + category + "'";
              pst = (PreparedStatement) conn.prepareStatement(sql);
              rs = pst.executeQuery();
            if (rs.next()) {
                UserSystem user = new UserSystem(Integer.parseInt(rs.getString(1)), Integer.parseInt(rs.getString(2)),
                        rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getString(8), rs.getString(9));
                 JOptionPane.showMessageDialog(this, "LOGIN_SUCCESSFULL");
                new CarRental(user).setVisible(true);
                 this.hide();
                  
            } else {
                JOptionPane.showMessageDialog(this, "LOGIN_FAILURE");
                
                txtusername.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }    catch (ClassNotFoundException ex) {
                 Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
             }finally {
            DBAccess.closeConn(null, null, rs);
        }
    }      
        
       
        
        
        
      
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
    
        if (check.isSelected())
            
        {
            txtpass.setEchoChar((char)0);
        }else{
            txtpass.setEchoChar('*');
        }
    }//GEN-LAST:event_checkActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ConfirmExit();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void icon2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MousePressed
        // TODO add your handling code here:
        icon1.setVisible(true);
        icon2.setVisible(false);
        txtpass.setEchoChar('*');
    }//GEN-LAST:event_icon2MousePressed

    private void icon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MousePressed
        // TODO add your handling code here:
        icon2.setVisible(true);
        icon1.setVisible(false);
        txtpass.setEchoChar((char)0);
    }//GEN-LAST:event_icon1MousePressed

    private void LoginAsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginAsComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginAsComboActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        SignUp s = new SignUp();
        s.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
private void ConfirmExit() {
        int confirmed = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to exit the program?", "Confirm Action",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            dispose();
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> LoginAsCombo;
    private javax.swing.JCheckBox check;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
