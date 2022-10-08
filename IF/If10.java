package com.company.IF;

import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =  in.nextInt();
        int b =  in.nextInt();
        int c;
        if (a!=b){
            c = a+b;
            a = c;
            b = c;
            System.out.println(a+" "+b);
        }else if (a==b){
            a = 0;
            b = 0;
            System.out.println(a+" "+b);
        }
    }
}
