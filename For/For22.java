package com.company.For;

import java.util.Scanner;

public class For22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        double n = in.nextDouble();
        System.out.print("x = ");
        double x = in.nextDouble();
        double s = 1;
        double k = 1;
        for (int i = 1; i <=n; i++) {
            k *= i;
            s += Math.pow(x,i)/k;
        }
        System.out.printf("%.2f", s);
    }
}
