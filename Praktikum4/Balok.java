/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author LENOVO LOQ
 */
public class Balok {
    protected double panjang;
    protected double lebar;
    protected double tinggi;

    // Constructor untuk Balok (Overloading constructor)
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Method untuk menghitung volume (Overriding method dalam subclass Kubus)
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    // Method untuk menghitung luas permukaan (Overriding method dalam subclass Kubus)
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }  
}
