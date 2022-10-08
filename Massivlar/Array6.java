package com.company.Massivlar;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A = ");
        int d = in.nextInt();
        System.out.print("B = ");
        int b = in.nextInt();
        System.out.print("n = ");
        int n = in.nextInt();
        int a[] = new int[n];
        a[0] = d;
        a[1] = b;
        for (int i = 2; i < n; i++) {
            for (int j = 0; j < i; j++) {
                a[i] += a[j];
            }
            System.out.println(a[i]);
        }
    }
}
