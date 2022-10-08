package com.company.For;

import java.util.Scanner;

public class For38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = i;
            for (int j = n; j >= 1; j--) {
                a *= a;
            }
            System.out.println(a);
        }
    }
}
