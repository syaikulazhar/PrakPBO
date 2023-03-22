/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;

import bangunDatar.PersegiPanjang;

/**
 *
 * @author Syaikul Azhar
 */
public class Balok extends PersegiPanjang implements HitungBangunRuang{
    public double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
        return super.luas() * this.tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * ((this.panjang * this.lebar) + (this.panjang * this.tinggi) + (this.tinggi * this.lebar));
    }
    
}
