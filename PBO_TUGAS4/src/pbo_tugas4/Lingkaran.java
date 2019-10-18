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
public class Lingkaran extends BangunDatar {

    protected double jari;

    public double Luas(double j) {
        double L = Math.pow(j, 2) * Math.PI;
        return L;
    }

    public double Keliling(double j) {
        double K = 2 * Math.PI * j;
        return K;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("lingkaran" + "\nluas lingkaran adalah\t\t: " + Luas(jari) + " cm^2" + "\nkeliling lingkaran adalah\t: " + Keliling(jari) + " cm");

    }
}
