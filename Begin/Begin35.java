package com.company.Begin;

import java.util.Scanner;

public class Begin35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double V = in.nextInt();
        double U = in.nextInt();
        double T1 = in.nextInt();
        double T2 = in.nextInt();
        double S1 = (V+U)*T1;
        double S2 = (V-U)*T2;
        double S = S1 + S2;
        System.out.println(S);
    }
}
