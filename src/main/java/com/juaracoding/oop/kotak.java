package com.juaracoding.oop;

public class Kotak {

    int sisi;

    Kotak(int sisi){
        this.sisi = sisi;
    }

    void draw() {
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}