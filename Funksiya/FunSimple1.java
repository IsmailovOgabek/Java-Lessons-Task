package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple1 {
    public static void powerA3(double a){
        System.out.println(Math.pow(a,3));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            double n = in.nextInt();
            powerA3(n);
        }
    }
}
