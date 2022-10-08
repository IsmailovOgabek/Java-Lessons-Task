package com.company.MaxAndMin;

import java.util.Scanner;

public class MinMax12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int n = 0, min = 1000, count =0;
        for (int i = 1; i <= N; i++) {
            n = in.nextInt();
            if (n>0 && min>n){
                min = n;
                count++;
            }

        }
        if (count>0){
            System.out.println(min);
        }else
        System.out.println(0);
    }
}
