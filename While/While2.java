package com.company.While;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a>b a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        int k = 0;
        while (a>=b){
            a -= b;
            k++;
        }
        System.out.printf("%d marta joylashadi",k);

    }
}
