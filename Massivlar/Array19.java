package com.company.Massivlar;

import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int max = a[n - 1];
        int min = a[0];
        int index = -1;

        for (int i = a.length - 2; i > 0; i--) {

            if (max > a[i] && min < a[i]) {
                index = i;
                break;
            }
        }
        if (index==-1){
            System.out.println(0);
        }else
            System.out.println(index);


    }
}

