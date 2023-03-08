/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author Syaikul Azhar
 */
public class PersegiPanjang implements MenghitungBidang{
    private float panjang, lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public float getLebar() {
        return lebar;
    }

    @Override
    public float luas() {
        return this.panjang * this.lebar;
    }

    @Override
    public float keliling() {
        return (2 * this.panjang) + (2 * this.lebar);
    }
    
    
    
}
