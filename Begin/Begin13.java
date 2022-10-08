package com.company.Begin;

import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       System.out.print("R1>R2");
        double R1 = in.nextInt();
        // System.out.print("0 ga teng bo'lmagan b sonni kiriting = ");
        double R2 = in.nextInt();
        double S1 = Math.PI*R1;
        double S2 = Math.PI*R2;
        double S3 = Math.PI*(R1-R2);
    }
}
