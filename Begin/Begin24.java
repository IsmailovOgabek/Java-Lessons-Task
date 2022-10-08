package com.company.Begin;

import java.util.Scanner;

public class Begin24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = (a+b+c);
        a = c;
        c = b;
        b = d-(a+c);
        System.out.println("a ="+a+" c = "+c+" b = "+b);
    }
}
