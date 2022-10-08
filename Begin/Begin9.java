package com.company.Begin;

import java.util.Scanner;

public class Begin9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Manfiy bo'lmagan a sonni kiriting = ");
        double a = in.nextInt();
        System.out.print("Manfiy bo'lmagan b sonni kiriting = ");
        double b = in.nextInt();
        double Q = Math.sqrt(a*b);
        System.out.println(Q);
    }
}
