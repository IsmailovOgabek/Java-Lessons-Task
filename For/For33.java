package com.company.For;

import java.util.Scanner;

public class For33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        int f1 = 1;
        int f2 = 1;
        int f = 0;
        System.out.println("1 -> "+f1+"\n2 -> "+f2);
        for (int i = 3; i <= n; i++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
            System.out.println(i+" -> "+f2);
        }
    }
}
