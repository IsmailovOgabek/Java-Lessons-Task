package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fib(n));

    }
    public static int fib(int n){
        int  f1 = 1, f2 = 1, f = f1+f2;
        while (n > 3){
            f1 = f2;
            f2 = f;
            f = f1+f2;
            n--;
        }
        return f;
    }
}
