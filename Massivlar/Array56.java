package com.company.Massivlar;

import java.util.Scanner;

public class Array56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int b[] = new int[n];
        int k = 0;
        for (int i = 3; i < a.length; i+=3) {
                b[k++] = a[i];
        }
        System.out.println("b massivning elemenlari = " +k);
        for (int i = 0; i < k; i++) {
            System.out.print(b[i]+" ");
        }

    }
}
