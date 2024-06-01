package com.juaracoding;

public class Operator {

    public static void main(String[] args) {

        int modulus = 12 % 3;
        System.out.println(modulus);

        int x = 2;
//        int num1 = 10 * x++; // suffix
        int num1 = 10 * --x; // prefix

        System.out.println(num1);

        int result = (10 + 2) * 5;
        System.out.println(result);

        // operator assignment
        int a = 10;
        a += 5; // a = a + 5
        System.out.println(a);

        // operator perbandingan
        boolean hasil = 5 <= 5;
        System.out.println(hasil);

        int hasilBitwise = 10 | 12;
        System.out.println(hasilBitwise);

        boolean opLogika = true || false;
        System.out.println(opLogika);



    }

}
