package com.juaracoding;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {

        for (int i = 9; i > 0; i--) {
            System.out.println("lap ke-" + i);
        }

        for (int i = 0; i < 10; i += 2) {
            System.out.println("angka genap = " + i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("angka genap = " + i);
            i++;
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.print(i);
            } else {
                System.out.print("*");
            }
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("(--------------------------------)");

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; i <= j; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            if (i == 6) {
                break;
            }
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                continue;
            }
            System.out.print(i);
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("username : ");
            String username = scanner.next();
            System.out.print("password : ");
            String password = scanner.next();
            if(username.equals("farhan") && password.equals("123")) break;
            else{
                System.out.println("Data yang anda masukkan salah, coba ulangi");
            }
        }

        System.out.println("berhasil login");



        String kata = "Tess";

        while (kata.length()<12) {

            kata = kata + "y";
        }
        System.out.println(kata);

        for (int i = 1; i < 5; i++) {

            for (int j = 0; j<i; j++) {

                System.out.print(5-j);

            }

            System.out.println();

        }

        int jumlahAnak = 3;

        do {

            jumlahAnak ++;

        }while(jumlahAnak<=2);

        System.out.print("Jumlah anak sekarang = "+jumlahAnak);



    }
}
