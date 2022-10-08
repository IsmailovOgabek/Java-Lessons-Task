package com.company.Massivlar;

import java.util.Scanner;

public class Array75 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int max = a[0], min = a[0], t, l;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) max = a[i];
            if (min > a[i]) min = a[i];
        }

        int p =
    }
}
