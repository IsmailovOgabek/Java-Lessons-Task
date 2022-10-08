package com.company.Begin;

import java.util.Scanner;

public class Begin40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A1 = in.nextDouble();
        double B1 = in.nextDouble();
        double C1 = in.nextDouble();
        double A2 = in.nextDouble();
        double B2 = in.nextDouble();
        double C2 = in.nextDouble();

        double D = (A1*B2-A2*B1);
        double x = (C1*B2 - C2*B1)/D;
        double y = (A1*C2 - A2*C1)/D;
        System.out.println(x+"\n"+y);
    }
}
