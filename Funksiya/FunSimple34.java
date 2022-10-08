package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            int n = in.nextInt();
            System.out.println(fact(n));
            System.out.println();
        }

    }
    public static int fact(int n){
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p *= i;
        }
        return p;
    }
}
