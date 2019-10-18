/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_tugas4;

import java.util.Scanner;

/**
 *
 * @author Ahnaf
 */
public class NewMain {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Pilih bangun datar yang diinginkan\n1. Persegi\n2. Lingkaran\n3. Segitiga\nMasukkan pilihan Anda : ");
        int JenisBangunDatar = X.nextInt();
        switch (JenisBangunDatar) {
            case 1:
                Persegi a = new Persegi();
                a.Jenis = "Persegi";
                System.out.print("Masukkan panjang sisi : ");
                a.Sisi = X.nextDouble();
                a.view();
                break;
            case 2:
                Lingkaran b = new Lingkaran();
                b.Jenis = "Lingkaran";
                System.out.print("Masukkan panjang jari-jari : ");
                b.jari = X.nextDouble();
                b.view();
                break;
            case 3:
                JenisSegitiga c = new JenisSegitiga();
                c.Jenis = "Segitiga";
                System.out.println("Pilih segitiga yang diinginkan\n1. Segitiga Siku-Siku\n2. Segitiga Sama Sisi");
                System.out.print("Masukkan pilihan Anda : ");
                int JenisSegitiga = X.nextInt();
                System.out.print("Masukkan panjang alas : ");
                c.Alas = X.nextDouble();
                System.out.print("Masukkan panjang tinggi : ");
                c.Tinggi = X.nextDouble();
                c.view();
                switch (JenisSegitiga) {
                    case 1:
                        c.Jenis = "Segitiga Siku-Siku";
                        c.view(c.Alas, c.Tinggi);
                        break;
                    case 2:
                        c.Jenis = "Segitiga Sama Sisi";
                        c.view(c.Alas);
                        break;
                    default:
                        System.out.println("Tidak ada dalam pilihan");
                        break;
                }
                break;
            default:
                System.out.println("Tidak ada dalam pilihan");
                break;
        }
    }
}
