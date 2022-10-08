package com.company.Begin;

import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Birinchi sonni kiriting = ");
        int a = in.nextInt();
        System.out.println("Ikkinchi sonni kiriting = ");
        int b = in.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Birinchi son = " +a);
        System.out.println("Ikkinchi son = "+b);
    }
}
