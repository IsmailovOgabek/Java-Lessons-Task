package com.company.Massivlar;

import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i+=2) {
            System.out.print("a["+i+"] -> "+a[i]+"\t");
        }
        System.out.println();
        for (int i = 1; i < n; i+=2) {
            System.out.print("a["+i+"] -> "+a[i]+"\t");
        }
    }
}
