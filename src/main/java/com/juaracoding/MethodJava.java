package com.juaracoding;

public class MethodJava {
    public static void main(String[] args) {

        kotak(5);
        kotak(10);
        segitiga(4);
        System.out.println(luasKotak(4));
        double luasTanahA = luasKotak(5);
        double luasTanahB = luasKotak(10);
        pajakTanah(luasTanahA);
        pajakTanah(luasTanahB);
        System.out.println(userInfo("farhan", "1671082202010006"));
        if (isLogin("farhan", "123")){
            System.out.println("redirect ke dashboard");
        } else {
            System.out.println("invalid login");
        }
        String [] kendaraan = {"mobil","motor","pesawat","kereta"};
        System.out.println(cariKataTerpanjang(kendaraan));
    }

    //membuat kotak dari "*"
    public static void kotak(int sisi) {
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //membuat segitiga siku dari "*"
    public static void segitiga(int sisi) {
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Menghitung luas kotak
    public static double luasKotak(int sisi){
        return sisi * sisi;
    }

    //Menghitung pajak tanah jika luas tanah lebih dari 25 pajak tanah adalah 2000, jika tidak pajak tanah adalah 1000
    public static void pajakTanah(double luasTanah){
        if  (luasTanah > 25){
            System.out.println("pajaknya 2000");
        } else {
            System.out.println("pajaknya 1000");
        }
    }

    //Menampilkan user info yaitu username dan nomor induk
    public static String userInfo(String userName, String nomorInduk){
        return "Nama : " + userName + ", NIM : " + nomorInduk;
    }

    //Penggunaan boolean untuk login
    public static boolean isLogin(String chUsername, String password){
        boolean isLogin1 = chUsername.equals("farhan") && password.equals("123");
        if (isLogin1){
            return true;
        } else {
            return false;
        }
    }

    //Mencari kata terpanjang dari suatu array
    public static String cariKataTerpanjang(String [] kata) {
        String kataTerpanjang = kata[0];
        for (int i = 0; i < kata.length; i++) {
            if (kataTerpanjang.length() < kata[i].length()) { // 6 < 5
                kataTerpanjang = kata[i];
            }
        }

        return "Kata terpanjang adalah " + kataTerpanjang;
    }

}
