package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            System.out.print("Birinchi sonni kiriting = ");
            double a = in.nextDouble();
            System.out.print("Ikkinchi sonni kiriting = ");
            double b = in.nextDouble();
            System.out.print("1 ayirish, 2 ko'paytirish, 3 bo'lish, 4 qo'shish kiriting = ");
            int c = in.nextInt();
            System.out.println(calc(a,b,c));

        }

    }
    public static double calc(double a, double b, int c){
        switch (c){
            case 1:
                return a - b;

            case 2:
                return a*b;

            case 3:
                return a/b;

            default:
            return a+b;
        }
    }
}
