/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Connector;
import project_006_081.CariJadwalView;
import project_006_081.CetakTiketView;
import project_006_081.FormPemesananView;

/**
 *
 * @author Acer
 */
public class FormPemesananController {
    Connector conn;
    FormPemesananView fpv;
    String[] kolomCariJadwal;
    String[] kolomPemesan;
    User user;
    String from;
    String to;
    
    public FormPemesananController(Connector conn, FormPemesananView fpv, User user, String[] kolomCariJadwal, String from, String to) {
        this.conn = conn;
        this.fpv = fpv;
        this.kolomCariJadwal = kolomCariJadwal;
        this.user = user;
        this.from = from;
        this.to = to;
        
        fpv.Pesan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin memesan tiket ini?", "Option", JOptionPane.YES_NO_OPTION);
                if (input == 0) {
                    kolomPemesan = new String[4];
                    kolomPemesan[0] = fpv.getNama_depan();
                    kolomPemesan[1] = fpv.getNama_belakang();
                    kolomPemesan[2] = fpv.getKtp();
                    kolomPemesan[3] = fpv.getHp();
                    
                    conn.tambahRiwayat(kolomCariJadwal, kolomPemesan, user);
                    CetakTiketView ctv = new CetakTiketView();
                    CetakTiketController ctc = new CetakTiketController(conn, ctv, kolomCariJadwal, kolomPemesan, user, from, to );
                    ctv.setVisible(true);
                    fpv.dispose();
                }
            }
        });
        
        fpv.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CariJadwalView cjv = new CariJadwalView();
                CariJadwalController cjc = new CariJadwalController(cjv, conn, from, to, user);
                cjv.setVisible(true);
                fpv.dispose();
            }
        });
    }
    
}
