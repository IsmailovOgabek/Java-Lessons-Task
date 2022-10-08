package com.company.MaxAndMin;

import java.util.Scanner;

public class MinMax6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int n = 0;
        int index = 0, min = 1000;
        for (int i = 1; i <= N; i++) {
            n = in.nextInt();

            if (min>n){
                min = n;
                index = i;
            }

        }
        System.out.printf("Eng kichik son %d uning o'rni %d", min, index);
    }
}
