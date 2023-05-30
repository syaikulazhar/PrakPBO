/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Connector;
import project_006_081.JadwalPesawatView;
import project_006_081.MenuView;

/**
 *
 * @author Acer
 */
public class JadwalPesawatController {
    JadwalPesawatView jpv;
    Connector konek;
    User user;
    
    public JadwalPesawatController(JadwalPesawatView jpv, Connector konek, User user) {
        this.jpv = jpv;
        this.konek = konek;
        this.user = user;
        showDataJadwal();
        
        jpv.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuView mv = new MenuView();
                MenuController mc = new MenuController(konek, mv, user);
                mv.setVisible(true);
                jpv.dispose();
            }
        });
    }
        
    public void showDataJadwal() {
        String[][] data = konek.readDataJadwal();
        String[] namaKolom = {"No. Pesawat", "Maskapai", "Kelas", "Asal", "Tujuan", "Tanggal", "Berangkat", "Tiba"};
        DefaultTableModel tableModel = new DefaultTableModel(data, namaKolom){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        jpv.tabelJadwalPesawat.setModel(tableModel);
    }
    
}
