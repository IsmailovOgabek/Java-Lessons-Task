package com.company.While;

import java.util.Scanner;

public class While26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f1 = 1, f2 = 1, f = 0, k = 1, count = 0;
        while (k<=n){
            f = f1+f2;
            f1 = f2;
            f2 = f;
            if (f2>n){
                System.out.println(n+" sonidan oldingi "+f1+" va keyingi "+f2+" fibanachchi sonlari");
                break;
            }
            k++;
        }

    }
}
