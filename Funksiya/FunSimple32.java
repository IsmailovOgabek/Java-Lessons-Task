package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            double n = in.nextDouble();
            System.out.println(degToRad(n));
        }
    }
    public static double degToRad(double d){
        return (d*Math.PI)/100.;
    }
}
