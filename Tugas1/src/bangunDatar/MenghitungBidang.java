/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author Syaikul Azhar
 */
public interface MenghitungBidang {
    default float luas(){
        System.out.println("ini luas1");
        return 0;
    };
    
    default float keliling() {
        System.out.println("ini keliling");
        return 0;
    };
}
