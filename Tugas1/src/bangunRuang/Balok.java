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
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private float tinggi;

    public Balok(float tinggi, float panjang, float lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }
    
    
    
    @Override
    public float luasPermukaan() {
        float newLebar = getLebar();
        float newPanjang = getPanjang();
        
        return 2 * (this.luas() + (newLebar * this.tinggi) + (newPanjang * this.tinggi));
    }

    @Override
    public float volume() {
        return this.luas() * this.tinggi;
    }
    
}
