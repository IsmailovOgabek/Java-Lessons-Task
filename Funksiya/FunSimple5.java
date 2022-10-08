package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <=2; i++) {
            System.out.println("x1 = ");
            double x1 = in.nextInt();
            System.out.println("y1 = ");
            double y1 = in.nextInt();
            System.out.println("x2 = ");
            double x2 = in.nextInt();
            System.out.println("y2 = ");
            double y2 = in.nextInt();
            double a = y2 - y1;
            double b = x2 - x1;
            restPS(a,b);
        }

    }
    public static void restPS(double a, double b){
        System.out.println("S = "+a*b);
        System.out.println("P = "+2*(a+b));

    }
}
