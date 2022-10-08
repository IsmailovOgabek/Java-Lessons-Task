package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        System.out.println(power(a,n));
        System.out.println(power(a,m));
        System.out.println(power(a,k));


    }
    public static double power(double a, double n){
        if (n>0) {
            return Math.pow(a, n);
        }else
            return 1/Math.pow(a,Math.abs(n));

    }
}
