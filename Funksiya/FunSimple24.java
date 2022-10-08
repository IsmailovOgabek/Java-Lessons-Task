package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            System.out.print("Butun son kiriting = ");
            int a = in.nextInt();
            System.out.println(even(a));
        }
    }
    public static String even(int k){
        if (k%2==0){
            return "Juft";
        }else {
            return "Toq";
        }
    }
}
