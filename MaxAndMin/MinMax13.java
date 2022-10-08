package com.company.MaxAndMin;

import java.util.Scanner;

public class MinMax13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int n = 0, max = 0, count = 0;
        for (int i = 1; i <= N ; i++) {
            n = in.nextInt();
            if (n % 2 == 1){
                max = n;
                count = i;
                break;
            }
        }
        if (count>0){
            System.out.println(max+" birinchi uchragan toq son uning tartib raqami "+count);
        }else
            System.out.println(0);
    }
}
