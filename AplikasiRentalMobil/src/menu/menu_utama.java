/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.awt.Cursor;

/**
 *
 * @author ASUS
 */
public class menu_utama extends javax.swing.JFrame {

    /**
     * Creates new form menu_utama
     */
    public menu_utama() {
        initComponents();
        setLocationRelativeTo(null);
        btnMenuInvisibility();
        pointerChanges();
        jDesktopPane1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void btnMenuInvisibility(){
        btnDatabase.setOpaque(false);
        btnDatabase.setContentAreaFilled(false);
        btnDatabase.setBorderPainted(false);
        
        btnRent.setOpaque(false);
        btnRent.setContentAreaFilled(false);
        btnRent.setBorderPainted(false);
    }
    
    private void pointerChanges(){
        btnDatabase.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        goToHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        aboutUs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRent = new javax.swing.JButton();
        aboutUs = new javax.swing.JLabel();
        goToHome = new javax.swing.JLabel();
        btnDatabase = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        menuUtamaDesign = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentActionPerformed(evt);
            }
        });
        getContentPane().add(btnRent, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 190, 240));

        aboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutUsMouseClicked(evt);
            }
        });
        getContentPane().add(aboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 60, 80));

        goToHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToHomeMouseClicked(evt);
            }
        });
        getContentPane().add(goToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 60, 70));

        btnDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatabaseActionPerformed(evt);
            }
        });
        getContentPane().add(btnDatabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 190, 240));

        jDesktopPane1.setOpaque(false);
        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 680, 540));

        menuUtamaDesign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/menu_utama .png"))); // NOI18N
        getContentPane().add(menuUtamaDesign, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUsMouseClicked
        // TODO add your handling code here:
        about_us kelompok = new about_us();
        kelompok.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_aboutUsMouseClicked

    private void btnRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.setVisible(true);
        jDesktopPane1.setOpaque(true);
        btnRent.setEnabled(false);
        btnDatabase.setEnabled(false);
        form_pinjam form = new form_pinjam();
        form.setVisible(true);
        form.setMaximizable(true);
        form.setOpaque(true);
        jDesktopPane1.add(form);
    }//GEN-LAST:event_btnRentActionPerformed

    private void goToHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToHomeMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.setVisible(false);
        jDesktopPane1.setOpaque(false);
        btnDatabase.setEnabled(true);
        btnRent.setEnabled(true);
        
    }//GEN-LAST:event_goToHomeMouseClicked

    private void btnDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatabaseActionPerformed
        // TODO add your handling code here:
        menu_crud crud = new menu_crud();
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDatabaseActionPerformed

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
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutUs;
    private javax.swing.JButton btnDatabase;
    private javax.swing.JButton btnRent;
    private javax.swing.JLabel goToHome;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel menuUtamaDesign;
    // End of variables declaration//GEN-END:variables
}
