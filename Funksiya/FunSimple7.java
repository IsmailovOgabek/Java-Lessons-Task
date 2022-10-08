package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("Son kiriting = ");
            int a = in.nextInt();
            investDigit(a);
        }
    }
    public static void investDigit(int a){
        while (a>0){
            int b = a%10;
            a = a/10;
            System.out.print(b);

        }
        System.out.println();
    }
}
