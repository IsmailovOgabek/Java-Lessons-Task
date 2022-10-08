package com.company.For;

import java.util.Scanner;

public class For31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("n = ");
        int n = in.nextInt();
        double a = 2;
        for (int i = 1; i <= n; i++) {
            a = 2+1/a;
            System.out.println(i+" -> "+a);
        }


    }
}
