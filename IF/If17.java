package com.company.IF;

import java.util.Scanner;

public class If17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        if ((a<=b && b<=c) || (a>=b && b>=c)){
            System.out.println(2*a+" "+2*b+" "+2*c);
        }else {
            System.out.println((-1)*a+" "+(-1)*b+" "+(-1)*c);
        }
    }
}
