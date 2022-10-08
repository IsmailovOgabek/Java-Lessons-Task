package com.company.IF;

import java.util.Scanner;

public class If20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double e = Math.abs(a-b);
        double d = Math.abs(a-c);
        if (e<d){
            System.out.println(a+" ga eng yaqin son "+b+" ular orasidagi masofa "+e);
        }else if (e>d){
            System.out.println(a+" ga eng yaqin son "+c+" ular orasidagi masofa "+d);
        }
    }
}
