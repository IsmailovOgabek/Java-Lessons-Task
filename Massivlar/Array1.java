package com.company.Massivlar;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=2*i+1;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] -> "+a[i]);
        }
    }
}
