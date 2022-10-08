package com.company.IF;

import java.util.Scanner;

public class If15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if ((a+b)>(b+c) && (a+b)>(a+c))
        {
            System.out.println(a+" "+b);
        }
        else if ((b+c)>(a+b) && (b+c)>(a+c))
        {
            System.out.println(b+" "+c);
        }
        else if ((a+c)>(a+b) && (a+c)>(b+c))
        {
            System.out.println(a+" "+c);
        }
    }
}
