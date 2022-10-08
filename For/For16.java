package com.company.For;

import java.util.Scanner;

public class For16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();
        int s =1;
        for (int i = 1; i <= n; i++) {
            s *= a;
            System.out.printf("%d ning %d darajasi %d %n",a,i,s);

        }
    }
}
