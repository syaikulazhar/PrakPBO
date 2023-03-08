
import bangunRuang.Balok;
import bangunRuang.Tabung;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Syaikul Azhar
 */
public class Main {
    public static void main(String[] args) {
        int ulang;
        
        do {
        System.out.println("==========");
        System.out.println("Menu Utama");
        System.out.println("==========");
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Tabung");
        System.out.println("0. Exit");
        System.out.print("Pilih : ");
        Scanner pilih = new Scanner(System.in);
        Scanner masukkan = new Scanner(System.in);
        int pilihMenu = pilih.nextInt();
        
        switch(pilihMenu) {
            case 0 -> {
                break;
            }
            case 1 -> {
                System.out.print("Input panjang : ");
                int panjang = masukkan.nextInt();
                System.out.print("Input lebar   : ");
                int lebar = masukkan.nextInt();
                System.out.print("Input tinggi  : ");
                int tinggi = masukkan.nextInt();
                
                segiEmpat(tinggi, panjang, lebar);
                break;
            }
            case 2 -> {
                System.out.print("Input jari - jari : " );
                int jari2 = masukkan.nextInt();
                System.out.print("Input tinggi      : ");
                int tinggi = masukkan.nextInt();
                
                segiTiga(jari2, tinggi);
                break;
            }
            default -> System.out.println("Inputan salah");
        }
            System.out.print("\nUlang (Ya : 1 || Tidak : 0)?  : ");
            ulang = pilih.nextInt(); 
    } while (ulang == 1);
}
    static void segiEmpat (int t, int p, int l) {
        Balok balok = new Balok(t, p, l);
    
        System.out.println("\nLuas persegi panjang    : " + balok.luas());
        System.out.println("Keliling persegi panjang : " + balok.keliling());
        System.out.println("Volume balok             : " + balok.volume());
        System.out.println("Luas permukaan           : " + balok.luasPermukaan());
    }
    
    static void segiEmpat (float t, float p, float l) {
        Balok balok = new Balok(t, p, l);
    
        System.out.println("\nLuas persegi panjang     : " + balok.luas());
        System.out.println("Keliling persegi panjang : " + balok.keliling());
        System.out.println("Volume balok             : " + balok.volume());
        System.out.println("Luas permukaan           : " + balok.luasPermukaan());
    }
    
    static void segiTiga (int r, int t) {
        Tabung tabung = new Tabung(t, r);
    
        System.out.println("\nLuas Lingkaran : " + tabung.luas());
        System.out.println("Keliling Lingkaran : " + tabung.keliling());
        System.out.println("Volume tabung      : " + tabung.volume());
        System.out.println("Luas permukaan     : " + tabung.luasPermukaan());
    }
    
    static void segiTiga (float r, float t) {
        Tabung tabung = new Tabung(t, t);
    
        System.out.println("\nLuas Lingkaran : " + tabung.luas());
        System.out.println("Keliling Lingkaran : " + tabung.keliling());
        System.out.println("Volume tabung      : " + tabung.volume());
        System.out.println("Luas permukaan     : " + tabung.luasPermukaan());
    }
    
}