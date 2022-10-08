package com.company.MaxAndMin;

import java.util.Scanner;

public class MinMax22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int min = 1000;
        for (int i = 1; i <= N; i++) {
            int n = in.nextInt();
            if (min>n){
                min = n;

            }

        }
        System.out.println(min);
    }
}
