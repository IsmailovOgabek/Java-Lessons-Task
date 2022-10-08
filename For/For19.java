package com.company.For;

import java.util.Scanner;

public class For19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s *= i;
            System.out.println(i+" "+s);
        }
        System.out.println(s);
    }
}
