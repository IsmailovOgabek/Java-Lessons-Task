package com.company.MaxAndMin;

import java.util.Scanner;

public class MinMax15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("b = ");
        int b = in.nextInt();
        System.out.print("c = ");
        int c = in.nextInt();
        int max = 0, count = 0;
        for (int i = 1; i <= 10; i++) {
           int n = in.nextInt();
            if (n>b && n<c && max<n){
                max = n;
                count = i;
            }
        }if (count>0)
        System.out.println(max+" "+count);
        else
            System.out.println("00");

    }
}
