package com.company.For;

import java.util.Scanner;

public class For21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double s = 1;
        double k = 1;
        for (int i = 1; i <= n ; i++) {
            k *= i;
            s += 1/k;
        }
        System.out.printf("%.2f", s);
    }
}
