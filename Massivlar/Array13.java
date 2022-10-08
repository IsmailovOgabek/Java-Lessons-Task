package com.company.Massivlar;

import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = a.length-1; i >= 1; i-=2) {
            System.out.println("a["+i+"] -> "+a[i]);
        }
    }
}
