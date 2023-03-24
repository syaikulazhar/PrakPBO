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
public class Designer implements Penilaian {
    double dP, p, c;

    public Designer(double dP, double p, double c) {
        this.dP = dP;
        this.p = p;
        this.c = c;
    }
    
    
    @Override
    public double hasilPenilaian() {
        return (this.dP * 0.30) + (this.p * 0.45) + (this.c * 0.25);
    }
    
}
