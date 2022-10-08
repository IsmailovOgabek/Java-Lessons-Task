package com.company.For;

import java.util.Scanner;

public class For13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble()  ;
        double m = 1+n/10.;
        double s = 0;
        for (double i = 1.1; i <= m; i+=0.1) {
            s += Math.pow(-1,i)*i;
            System.out.printf("%.2f%n" , s);

        }

    }
}
