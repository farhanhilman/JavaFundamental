package com.juaracoding.oop;

import java.util.Date;

public class MainAppOOP {
    public static void main(String[] args) {

        Fruit apel = new Fruit();
        apel.gram = 100;
        apel.calsPerGram = 30;
        System.out.println(apel.totalCalories());

        Fruit mangga = new Fruit();
        mangga.gram = 100;
        mangga.calsPerGram = 24;
        System.out.println(mangga.totalCalories());

        //Clean code
        Kotak kotak = new Kotak(3);
        kotak.draw();

        Cars cars = new Cars("Mercedes","Pertalite", 2000);
        cars.warna();
        cars.mesin();
        System.out.println("Merknya " + cars.getMerkKendaraan());
        System.out.println("bahannya " + cars.getBahanBakar());
        System.out.println("tahun pembuatan " + cars.getTahunPembuatan());

        Date date = new Date();
        System.out.println("Waktu saat ini adalah : " + date);
        System.out.println("Tanggal : " + date.getDate());

    }
}
