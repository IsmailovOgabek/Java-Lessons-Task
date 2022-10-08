package com.company.Massivlar;

import java.util.Scanner;

public class Array30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (a[i-1]<a[i]){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
