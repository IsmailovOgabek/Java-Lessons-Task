package com.company.IF;

import java.util.Scanner;

public class If9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c;
        if (a>b){
            c = a;
            a = b;
            b = c;
            System.out.println(a+" "+b);
        }else {
            System.out.println(a+" "+b);
        }
    }
}
