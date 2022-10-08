package com.company.Massivlar;

import java.util.Scanner;

public class Array24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int indes = -1;
        for (int i = 2; i < n; i++) {
            if ((a[i]-a[i-1])!=(a[i-1]-a[i-2])) {
                indes = i;
            }
        }
        if (indes==-1){
            System.out.println(a[2]-a[1]);
        }else
            System.out.println(0);
    }
}
