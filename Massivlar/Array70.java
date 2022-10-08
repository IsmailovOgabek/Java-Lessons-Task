package com.company.Massivlar;

import java.util.Scanner;

public class Array70 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n juftson kiriting = ");
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        int b[] = new int[n/2];
        for (int i = 0; i < n/2; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < n/2; i++) {
            a[i] = a[i+n/2];
        }
        for (int i = 0; i < n/2; i++) {
            a[i+n/2] = b[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
