/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;


import java.awt.Cursor;
                    

public class login_form extends javax.swing.JFrame {

   
    
    
    public login_form() {
        initComponents();
        setLocationRelativeTo(null);
        btnLoginInvisibility();
        btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        txtFieldInvisibility();
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void btnLoginInvisibility(){
        btnLogin.setOpaque(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setBorderPainted(false);
    }
    
    private void txtFieldInvisibility(){
        //Login_form excuse
        txtFieldUser.setBackground(new java.awt.Color(0,0,0,1));
        txtFieldPass.setBackground(new java.awt.Color(0,0,0,1));
    }
    
    
    
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFieldUser = new javax.swing.JTextField();
        txtFieldPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        desainForm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFieldUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFieldUser.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldUser.setBorder(null);
        getContentPane().add(txtFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 240, 30));

        txtFieldPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFieldPass.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldPass.setBorder(null);
        getContentPane().add(txtFieldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 240, 20));

        btnLogin.setPreferredSize(new java.awt.Dimension(73, 30));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 394, 220, 50));

        desainForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/login_menu.png"))); // NOI18N
        getContentPane().add(desainForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
        System.out.println("HAII");
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel desainForm;
    private javax.swing.JPasswordField txtFieldPass;
    private javax.swing.JTextField txtFieldUser;
    // End of variables declaration//GEN-END:variables
}
