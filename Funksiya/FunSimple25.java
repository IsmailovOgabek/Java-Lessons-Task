package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            int a = in.nextInt();
            System.out.println(isSquare(a));
        }
    }
    public static boolean isSquare(int k){
        double d = Math.sqrt(k);
        if (d*d==k){
            return true;
        }else {
            return false;
        }
    }
}
