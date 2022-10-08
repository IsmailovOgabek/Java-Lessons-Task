package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r1 = in.nextDouble();
        double r2 = in.nextDouble() ;

        System.out.println(ringS(r1,r2));
    }
    public static double ringS(double r1, double r2){
            return Math.abs(Math.PI*r1*r1-Math.PI*r2*r2);
    }
}
