package com.company.Massivlar;

import java.util.Scanner;

public class Array50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
            System.out.println(arr(a));

    }

    public static int arr(int[] a){
        int count = 0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]>a[i+1]){
                count++;
            }
        }
        return count;


    }

}
