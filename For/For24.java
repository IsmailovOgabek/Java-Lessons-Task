package com.company.For;

import java.util.Scanner;

public class For24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        double n = in.nextDouble();
        System.out.print("x = ");
        double x = in.nextDouble();
        double s = 1;
        double k = 1;
        double ishora = 1;
        for (int i = 2; i <= n; i+=2) {
            ishora *= (-1);
            k = 1;
            for (int j = 1; j <= i; j++) {
                k *= j;
            }
            s += ishora*Math.pow(x,i)/k ;
        }
        System.out.println(s);
    }
}
