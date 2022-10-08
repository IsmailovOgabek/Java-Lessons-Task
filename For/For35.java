package com.company.For;

import java.util.Scanner;

public class For35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        double a1 = 1;
        double a2 = 2;
        double a3 = 3;
        double a = 0;
        System.out.println("1 -> "+a1+"\n2 -> "+a2+"\n3 -> "+a3);

        for (int i = 4; i <= n; i++) {
            a = a3 + a2 - 2*a1;
            System.out.println(i+" -> "+a);
            a1 = a2;
            a2 = a3;
            a3 = a;
        }
    }
}
