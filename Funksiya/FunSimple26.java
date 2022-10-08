package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            int a = in.nextInt();
            System.out.println(isSquare(a));
        }
    }
    public static boolean isSquare(int k){
     double a = k, cout = 0;
        while (k > 1){
         k = k / 5;
         cout++;
     }
    if (a == Math.pow(5,cout)){
        return true;
    }else
        return false;

    }
}
