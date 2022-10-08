package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            int k = in.nextInt();
            System.out.println(digitCount(k));
        }
    }
    public static int digitCount(int k){
        int count = 0;
        while (k>0){
            k /= 10;
            count++;
        }
        return count;
    }
}
