package com.company.Massivlar;

import java.util.Scanner;

public class Array54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int k = 0;
        int b[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0){
             b[k++] = a[i];
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(b[i]);
        }
    }
}
