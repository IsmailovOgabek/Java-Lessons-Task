package com.company.Integet;

import java.util.Scanner;

public class Integer27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = (k-1)%7;
        System.out.println(n);
    }
}
