package com.company.Begin;

import java.util.Scanner;

public class Begin15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Aylna uzunligi L ningi kiriting = ");
        double S = in.nextInt();
        double  R = Math.sqrt(S/Math.PI);
        double D = 2*R;
        System.out.println(R);
        System.out.println(D);

    }
}
