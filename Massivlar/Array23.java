package com.company.Massivlar;

import java.util.Scanner;

public class Array23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int k = in.nextInt();
        int l = in.nextInt();
        int sum = 0;
        int count=0;
        for (int i = 0; i < n; i++) {
            if (i<k || i>l) {
                sum += a[i];
                count++;
            }
        }
        System.out.println(sum/count);
    }
}
