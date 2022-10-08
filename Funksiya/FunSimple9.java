package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple9 {
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
       int count = 0, b = a;
        while (a>0){
            a = a/10;
            count++;
        }
        switch (count){
            case 1:
                System.out.println(10*r+b);
                break;
            case 2:
                System.out.println(100*r+b);
                break;
            case 3:
                System.out.println(1000*r+b);
                break;
            case 4:
                System.out.println(10000*r+b);
                break;
            case 5:
                System.out.println(100000*r+b);
                break;
            case 6:
                System.out.println(1000000*r+b);
                break;
            case 7:
                System.out.println(10000000*r+b);
                break;

        }

    }
}
