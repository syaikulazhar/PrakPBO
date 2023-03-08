/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author Syaikul Azhar
 */
public class Lingkaran implements MenghitungBidang {
    private float jari2;

    public Lingkaran(float jari2) {
        this.jari2 = jari2;
    }

    public float getJari2() {
        return jari2;
    }

    public void setJari2(float jari2) {
        this.jari2 = jari2;
    }

    @Override
    public float luas() {
        return (float) Math.PI * this.jari2 * this.jari2;
    }

    @Override
    public float keliling() {
        return 2 * (float) Math.PI * this.jari2;
    }
    
    
    
}
