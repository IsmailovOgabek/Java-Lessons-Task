package com.company.Massivlar;

import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("a[0] -> "+a[0]);
        for (int i = 2; i < n; i+=2) {
            System.out.println("a["+i+"] -> "+a[i]);
        }

    }
}
