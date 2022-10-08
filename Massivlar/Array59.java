package com.company.Massivlar;

import java.util.Scanner;

public class Array59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int b[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j <= k; j++) {
                sum += a[j];
            }
            b[k] = sum/k;
            k++;
        }
        for (int i = 0; i < k; i++) {
            System.out.println("b["+i+"] -> "+b[i]);
        }
    }
}
