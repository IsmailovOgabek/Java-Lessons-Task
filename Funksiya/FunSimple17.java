package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        double d = b*b-4*a*c;
        System.out.println(kvadratIldiz(d));

    }
    public static int kvadratIldiz(double d){

        if (d>0){
            return 2;
        }if (d<0){
            return 0;
        }else
            return 1;

    }
}
