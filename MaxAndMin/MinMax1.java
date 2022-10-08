package com.company.MaxAndMin;

import java.util.Scanner;

public class MinMax1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int n = 0;
        int max = n, min = 1000;
        for (int i = 1; i <= N; i++) {
            n = in.nextInt();

            if (max<n){
                max = n;
            }
            if (min>n){
                min = n;
            }

        }
        System.out.println(max);
        System.out.println(min);

        
    }
}
