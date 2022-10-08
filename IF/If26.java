package com.company.IF;

import java.util.Scanner;

public class If26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextInt();
        double F = 0;
        if (x<=0){
            F = 2*x;
        }else if (x>0 && x<2){
            F = x*x;
        }else if (x>=2){
            F = 4;
        }
        System.out.println(F);
    }
}
