package com.company.Massivlar;

import java.util.Scanner;

public class Array72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int h = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        int c = a[k];
        a[k] = a[h];
        a[h] = c;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
