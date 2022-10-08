package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yil = in.nextInt();
        System.out.println(isLeapYear(yil));

    }
    public static boolean isLeapYear(int a){
        if ((a%4==0 && a%100!=0) || a%400==0){
            return true;
        }else
            return false;
    }
}
