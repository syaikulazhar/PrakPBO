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
import view.UserInterface;

/**
 *
 * @author Lab Informatika
 */
public class UIController {
    Connector conn;
    UserInterface ui;

    public UIController(Connector conn, UserInterface ui) {
        this.conn = conn;
        this.ui = ui;
        showData();
        
        ui.bTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conn.tambahData(ui.getJudul(), ui.getAlur(), ui.getOri(), ui.getKata());
                showData();
            }
        });
        
        ui.tabelData.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int row = ui.tabelData.getSelectedRow();
                String[] kolomKlikTabel = new String[4];
                kolomKlikTabel[0] = (String) ui.tabelData.getValueAt(row, 0);
                kolomKlikTabel[1] = (String) ui.tabelData.getValueAt(row, 1);
                kolomKlikTabel[2] = (String) ui.tabelData.getValueAt(row, 2);
                kolomKlikTabel[3] = (String) ui.tabelData.getValueAt(row, 3);
                
                ui.tfJudul.setText(kolomKlikTabel[0]);
                ui.tfAlur.setText(kolomKlikTabel[1]);
                ui.tfOri.setText(kolomKlikTabel[2]);
                ui.tfKata.setText(kolomKlikTabel[3]);
            }
        });
        
        ui.bClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ui.tfJudul.setText("");
                ui.tfAlur.setText("");
                ui.tfOri.setText("");
                ui.tfKata.setText("");
            }
        });
        
        ui.bDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data?", "Option", JOptionPane.YES_NO_OPTION);
                if (input == 0) {
                    conn.hapusData(ui.getJudul());
                    showData();
                }
            }
        });
        
        ui.bUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conn.updateData(ui.getJudul(), ui.getAlur(), ui.getOri(),ui.getKata());
                showData();
            }
        });
    }
    
    void showData() {
        String[][] data = conn.readData();
        String[] namaKolom = {"Judul", "Alur", "Orisaniltas", "Pemilihan Kata", "Nilai" };
        DefaultTableModel tableModel = new DefaultTableModel(data, namaKolom) {
            @Override
            public boolean isCellEditable (int row, int column) {
            return false;
        }
    };
    ui.tabelData.setModel(tableModel);
    }
    
}
