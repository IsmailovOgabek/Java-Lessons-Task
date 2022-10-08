package com.company.Massivlar;

import java.util.Scanner;

public class Array66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int juft = 0;
        for (int i = 0; i < n; i++) {
           if (a[i]%2 == 0) {
               juft = a[i];
               break;
           }
        }
        for (int i = 0; i < n; i++) {
            if (a[i]%2 == 0){
                a[i] = a[i]+juft;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
