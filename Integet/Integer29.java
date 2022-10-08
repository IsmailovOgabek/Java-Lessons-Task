package com.company.Integet;

import java.util.Scanner;

public class Integer29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int togriTortBurcha = a*b;
        int kvadrat = c*c;
        int n = togriTortBurcha/kvadrat;
        int m = togriTortBurcha%kvadrat;
        System.out.println(n);
        System.out.println(m);
    }
}
