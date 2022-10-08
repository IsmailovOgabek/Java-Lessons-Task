package com.company.Massivlar;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double a[] = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = Math.pow(2,i);
            System.out.println("2 ni "+i+" darajasi "+a[i]);
        }

    }
}
