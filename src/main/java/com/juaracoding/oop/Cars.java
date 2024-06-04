package com.juaracoding.oop;

public class Cars {
    private String merkKendaraan;
    private String bahanBakar;
    private int tahunPembuatan;

    Cars(String merkKendaraan, String bahanBakar, int tahunPembuatan){
        this.bahanBakar = bahanBakar;
        this.tahunPembuatan = tahunPembuatan;
        this.merkKendaraan = merkKendaraan;
    }

    void warna(){
        System.out.println("Mobil berwarna merah");
    }

    void mesin(){
        System.out.println("bermesin 1800");
    }

    String getMerkKendaraan(){
        return merkKendaraan;
    }

    int getTahunPembuatan(){
        return tahunPembuatan;
    }

    String getBahanBakar(){
        return bahanBakar;
    }
}

