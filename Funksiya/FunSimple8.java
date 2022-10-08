package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("Son kiriting = ");
            int a = in.nextInt();
            System.out.print("R ni kiriting = ");
            int r = in.nextInt();
            addRightDigit(a,r);
        }
    }
    public static void addRightDigit(int a, int r){
        System.out.println(a*10+r);
    }
}
