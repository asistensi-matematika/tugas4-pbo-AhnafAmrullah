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
public class JenisSegitiga extends Segitiga {

    public double SisiMiring(double a, double t) {
        double miring = Math.sqrt(Math.pow(a, 2) + Math.pow(t, 2));
        return miring;
    }

    public double keliling(double a) {
        double K = a + a + a;
        return K;
    }

    public double keliling(double a, double t) {
        double K = a + t + SisiMiring(a, t);
        return K;
    }

    public void view(double a) {
        System.out.println("Jenis Segitiga adalah " + Jenis + "\nKeliling Segitiga adalah : " + keliling(a) + " cm");
    }

    public void view(double a, double t) {
        System.out.println("Jenis Segitiga adalah " + Jenis + "\nKeliling Segitiga adalah : " + keliling(a, t) + " cm");
    }
}
