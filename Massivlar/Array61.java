package com.company.Massivlar;

import java.util.Scanner;

public class Array61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        double b[] = new double[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0, count = 0;
            for (int j = k; j <= a.length-1; j++) {
                sum += a[j];
                count++;
            }
            b[k] = sum/count;
            k++;
        }
        for (int i = 0; i < k; i++) {
            System.out.println("b["+i+"] -> "+b[i]);
        }
    }
}
