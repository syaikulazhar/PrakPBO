/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab Informatika
 */
public class Connector {
    String DBurl = "jdbc:mysql://localhost/db_lomba";
    String DBusername = "root";
    String DBpassword = "";
    public Connection koneksi;
    public Statement statement;

    public Connector() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl, DBusername, DBpassword);
            System.out.println("Koneksi Berhasil!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Koneksi gagal!");
            System.out.println(e.getMessage());
        }
    }
    
    public int cekJmlData () {
        int jmlData = 0;
        try {
            String query = "SELECT * FROM lomba";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()) {
                jmlData ++;
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return jmlData;
    }
    
    public String[][] readData () {
        String dataLomba[][] = new String[cekJmlData()][6];
        int jmlData = 0;
        try {
            String query = "SELECT * FROM lomba";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()) {
                dataLomba[jmlData][0] = resultSet.getString("judul");
                dataLomba[jmlData][1] = resultSet.getString("alur");
                dataLomba[jmlData][2] = resultSet.getString("orisinalitas");
                dataLomba[jmlData][3] = resultSet.getString("pemilihanKata");
                dataLomba[jmlData][4] = resultSet.getString("nilai");
                
                jmlData++;
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return dataLomba;
    }
    
    public void tambahData (String judul, int alur, int ori, int kata) {
        int nilai  = (alur + ori + kata) / 3;
        try {
                String query = "INSERT INTO `lomba`(`judul`, `alur`, `orisinalitas`, `pemilihanKata`, `nilai`) VALUES ('" + judul + "','" +alur+"','" +ori+ "','" + kata + "','" + nilai +"')";
                statement = koneksi.createStatement();
                statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Tambah data berhasil!");
        } catch(Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Judul sudah ada!");
        }
    }
    
    public void hapusData (String judul) {
        try {
            String query = "DELETE FROM lomba WHERE judul = '" + judul + "'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Hapus data berhasil!");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateData (String judul, int alur, int ori, int kata ) {
        int nilai  = (alur + ori + kata) / 3;
        try {
            String query = "UPDATE `lomba` SET alur = '"+alur+"', orisinalitas = '" + ori +"', pemilihanKata = '" + kata + "', nilai = '" + nilai + "' WHERE judul = '"+judul+"'"; 
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Update data berhasil!");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
