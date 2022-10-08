package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(triangleP(a,b));

    }
    public static double triangleP(int a, int b){
        return Math.sqrt(a*a+b*b);
    }
}
