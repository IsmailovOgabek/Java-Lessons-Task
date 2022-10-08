package com.company.For;

import java.util.Scanner;

public class For20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n>0 n = ");
        int n = in.nextInt();
        int s = 0;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            k *= i;
            s += k;
            System.out.print(k+" + ");
        }
        System.out.printf("%n%d gacha bo'lgan faktaryallar yig'indisi %d ", n, s);
    }
}
