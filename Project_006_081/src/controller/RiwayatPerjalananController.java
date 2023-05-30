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
import project_006_081.MenuView;
import project_006_081.RiwayatPerjalananView;

/**
 *
 * @author Acer
 */
public class RiwayatPerjalananController {
    RiwayatPerjalananView rpv;
    Connector conn;
    User user;
    
    public RiwayatPerjalananController( Connector conn, RiwayatPerjalananView rpv, User user) {
        this.rpv = rpv;
        this.conn = conn;
        this.user = user;
        showDataRiwayat();
        rpv.tabelRiwayat.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int row = rpv.tabelRiwayat.getSelectedRow();
                String id_jadwal = (String) rpv.tabelRiwayat.getValueAt(row, 0);
                int input = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data?", "Option", JOptionPane.YES_NO_OPTION);
                if (input == 0) {
                    conn.hapusRiwayat(Integer.parseInt(id_jadwal));
                }
            }
        });
        
        rpv.Back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuView mv = new MenuView();
                MenuController mc = new MenuController(conn, mv, user);
                mv.setVisible(true);
                rpv.dispose();
            }
        });
        
    }
    
    void showDataRiwayat() {
        String[][] data = conn.readDataRiwayat(user.getId_user());
        String[] namaKolom = {"ID Perjalanan", "Nama Depan", "Nama Belakang", "No. KTP", "No. Pesawat", "Maskapai", "Kelas", "Asal", "Tujuan", "Tanggal", "Berangkat", "Tiba"};
        DefaultTableModel tableModel = new DefaultTableModel(data, namaKolom){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        rpv.tabelRiwayat.setModel(tableModel);
    }
    
}
