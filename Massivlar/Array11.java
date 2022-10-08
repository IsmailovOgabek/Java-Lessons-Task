package com.company.Massivlar;

import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        for (int i = k; i < a.length; i+=k) {
            System.out.println(a[i]);
        }
    }
}
