package com.company.Massivlar;

import java.util.Scanner;

public class Array45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int index = 0, ayirma = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < n-1; i++) {
            ayirma = Math.abs(a[i]-a[i+1]);
            if (min>ayirma){
                min = ayirma;
                index = i;
            }
        }
        System.out.println(index);
    }

}
