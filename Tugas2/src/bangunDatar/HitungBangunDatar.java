/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author Syaikul Azhar
 */
public interface HitungBangunDatar {
    default double luas() {
        System.out.println("ini luas");
        return 0;
    };
    default double keliling() {
        System.out.println("ini keliling");
        return 0;   
    };
}
