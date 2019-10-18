/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_tugas4;

/**
 *
 * @author Ahnaf
 */
public class Segitiga extends BangunDatar {

    protected double Alas;
    protected double Tinggi;

    public double Luas(double a, double t) {
        double L = (a * t) / 2;
        return L;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("\nLuas segitiga adalah\t: " + Luas(Alas, Tinggi) + " cm^2");
    }
}
