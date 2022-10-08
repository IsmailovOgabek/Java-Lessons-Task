package com.company.Massivlar;

import java.util.Scanner;

public class Array68 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int max = a[0], index1 = 0, index2 = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (max<a[i]){
                max = a[i];
                index1 = i;
            }
            if (min>a[i]){
                min = a[i];
                index2 = i;
            }
        }
        a[index1] = min;
        a[index2] = max;

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
