package com.company.Massivlar;

import java.util.Scanner;

public class Array34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 1; i < n-1; i++) {
            if (a[i-1]>=a[i] && a[i]<=a[i+1]){
                if (min>a[i]){
                    min = a[i];
                }

            }
        }
        System.out.println(min);


    }
}
