package com.company.MaxAndMin;

import java.util.Scanner;

public class MinMax2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = 0, b = 0, s = 0, max = 0, min = 1000;
        for (int i = 1; i <= N; i++) {
            a = in.nextInt();
            b = in.nextInt();
            s = a*b;
            System.out.println(a+" * "+b+" = "+s);

            if (max<s){
                max = s;
            }
            if (min>s){
                min = s;
            }
        }
        System.out.println(max+" "+min);
    }
}
