package com.company.For;

import java.util.Scanner;

public class For37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int daraja = 1;
            for (int j = 1; j <= i; j++) {
                daraja *= i;
            }
            System.out.print(daraja+"\t");
            sum += daraja;
        }
        System.out.println("\n"+sum);
    }
}
