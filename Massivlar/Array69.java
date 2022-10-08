package com.company.Massivlar;

import java.util.Scanner;

public class Array69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 1; i < n; i+=2) {
            int d = 0;
            d = a[i-1];
            a[i-1] = a[i];
            a[i] = d;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
