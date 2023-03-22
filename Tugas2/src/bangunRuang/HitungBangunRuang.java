/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bangunRuang;

/**
 *
 * @author Syaikul Azhar
 */
public interface HitungBangunRuang {
    default double volume() {
        System.out.println("ini volume");
        return 0;
    }
    
    default double luasPermukaan() {
        System.out.println("ini luas permukaan");
        return 0;
    }
}
