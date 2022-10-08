package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println(a/fras1(a,b)+"/"+b/fras1(a,b));
        System.out.println(a/fras1(a,c)+"/"+c/fras1(a,c));
        System.out.println(a/fras1(a,d)+"/"+d/fras1(a,d));


    }
    public static int  fras1(int a, int b){
        int c;
        if(a>b){
            c = a;
        }else {
            c = b;
        }
        while (c>0){
            if (a%c == 0 && b%c == 0){
                break;
            }
            c--;
        }
        return c;

    }
}
