package com.company.Massivlar;

import java.util.Scanner;

public class Array26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        boolean b;
        for (int i = 1; i < n; i++) {
            if ((a[i-1]+a[i])%2==1){
                b = true;
            }else {
                System.out.println(i);
                b = false;
                break;
            }
            if (b){
                System.out.println(0);
            }
        }
    }
}
