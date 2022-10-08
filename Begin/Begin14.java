package com.company.Begin;

import java.util.Scanner;

public class Begin14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Aylna uzunligi L ningi kiriting = ");
        double l = in.nextInt();
        double R = l/(2*Math.PI);
        double S = Math.PI*R*R;
        System.out.println(R);
        System.out.println(S);

    }
}
