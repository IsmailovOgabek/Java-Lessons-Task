package com.company.MaxAndMin;

import java.util.Scanner;

public class MinMax5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int m = 0, v = 0, s = 0, max = 0, min = 1000;
        for (int i = 1; i <= N; i++) {
            m = in.nextInt();
            v = in.nextInt();
            s = 2*(m/v);
            System.out.println(m+" / "+v+" = "+s);

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
