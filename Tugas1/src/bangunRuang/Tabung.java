/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;

import bangunDatar.Lingkaran;

/**
 *
 * @author Syaikul Azhar
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    float tinggi;

    public Tabung(float tinggi, float jari2) {
        super(jari2);
        this.tinggi = tinggi;
    }

    @Override
    public float luasPermukaan() {
        float newJari2 = getJari2();
        return this.keliling() * (newJari2 + this.tinggi); 
    }

    @Override
    public float volume() {
        return this.luas()* this.tinggi;
    }
}
