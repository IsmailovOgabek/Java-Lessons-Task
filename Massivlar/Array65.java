package com.company.Massivlar;

import java.util.Scanner;

public class Array65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            a[i] = a[i]+a[k];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
