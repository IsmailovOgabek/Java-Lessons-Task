package com.company.Massivlar;

import java.util.Scanner;

public class Array71 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        int b[] = new int[n];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            b[k++] = a[n-i-1];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
