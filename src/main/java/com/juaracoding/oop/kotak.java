package com.juaracoding.oop;

public class Kotak extends BidangDatar {

    int sisi;

    Kotak(int sisi){
        this.sisi = sisi;
    }

    public void draw() {
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void luas(){
        System.out.println("luas kotak: " + sisi * sisi);
    }
}
