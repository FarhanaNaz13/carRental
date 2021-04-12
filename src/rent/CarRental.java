
package rent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public final class CarRental extends javax.swing.JFrame {

    private UserSystem user;
    public CarRental() {
        initComponents();
      
    
 
     
        
    }
    Connection conn;
 
    
    public CarRental(UserSystem user){
        initComponents();
        this.setTitle("pink gamer");
        this.user = user;
     
        
        
    
    
    }
 
    
    

    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        reg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        mnLogout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnAddAcc = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        mnUpdateAcc = new javax.swing.JMenuItem();
        space = new javax.swing.JPopupMenu.Separator();
        mnChangePass = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        mnCreateAbill = new javax.swing.JMenuItem();
        mnCustomer = new javax.swing.JMenu();
        mnAddcustomer = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        mnSearchCustomer = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        mnUpdateCustomer = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PINK GAMER");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reg.setBackground(new java.awt.Color(32, 24, 24));
        reg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reg.setForeground(new java.awt.Color(226, 233, 233));
        reg.setText("Car Registration");
        reg.setBorder(new javax.swing.border.MatteBorder(null));
        reg.setFocusCycleRoot(true);
        reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regMouseExited(evt);
            }
        });
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        getContentPane().add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CarBanner.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 330));

        file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Run.png"))); // NOI18N
        file.setText("File");

        mnLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red Ball.png"))); // NOI18N
        mnLogout.setText("LogOut");
        mnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLogoutActionPerformed(evt);
            }
        });
        file.add(mnLogout);
        file.add(jSeparator1);

        mnExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Eject Blue Button.png"))); // NOI18N
        mnExit.setText("Exit");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        file.add(mnExit);

        jMenuBar1.add(file);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rent/Employee Card_35px.png"))); // NOI18N
        jMenu1.setText("User Account");

        mnAddAcc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnAddAcc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add.png"))); // NOI18N
        mnAddAcc.setText("Add New Account");
        mnAddAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAddAccActionPerformed(evt);
            }
        });
        jMenu1.add(mnAddAcc);
        jMenu1.add(jSeparator11);

        mnUpdateAcc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnUpdateAcc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Write Document.png"))); // NOI18N
        mnUpdateAcc.setText("Update Account");
        mnUpdateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUpdateAccActionPerformed(evt);
            }
        });
        jMenu1.add(mnUpdateAcc);
        jMenu1.add(space);

        mnChangePass.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Plugin Green Button.png"))); // NOI18N
        mnChangePass.setText("Change Password");
        mnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnChangePassActionPerformed(evt);
            }
        });
        jMenu1.add(mnChangePass);
        jMenu1.add(jSeparator12);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rent/Visa_35px.png"))); // NOI18N
        jMenu3.setText("Invoice");

        mnCreateAbill.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnCreateAbill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green Ball.png"))); // NOI18N
        mnCreateAbill.setText("Create Receive Invoice");
        mnCreateAbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCreateAbillActionPerformed(evt);
            }
        });
        jMenu3.add(mnCreateAbill);

        jMenuBar1.add(jMenu3);

        mnCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rent/Add User Male_35px.png"))); // NOI18N
        mnCustomer.setText("Customer");

        mnAddcustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnAddcustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add.png"))); // NOI18N
        mnAddcustomer.setText("Add New Customer");
        mnAddcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAddcustomerActionPerformed(evt);
            }
        });
        mnCustomer.add(mnAddcustomer);
        mnCustomer.add(jSeparator9);

        mnSearchCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnSearchCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Spotlight Blue Button.png"))); // NOI18N
        mnSearchCustomer.setText("Search Customer");
        mnSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSearchCustomerActionPerformed(evt);
            }
        });
        mnCustomer.add(mnSearchCustomer);
        mnCustomer.add(jSeparator10);

        mnUpdateCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnUpdateCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Write Document.png"))); // NOI18N
        mnUpdateCustomer.setText("Update Customer");
        mnUpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUpdateCustomerActionPerformed(evt);
            }
        });
        mnCustomer.add(mnUpdateCustomer);

        jMenuBar1.add(mnCustomer);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rent/Driver_35px.png"))); // NOI18N
        jMenu2.setText("Driver");
        jMenuBar1.add(jMenu2);

        jMenu4.setBackground(new java.awt.Color(88, 104, 137));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rent/Fiat 500_35px.png"))); // NOI18N
        jMenu4.setText("Car management");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setBackground(new java.awt.Color(110, 131, 175));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rent/Carpool_35px.png"))); // NOI18N
        jMenuItem3.setText("car rent");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rent/Car Rental_35px.png"))); // NOI18N
        jMenuItem4.setText(" Return car");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void ConfirmExit() {
        int confirmed = JOptionPane.showConfirmDialog(null,
                " Log out from the program?", "Confirm Action",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            dispose();
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }
    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        // TODO add your handling code here:
        CarReg c = new CarReg();
        c.setVisible(true);
       
       this.hide();
       
    }//GEN-LAST:event_regActionPerformed

    private void mnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLogoutActionPerformed
        // TODO add your handling code here:
        new loginN11().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnLogoutActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_mnExitActionPerformed

    private void mnAddAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAddAccActionPerformed
        // TODO add your handling code here:
        AddNewUser s = new AddNewUser();
        s.setVisible(true);
        this.hide();
    }//GEN-LAST:event_mnAddAccActionPerformed

    private void mnUpdateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUpdateAccActionPerformed
        // TODO add your handling code here:
        EditAccount a = new EditAccount();
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_mnUpdateAccActionPerformed

    private void mnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnChangePassActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mnChangePassActionPerformed

    private void mnCreateAbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCreateAbillActionPerformed
        // TODO add your handling code here:
      invoicePayment p = new invoicePayment();
        p.setVisible(true);
        this.hide();
    }//GEN-LAST:event_mnCreateAbillActionPerformed

    private void mnAddcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAddcustomerActionPerformed
        // TODO add your handling code here:
        passenger c = new passenger();
        c.setVisible(true);
        this.hide();
    }//GEN-LAST:event_mnAddcustomerActionPerformed

    private void mnSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSearchCustomerActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mnSearchCustomerActionPerformed

    private void mnUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUpdateCustomerActionPerformed
        // TODO add your handling code here:
        UpdateCustomer c = new UpdateCustomer();
        c.setVisible(true);
        this.hide();
    }//GEN-LAST:event_mnUpdateCustomerActionPerformed

    private void regMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_regMouseExited

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        rental c = new rental();
        c.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        ReturnCarN c = new ReturnCarN();
        c.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CarRental().setVisible(true);
            }
        });
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu file;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem mnAddAcc;
    private javax.swing.JMenuItem mnAddcustomer;
    private javax.swing.JMenuItem mnChangePass;
    private javax.swing.JMenuItem mnCreateAbill;
    private javax.swing.JMenu mnCustomer;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenuItem mnLogout;
    private javax.swing.JMenuItem mnSearchCustomer;
    private javax.swing.JMenuItem mnUpdateAcc;
    private javax.swing.JMenuItem mnUpdateCustomer;
    private javax.swing.JButton reg;
    private javax.swing.JPopupMenu.Separator space;
    // End of variables declaration//GEN-END:variables

}




