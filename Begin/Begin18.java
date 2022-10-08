package com.company.Begin;

import java.util.Scanner;

public class Begin18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("C nuqta A va B nuqta orasida ");
        System.out.println("A = ");
        double A = in.nextInt();
        System.out.println("B = ");
        double B = in.nextInt();
        System.out.println("C= ");
        double C = in.nextInt();
        double AC = C-A;
        double BC = B-C;
        double S = AC*BC;
        System.out.println("AC = "+AC);
        System.out.println("BC = "+BC);
        System.out.println("Kesmalar ko'paytmasi = "+S);
    }
}
