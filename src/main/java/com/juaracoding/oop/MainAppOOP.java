package com.juaracoding.oop;

import java.util.Date;

public class MainAppOOP {
    public static void main(String[] args) {

        Fruit apel = new Fruit();
        apel.gram = 100;
        apel.calsPerGram = 30;
        System.out.println(apel.totalCalories());

        Fruit mangga = new Fruit();
        mangga.gram = 100;
        mangga.calsPerGram = 24;
        System.out.println(mangga.totalCalories());

        //Clean code
        Kotak kotak = new Kotak(3);
        kotak.draw();

        Cars cars = new Cars("Mercedes","Pertalite", 2000);
        cars.warna();
        cars.mesin();
        System.out.println("Merknya " + cars.getMerkKendaraan());
        System.out.println("bahannya " + cars.getBahanBakar());
        System.out.println("tahun pembuatan " + cars.getTahunPembuatan());

        Date date = new Date();
        System.out.println("Waktu saat ini adalah : " + date);
        System.out.println("Tanggal : " + date.getDate());

        Employee employee = new Employee();
        String employeeName = "farhan";
        employee.setName(employeeName);
        int employeeAge = 23;
        employee.setAge(employeeAge);
        String employeeAddress = "Palembang";
        employee.setAddress(employeeAddress);
        double employeeSalary = 12000.00;
        employee.setSalary(employeeSalary);

        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getAddress());
        System.out.println(employee.getSalary());

        User user = new User();
        String username = "Muhammad Farhan Hilman";
        user.setUsername(username);
        String password = "123456";
        user.setPassword(password);

        String inputUsername = "Muhammad Farhan Hilman";
        String inputPassword = "123456";

        if(inputUsername.equals(user.getUsername())){
            System.out.println("berhasil login");
        } else {
            System.out.println("data yang anda masukkan salah");
        }

        User user1 = new User();
        String username1 = "farhan";
        user1.setUsername(username1);
        String password1 = "123";
        user1.setPassword(password1);

        User user2 = new User();
        String username2 = "hilman";
        user2.setUsername(username2);
        String password2 = "456";
        user2.setPassword(password2);

        User user3 = new User();
        String username3 = "muhammad";
        user3.setUsername(username3);
        String password3 = "789";
        user3.setPassword(password3);

        System.out.println(user1);
        System.out.println("Username dan Password user 1 : ");
        System.out.println(user1.getUsername());
        System.out.println(user1.getPassword());
        System.out.println(user2);
        System.out.println("Username dan Password user 2 : ");
        System.out.println(user2.getUsername());
        System.out.println(user2.getPassword());
        System.out.println(user3);
        System.out.println("Username dan Password user 3 : ");
        System.out.println(user3.getUsername());
        System.out.println(user3.getPassword());

        //Polymorphism (Method Overloading)
        Calculation.sum(1, 2, 3); //int a + int b + int c
        Calculation.sum(1,2); //int a + int b
        Calculation.sum(1.0,2.0); //double a + double b

        //Polymorphism (Method Overriding)
        BidangDatar bidangDatar = new BidangDatar();
        bidangDatar.draw();

        BidangDatar segitiga = new Segitiga(4);
        segitiga.draw();

        BidangDatar segitigaLuas = new Segitiga(12, 5);
        segitigaLuas.luas();

        BidangDatar kotak1 = new Kotak(5);
        kotak1.draw();
        kotak1.luas();

        //inheritance (Pewarisan)
        Manager manager = new Manager();
        manager.setName("farhan");
        System.out.println("managernya adalah " + manager.getName());
        manager.setDepartement("Quality Asurance Engineer");
        System.out.println("Departemen " + manager.getDepartement());

    }
}
