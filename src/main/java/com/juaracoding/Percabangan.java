package com.juaracoding;

public class Percabangan {

    public static void main(String[] args) {

        // String method
        if(false){
            System.out.println("Statement IF");
        } else {
            System.out.println("Statement Else");
        }

        // bilangan ganjil genap
        int angka = 5;
        if(angka % 2 == 0) { // 5 % 2 = 1 == 0 (false)
            System.out.println("bilangan genap");
        } else {
            System.out.println("bilangan ganjil");
        }

        String username = "farhan";
        String password = "123456";

        String inputUsername = "farhan";
        String inputPassword = "123456";


        boolean isLogin = username == inputUsername && password == inputPassword;
        boolean isKurangTepat = username == inputUsername || password == inputPassword;

        if (isLogin) {
            System.out.println("Login Berhasil");
        } else if (isKurangTepat) {
            System.out.println("Username atau Password kurang tepat");
        } else {
            System.out.println("Invalid Login");
        }
        System.out.println("(---------------------------)");

        // login
        // Login Berhasil ketika username dan password sesuai
        // Invalid Login
        String usernameAdmin = "Admin", passwordAdmin = "password";
        String chUsername = username.toLowerCase();
        String validUsername = "admin", validPassword = "password";


        boolean isLoginAdmin = chUsername.equals(validUsername) && password.equals(validPassword);
        System.out.println(isLogin);
        System.out.println(chUsername);
        if (isLoginAdmin){
            System.out.println("Login Berhasil");
        } else {
            System.out.println("Invalid Login");
        }


        // salary = 7000 wajib pajak
        // gender L, status BM = 10%
        // gender L, status M = 6%
        // gender P, status BM = 7%
        // gender P, status M = 4%
        double salary = 7000;
        char gender = 'L';
        String status = "M";
        if(salary >= 7000){
            System.out.println("Wajib pajak (pph21)");
            if(gender == 'L'){
                System.out.println("Laki-laki");
                if(status == "BM"){
                    System.out.println("Status belum menikah, pajak 10%");
                    System.out.println(salary*10/100);
                } else {
                    System.out.println("Status menikah, pajak 6%");
                    System.out.println(salary*6/100);
                }
            } else {
                System.out.println("Perempuan");
                // if
            }
        } else {
            System.out.println("Tidak wajib pajak (pph21)");
        }

        // operator ternary
        int nilai = 75;
        String output = (nilai >= 75) ? "Lulus" : "Belum Lulus";
        System.out.println(output);


    }



}
