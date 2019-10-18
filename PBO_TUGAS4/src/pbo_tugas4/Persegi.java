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
public class Persegi extends BangunDatar {

    protected double Sisi;

    public double Luas(double s) {
        double L = Math.pow(s, 2);
        return L;
    }

    public double Keliling(double s) {
        double K = s + s + s + s;
        return K;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("\nLuasnya adalah\t: " + Luas(Sisi) + " cm^2" + "\nKeliling adalah\t: " + Keliling(Sisi) + " cm");
    }
}
