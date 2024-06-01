package com.juaracoding;

public class Variable {

    public static void main(String[] args) {

        // cara 1
        // int id = 1;

        // cara 2
        int id;
        id = 1;

        byte sizeCart = 100;

        float nilai = 88.90f;

        double transfer = 1000.504;
        System.out.println(transfer);
        System.out.println(transfer);
        System.out.printf("%.2f %.2f\n",transfer,nilai);
        System.out.printf("%.2f %.2f\n",transfer,nilai);

        char predikat = 'A';
        System.out.println(predikat);

        String nama = "Farhan";
        Byte usia = 23;
        int tinggiBadan = 164;
        double beratBadan = 60.2;
        Character golDarah = 'O';
        Float ipk = 3.62F;
        boolean pria = true;
        long nik = 1671082202010006L;

        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        System.out.println("Tinggi Badan : " + tinggiBadan + " cm");
        System.out.println("Berat Badan : " + beratBadan + " kg");
        System.out.println("Golongan Darah : " + golDarah);
        System.out.println("Indeks Prestasi Kumulatif : " + ipk);
        System.out.println("Jenis Kelamin Pria : " + pria);
        System.out.println("Nomor Induk Kependudukan : " + nik);

//
        double x = 23.2005;
        char r = 'g';
        String num = "a";

        {
            System.out.printf("%.3f\t", x);
            System.out.println(r);
            System.out.println(num);
        }

        // tipe data primitive dan non primitive (tipe data object)

        boolean isLogin = true;
        System.out.println(isLogin);

        // buatkan informasi profile user dan tampilkan ke console
        boolean isActive = false;

        // automatic casting / implicit
        short data1 = 457;
        double doubleData = data1;
        System.out.println(doubleData);

        char data2 = 'w';
        long dataLong = data2;
        System.out.println(dataLong);

        // manual casting / explicit
        long data3 = 9223372036854775000l;
        int dataInt = (int) data3;
        System.out.println(dataInt);

    }

}
