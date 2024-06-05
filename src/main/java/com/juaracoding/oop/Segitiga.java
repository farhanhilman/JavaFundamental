package com.juaracoding.oop;

public class Segitiga extends BidangDatar {

    private int sisi;
    private int alas;
    private int tinggi;

    public Segitiga(int sisi) {
        this.sisi = sisi;
    }

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void draw() {
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void luas(){
        System.out.println("luas segitiga: " + 0.5 * alas * tinggi);
    }

}