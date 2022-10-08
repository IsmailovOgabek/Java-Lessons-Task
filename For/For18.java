package com.company.For;

import java.util.Scanner;

public class For18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();
        int s = 0;
        int k;
        for (int i = 0; i <= n; i++) {
            k = (int) Math.pow(a,i);
            s += Math.pow(-1,i)*k;
            System.out.println(a+" ning "+i+" darajasi = "+k+" "+s);
        }
    }
}
