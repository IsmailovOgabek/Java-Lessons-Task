package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            System.out.print("o dan farqli bo'lgan a ni kiriting = ");
            double a = in.nextDouble();
            System.out.print("o dan farqli bo'lgan b ni kiriting = ");
            double b = in.nextDouble();
            System.out.println(quarter(a,b));
            System.out.println();
        }

    }
    public static String quarter(double a, double b){
        if (a>0 && b>0){
            return "I chorak";
        }else if (a<0 && b>0){
            return "II chorak";
        }else if (a<0 && b<0){
            return "III chorak";
        }else if (a>0 && b<0) {
            return "IV chorak";
        }else
            return "Xato";
    }
}
