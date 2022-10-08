package com.company.Begin;

import java.util.Scanner;

public class Begin36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double V1 = in.nextDouble();
        double V2 = in.nextDouble();
        double S1 = in.nextDouble();
        double T = in.nextDouble();
        double S = S1 + V1*T + V2*T;
        System.out.println(S);

    }
}
