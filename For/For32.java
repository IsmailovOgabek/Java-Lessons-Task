package com.company.For;

import java.util.Scanner;

public class For32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        double a = 1;
        for (int i = 1; i <= n; i++) {
            a = (a + 1)/i;
            System.out.println(i+" -> "+a);

        }
    }
}
