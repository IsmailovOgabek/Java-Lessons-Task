package com.company.For;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i+" "+k);
        }

    }
}
