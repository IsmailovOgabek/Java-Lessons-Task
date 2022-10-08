package com.company.For;

import java.util.Scanner;

public class For27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n>0  = ");
        double n = in.nextDouble();
        System.out.print("|x|<1 x = ");
        double x = in.nextDouble();
        double s = 0;
        double k = 1;
        double d = 1;
        for (int i = 1; i <= n; i+=2) {
            k = 1;
            for (int j = 1; j <i ; j+=2) {
                k *= j;
            }

            s += Math.pow(x,i)/i ;
        }
        System.out.println(s);
    }
}
