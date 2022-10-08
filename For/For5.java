package com.company.For;

import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int narx = in.nextInt();
        for (double i = 0.1; i <= 1; i+=0.1) {

                System.out.printf("%.1f%n", narx*i);


        }
    }
}
