package com.company.For;

import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bir kilogrom konfetning narhini kiriting = ");
        int a = in.nextInt();
        for (double i = 1.2; i <= 2; i+=0.2) {
            System.out.printf("%.15f%n", a*i);
        }

    }
}
