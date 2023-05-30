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
import project_006_081.LoginView;
import project_006_081.MenuView;

/**
 *
 * @author Acer
 */
public class AkunController {
    Connector conn;
    AkunView av;
    User user;

    public AkunController(Connector conn, AkunView av, User user) {
        this.conn = conn;
        this.av = av;
        this.user = user;
        setForm();
        
        av.Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                MenuView mv = new MenuView();
                MenuController mc = new MenuController(conn, mv, user);
                mv.setVisible(true);
                av.dispose();
            }
        });
        
        av.update.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e) {
                if(conn.checkUpdate(user.getUsername(), av.getPassword()) && conn.checkUpdateUsername(user.getUsername(), av.getUsername())){
                    conn.updateData(av.getUsername(), av.getNama(), av.getEmail(), user.getUsername());
                    user.setEmail(av.getEmail());
                    user.setNama(av.getNama());
                    user.setUsername(av.getUsername());
                }
            }
        });
        
        av.reset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e) {
                av.tfNama.setText("");
                av.tfEmail.setText("");
                av.tfPassword.setText("");
                av.tfUsername.setText("");
            }
        });
    }
    
    //ngeset sesuai data user yg login
    void setForm () {
       av.tfNama.setText(user.getNama());
       av.tfEmail.setText(user.getEmail());
       av.tfUsername.setText(user.getUsername());
    }
    
}
