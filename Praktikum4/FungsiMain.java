/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author LENOVO LOQ
 */
public class FungsiMain {
     public static void main(String[] args) {
        // Membuat objek Balok dengan panjang 5, lebar 3, tinggi 4
        Balok balok = new Balok(5, 3, 4);
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());

        // Membuat objek Kubus dengan sisi 3
        Kubus kubus = new Kubus(3);
        System.out.println("\nVolume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
}
