/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kategori;

/**
 *
 * @author Lab Informatika
 */
public class Programmer implements Penilaian {
    double pK, cC, d;

    public Programmer(double pK, double cC, double d) {
        this.pK = pK;
        this.cC = cC;
        this.d = d;
    }
    
    @Override
    public double hasilPenilaian() {
        return (this.pK * 0.60) + (this.cC * 0.15) + (this.d * 0.25);
    }
}
