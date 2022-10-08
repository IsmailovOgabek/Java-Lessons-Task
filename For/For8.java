package com.company.For;

import java.util.Scanner;

public class For8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int k = 1;
        for (int i = a; i <= b ; i++) {
           k *= i;
        }
        System.out.println(k);
    }
}
