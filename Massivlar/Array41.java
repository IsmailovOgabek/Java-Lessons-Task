package com.company.Massivlar;

import java.util.Scanner;

public class Array41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int index = 0, birinchi = 0, ikkinchi = 0;
        for (int i = 0; i < n-1; i++) {
            int yigindi = a[i]+a[i+1];
            if (yigindi>max){
                max = yigindi;
                birinchi = a[i];
                ikkinchi = a[i+1];
            }

        }
        System.out.println(birinchi+"\t"+ikkinchi);
    }
}
