package latihan;

import java.util.*;
import java.text.DecimalFormat;

public class subclass extends superclass {

    Scanner myvar = new Scanner(System.in);
    DecimalFormat koma = new DecimalFormat();
    int jenis;
    String kendaraan;
    double diskon, ttlhrg, ttl, bayar, kmbl, price, parkir;
  
    public void transaksi() {
        System.out.println("---------Selamat Datang----------");
        System.out.println("--- Tempat Parkir Dimana Saja ---");
        System.out.println("1.Mobil Rp. 5.000,-/jam");
        System.out.println("2.Motor Rp. 2.000,-/jam");
        System.out.println("-----------------------------");
        System.out.print("Masukan pilihan Anda : ");
        jenis = myvar.nextInt();
        switch (jenis) {
            case 1: {
                kendaraan = "Mobil";
                price = 5000;
                System.out.println("Jenis Kendaraan Anda : " + kendaraan);
                System.out.print("Berapa Lama Anda Parkir : ");
                parkir = myvar.nextDouble();    
                System.out.println("-----------------------------------");
                System.out.println("Struk Parkir Anda");
                System.out.println("Jl. Raya Serang km. 5 Taman Drangong");
                System.out.println("-----------------------------------");
                break;
            }
            case 2: {
                kendaraan = "Motor";
                price = 2000;
                System.out.println("Jenis Kendaraan Anda : " + kendaraan);
                System.out.print("Berapa Lama Anda Parkir : ");
                parkir = myvar.nextDouble();
                System.out.println("-----------------------------------");
                System.out.println("Struk Parkir Anda");
                System.out.println("Jl. Raya Serang km. 5 Taman Drangong");
                System.out.println("-----------------------------------");
                break;
            }
        }
    }

    public void diskon() {
        System.out.println("-----------------------------------");
        System.out.println("------------ Selamat  -------------");
        System.out.println("Anda Mendapatkan Diskon (20%)");
        System.out.println("-----------------------------------");
        ttl = parkir * price;
        System.out.println("Total Pembayaran Parkir Anda : Rp." + koma.format(ttl));
        diskon = ttl * 0.2;
        System.out.println("Anda mendapatkan diskon : Rp." + koma.format(diskon));
        ttlhrg = ttl - diskon;
        System.out.println("Total Pembayaran Setelah Diskon : Rp." + koma.format(ttlhrg));
        System.out.print("masukan Uang pembayaran  : Rp.");
        do {
            bayar = myvar.nextDouble();
            kmbl = bayar - ttlhrg;
            if (bayar < ttlhrg) {
                System.out.println("Uang anda kurang mohon coba lagi");
            }
        } while (bayar < ttlhrg);
        System.out.println("Uang Kembalian anda : Rp." + koma.format(kmbl));
        System.out.println("--------------------------------------------");
    }

    public void nondiskon() {
        System.out.println("--------------------------------------------");
        ttl = parkir * price;
        System.out.println("Total Pembayaran Parkir Anda : Rp." + koma.format(ttl));
        System.out.print("masukan pembayaran anda : Rp.");
        do {
            bayar = myvar.nextDouble();
            kmbl = (bayar - ttl);
            if (bayar < ttl) {
                System.out.println("Uang anda kurang mohon coba lagi");
            }
        } while (bayar < ttl);
        System.out.println("Kembalian anda Adalah: Rp." + koma.format(kmbl));
        System.out.println("--------------------------------------------");
    }
}
