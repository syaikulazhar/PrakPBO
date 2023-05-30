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
import project_006_081.DaftarView;
import project_006_081.LoginView;

/**
 *
 * @author Acer
 */
public class DaftarController {
    Connector conn;
    DaftarView dv;

    public DaftarController(Connector conn, DaftarView dv) {
        this.conn = conn;
        this.dv = dv;
        
        dv.daftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                if(conn.checkUsername(dv.getUsername())) {
                    conn.daftarAkun(dv.getNama_lengkap(), dv.getEmail(), dv.getUsername(), dv.getPass());
                } 
            }
        });
        
        dv.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                LoginView lv = new LoginView();
                LoginController lc = new LoginController(conn, lv);
                lv.setVisible(true);
                dv.dispose();
            }
        });
        
        dv.reset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e) {
                dv.TfEmail.setText("");
                dv.TfNama.setText("");
                dv.TfPass.setText("");
                dv.TfUsername.setText("");
            }
        });
        
    }
    
    
}
