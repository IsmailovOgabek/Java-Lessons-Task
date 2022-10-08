package com.company.Massivlar;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int d = in.nextInt();
        int n = in.nextInt();
        int array[] = new int[n];
        array[0] = a;
        for (int i = 1; i < n; i++) {
            array[i] = array[i-1]*d;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("a["+i+"] -> "+array[i]);
        }
    }
}
