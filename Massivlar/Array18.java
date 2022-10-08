package com.company.Massivlar;

import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int index = -1;
        int min = a[n - 1];
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
                index++;
                break;


            }
        }
        if (index==-1){
            System.out.println(0);
        }else
            System.out.println(min);
    }
}
