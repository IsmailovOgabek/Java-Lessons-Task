package com.company.Begin;

import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("0 ga teng bo'lmagan a sonni kiriting = ");
        double a = in.nextInt();
        System.out.print("0 ga teng bo'lmagan b sonni kiriting = ");
        double b = in.nextInt();
        double c = Math.sqrt(a*a+b*b);
        double P = a+b+c;
        System.out.println("Gipatenuzasi = "+c);
        System.out.println("Peremetiri + "+P);
    }
}
