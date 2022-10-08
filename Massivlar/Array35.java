package com.company.Massivlar;

import java.util.Scanner;

public class Array35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int index = 0;
        int max = a[0];
        int min = Integer.MAX_VALUE;
        for (int i = (a.length-2); i > 0; i--) {
            if (a[i-1]<=a[i] && a[i]>=a[i+1]){
                    max = a[i];
                    if (min>max){
                        min = max;
                        index++;
                }
            }
        }
        if (index!=0)
            System.out.println(min);

    }
}
