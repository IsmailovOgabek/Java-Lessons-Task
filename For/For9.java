package com.company.For;

import java.util.Scanner;

public class For9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int s = 0;
        for (int i = a; i <= b; i++) {
            s += i*i;
        }
        System.out.println(s);
    }
}
