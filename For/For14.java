package com.company.For;

import java.util.Scanner;

public class For14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s +=(2*i-1);
            System.out.println(i*i+" == "+s);
        }

    }
}
