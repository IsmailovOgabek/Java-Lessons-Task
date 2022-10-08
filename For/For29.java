package com.company.For;

import java.util.Scanner;

public class For29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        System.out.print("n = ");
        double n = in.nextDouble();
        double c = (b - a) / n;
        for (double i = 1; i <= n; i++) {
            System.out.printf("%n");
            for (double j = a; j < a+c; j++) {
                System.out.print(j+" ");
            }
                a += c;
            }
        }
    }
