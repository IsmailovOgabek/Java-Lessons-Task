package com.company.IF;

import java.util.Scanner;

public class If24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextInt();
        double F = 0;
        if (x>0){
            F = 2*Math.sin(x);
        }else if (x<=0){
            F = x-6;
        }
        System.out.println(F);
    }
}
