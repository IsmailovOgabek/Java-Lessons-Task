package com.company.For;

import java.util.Scanner;

public class For17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();
        int s = 0;
        int k = 1;
        for (int i = 0; i < n; i++) {
            k *= a;
            s += k;
            System.out.println(k+" "+s);
        }
    }
}
