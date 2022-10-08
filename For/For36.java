package com.company.For;

import java.util.Scanner;

public class For36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int sum = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            b = i;
            int daraja =1;
            for (int j = 1; j <= k; j++) {
                daraja *= b;
            }
            System.out.print(daraja+"\t");
            sum += daraja;

        }
        System.out.printf("%n%d ", sum);
    }
}
