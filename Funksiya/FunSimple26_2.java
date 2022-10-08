package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple26_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            int a = in.nextInt();
            System.out.println(isSquare(a));
        }
    }

    public static boolean isSquare(int k) {
        double a = k, cout = 0;
        for (int i = 1; i <= k; i++) {
            if (Math.pow(5, i) == k) {
                cout++;
            }
        }
        if (cout > 0) {
            return true;
        } else
            return false;

    }
}
