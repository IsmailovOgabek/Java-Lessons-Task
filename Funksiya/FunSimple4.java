package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <=3; i++) {
            double a = in.nextInt();
            triangle(a);
        }
    }
    public static void triangle(double a){
        double s = (a*a*Math.sqrt(3))/4;
        System.out.println(s);
    }
}
