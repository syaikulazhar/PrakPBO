/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Connector;
import project_006_081.CariJadwalView;
import project_006_081.MenuView;
import project_006_081.PesanTiketView;

/**
 *
 * @author Acer
 */
public class PesanTiketController {
    PesanTiketView ptv;
    Connector connector;
    User user;

    public PesanTiketController(PesanTiketView ptv, Connector connector, User user) {
        this.ptv = ptv;
        this.connector = connector;
        this.user= user;
        showDataAsal();
        showDataTujuan();
        
        ptv.cari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CariJadwalView cjv = new CariJadwalView();
                CariJadwalController cjc = new CariJadwalController(cjv, connector, ptv.getFrom(), ptv.getTo(), user);
                cjv.setVisible(true);
                ptv.dispose();
            }
        });
        
        ptv.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuView mv = new MenuView();
                MenuController mc = new MenuController(connector, mv, user);
                mv.setVisible(true);
                ptv.dispose();
            }
        });
    }
    
    void showDataAsal() {
        String[] data = connector.dropAsal();
        int jml = connector.jmlDataJadwal();
        for(int i = 0; i <jml; i++) {
            ptv.dari.addItem(data[i]);
        }
    }
    
    void showDataTujuan() {
        String[] data = connector.dropTujuan();
        int jml = connector.jmlDataJadwal();
        for(int i = 0; i <jml; i++) {
            ptv.tujuan.addItem(data[i]);
        }
    }
}
