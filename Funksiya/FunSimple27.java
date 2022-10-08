package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            int k = in.nextInt();
            int n = in.nextInt();
            System.out.println(isPower(k,n));
        }
    }

    public static boolean isPower(int k, int n) {
        double a = k, cout = 0;
        while (k > 1){
            k = k / n;
            cout++;
        }
        if (a == Math.pow(n,cout)){
            return true;
        }else
            return false;


    }


    }

