package com.company.Integet;

import java.util.Scanner;

public class Integer17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("999 dan katta son kiriting ");
        int a = in.nextInt();
        int b = a%1000;
        int c = b/100;
        System.out.println(c);
    }
}
