package com.company.IF;

import java.util.Scanner;

public class If19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double e = in.nextDouble();
        if (a==b && b==c){
            System.out.println(e+" tartib raqami "+4);
        }else if (a==b && b==e){
            System.out.println(c+" tartib raqami "+3);
        }else if (a==c && c==e) {
            System.out.println(b +" tartib raqami " + 2);
        }else if (b==c && c==e) {
            System.out.println(a+" tartib raqami " + 1);
        }



    }
}
