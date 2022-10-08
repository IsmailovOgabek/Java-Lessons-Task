package com.company.Massivlar;

import java.util.Scanner;

public class Array47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int count = 0, c = 0, b = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                if (a[i]!=a[j]){
                    c++;
                }
                if (a[i]==a[j])
                    b++;
            }

        }
        int yangiMassivUzunlig = c+b/2;
        int d[] = new int[yangiMassivUzunlig];

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < d.length; j++) {
                if (a[i]!=d[j]){
                    d[j] = a[i];
                }
            }
            for (int j = 0; j < d.length; j++) {
                System.out.println(d[j]);
            }
        }


    }
}
