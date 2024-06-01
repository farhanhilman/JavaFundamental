package com.juaracoding;

public class MainJava {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Hello Juara");
        //camelCase
        //snake_case

        int x = 10;

        if(true){
            System.out.println("Statement IF");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(x);
            System.out.println("Indonesia "+i);
        }

        {
            int a = 20;
            {
                System.out.println(a);
            }

            {
                System.out.println(a);
            }
        }

    }


}