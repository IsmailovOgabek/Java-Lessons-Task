package com.company.For;

import java.util.Scanner;

public class For34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        double a1 = 1;
        double a2 = 2;
        double a = 0;
        System.out.println("1 -> "+a1+"\n2 -> "+a2);
        for (int i = 3; i <=n; i++) {
            a = (a1 + 2*a2)/3;
            a1 = a2;
            a2 = a;
            System.out.println(i+" -> "+a2);
        }
    }
}
