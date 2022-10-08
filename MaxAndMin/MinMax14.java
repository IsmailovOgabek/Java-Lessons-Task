package com.company.MaxAndMin;

import java.util.Scanner;

public class MinMax14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int min = 1000, count = 0;
        for (int i = 1; i <= 10; i++) {
            int n = in.nextInt();
            if (n > b && min > n){
                min = n;
                count = i;
            }
        }
        System.out.println(min+" "+count);
    }
}
