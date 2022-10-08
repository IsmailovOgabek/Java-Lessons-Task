package com.company.For;

import java.util.Scanner;

public class For25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n>0 n = ");
        double n = in.nextDouble();
        System.out.print("|x|<1  x = ");
        double x = in.nextDouble();
        double s = x;
        double k = 1;
        int ishora = 1;
        for (int i = 2; i <= n; i++) {
            ishora *= -1;
            s += ishora*Math.pow(x,i)/i ;
        }
        System.out.println(s);
    }
}
