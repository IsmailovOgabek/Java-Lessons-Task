package com.company.Massivlar;

import java.util.Scanner;

public class Array28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i+=2) {
            if(min>a[i]){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
