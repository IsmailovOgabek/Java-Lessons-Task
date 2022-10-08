package com.company.Massivlar;

import java.util.Scanner;

public class Array42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int ayirma = 0, yigindi = 0, birinchi = 0, ikkinchi = 0;
        for (int i = 0; i < n-1; i++) {

            yigindi = a[i]+a[i+1];
            ayirma = Math.abs(r-yigindi);
            if (min>ayirma){
                min = ayirma;
                birinchi = a[i];
                ikkinchi = a[i+1];
            }
        }
        System.out.println(birinchi+"\n"+ikkinchi);
    }
}
