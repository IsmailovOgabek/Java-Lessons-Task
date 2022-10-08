package com.company.For;

import java.util.Scanner;

public class For40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int k = 0;
        for (int i = a; i <= b; i++) {

            for (int j = 1; j <= k+1; j++) {
                System.out.print(i+" ");
            }
            k++;
            System.out.println();
        }
    }
}
