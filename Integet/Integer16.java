package com.company.Integet;

import java.util.Scanner;

public class Integer16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c = a%10;
        int d = a%100;
        int b = d/10;
        int q = a/100;
        System.out.println(q+""+c+""+b);
    }
}
