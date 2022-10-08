package com.company.Begin;

import java.util.Scanner;

public class Begin39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        double D = B*B - 4*A*C;
        double x1 = (-B+Math.sqrt(D))/2.*A;
        double x2 = (-B-Math.sqrt(D))/2.*A;
    }
}
