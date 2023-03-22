/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author Syaikul Azhar
 */
public class PersegiPanjang implements HitungBangunDatar{
    public double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    
    @Override
    public double luas() {
        return this.panjang * this.lebar;
    }

    @Override
    public double keliling() {
        return 2 * (this.panjang + this.lebar);
    }
   
}
