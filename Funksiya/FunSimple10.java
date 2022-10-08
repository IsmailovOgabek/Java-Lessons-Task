package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        System.out.print("c = ");
        int c = in.nextInt();
        System.out.print("d = ");
        int d = in.nextInt();
        swap(a,b);
        swap(c,d);

    }
    public static void swap(int a,int b){
        int c = a;
        a = b;
        b = c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);


    }
}
