package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println(EKUB(a,b));
        System.out.println(EKUB(a,c));
        System.out.println(EKUB(a,d));
    }
    public static double EKUB(int a, int b){
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
