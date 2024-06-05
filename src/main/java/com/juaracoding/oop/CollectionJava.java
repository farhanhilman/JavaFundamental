package com.juaracoding.oop;

import com.juaracoding.ArrayJava;

import java.util.ArrayList;

public class CollectionJava {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Innova");
        cars.add("Xenia");
        cars.add("Avanza");
        cars.add("Brio");
        System.out.println(cars);
        System.out.println("jumlah data: " + cars.size());

        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }

}
