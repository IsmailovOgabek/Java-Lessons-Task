package com.company.Begin;

import java.util.Scanner;

public class Begin5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kubning a tomonini kiriting = ");
        double a = in.nextInt();
        double V = Math.pow(a,3);
        double S = 6*a*a;
        System.out.println("Kubning hajmi = "+V);
        System.out.println("Kubning to'la sirti = "+S);

    }
}
