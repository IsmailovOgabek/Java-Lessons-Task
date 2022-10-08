package com.company.Massivlar;

import java.util.Scanner;

public class Array63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = i;
        }
        int k = 0, d = 0;
        int b[] = new int[5];
        for (int i = 5; i < 10; i++) {
            b[d++] = i;
        }
        int c[] = new int[10];

        for (int i = 1; i < 5; i++) {
            c[k++] = a[i];
        }
        for (int i = 0; i <5; i++) {
                c[k++] = b[i];
        }
        for (int i = 0; i < k; i++) {
            System.out.println("c[" + i + "] -> " + c[i]);

        }
    }
}