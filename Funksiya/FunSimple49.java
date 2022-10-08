package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println(EKUB(a,b,d));
        System.out.println(EKUB(a,c,d));
        System.out.println(EKUB(a,b,d));
    }
    public static double EKUB(int a, int b, int d){
        int c = 0;
        if((a>b && b>d) || (a>d && d>b)){
            c = a;
        }else if ((b>a && a>d) || (b>d && d>a)){
            c = b;
        } else if ((d>a && a>b) || (d>b && b>a)) {
            c = d;
        }
        while (c>0){
            if (a%c == 0 && b%c == 0 && d%c == 0){
                break;
            }
            c--;
        }
        return c;

    }
    }

