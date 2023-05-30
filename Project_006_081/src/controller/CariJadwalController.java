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
import project_006_081.CariJadwalView;
import project_006_081.FormPemesananView;
import project_006_081.PesanTiketView;

/**
 *
 * @author Acer
 */
public class CariJadwalController {
    CariJadwalView cjv;
    Connector conn;
    String from;
    String to;
    User user;

    public CariJadwalController(CariJadwalView cjv, Connector conn, String from, String to, User user) {
        this.cjv = cjv;
        this.conn = conn;
        this.from= from;
        this.to = to;
        this.user = user;
        showCariJadwal(from, to);
        
        cjv.tabelJadwalTersedia.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int row = cjv.tabelJadwalTersedia.getSelectedRow();
                String[] kolomCariJadwal = new String[9];
                kolomCariJadwal[0] = (String) cjv.tabelJadwalTersedia.getValueAt(row, 0);
                kolomCariJadwal[1] = (String) cjv.tabelJadwalTersedia.getValueAt(row, 1);
                kolomCariJadwal[2] = (String) cjv.tabelJadwalTersedia.getValueAt(row, 2);
                kolomCariJadwal[3] = (String) cjv.tabelJadwalTersedia.getValueAt(row, 3);
                kolomCariJadwal[4] =(String) cjv.tabelJadwalTersedia.getValueAt(row, 4);
                kolomCariJadwal[5] =  (String) cjv.tabelJadwalTersedia.getValueAt(row, 5);
                kolomCariJadwal[6] = (String) cjv.tabelJadwalTersedia.getValueAt(row, 6);
                kolomCariJadwal[7] =(String) cjv.tabelJadwalTersedia.getValueAt(row, 7);
                kolomCariJadwal[8] =(String) cjv.tabelJadwalTersedia.getValueAt(row, 8);
                int input = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin memilih jadwal ini?", "Option", JOptionPane.YES_NO_OPTION);
                if (input == 0) {
                    FormPemesananView fpv = new FormPemesananView();
                    FormPemesananController fpc = new FormPemesananController(conn, fpv, user, kolomCariJadwal, from, to);
                    fpv.setVisible(true);
                    cjv.dispose();
                }
            }
        });
        
        cjv.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PesanTiketView ptv = new PesanTiketView();
                PesanTiketController ptc = new PesanTiketController(ptv, conn, user);
                ptv.setVisible(true);
                cjv.dispose();
            }
        });
    }
    
    public void showCariJadwal (String from, String to){
        String[][] data = conn.resultJadwal(from, to);
        String[] namaKolom = {"No. Pesawat", "Maskapai", "Kelas", "Asal", "Tujuan", "Tanggal", "Berangkat", "Tiba", "Harga"};
        DefaultTableModel tableModel = new DefaultTableModel(data, namaKolom){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        cjv.tabelJadwalTersedia.setModel(tableModel);
        
    }
};