/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_006_081;

/**
 *
 * @author Acer
 */
public class CetakTiketView extends javax.swing.JFrame {

    /**
     * Creates new form CetakTiketView
     */
    public CetakTiketView() {
        initComponents();
        setTitle("Cetak Tiket");
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

        home = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        berangkat = new javax.swing.JLabel();
        tiba = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        noKtp = new javax.swing.JLabel();
        noHp = new javax.swing.JLabel();
        kelas = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        noPesawat = new javax.swing.JLabel();
        maskapai = new javax.swing.JLabel();
        harga = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        asalTujuan = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_006_081/home.png"))); // NOI18N
        home.setContentAreaFilled(false);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        jLabel27.setText("Home");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 40, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("E-Ticket");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 161, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_006_081/jarak.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 31, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Berangkat");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tiba");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 57, -1));

        berangkat.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        berangkat.setForeground(new java.awt.Color(255, 255, 255));
        berangkat.setText("kosong");
        getContentPane().add(berangkat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 70, 14));

        tiba.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        tiba.setForeground(new java.awt.Color(255, 255, 255));
        tiba.setText("kosong");
        getContentPane().add(tiba, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 80, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("No. KTP");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 100, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("No. HP");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 100, -1));

        nama.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nama.setForeground(new java.awt.Color(255, 255, 255));
        nama.setText("kosong");
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 220, -1));

        noKtp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        noKtp.setForeground(new java.awt.Color(255, 255, 255));
        noKtp.setText("kosong");
        getContentPane().add(noKtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 220, -1));

        noHp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        noHp.setForeground(new java.awt.Color(255, 255, 255));
        noHp.setText("kosong");
        getContentPane().add(noHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 220, -1));

        kelas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kelas.setForeground(new java.awt.Color(255, 255, 255));
        kelas.setText("kosong");
        getContentPane().add(kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 220, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Detail Pemesanan");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 120, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tanggal");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 57, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("No. Pesawat");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 100, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Maskapai");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 57, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Harga");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 57, -1));

        tanggal.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        tanggal.setForeground(new java.awt.Color(255, 255, 255));
        tanggal.setText("kosong");
        getContentPane().add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 263, 110, 20));

        noPesawat.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        noPesawat.setForeground(new java.awt.Color(255, 255, 255));
        noPesawat.setText("kosong");
        getContentPane().add(noPesawat, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 266, 110, -1));

        maskapai.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        maskapai.setForeground(new java.awt.Color(255, 255, 255));
        maskapai.setText("kosong");
        getContentPane().add(maskapai, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 266, 110, -1));

        harga.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        harga.setForeground(new java.awt.Color(255, 255, 255));
        harga.setText("kosong");
        getContentPane().add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 263, 120, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Kelas");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 100, -1));

        asalTujuan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        asalTujuan.setForeground(new java.awt.Color(255, 255, 255));
        asalTujuan.setText("Kosong");
        getContentPane().add(asalTujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 340, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_006_081/e ticket.jpg"))); // NOI18N
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(CetakTiketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CetakTiketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CetakTiketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CetakTiketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CetakTiketView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel asalTujuan;
    public javax.swing.JLabel berangkat;
    public javax.swing.JLabel harga;
    public javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel kelas;
    public javax.swing.JLabel maskapai;
    public javax.swing.JLabel nama;
    public javax.swing.JLabel noHp;
    public javax.swing.JLabel noKtp;
    public javax.swing.JLabel noPesawat;
    public javax.swing.JLabel tanggal;
    public javax.swing.JLabel tiba;
    // End of variables declaration//GEN-END:variables
}