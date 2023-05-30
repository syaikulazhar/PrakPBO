/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Connector;
import project_006_081.CetakTiketView;
import project_006_081.MenuView;

/**
 *
 * @author Acer
 */
public class CetakTiketController {
    Connector conn;
    CetakTiketView ctv ;
    String[] kolomCariJadwal;
    String[] kolomPemesan;
    User user;
    String from;
    String to;

    public CetakTiketController(Connector conn, CetakTiketView ctv, String[] kolomCariJadwal, String[] kolomPemesan, User user, String from, String to) {
        this.conn = conn;
        this.ctv = ctv;
        this.kolomCariJadwal = kolomCariJadwal;
        this.kolomPemesan = kolomPemesan;
        this.user = user;
        this.from = from;
        this.to = to;
        
        ctv.berangkat.setText(kolomCariJadwal[6]);
        ctv.harga.setText(kolomCariJadwal[8]);
        ctv.kelas.setText(kolomCariJadwal[2]);
        ctv.maskapai.setText(kolomCariJadwal[1]);
        ctv.nama.setText("Mr./Ms. " + kolomPemesan[1] + "/" + kolomPemesan[0]);
        ctv.noHp.setText(kolomPemesan[3]);
        ctv.noKtp.setText(kolomPemesan[2]);
        ctv.noPesawat.setText(kolomCariJadwal[0]);
        ctv.tanggal.setText(kolomCariJadwal[5]);
        ctv.tiba.setText(kolomCariJadwal[7]);
        ctv.asalTujuan.setText(kolomCariJadwal[3] + " - " + kolomCariJadwal[4]);
        
        ctv.home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuView mv = new MenuView();
                MenuController mc = new MenuController(conn, mv, user);
                mv.setVisible(true);
                ctv.dispose();
            }
        });
    }
    
    
    
    
    
}
