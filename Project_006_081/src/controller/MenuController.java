/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Connector;
import project_006_081.AkunView;
import project_006_081.JadwalPesawatView;
import project_006_081.LoginView;
import project_006_081.MenuView;
import project_006_081.PesanTiketView;
import project_006_081.RiwayatPerjalananView;


/**
 *
 * @author Acer
 */
public class MenuController {
    Connector conn;
    MenuView mv;
    User user;
    
    public MenuController(Connector conn, MenuView mv, User user) {
        this.conn = conn;
        this.mv = mv;
        this.user= user;
        
        mv.PesanTiket.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e) {
                PesanTiketView ptv = new PesanTiketView();
                PesanTiketController ptc = new PesanTiketController(ptv, conn, user);
                ptv.setVisible(true);
                mv.dispose();
            }
        });
        
        mv.JadwalPesawat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e) {
                JadwalPesawatView jpv = new JadwalPesawatView();
                JadwalPesawatController jpc = new JadwalPesawatController(jpv, conn, user);
                jpv.setVisible(true);
                mv.dispose();
            }
        });
        
        mv.RiwayatJalan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e) {
                RiwayatPerjalananView rpv = new RiwayatPerjalananView();
                RiwayatPerjalananController rpc = new RiwayatPerjalananController(conn, rpv, user);
                rpv.setVisible(true);
                mv.dispose();
            }
        });
        
        mv.back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e) {
                LoginView lv = new LoginView();
                LoginController lc = new LoginController(conn, lv);
                lv.setVisible(true);
                mv.dispose();
            }
        });
        
        mv.akun.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e) {
                AkunView av = new AkunView();
                AkunController ac = new AkunController(conn, av, user);
                av.setVisible(true);
                mv.dispose();
            }
        });
    }
    
}
 