package com.company.IF;

import java.util.Scanner;

public class If25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextInt();
        double F = 0;
        if (x>-2 && x>2){
            F = 2*x;
        }else{
            F = -3*x;
        }
        System.out.println(F);
    }
}
