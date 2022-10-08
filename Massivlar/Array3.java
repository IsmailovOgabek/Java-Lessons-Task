package com.company.Massivlar;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double d = in.nextDouble();
        int n = in.nextInt();
        double array[] = new double[n];
        array[0] = a;
        for (int i = 1; i < n; i++) {
            array[i] =array[i-1]+d; ;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("a["+i+"] -> "+array[i]);
        }
    }
}
