/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author LENOVO LOQ
 */
public class Kubus extends Balok{
  // Constructor untuk Kubus (Overloading constructor)
    public Kubus(double sisi) {
        // Memanggil constructor superclass (Balok) dengan nilai sisi yang sama untuk panjang, lebar, dan tinggi
        super(sisi, sisi, sisi);
    }

    // Overriding method hitungVolume untuk Kubus
    @Override
    public double hitungVolume() {
        return panjang * panjang * panjang;
    }

    // Overriding method hitungLuasPermukaan untuk Kubus
    @Override
    public double hitungLuasPermukaan() {
        return 6 * (panjang * panjang);
    }  
}
