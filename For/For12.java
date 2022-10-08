package com.company.For;

import java.util.Scanner;

public class For12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double m = (1+n/10);
        double k = 1;
        for (double i = 1; i <=m; i += 0.1) {

            k *= i;
            System.out.printf("%.1f%n",k);
        }
    }
}
