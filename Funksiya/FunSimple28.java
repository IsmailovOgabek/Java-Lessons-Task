package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        for (int i = 1; i <= k; i++) {
            int n = in.nextInt();
            System.out.println(isPrime(n));
        }
    }
    public static boolean isPrime(int n){
        int b = n/2, a, coant = 0;
        while (b>1){
            a = n%b;
            if (a==0){
                coant++;
            }
            b--;
        }
        if (coant==0){
            return true;
        }else
            return false;
    }
}
