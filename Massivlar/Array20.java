package com.company.Massivlar;

import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int k = in.nextInt();
        int l = in.nextInt();
        int sum = 0;
        for (int i = k; i <= l; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
