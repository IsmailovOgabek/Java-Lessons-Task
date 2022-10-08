package com.company.Begin;

import java.util.Scanner;

public class Begin23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = (a+b+c);
        a = b;
        b = c;
        c = d-(a+b);
        System.out.println("a ="+a+" b = "+b+" c = "+c);

        
    }
}
