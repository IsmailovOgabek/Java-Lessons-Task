package com.company.IF;

import java.util.Scanner;

public class If14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if ((a>b && a<c)){
            System.out.println(b+" "+a+" "+c);
        }else if ((a>c && a<b)){
            System.out.println(c+" "+a+" "+b);
        }else if ((b>a && b<c)){
            System.out.println(a+" "+b+" "+c);
        }else if (b>c && b<a){
            System.out.println(c+" "+b+" "+a);
        }else if (c>a && c<b) {
            System.out.println(a+" "+c+" "+b);
        }else if ((c>b && c<a)){
            System.out.println(b+" "+c+" "+a);
        }
    }
}
