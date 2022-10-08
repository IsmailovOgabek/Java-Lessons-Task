package com.company.Begin;

import java.util.Scanner;

public class Begin11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("0 ga teng bo'lmagan a sonni kiriting = ");
        double a = in.nextInt();
        System.out.print("0 ga teng bo'lmagan b sonni kiriting = ");
        double b = in.nextInt();
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(Math.abs(a-b));
    }
}
