package com.company.While;

import java.util.Scanner;

public class While6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("n = ");
        int n = in.nextInt();
        int kopaytma = 1;
        while (n>0){
            kopaytma *= n;
            n -=2;
            System.out.println(n);
        }
        System.out.println(kopaytma);
    }
}
