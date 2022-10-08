package com.company.For;

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double s = 0;
        for (int i = 1; i < n; i++) {
            s += 1./i;
            System.out.println(i+" "+s);
        }
        System.out.printf("%.2f",s);
    }
}
