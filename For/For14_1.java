package com.company.For;

import java.util.Scanner;

public class For14_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <=(2*i-1) ; j+=2) {
                sum+=j;
            }
            System.out.println(i*i+" == "+sum);
        }

    }
}
