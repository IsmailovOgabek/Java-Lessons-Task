package com.company.Integet;

import java.util.Scanner;

public class Integer25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = (k+4)%7-1;
        System.out.println(n);
    }
}
