package com.company.While;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a>b a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        while (a>=b){
            a -= b;
        }
        System.out.println("A kesmaning bo'sh joyi = "+a);

    }
}
