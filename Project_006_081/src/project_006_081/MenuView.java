package project_006_081;
import controller.JadwalPesawatController;
import controller.PesanTiketController;
import controller.RiwayatPerjalananController;
import model.Connector;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class MenuView extends javax.swing.JFrame {

    /**
     * Creates new form MenuView
     */
    public MenuView() {
        initComponents();
        setTitle("Menu View");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        akun = new javax.swing.JButton();
        PesanTiket = new javax.swing.JButton();
        JadwalPesawat = new javax.swing.JButton();
        RiwayatJalan = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Pemesanan Tiket Pesawat");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 29, 211, -1));

        akun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_006_081/WhatsApp_Image_2023-05-17_at_1.04.43_PM-removebg-preview-removebg-preview.png"))); // NOI18N
        akun.setContentAreaFilled(false);
        akun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akunActionPerformed(evt);
            }
        });
        getContentPane().add(akun, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 50, 30));

        PesanTiket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_006_081/tiket.png"))); // NOI18N
        PesanTiket.setContentAreaFilled(false);
        PesanTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesanTiketActionPerformed(evt);
            }
        });
        getContentPane().add(PesanTiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 70, 53));

        JadwalPesawat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_006_081/calendar.png"))); // NOI18N
        JadwalPesawat.setContentAreaFilled(false);
        JadwalPesawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JadwalPesawatActionPerformed(evt);
            }
        });
        getContentPane().add(JadwalPesawat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 60, 53));

        RiwayatJalan.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Pictures\\Camera Roll\\img\\jam pasir.png")); // NOI18N
        RiwayatJalan.setContentAreaFilled(false);
        RiwayatJalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RiwayatJalanActionPerformed(evt);
            }
        });
        getContentPane().add(RiwayatJalan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 40, 50));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_006_081/back.png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Pesan Tiket");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 71, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Jadwal Pesawat");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 105, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Riwayat Perjalanan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 121, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_006_081/peswat2.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesanTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesanTiketActionPerformed

    }//GEN-LAST:event_PesanTiketActionPerformed

    private void JadwalPesawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JadwalPesawatActionPerformed
        
    }//GEN-LAST:event_JadwalPesawatActionPerformed

    private void RiwayatJalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RiwayatJalanActionPerformed
        
    }//GEN-LAST:event_RiwayatJalanActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        
    }//GEN-LAST:event_backActionPerformed

    private void akunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akunActionPerformed
      
    }//GEN-LAST:event_akunActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JadwalPesawat;
    public javax.swing.JButton PesanTiket;
    public javax.swing.JButton RiwayatJalan;
    public javax.swing.JButton akun;
    public javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
