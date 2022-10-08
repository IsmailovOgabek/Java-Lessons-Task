package com.company.Massivlar;

import java.util.Scanner;

public class Array33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int index = 0;
        for (int i = (a.length-1); i > 0; i--) {
            if (a[i-1]<=a[i] && a[i]>=a[i+1]){
                System.out.println(a[i]);
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
