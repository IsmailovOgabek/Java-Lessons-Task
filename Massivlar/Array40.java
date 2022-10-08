package com.company.Massivlar;

import java.util.Scanner;

public class Array40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int index = 0, k = 0 ;
        for (int i = 0; i < a.length; i++) {
            int ayirma = Math.abs(r - a[i]);
            if (ayirma < min) {
                min = ayirma;
            }
        }
        for (int i = 0; i < a.length-1; i++) {
            int ayirma = Math.abs(r - a[i]);
            if (ayirma == min){
                if (ayirma != 0)
                System.out.print(a[i]+" ");
            }
        }
    }
}
