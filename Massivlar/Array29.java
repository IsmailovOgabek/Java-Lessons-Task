package com.company.Massivlar;

import java.util.Scanner;

public class Array29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i+=2) {
            if(max<a[i]){
                max = a[i];
            }
        }
        System.out.println(max);

    }
}
