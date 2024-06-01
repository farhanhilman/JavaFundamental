package com.juaracoding;

import java.util.Scanner;

public class ArrayJava {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(array[2]);

        int angka[] = new int[5];

        angka[0] = 233;
        angka[1] = 23;
        angka[2] = 12;
        angka[3] = 33;
        angka[4] = 122;

        System.out.println(angka[2]);

        System.out.println(angka.length);

        for (int i = 0; i < angka.length; i++) {
            int j = i + 1;
            System.out.println("angka ke-" + j + " = " + angka[i]);
        }

        String cars[] = {"ferrari", "lamborghini", "supra", "mustang"};
        double prices[] = {5000, 6000, 5400, 4500};

        for (int i = 0; i < cars.length; i++) {
            int j = i + 1;
            System.out.println("mobil ke-" + j + " = " + cars[i] + " dengan harga " + prices[i] + " dolar");
        }

        for (String car : cars) {
            System.out.println(car);
        }

        int numbers[][] = {{1, 2, 3, 4}, {7, 8, 9}, {11, 23, 34}};
        System.out.println(numbers[2][2]);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Total angka = ");
        int inputAngka = scanner.nextInt();
        double bilangan[] = new double[inputAngka];

        for (int i = 0; i < inputAngka; i++) {
            System.out.print("input bilagan ke-" + i + " = ");
            bilangan[i] = scanner.nextDouble();
        }

        for (int i = 0; i < inputAngka; i++) {
            System.out.println(bilangan[i]);
        }

        System.out.print("Masukkan kata yang ingin dicari = ");
        String search = scanner.next();

        for (int i = 0; i < cars.length; i++) {
            if (search.equals(cars[i])) {
                int j = i;
                System.out.println("mobil ditemukan di data ke-" + j);
            } else {
                System.out.println("data tidak ditemukan");
            }
        }

        // mencari kata terpanjang
        String kataTerpanjang = cars[0];
        for (int i = 0; i < cars.length; i++) {
            if (kataTerpanjang.length() < cars[i].length()) { // 6 < 5
                kataTerpanjang = cars[i];
            }
        }

        System.out.println("Kata terpanjang adalah " + kataTerpanjang);
    }
}