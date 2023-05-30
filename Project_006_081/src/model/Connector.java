/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.User;
import java.sql.*;
import javax.swing.JOptionPane;
import project_006_081.PesanTiketView;

/**
 *
 * @author Acer
 */
public class Connector {
    String DBurl = "jdbc:mysql://localhost/tiket_pesawat";
    String DBusername = "root";
    String DBpassword = "";
    public Connection koneksi;
    public Statement statement;
    
    public Connector() {
        try{
            Class.forName("com.mysql.jdbc.Driver"); // memanggil fungsi dari library yang dibuat
            koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Koneksi error!");
        }
    } 
    
    //ini mengecek jumlah data jadwal pesawat
    public int jmlDataJadwal () {
        int jumlahDataJadwal = 0;
        try {
            String query = "SELECT * FROM jadwal_pesawat";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                jumlahDataJadwal++;
            }
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        return jumlahDataJadwal;
    }
    
    //ini membaca data jadwal pesawat
    public String[][] readDataJadwal() {
        String[][] dataJadwal = new String [jmlDataJadwal()][8];
        int jumlahDataJadwal = 0;
        try {
            String query = "SELECT * FROM jadwal_pesawat";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                dataJadwal[jumlahDataJadwal][0] = resultSet.getString("no_pesawat");
                dataJadwal[jumlahDataJadwal][1] = resultSet.getString("maskapai");
                dataJadwal[jumlahDataJadwal][2] = resultSet.getString("kelas");
                dataJadwal[jumlahDataJadwal][3] = resultSet.getString("asal");
                dataJadwal[jumlahDataJadwal][4] = resultSet.getString("tujuan");
                dataJadwal[jumlahDataJadwal][5] = resultSet.getString("tanggal");
                dataJadwal[jumlahDataJadwal][6] = resultSet.getString("berangkat");
                dataJadwal[jumlahDataJadwal][7] = resultSet.getString("tiba");
                
                jumlahDataJadwal++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return dataJadwal;
    } 
    
    //ini mengecek banyak data riwayat perjalanan
    public int jmlDataRiwayat (String id_user) {
        int jumlahDataRiwayat = 0;
        try {
            String query = "SELECT * FROM riwayat_perjalanan WHERE id_user = '" +id_user+"'";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                jumlahDataRiwayat++;
            }
        } catch (Exception e) {
           e.getMessage();
        }
        return jumlahDataRiwayat;
    }
    
    //ini membaca data riwayat perjalanan
    public String[][] readDataRiwayat(String id_user) {
        String[][] dataRiwayat = new String [jmlDataRiwayat(id_user)][12];
        int jumlahDataRiwayat = 0;
        try {
            String query = "SELECT id_perjalanan, nama_depan, nama_belakang, no_ktp, no_pesawat, maskapai, kelas, asal, tujuan, tanggal, berangkat, tiba FROM riwayat_perjalanan WHERE id_user = '" +id_user+"'";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                dataRiwayat[jumlahDataRiwayat][0] = resultSet.getString("id_perjalanan");
                dataRiwayat[jumlahDataRiwayat][1] = resultSet.getString("nama_depan");
                dataRiwayat[jumlahDataRiwayat][2] = resultSet.getString("nama_belakang");
                dataRiwayat[jumlahDataRiwayat][3] = resultSet.getString("no_ktp");
                dataRiwayat[jumlahDataRiwayat][4] = resultSet.getString("no_pesawat");
                dataRiwayat[jumlahDataRiwayat][5] = resultSet.getString("maskapai");
                dataRiwayat[jumlahDataRiwayat][6] = resultSet.getString("kelas");
                dataRiwayat[jumlahDataRiwayat][7] = resultSet.getString("asal");
                dataRiwayat[jumlahDataRiwayat][8] = resultSet.getString("tujuan");
                dataRiwayat[jumlahDataRiwayat][9] = resultSet.getString("tanggal");
                dataRiwayat[jumlahDataRiwayat][10] = resultSet.getString("berangkat");
                dataRiwayat[jumlahDataRiwayat][11] = resultSet.getString("tiba");
                
                jumlahDataRiwayat++;
            }
        } catch (Exception e) {
           e.getMessage();
        }
        return dataRiwayat;
    }
    
    //ini menghapus riwayat perjalanan
    public void hapusRiwayat (int id_jadwal) {
        try {
            String query = "DELETE FROM `riwayat_perjalanan` WHERE `riwayat_perjalanan`.`id_perjalanan` =" + id_jadwal;
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Koneksi gagal");
        }
    }
    
    //auto generate dropdown asal di pesan tiket view
    public String[] dropAsal (){
        String[] dataAsal = new String[jmlDataJadwal()];
        int jmlData = 0;
        try {
            String query = "SELECT asal FROM jadwal_pesawat";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next() ) {
                dataAsal[jmlData] = resultSet.getString("asal");
                jmlData++;
            } 
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal");
        }
        return dataAsal;
    }
    
    //auto generate dropdown tujuan di pesan tiket view
    public String[] dropTujuan (){
        String[] dataTujuan = new String[jmlDataJadwal()];
        int jmlData = 0;
        try {
            String query = "SELECT tujuan FROM jadwal_pesawat";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next() ) {
                dataTujuan[jmlData] = resultSet.getString("tujuan");
                jmlData++;
            } 
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal");
        }
        return dataTujuan;
    }
    
    //menghitung banyak data sesuai inputan asal dan tujuan di tabel cari jadwal view
    public int jmlDataResultJadwal (String from, String to) {
        int jumlahDataJadwal = 0;
        try {
            String query = "SELECT * FROM jadwal_pesawat WHERE asal = '" + from + "' AND tujuan = '" + to + "'";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                jumlahDataJadwal++;
            }
        } catch (Exception e) {
            System.out.println("gabisa");
        }
        return jumlahDataJadwal;
    }
    
    //mebaca data jadwal yang tersedia lalu ditampilkan di tabel cari jadwal view
    public String[][] resultJadwal (String from, String to) {
        String[][] hasilJadwal = new String[jmlDataResultJadwal(from, to)][9];
        int jmlData = 0;
        try {
            String query = "SELECT no_pesawat, maskapai, kelas, asal, tujuan, tanggal, berangkat, harga, tiba FROM jadwal_pesawat WHERE asal = '" + from + "' AND tujuan = '" + to + "'";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next() ) {
                hasilJadwal[jmlData][0] = resultSet.getString("no_pesawat");
                hasilJadwal[jmlData][1] = resultSet.getString("maskapai");
                hasilJadwal[jmlData][2] = resultSet.getString("kelas");
                hasilJadwal[jmlData][3] = resultSet.getString("asal");
                hasilJadwal[jmlData][4] = resultSet.getString("tujuan");
                hasilJadwal[jmlData][5] = resultSet.getString("tanggal");
                hasilJadwal[jmlData][6] = resultSet.getString("berangkat");
                hasilJadwal[jmlData][7] = resultSet.getString("tiba");
                hasilJadwal[jmlData][8] = resultSet.getString("harga");
                
                jmlData++;
            } 
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return hasilJadwal;
    }
    
    //cek akun bener apa ngga di page login
    public boolean login (String username, String password) {
        try {
            String query = "SELECT COUNT(*) AS total FROM user WHERE username = '" + username + "' AND password = BINARY '" + password + "'";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next() ) {
                if (resultSet.getString("total").equals("1")) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Username atau Password salah!");
        return false;
    }
    
    //membaca info akun sesuai username
    public String[] readDataUser (String username) {
        String[] dataUser = new String[5];
        try {
            String query = "SELECT * FROM user WHERE username = '" + username + "'";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next() ) {
                dataUser[0] = resultSet.getString("nama_lengkap");
                dataUser[1] = resultSet.getString("email");
                dataUser[2] = resultSet.getString("username");
                dataUser[3] = resultSet.getString("password");
                dataUser[4] = resultSet.getString("id_user");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return dataUser;
    }
    
    //daftar akun
    public void daftarAkun (String namaLengkap, String email, String username, String password) {
        try {
            String query = "INSERT INTO `user`(`nama_lengkap`, `email`,`username`,`password`) VALUES ('"+ namaLengkap +"','"+ email +"','"+ username +"','"+ password +"')";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Daftar  Berhasil!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //pas daftar akun, usernamenya ada sama apa ngga
    public boolean checkUsername(String username) {
        try {
            String query = "SELECT COUNT(*) as total FROM user WHERE username = '"+ username + "'";
            statement = koneksi.createStatement();
            statement.executeQuery(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next() ) {
                if (resultSet.getString("total").equals("1")) {
                    JOptionPane.showMessageDialog(null, "Username sudah ada!");
                    return false;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
    
    //mengecek kebenaran akun pada saat di update
    public boolean checkUpdate (String username, String password) {
        try {
            String query = "SELECT COUNT(*) AS total FROM user WHERE username = '" + username + "' AND password = BINARY '" + password + "'";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next() ) {
                if (resultSet.getString("total").equals("1")) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Password salah!");
        return false;
    }
    
    
    //update akun
    public void updateData (String usernameBaru, String nama, String email, String usernameLama) {
        try{
            String query = "UPDATE user SET nama_lengkap = '" + nama +"', email = '" + email + "', username = '" + usernameBaru + "' WHERE username = '" + usernameLama + "'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //mengecek apakah usernamenya tersedia pa ngga
     public boolean checkUpdateUsername (String usernameLama, String usernameBaru) {
        try {
            String query = "SELECT COUNT(*) AS total FROM user WHERE username = '" + usernameBaru + "' AND username != '" + usernameLama + "'";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next() ) {
                if (resultSet.getString("total").equals("1")) {
                    JOptionPane.showMessageDialog(null, "Username sudah terpakai");
                    return false;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
     
     //tambah riwayat dari form pemesanan
     public void tambahRiwayat (String[] kolomCariJadwal, String[] kolomPemesan, User user) {
        try {
            String query = "INSERT INTO `riwayat_perjalanan`(`id_user`,`nama_depan`,`nama_belakang`,`no_ktp`,`no_pesawat`, `maskapai`, `kelas`,`asal`,`tujuan`, `tanggal`, `berangkat`,`tiba`) VALUES ('"+ user.getId_user() +"','"+ kolomPemesan[0] +"','"+ kolomPemesan[1] +"','"+ kolomPemesan[2] +"','"+kolomCariJadwal[0]+"','"+kolomCariJadwal[1]+"','"+kolomCariJadwal[2]+"','"+kolomCariJadwal[3]+"','"+kolomCariJadwal[4]+"','"+kolomCariJadwal[5]+"','"+kolomCariJadwal[6]+"','"+kolomCariJadwal[7]+"')";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     
}
