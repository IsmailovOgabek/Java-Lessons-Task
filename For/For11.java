package com.company.For;

import java.util.Scanner;

public class For11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += Math.pow((n+i),2);
            System.out.println(Math.pow((n+i),2)+" "+i+" "+s);
        }
    }
}
