package com.company.Integet;

import java.util.Scanner;

public class Integer22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int soat = n/3600;
        int sekunt = n%3600;
        System.out.println(soat);
        System.out.println(sekunt);
    }
}
