package com.company.IF;

import java.util.Scanner;

public class If13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        if ((a>b && a<c) || (a>c && a<b)){
            System.out.println(a);
        }else if ((b>a && b<c) || (b>c && b<a)){
            System.out.println(b);
        }else if ((c>a && c<b) || (c>b && c<a)) {
            System.out.println(c);
        }
    }
}
