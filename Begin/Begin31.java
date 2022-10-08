package com.company.Begin;

import java.util.Scanner;

public class Begin31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double T_F = in.nextDouble();
        double T_C = (T_F-32)*(5/9);
        System.out.println(T_C);
    }
}
