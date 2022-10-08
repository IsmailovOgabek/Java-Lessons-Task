package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        int n = in.nextInt();
        System.out.println(exp(x,n));
    }
    public static double exp(double x, int n){
        double sum = 0, factaral = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                factaral *= j;
            }
            sum += Math.pow(x,n)/factaral;
        }
        return sum;
    }
}
