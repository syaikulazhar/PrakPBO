/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventHandling;

import bangunRuang.Balok;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Syaikul Azhar
 */
public class ButtonHandling extends JFrame implements ActionListener {
    public JLabel lPanjang, lLebar, lTinggi, lLuas, lKetLuas, lKeliling, lKetKeliling, lVolume, lKetVolume, message;
    public JLabel lLuasPermukaan, lKetLuasPermukaan;
    public JButton hitung, reset;
    public JTextField tfPanjang, tfLebar, tfTinggi;
    
    public ButtonHandling() {
        setTitle("Kalkulator Balok");
        setSize(270, 400);
        lPanjang = new JLabel("Panjang   ");
        tfPanjang = new JTextField();
        lLebar = new JLabel("Lebar     ");
        tfLebar = new JTextField();
        lTinggi = new JLabel("Tinggi");
        tfTinggi = new JTextField();
        lKetLuas = new JLabel(""); //luas
        lLuas = new JLabel(""); // perhitungan
        lKetKeliling = new JLabel("");
        lKeliling = new JLabel("");
        lKetVolume = new JLabel(""); //luas
        lVolume = new JLabel(""); // perhitungan
        lKetLuasPermukaan = new JLabel("");
        lLuasPermukaan = new JLabel("");
        message = new JLabel("");
        hitung = new JButton("Hitung");
        reset = new JButton("Reset");
        
        setLayout(null);
        add(lPanjang);
        add(tfPanjang);
        add(lLebar);
        add(tfLebar);
        add(lTinggi);
        add(tfTinggi);
        add(hitung);
        add(reset);
        add(lLuas);
        add(lKetLuas);
        add(lKeliling);
        add(lKetKeliling);
        add(lVolume);
        add(lKetVolume);
        add(lLuasPermukaan);
        add(lKetLuasPermukaan);
        add(message);
        
        lPanjang.setBounds(10, 10, 100, 20);
        tfPanjang.setBounds(140, 10, 100, 20);
        lLebar.setBounds(10, 50, 100, 20);
        tfLebar.setBounds(140, 50, 100, 20);
        lTinggi.setBounds(10, 90, 100, 20);
        tfTinggi.setBounds(140, 90, 100, 20);
        hitung.setBounds(25, 130, 100, 20);
        reset.setBounds(135, 130, 100, 20);
        lLuas.setBounds(180, 160, 100, 20);
        lKetLuas.setBounds(20, 160, 130, 20);
        lKeliling.setBounds(180, 180, 100, 20);
        lKetKeliling.setBounds(20, 180, 150, 20);
        lVolume.setBounds(180, 200, 100, 20);
        lKetVolume.setBounds(20, 200, 150, 20);
        lLuasPermukaan.setBounds(180, 220, 100, 20);
        lKetLuasPermukaan.setBounds(20, 220, 150, 20);
        message.setBounds(50, 190,170,20);
       
        hitung.addActionListener(this);
        reset.addActionListener(this);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static boolean Numeric(String string) {
    double intValue;
		
    if(string == null || string.equals("")) {
        return false;
    }
    
    try {
        intValue = Double.parseDouble(string);
        return true;
    } catch (NumberFormatException e) {
    }
        return false;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == hitung){
            if (!Numeric(tfPanjang.getText()) || !Numeric(tfLebar.getText()) || !Numeric(tfTinggi.getText()) ) {
                JOptionPane.showMessageDialog(null, "Harap masukkan inputan yang benar!");
                lLuas.setText("");
                lKetLuas.setText("");
                lKeliling.setText("");
                lKetKeliling.setText("");
                lVolume.setText("");
                lKetVolume.setText("");
                lLuasPermukaan.setText("");
                lKetLuasPermukaan.setText("");
            } else {
                message.setText("");
                double panjang = Double.parseDouble(tfPanjang.getText());
                double lebar = Double.parseDouble(tfLebar.getText());
                double tinggi = Double.parseDouble(tfTinggi.getText());
                Balok balok = new Balok(panjang, lebar, tinggi);
                double luas = balok.luas();
                double keliling = balok.keliling();
                double volume = balok.volume();
                double luasPermukaan = balok.luasPermukaan();
                String luas2 = Double.toString(luas);
                String keliling2 = Double.toString(keliling);
                String volume2 = Double.toString(volume);
                String luasPermukaan2 = Double.toString(luasPermukaan);
                lLuas.setText(luas2);
                lKetLuas.setText("Luas persegi panjang: ");
                lKeliling.setText(keliling2);
                lKetKeliling.setText("Keliling Persegi panjang: ");
                lVolume.setText(volume2);
                lKetVolume.setText("Volume balok: ");
                lLuasPermukaan.setText(luasPermukaan2);
                lKetLuasPermukaan.setText("Luas permukaan balok: ");
            }
        }
        if (e.getSource() == reset){
            tfPanjang.setText("");
            tfLebar.setText("");
            tfTinggi.setText("");
        }
    }
}
