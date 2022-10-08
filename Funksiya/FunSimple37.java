package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 1; i++) {
            double a = in.nextDouble();
            double b = in.nextDouble();
            System.out.println(power(a,b));
        }
    }
    public static double power(double a, double b){

        return Math.pow(a,b);
    }
}
