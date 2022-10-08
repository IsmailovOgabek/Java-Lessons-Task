package com.company.Massivlar;

import java.util.Scanner;

public class Array51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[]{2,5,9,45,7};
        int b[] = new int[]{6,9,10,18,19};
        int c[] = new int[5];
        for (int i = 0; i < 5; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < 5; i++) {
            a[i] = b[i];
        }
        for (int i = 0; i < 5; i++) {
            b[i] = c[i];
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(b[i]+" ");
        }

    }
}
