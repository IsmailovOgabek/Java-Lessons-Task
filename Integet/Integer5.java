package com.company.Integet;

import java.util.Scanner;

public class Integer5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int d = a/b;
        int c = a%b;
        System.out.println(d);
        System.out.println(c);
    }
}
