package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A = ");
        int a = in.nextInt();
        System.out.print("B = ");
        int b = in.nextInt();
        System.out.print("C = ");
        int c = in.nextInt();
        System.out.print("D = ");
        int d = in.nextInt();
        mean(a,b);
        mean(a,c);
        mean(a,d);
    }
    public static void mean(int a, int b){

        System.out.println((a+b)/2);
        System.out.println(Math.sqrt(a*b));
        System.out.println();
    }
}
