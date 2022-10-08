package com.company.Massivlar;

import java.util.Scanner;

public class Array53 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
//            c[i] = Math.max(a[i],b[i]);
//            System.out.print(c[i]+" ");
            if (a[i]>b[i]){
                c[i] = a[i];
            }else {
                c[i] = b[i];
            }
            System.out.print(c[i]+" ");
        }

    }
}
