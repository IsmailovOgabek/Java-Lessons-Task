package com.company.Begin;

import java.util.Scanner;

public class Begin6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Poralilipipetning a tomonini kiriting = ");
        double a = in.nextInt();
        System.out.print("Poralilipipetning b tomonini kiriting = ");
        double b = in.nextInt();
        System.out.print("Poralilipipetning c tomonini kiriting = ");
        double c = in.nextInt();

        double V = a*b*c;
        double S = 2*(a*b + b*c + a*c);

        System.out.println("Poralilipipetning hajmi = "+V);
        System.out.println("Poralilipipetning yuzasi = "+S);
    }
}
