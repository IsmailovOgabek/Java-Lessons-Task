package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println(EKUK(a,b));
        System.out.println(EKUK(a,c));
        System.out.println(EKUK(a,d));
    }
    public static int EKUK(int a, int b){
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
        return a*b/c;

    }
}
