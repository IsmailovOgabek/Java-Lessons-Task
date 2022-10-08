package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple2 {

    public static void powerA234(double a){
        System.out.println(Math.pow(a,2));
        System.out.println(Math.pow(a,3));
        System.out.println(Math.pow(a,4));
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            double n = in.nextInt();
            powerA234(n);
        }
    }
}
