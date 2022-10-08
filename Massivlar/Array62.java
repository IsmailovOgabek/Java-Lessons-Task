package com.company.Massivlar;

import java.util.Scanner;

public class Array62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int b[] = new int[n];
        int c[] = new int[n];
        int k = 0, d = 0;
        for (int i = 0; i < n; i++) {
            if (a[i]>0)
                b[k++] = a[i];
            else
                c[d++] = a[i];
        }
        for (int i = 0; i < k; i++) {
            System.out.println("b["+i+"] -> "+b[i]);
        }
        for (int i = 0; i < d; i++) {
            System.out.println("b["+i+"] -> "+c[i]);
        }
    }
}
