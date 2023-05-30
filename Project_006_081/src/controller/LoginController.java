/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Connector;
import project_006_081.DaftarView;
import project_006_081.LoginView;
import project_006_081.MenuView;

/**
 *
 * @author Acer
 */
public class LoginController {
    Connector conn;
    LoginView lv;
    
    public LoginController(Connector conn, LoginView lv) {
        this.conn = conn;
        this.lv = lv;
        
        lv.ButtonDaftar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e) {
                DaftarView dv = new DaftarView();
                DaftarController dc = new DaftarController(conn, dv);
                dv.setVisible(true);
                lv.dispose();
            }
        });
        
        lv.Login1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e) {
                if (conn.login(lv.getUsername(), lv.getPassword())) {
                    String[] data = conn.readDataUser(lv.getUsername());
                    User user = new User(data[0], data[1], data[2], data[3], data[4]);
                    MenuView mv = new MenuView();
                    mv.setVisible(true);
                    MenuController mc = new MenuController(conn, mv, user);
                    lv.dispose();
                }
            }
        });
    }
}
