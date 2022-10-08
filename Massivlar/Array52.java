package com.company.Massivlar;

import java.util.Scanner;

public class Array52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i]<5){
                count++;
            }
        }
        if (count==0){
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i]/2;
            }
        }else {
            for (int i = 0; i < a.length; i++) {
                b[i] = 2*a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
