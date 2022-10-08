package com.company.IF;

import java.util.Scanner;

public class If18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        if (a==b){
            System.out.println(c+" tartib raqami "+3);
        }else if (a==c){
            System.out.println(b+" tartib raqami "+2);
        }else if (b==c){
            System.out.println(a+" tartib raqami "+1);
        }
    }
}
